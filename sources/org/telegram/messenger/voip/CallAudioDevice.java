package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.text.TextUtils;
import org.webrtc.JniCommon;
import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioTrack;
public final class CallAudioDevice {
    public static final String DEBUG_OVERRIDE_KEY = "dbg_call_audio_device";
    public static final int MODE_JAVA = 1;
    public static final int MODE_LEGACY = 0;
    public static final int MODE_OPENSLES = 2;
    public static final String NAME_AUTO = "auto";
    public static final String NAME_JAVA = "java";
    public static final String NAME_LEGACY = "legacy";
    public static final String NAME_OPENSLES = "opensles";
    private static volatile JavaAudioDeviceModule javaModule = null;
    private static volatile int playoutUsage = 2;
    private static volatile SamplesCallback samplesCallback;
    private static volatile boolean speakerMuted;

    public interface SamplesCallback {
        void onSamples(byte[] bArr, int i, int i2);
    }

    private CallAudioDevice() {
    }

    public static long createJavaModule(long j) {
        boolean z;
        if (j == 0) {
            return 0L;
        }
        try {
            boolean z2 = xea.U;
            JavaAudioDeviceModule.Builder builder = JavaAudioDeviceModule.builder(org.telegram.messenger.a.b);
            boolean z3 = false;
            if (!z2 && JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()) {
                z = true;
            } else {
                z = false;
            }
            JavaAudioDeviceModule.Builder useHardwareAcousticEchoCanceler = builder.setUseHardwareAcousticEchoCanceler(z);
            if (!z2 && JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                z3 = true;
            }
            JavaAudioDeviceModule createAudioDeviceModule = useHardwareAcousticEchoCanceler.setUseHardwareNoiseSuppressor(z3).setAudioAttributes(new AudioAttributes.Builder().setUsage(playoutUsage).setContentType(1).build()).setSamplesReadyCallback(new rm0((byte) 16)).setAudioRecordErrorCallback(new JavaAudioDeviceModule.AudioRecordErrorCallback() {
                @Override
                public void onWebRtcAudioRecordError(String str) {
                    cc4.d("CallAudioDevice record: " + str);
                }

                @Override
                public void onWebRtcAudioRecordInitError(String str) {
                    cc4.d("CallAudioDevice record init: " + str);
                }

                @Override
                public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
                    cc4.d("CallAudioDevice record start: " + audioRecordStartErrorCode + " " + str);
                }
            }).setAudioTrackErrorCallback(new JavaAudioDeviceModule.AudioTrackErrorCallback() {
                @Override
                public void onWebRtcAudioTrackError(String str) {
                    cc4.d("CallAudioDevice track: " + str);
                }

                @Override
                public void onWebRtcAudioTrackInitError(String str) {
                    cc4.d("CallAudioDevice track init: " + str);
                }

                @Override
                public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
                    cc4.d("CallAudioDevice track start: " + audioTrackStartErrorCode + " " + str);
                }
            }).createAudioDeviceModule();
            createAudioDeviceModule.setSpeakerMute(speakerMuted);
            long j2 = createAudioDeviceModule.getNative(j);
            if (j2 == 0) {
                createAudioDeviceModule.release();
                return 0L;
            }
            JniCommon.nativeAddRef(j2);
            createAudioDeviceModule.release();
            javaModule = createAudioDeviceModule;
            return j2;
        } catch (Throwable th) {
            cc4.g(th, true);
            return 0L;
        }
    }

    public static String getDebugOverride() {
        return uc7.e1().getString("dbg_call_audio_device", "");
    }

    public static int getMode(int r3) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.CallAudioDevice.getMode(int):int");
    }

    public static String getModeName(int i) {
        String debugOverride = getDebugOverride();
        if (!TextUtils.isEmpty(debugOverride)) {
            return debugOverride;
        }
        String str = uc7.s1(i).k4.H.f;
        if (TextUtils.isEmpty(str)) {
            return "java";
        }
        return str;
    }

    private static boolean hasLowLatencyAudio() {
        return org.telegram.messenger.a.b.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static boolean isSpeakerMuted() {
        return speakerMuted;
    }

    public static void lambda$createJavaModule$1(JavaAudioDeviceModule.AudioSamples audioSamples) {
        SamplesCallback samplesCallback2 = samplesCallback;
        if (samplesCallback2 != null) {
            samplesCallback2.onSamples(audioSamples.getData(), audioSamples.getSampleRate(), audioSamples.getChannelCount());
        }
    }

    public static void lambda$setOnRecordedSamples$0(SamplesCallback samplesCallback2, WebRtcAudioRecord.AudioSamples audioSamples) {
        samplesCallback2.onSamples(audioSamples.getData(), audioSamples.getSampleRate(), audioSamples.getChannelCount());
    }

    public static String modeToString(int i) {
        if (i != 1) {
            if (i != 2) {
                return "legacy";
            }
            return "opensles";
        }
        return "java";
    }

    public static void setDebugOverride(String str) {
        SharedPreferences.Editor edit = uc7.e1().edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove("dbg_call_audio_device");
        } else {
            edit.putString("dbg_call_audio_device", str);
        }
        edit.apply();
    }

    public static void setOnRecordedSamples(SamplesCallback samplesCallback2) {
        tg0 tg0Var;
        samplesCallback = samplesCallback2;
        if (samplesCallback2 == null) {
            tg0Var = null;
        } else {
            tg0Var = new tg0(samplesCallback2, (byte) 25);
        }
        WebRtcAudioRecord.setOnAudioSamplesReady(tg0Var);
    }

    public static void setPlayoutStreamType(int i) {
        WebRtcAudioTrack.setAudioStreamType(i);
    }

    public static void setPlayoutUsage(int i) {
        playoutUsage = i;
        WebRtcAudioTrack.setAudioTrackUsageAttribute(i);
    }

    public static void setSpeakerMute(boolean z) {
        speakerMuted = z;
        WebRtcAudioTrack.setSpeakerMute(z);
        JavaAudioDeviceModule javaAudioDeviceModule = javaModule;
        if (javaAudioDeviceModule != null) {
            javaAudioDeviceModule.setSpeakerMute(z);
        }
    }
}
