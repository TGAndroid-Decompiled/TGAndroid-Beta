package org.telegram.messenger.voip;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;
import nh.b6;
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
        Pattern makeNonEmptyRegex = makeNonEmptyRegex("adsp_good_impls");
        Pattern makeNonEmptyRegex2 = makeNonEmptyRegex("adsp_good_names");
        AudioEffect.Descriptor descriptor = audioEffect.getDescriptor();
        VLog.d(audioEffect.getClass().getSimpleName() + ": implementor=" + descriptor.implementor + ", name=" + descriptor.name);
        if (makeNonEmptyRegex != null && makeNonEmptyRegex.matcher(descriptor.implementor).find()) {
            return true;
        }
        if (makeNonEmptyRegex2 != null && makeNonEmptyRegex2.matcher(descriptor.name).find()) {
            return true;
        }
        if (audioEffect instanceof AcousticEchoCanceler) {
            Pattern makeNonEmptyRegex3 = makeNonEmptyRegex("aaec_good_impls");
            Pattern makeNonEmptyRegex4 = makeNonEmptyRegex("aaec_good_names");
            if (makeNonEmptyRegex3 != null && makeNonEmptyRegex3.matcher(descriptor.implementor).find()) {
                return true;
            }
            if (makeNonEmptyRegex4 != null && makeNonEmptyRegex4.matcher(descriptor.name).find()) {
                return true;
            }
        }
        if (audioEffect instanceof NoiseSuppressor) {
            Pattern makeNonEmptyRegex5 = makeNonEmptyRegex("ans_good_impls");
            Pattern makeNonEmptyRegex6 = makeNonEmptyRegex("ans_good_names");
            if (makeNonEmptyRegex5 != null && makeNonEmptyRegex5.matcher(descriptor.implementor).find()) {
                return true;
            }
            if (makeNonEmptyRegex6 != null && makeNonEmptyRegex6.matcher(descriptor.name).find()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void lambda$startThread$0(ByteBuffer byteBuffer) {
        while (this.running) {
            try {
                if (!this.needResampling) {
                    this.audioRecord.read(this.buffer, 1920);
                } else {
                    this.audioRecord.read(byteBuffer, 1764);
                    Resampler.convert44to48(byteBuffer, this.buffer);
                }
            } catch (Exception e10) {
                VLog.e(e10);
            }
            if (!this.running) {
                this.audioRecord.stop();
                break;
            }
            nativeCallback(this.buffer);
        }
        VLog.i("audiorecord thread exits");
    }

    private static Pattern makeNonEmptyRegex(String str) {
        String string = Instance.getGlobalServerConfig().getString(str);
        if (!TextUtils.isEmpty(string)) {
            try {
                return Pattern.compile(string);
            } catch (Exception e10) {
                VLog.e(e10);
                return null;
            }
        }
        return null;
    }

    private native void nativeCallback(ByteBuffer byteBuffer);

    private void startThread() {
        ByteBuffer byteBuffer;
        if (this.thread == null) {
            this.running = true;
            if (this.needResampling) {
                byteBuffer = ByteBuffer.allocateDirect(1764);
            } else {
                byteBuffer = null;
            }
            Thread thread = new Thread(new b6(20, this, byteBuffer));
            this.thread = thread;
            thread.start();
            return;
        }
        throw new IllegalStateException("thread already started");
    }

    private boolean tryInit(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.AudioRecordJNI.tryInit(int, int):boolean");
    }

    public int getEnabledEffectsMask() {
        int i10;
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null && acousticEchoCanceler.getEnabled()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null && noiseSuppressor.getEnabled()) {
            return i10 | 2;
        }
        return i10;
    }

    public void init(int i10, int i11, int i12, int i13) {
        boolean z10;
        if (this.audioRecord == null) {
            this.bufferSize = i13;
            boolean tryInit = tryInit(7, 48000);
            boolean z11 = true;
            if (!tryInit) {
                tryInit = tryInit(1, 48000);
            }
            if (!tryInit) {
                tryInit = tryInit(7, 44100);
            }
            if (!tryInit) {
                tryInit = tryInit(1, 44100);
            }
            if (!tryInit) {
                return;
            }
            try {
                if (AutomaticGainControl.isAvailable()) {
                    AutomaticGainControl create = AutomaticGainControl.create(this.audioRecord.getAudioSessionId());
                    this.agc = create;
                    if (create != null) {
                        create.setEnabled(false);
                    }
                } else {
                    VLog.w("AutomaticGainControl is not available on this device :(");
                }
            } catch (Throwable th2) {
                VLog.e("error creating AutomaticGainControl", th2);
            }
            try {
                if (NoiseSuppressor.isAvailable()) {
                    NoiseSuppressor create2 = NoiseSuppressor.create(this.audioRecord.getAudioSessionId());
                    this.ns = create2;
                    if (create2 != null) {
                        if (Instance.getGlobalServerConfig().useSystemNs && isGoodAudioEffect(this.ns)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        create2.setEnabled(z10);
                    }
                } else {
                    VLog.w("NoiseSuppressor is not available on this device :(");
                }
            } catch (Throwable th3) {
                VLog.e("error creating NoiseSuppressor", th3);
            }
            try {
                if (AcousticEchoCanceler.isAvailable()) {
                    AcousticEchoCanceler create3 = AcousticEchoCanceler.create(this.audioRecord.getAudioSessionId());
                    this.aec = create3;
                    if (create3 != null) {
                        if (!Instance.getGlobalServerConfig().useSystemAec || !isGoodAudioEffect(this.aec)) {
                            z11 = false;
                        }
                        create3.setEnabled(z11);
                    }
                } else {
                    VLog.w("AcousticEchoCanceler is not available on this device");
                }
            } catch (Throwable th4) {
                VLog.e("error creating AcousticEchoCanceler", th4);
            }
            this.buffer = ByteBuffer.allocateDirect(i13);
            return;
        }
        throw new IllegalStateException("already inited");
    }

    public void release() {
        this.running = false;
        Thread thread = this.thread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e10) {
                VLog.e(e10);
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
            } catch (Exception e10) {
                VLog.e("Error initializing AudioRecord", e10);
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
