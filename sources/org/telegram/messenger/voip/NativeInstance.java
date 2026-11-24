package org.telegram.messenger.voip;

import android.graphics.Point;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.ContextUtils;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioRecord;
public class NativeInstance {
    private static volatile boolean ownAudioCapture;
    private static volatile float ownAudioLevel;
    private static volatile boolean ownAudioLevelMeter;
    private static int ownPeak;
    private static int ownPeakCount;
    private AudioLevelsCallback audioLevelsCallback;
    private BroadcastStateCallback broadcastStateCallback;
    private Instance.FinalState finalState;
    private boolean isGroup;
    private long nativePtr;
    private Instance.OnRemoteMediaStateUpdatedListener onRemoteMediaStateUpdatedListener;
    private Instance.OnSignalBarsUpdatedListener onSignalBarsUpdatedListener;
    private Instance.OnSignalingDataListener onSignalDataListener;
    private Instance.OnStateUpdatedListener onStateUpdatedListener;
    private PayloadCallback payloadCallback;
    private String persistentStateFilePath;
    private CountDownLatch stopBarrier;
    private VideoSourcesCallback unknownParticipantsCallback;
    private float[] temp = new float[1];
    private final HashMap<String, VideoSink> incomingSinks = new HashMap<>();
    private final HashMap<Long, String> incomingSinkEndpoints = new HashMap<>();

    public interface AudioLevelsCallback {
        void run(int[] iArr, float[] fArr, boolean[] zArr);
    }

    public interface BroadcastStateCallback {
        void onBroadcastStateChanged(boolean z, boolean z2);
    }

    public interface PayloadCallback {
        void run(int i, String str);
    }

    public static class SsrcGroup {
        public String semantics;
        public int[] ssrcs;
    }

    public interface VideoSourcesCallback {
        void run(long j, int[] iArr);
    }

    public static void a(NativeInstance nativeInstance, int i, String str) {
        nativeInstance.lambda$onEmitJoinPayload$3(i, str);
    }

    private native long addIncomingVideoOutputNative(int i, String str, SsrcGroup[] ssrcGroupArr, VideoSink videoSink, long j);

    public static native long createVideoCapturer(VideoSink videoSink, int i);

    public static native void destroyVideoCapturer(long j);

    public static void e(WebRtcAudioRecord.AudioSamples audioSamples) {
        onRecordedSamples(audioSamples);
    }

    public static native String[] getAllVersions();

    public static float getOwnAudioLevel() {
        if (ownAudioLevelMeter) {
            return ownAudioLevel;
        }
        return 0.0f;
    }

    public void lambda$onAudioLevelsUpdated$1(int[] iArr, float[] fArr, boolean[] zArr) {
        this.audioLevelsCallback.run(iArr, fArr, zArr);
    }

    public void lambda$onEmitJoinPayload$3(int i, String str) {
        this.payloadCallback.run(i, str);
    }

    public void lambda$onNetworkStateUpdated$0(boolean z, boolean z2) {
        this.onStateUpdatedListener.onStateUpdated(z ? 1 : 0, z2);
    }

    public void lambda$onParticipantDescriptionsRequired$2(long j, int[] iArr) {
        this.unknownParticipantsCallback.run(j, iArr);
    }

    public static NativeInstance make(String str, Instance.Config config, String str2, Instance.Endpoint[] endpointArr, Instance.Proxy proxy, int i, Instance.EncryptionKey encryptionKey, VideoSink videoSink, long j, AudioLevelsCallback audioLevelsCallback) {
        if (e21.a) {
            fc4.b("create new tgvoip instance, version " + str);
        }
        NativeInstance nativeInstance = new NativeInstance();
        nativeInstance.persistentStateFilePath = str2;
        nativeInstance.audioLevelsCallback = audioLevelsCallback;
        Point point = gm.q;
        nativeInstance.nativePtr = makeNativeInstance(str, nativeInstance, config, str2, endpointArr, proxy, i, encryptionKey, videoSink, j, Math.min(point.x, point.y) / Math.max(point.x, point.y));
        return nativeInstance;
    }

    public static NativeInstance makeGroup(String str, long j, boolean z, boolean z2, PayloadCallback payloadCallback, AudioLevelsCallback audioLevelsCallback, VideoSourcesCallback videoSourcesCallback, boolean z3) {
        ContextUtils.initialize(org.telegram.messenger.a.b);
        NativeInstance nativeInstance = new NativeInstance();
        nativeInstance.payloadCallback = payloadCallback;
        nativeInstance.audioLevelsCallback = audioLevelsCallback;
        nativeInstance.unknownParticipantsCallback = videoSourcesCallback;
        nativeInstance.isGroup = true;
        nativeInstance.nativePtr = makeGroupNativeInstance(nativeInstance, str, gda.U, j, z, z2, z3);
        return nativeInstance;
    }

    private static native long makeGroupNativeInstance(NativeInstance nativeInstance, String str, boolean z, long j, boolean z2, boolean z3, boolean z4);

    private static native long makeNativeInstance(String str, NativeInstance nativeInstance, Instance.Config config, String str2, Instance.Endpoint[] endpointArr, Instance.Proxy proxy, int i, Instance.EncryptionKey encryptionKey, VideoSink videoSink, long j, float f);

    private static void measureOwnLevel(byte[] bArr, int i) {
        int i2 = i << 1;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < bArr.length) {
                int abs = Math.abs((int) ((short) ((bArr[i3] & 255) | (bArr[i4] << 8))));
                int i5 = ownPeak;
                if (abs > i5) {
                    ownPeak = abs;
                } else {
                    abs = i5;
                }
                int i6 = ownPeakCount + 1;
                ownPeakCount = i6;
                if (i6 >= 1200) {
                    ownAudioLevel = abs / 8000.0f;
                    ownPeak = 0;
                    ownPeakCount = 0;
                }
                i3 += i2;
            } else {
                return;
            }
        }
    }

    private void onAudioLevelsUpdated(int[] iArr, float[] fArr, boolean[] zArr) {
        if (this.isGroup && iArr != null && iArr.length == 0) {
            return;
        }
        gm.c3(new jy6(this, iArr, fArr, zArr, (byte) 12));
    }

    private void onBroadcastStateChanged(boolean z, boolean z2) {
        BroadcastStateCallback broadcastStateCallback = this.broadcastStateCallback;
        if (broadcastStateCallback != null) {
            broadcastStateCallback.onBroadcastStateChanged(z, z2);
        }
    }

    private void onEmitJoinPayload(String str, int i) {
        try {
            gm.c3(new h65(this, i, str, (byte) 15));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    private void onNetworkStateUpdated(boolean z, boolean z2) {
        if (this.onStateUpdatedListener != null) {
            gm.c3(new c04(this, z, z2, (byte) 1));
        }
    }

    private void onParticipantDescriptionsRequired(long j, int[] iArr) {
        if (this.unknownParticipantsCallback == null) {
            return;
        }
        gm.c3(new hq6(this, j, iArr, (byte) 20));
    }

    public static void onRecordedSamples(WebRtcAudioRecord.AudioSamples audioSamples) {
        if (ownAudioLevelMeter && audioSamples.getAudioFormat() == 2) {
            measureOwnLevel(audioSamples.getData(), Math.max(1, audioSamples.getChannelCount()));
        }
        if (ownAudioCapture) {
            pushOwnAudio(audioSamples.getData(), audioSamples.getSampleRate(), audioSamples.getChannelCount());
        }
    }

    private void onRemoteMediaStateUpdated(int i, int i2) {
        Instance.OnRemoteMediaStateUpdatedListener onRemoteMediaStateUpdatedListener = this.onRemoteMediaStateUpdatedListener;
        if (onRemoteMediaStateUpdatedListener != null) {
            onRemoteMediaStateUpdatedListener.onMediaStateUpdated(i, i2);
        }
    }

    private void onSignalBarsUpdated(int i) {
        Instance.OnSignalBarsUpdatedListener onSignalBarsUpdatedListener = this.onSignalBarsUpdatedListener;
        if (onSignalBarsUpdatedListener != null) {
            onSignalBarsUpdatedListener.onSignalBarsUpdated(i);
        }
    }

    private void onSignalingData(byte[] bArr) {
        Instance.OnSignalingDataListener onSignalingDataListener = this.onSignalDataListener;
        if (onSignalingDataListener != null) {
            onSignalingDataListener.onSignalingData(bArr);
        }
    }

    private void onStateUpdated(int i) {
        Instance.OnStateUpdatedListener onStateUpdatedListener = this.onStateUpdatedListener;
        if (onStateUpdatedListener != null) {
            onStateUpdatedListener.onStateUpdated(i, false);
        }
    }

    private void onStop(Instance.FinalState finalState) {
        this.finalState = finalState;
        CountDownLatch countDownLatch = this.stopBarrier;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static native String probeListenerAudio(byte[] bArr, int i);

    private static native void pushOwnAudio(byte[] bArr, int i, int i2);

    public static native byte[] readIncomingAudio();

    private native void removeIncomingVideoOutputNative(long j);

    public static void setIncomingAudioCapture(boolean z) {
        ownAudioCapture = z;
        updateRecordedSamplesCallback();
        setIncomingAudioCaptureNative(z);
    }

    private static native void setIncomingAudioCaptureNative(boolean z);

    public static void setOwnAudioLevelMeter(boolean z) {
        ownAudioLevelMeter = z;
        if (!z) {
            ownAudioLevel = 0.0f;
        }
        updateRecordedSamplesCallback();
    }

    public static native void setVideoStateCapturer(long j, int i);

    private native void stopGroupNative();

    private native void stopNative();

    public static native void switchCameraCapturer(long j, boolean z);

    private static synchronized void updateRecordedSamplesCallback() {
        bh7 bh7Var;
        synchronized (NativeInstance.class) {
            if (!ownAudioCapture && !ownAudioLevelMeter) {
                bh7Var = null;
            } else {
                bh7Var = new bh7((byte) 2);
            }
            WebRtcAudioRecord.setOnAudioSamplesReady(bh7Var);
        }
    }

    public native void activateVideoCapturer(long j);

    public long addIncomingVideoOutput(int i, String str, SsrcGroup[] ssrcGroupArr, VideoSink videoSink, long j) {
        long addIncomingVideoOutputNative = addIncomingVideoOutputNative(i, str, ssrcGroupArr, videoSink, j);
        synchronized (this.incomingSinks) {
            if (str != null && videoSink != null) {
                this.incomingSinks.put(str, videoSink);
                this.incomingSinkEndpoints.put(Long.valueOf(addIncomingVideoOutputNative), str);
            }
        }
        return addIncomingVideoOutputNative;
    }

    public native void clearVideoCapturer();

    public native boolean deliverListenerAudio(long j, byte[] bArr, int i);

    public native void deliverListenerVideo(long j, byte[] bArr, int i);

    public native String getDebugInfo();

    public VideoSink getIncomingVideoSink(String str) {
        VideoSink videoSink;
        synchronized (this.incomingSinks) {
            videoSink = this.incomingSinks.get(str);
        }
        return videoSink;
    }

    public native String getLastError();

    public int getPeerCapabilities() {
        return 0;
    }

    public native byte[] getPersistentState();

    public native long getPreferredRelayId();

    public native Instance.TrafficStats getTrafficStats();

    public native boolean hasVideoCapturer();

    public boolean isGroup() {
        return this.isGroup;
    }

    public native void onMediaDescriptionAvailable(long j, VoIPService.RequestedParticipant[] requestedParticipantArr);

    public native void onSignalingDataReceive(byte[] bArr);

    public native boolean playListenerAudio(long j, long j2, int i);

    public native void prepareForStream(boolean z);

    public void removeIncomingVideoOutput(long j) {
        synchronized (this.incomingSinks) {
            if (j == 0) {
                this.incomingSinks.clear();
                this.incomingSinkEndpoints.clear();
            } else {
                String remove = this.incomingSinkEndpoints.remove(Long.valueOf(j));
                if (remove != null) {
                    this.incomingSinks.remove(remove);
                }
            }
        }
        removeIncomingVideoOutputNative(j);
    }

    public native void resetGroupInstance(boolean z, boolean z2);

    public native void setAudioOutputGainControlEnabled(boolean z);

    public void setBroadcastStateCallback(BroadcastStateCallback broadcastStateCallback) {
        this.broadcastStateCallback = broadcastStateCallback;
    }

    public native void setBufferSize(int i);

    public native void setConferenceCallId(long j);

    public native void setEchoCancellationStrength(int i);

    public native void setGlobalServerConfig(String str);

    public native void setJoinResponsePayload(String str);

    public native void setMuteMicrophone(boolean z);

    public native void setNetworkType(int i);

    public native void setNoiseSuppressionEnabled(boolean z);

    public void setOnRemoteMediaStateUpdatedListener(Instance.OnRemoteMediaStateUpdatedListener onRemoteMediaStateUpdatedListener) {
        this.onRemoteMediaStateUpdatedListener = onRemoteMediaStateUpdatedListener;
    }

    public void setOnSignalBarsUpdatedListener(Instance.OnSignalBarsUpdatedListener onSignalBarsUpdatedListener) {
        this.onSignalBarsUpdatedListener = onSignalBarsUpdatedListener;
    }

    public void setOnSignalDataListener(Instance.OnSignalingDataListener onSignalingDataListener) {
        this.onSignalDataListener = onSignalingDataListener;
    }

    public void setOnStateUpdatedListener(Instance.OnStateUpdatedListener onStateUpdatedListener) {
        this.onStateUpdatedListener = onStateUpdatedListener;
    }

    public native void setVideoEndpointQuality(String str, int i);

    public native void setVideoState(int i);

    public native void setVolume(int i, double d);

    public native void setupOutgoingVideo(VideoSink videoSink, int i);

    public native void setupOutgoingVideoCreated(long j);

    public Instance.FinalState stop() {
        this.stopBarrier = new CountDownLatch(1);
        stopNative();
        try {
            this.stopBarrier.await();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        return this.finalState;
    }

    public void stopGroup() {
        stopGroupNative();
    }

    public native void switchCamera(boolean z);
}
