package org.telegram.messenger.voip;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;
import lh.k7;

public class AudioRecordJNI {
    private AcousticEchoCanceler aec;
    private AutomaticGainControl agc;
    private AudioRecord audioRecord;
    private ByteBuffer buffer;
    private int bufferSize;
    private long nativeInst;
    private boolean needResampling = false;
    private NoiseSuppressor ns;
    private boolean running;
    private Thread thread;

    public AudioRecordJNI(long j10) {
        this.nativeInst = j10;
    }

    private int getBufferSize(int i10, int i11) {
        return Math.max(AudioRecord.getMinBufferSize(i11, 16, 2), i10);
    }

    private static boolean isGoodAudioEffect(AudioEffect audioEffect) {
        Pattern patternMakeNonEmptyRegex = makeNonEmptyRegex("adsp_good_impls");
        Pattern patternMakeNonEmptyRegex2 = makeNonEmptyRegex("adsp_good_names");
        AudioEffect.Descriptor descriptor = audioEffect.getDescriptor();
        VLog.d(audioEffect.getClass().getSimpleName() + ": implementor=" + descriptor.implementor + ", name=" + descriptor.name);
        if (patternMakeNonEmptyRegex != null && patternMakeNonEmptyRegex.matcher(descriptor.implementor).find()) {
            return true;
        }
        if (patternMakeNonEmptyRegex2 != null && patternMakeNonEmptyRegex2.matcher(descriptor.name).find()) {
            return true;
        }
        if (audioEffect instanceof AcousticEchoCanceler) {
            Pattern patternMakeNonEmptyRegex3 = makeNonEmptyRegex("aaec_good_impls");
            Pattern patternMakeNonEmptyRegex4 = makeNonEmptyRegex("aaec_good_names");
            if (patternMakeNonEmptyRegex3 != null && patternMakeNonEmptyRegex3.matcher(descriptor.implementor).find()) {
                return true;
            }
            if (patternMakeNonEmptyRegex4 != null && patternMakeNonEmptyRegex4.matcher(descriptor.name).find()) {
                return true;
            }
        }
        if (!(audioEffect instanceof NoiseSuppressor)) {
            return false;
        }
        Pattern patternMakeNonEmptyRegex5 = makeNonEmptyRegex("ans_good_impls");
        Pattern patternMakeNonEmptyRegex6 = makeNonEmptyRegex("ans_good_names");
        if (patternMakeNonEmptyRegex5 == null || !patternMakeNonEmptyRegex5.matcher(descriptor.implementor).find()) {
            return patternMakeNonEmptyRegex6 != null && patternMakeNonEmptyRegex6.matcher(descriptor.name).find();
        }
        return true;
    }

    public void lambda$startThread$0(ByteBuffer byteBuffer) {
        while (this.running) {
            try {
                if (this.needResampling) {
                    this.audioRecord.read(byteBuffer, 1764);
                    Resampler.convert44to48(byteBuffer, this.buffer);
                } else {
                    this.audioRecord.read(this.buffer, 1920);
                }
                if (!this.running) {
                    this.audioRecord.stop();
                    break;
                }
                nativeCallback(this.buffer);
            } catch (Exception e9) {
                VLog.e(e9);
            }
        }
        VLog.i("audiorecord thread exits");
    }

    private static Pattern makeNonEmptyRegex(String str) {
        String string = Instance.getGlobalServerConfig().getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Pattern.compile(string);
        } catch (Exception e9) {
            VLog.e(e9);
            return null;
        }
    }

    private native void nativeCallback(ByteBuffer byteBuffer);

    private void startThread() {
        if (this.thread != null) {
            throw new IllegalStateException("thread already started");
        }
        this.running = true;
        Thread thread = new Thread(new k7(23, this, this.needResampling ? ByteBuffer.allocateDirect(1764) : null));
        this.thread = thread;
        thread.start();
    }

    private boolean tryInit(int i10, int i11) {
        int i12;
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            try {
                audioRecord.release();
            } catch (Exception unused) {
            }
        }
        VLog.i(a9.p.j(i10, i11, "Trying to initialize AudioRecord with source=", " and sample rate="));
        try {
            i12 = i11;
            try {
                this.audioRecord = new AudioRecord(i10, i12, 16, 2, getBufferSize(this.bufferSize, 48000));
            } catch (Exception e9) {
                e = e9;
                VLog.e("AudioRecord init failed!", e);
            }
        } catch (Exception e10) {
            e = e10;
            i12 = i11;
        }
        this.needResampling = i12 != 48000;
        AudioRecord audioRecord2 = this.audioRecord;
        return audioRecord2 != null && audioRecord2.getState() == 1;
    }

    public int getEnabledEffectsMask() {
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        int i10 = (acousticEchoCanceler == null || !acousticEchoCanceler.getEnabled()) ? 0 : 1;
        NoiseSuppressor noiseSuppressor = this.ns;
        return (noiseSuppressor == null || !noiseSuppressor.getEnabled()) ? i10 : i10 | 2;
    }

    public void init(int i10, int i11, int i12, int i13) {
        if (this.audioRecord != null) {
            throw new IllegalStateException("already inited");
        }
        this.bufferSize = i13;
        boolean zTryInit = tryInit(7, 48000);
        boolean z10 = true;
        if (!zTryInit) {
            zTryInit = tryInit(1, 48000);
        }
        if (!zTryInit) {
            zTryInit = tryInit(7, 44100);
        }
        if (!zTryInit) {
            zTryInit = tryInit(1, 44100);
        }
        if (zTryInit) {
            try {
                if (AutomaticGainControl.isAvailable()) {
                    AutomaticGainControl automaticGainControlCreate = AutomaticGainControl.create(this.audioRecord.getAudioSessionId());
                    this.agc = automaticGainControlCreate;
                    if (automaticGainControlCreate != null) {
                        automaticGainControlCreate.setEnabled(false);
                    }
                } else {
                    VLog.w("AutomaticGainControl is not available on this device :(");
                }
            } catch (Throwable th) {
                VLog.e("error creating AutomaticGainControl", th);
            }
            try {
                if (NoiseSuppressor.isAvailable()) {
                    NoiseSuppressor noiseSuppressorCreate = NoiseSuppressor.create(this.audioRecord.getAudioSessionId());
                    this.ns = noiseSuppressorCreate;
                    if (noiseSuppressorCreate != null) {
                        noiseSuppressorCreate.setEnabled(Instance.getGlobalServerConfig().useSystemNs && isGoodAudioEffect(this.ns));
                    }
                } else {
                    VLog.w("NoiseSuppressor is not available on this device :(");
                }
            } catch (Throwable th2) {
                VLog.e("error creating NoiseSuppressor", th2);
            }
            try {
                if (AcousticEchoCanceler.isAvailable()) {
                    AcousticEchoCanceler acousticEchoCancelerCreate = AcousticEchoCanceler.create(this.audioRecord.getAudioSessionId());
                    this.aec = acousticEchoCancelerCreate;
                    if (acousticEchoCancelerCreate != null) {
                        if (!Instance.getGlobalServerConfig().useSystemAec || !isGoodAudioEffect(this.aec)) {
                            z10 = false;
                        }
                        acousticEchoCancelerCreate.setEnabled(z10);
                    }
                } else {
                    VLog.w("AcousticEchoCanceler is not available on this device");
                }
            } catch (Throwable th3) {
                VLog.e("error creating AcousticEchoCanceler", th3);
            }
            this.buffer = ByteBuffer.allocateDirect(i13);
        }
    }

    public void release() {
        this.running = false;
        Thread thread = this.thread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e9) {
                VLog.e(e9);
            }
            this.thread = null;
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        AutomaticGainControl automaticGainControl = this.agc;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.agc = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
    }

    public boolean start() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null && audioRecord.getState() == 1) {
            try {
                if (this.thread == null) {
                    AudioRecord audioRecord2 = this.audioRecord;
                    if (audioRecord2 == null) {
                        return false;
                    }
                    audioRecord2.startRecording();
                    startThread();
                } else {
                    this.audioRecord.startRecording();
                }
                return true;
            } catch (Exception e9) {
                VLog.e("Error initializing AudioRecord", e9);
            }
        }
        return false;
    }

    public void stop() {
        try {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord != null) {
                audioRecord.stop();
            }
        } catch (Exception unused) {
        }
    }
}
