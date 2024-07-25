package org.telegram.messenger.voip;

import android.graphics.Point;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.Instance;
import org.webrtc.ContextUtils;
import org.webrtc.VideoSink;
public class NativeInstance {
    private AudioLevelsCallback audioLevelsCallback;
    private RequestBroadcastPartCallback cancelRequestBroadcastPartCallback;
    private Instance.FinalState finalState;
    private boolean isGroup;
    private long nativePtr;
    private Instance.OnRemoteMediaStateUpdatedListener onRemoteMediaStateUpdatedListener;
    private Instance.OnSignalBarsUpdatedListener onSignalBarsUpdatedListener;
    private Instance.OnSignalingDataListener onSignalDataListener;
    private Instance.OnStateUpdatedListener onStateUpdatedListener;
    private PayloadCallback payloadCallback;
    private String persistentStateFilePath;
    private RequestBroadcastPartCallback requestBroadcastPartCallback;
    private RequestCurrentTimeCallback requestCurrentTimeCallback;
    private CountDownLatch stopBarrier;
    private float[] temp = new float[1];
    private VideoSourcesCallback unknownParticipantsCallback;

    public interface AudioLevelsCallback {
        void run(int[] iArr, float[] fArr, boolean[] zArr);
    }

    public interface PayloadCallback {
        void run(int i, String str);
    }

    public interface RequestBroadcastPartCallback {
        void run(long j, long j2, int i, int i2);
    }

    public interface RequestCurrentTimeCallback {
        void run(long j);
    }

    public static class SsrcGroup {
        public String semantics;
        public int[] ssrcs;
    }

    public interface VideoSourcesCallback {
        void run(long j, int[] iArr);
    }

    public static native long createVideoCapturer(VideoSink videoSink, int i);

    public static native void destroyVideoCapturer(long j);

    private static native long makeGroupNativeInstance(NativeInstance nativeInstance, String str, boolean z, long j, boolean z2, boolean z3);

    private static native long makeNativeInstance(String str, NativeInstance nativeInstance, Instance.Config config, String str2, Instance.Endpoint[] endpointArr, Instance.Proxy proxy, int i, Instance.EncryptionKey encryptionKey, VideoSink videoSink, long j, float f);

    public static native void setVideoStateCapturer(long j, int i);

    private native void stopGroupNative();

    private native void stopNative();

    public static native void switchCameraCapturer(long j, boolean z);

    public native void activateVideoCapturer(long j);

    public native long addIncomingVideoOutput(int i, String str, SsrcGroup[] ssrcGroupArr, VideoSink videoSink);

    public native void clearVideoCapturer();

    public native String getDebugInfo();

    public native String getLastError();

    public int getPeerCapabilities() {
        return 0;
    }

    public native byte[] getPersistentState();

    public native long getPreferredRelayId();

    public native Instance.TrafficStats getTrafficStats();

    public native String getVersion();

    public native boolean hasVideoCapturer();

    public native void onMediaDescriptionAvailable(long j, int[] iArr);

    public native void onRequestTimeComplete(long j, long j2);

    public native void onSignalingDataReceive(byte[] bArr);

    public native void onStreamPartAvailable(long j, ByteBuffer byteBuffer, int i, long j2, int i2, int i3);

    public native void prepareForStream(boolean z);

    public native void removeIncomingVideoOutput(long j);

    public native void resetGroupInstance(boolean z, boolean z2);

    public native void setAudioOutputGainControlEnabled(boolean z);

    public native void setBufferSize(int i);

    public native void setEchoCancellationStrength(int i);

    public native void setGlobalServerConfig(String str);

    public native void setJoinResponsePayload(String str);

    public native void setMuteMicrophone(boolean z);

    public native void setNetworkType(int i);

    public native void setNoiseSuppressionEnabled(boolean z);

    public native void setVideoEndpointQuality(String str, int i);

    public native void setVideoState(int i);

    public native void setVolume(int i, double d);

    public native void setupOutgoingVideo(VideoSink videoSink, int i);

    public native void setupOutgoingVideoCreated(long j);

    public native void switchCamera(boolean z);

    public static NativeInstance make(String str, Instance.Config config, String str2, Instance.Endpoint[] endpointArr, Instance.Proxy proxy, int i, Instance.EncryptionKey encryptionKey, VideoSink videoSink, long j, AudioLevelsCallback audioLevelsCallback) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("create new tgvoip instance, version " + str);
        }
        NativeInstance nativeInstance = new NativeInstance();
        nativeInstance.persistentStateFilePath = str2;
        nativeInstance.audioLevelsCallback = audioLevelsCallback;
        Point point = AndroidUtilities.displaySize;
        Point point2 = AndroidUtilities.displaySize;
        nativeInstance.nativePtr = makeNativeInstance(str, nativeInstance, config, str2, endpointArr, proxy, i, encryptionKey, videoSink, j, Math.min(point.x, point.y) / Math.max(point2.x, point2.y));
        return nativeInstance;
    }

    public static NativeInstance makeGroup(String str, long j, boolean z, boolean z2, PayloadCallback payloadCallback, AudioLevelsCallback audioLevelsCallback, VideoSourcesCallback videoSourcesCallback, RequestBroadcastPartCallback requestBroadcastPartCallback, RequestBroadcastPartCallback requestBroadcastPartCallback2, RequestCurrentTimeCallback requestCurrentTimeCallback) {
        ContextUtils.initialize(ApplicationLoader.applicationContext);
        NativeInstance nativeInstance = new NativeInstance();
        nativeInstance.payloadCallback = payloadCallback;
        nativeInstance.audioLevelsCallback = audioLevelsCallback;
        nativeInstance.unknownParticipantsCallback = videoSourcesCallback;
        nativeInstance.requestBroadcastPartCallback = requestBroadcastPartCallback;
        nativeInstance.cancelRequestBroadcastPartCallback = requestBroadcastPartCallback2;
        nativeInstance.requestCurrentTimeCallback = requestCurrentTimeCallback;
        nativeInstance.isGroup = true;
        nativeInstance.nativePtr = makeGroupNativeInstance(nativeInstance, str, SharedConfig.disableVoiceAudioEffects, j, z, z2);
        return nativeInstance;
    }

    public boolean isGroup() {
        return this.isGroup;
    }

    public void setOnStateUpdatedListener(Instance.OnStateUpdatedListener onStateUpdatedListener) {
        this.onStateUpdatedListener = onStateUpdatedListener;
    }

    public void setOnSignalBarsUpdatedListener(Instance.OnSignalBarsUpdatedListener onSignalBarsUpdatedListener) {
        this.onSignalBarsUpdatedListener = onSignalBarsUpdatedListener;
    }

    public void setOnSignalDataListener(Instance.OnSignalingDataListener onSignalingDataListener) {
        this.onSignalDataListener = onSignalingDataListener;
    }

    public void setOnRemoteMediaStateUpdatedListener(Instance.OnRemoteMediaStateUpdatedListener onRemoteMediaStateUpdatedListener) {
        this.onRemoteMediaStateUpdatedListener = onRemoteMediaStateUpdatedListener;
    }

    private void onStateUpdated(int i) {
        Instance.OnStateUpdatedListener onStateUpdatedListener = this.onStateUpdatedListener;
        if (onStateUpdatedListener != null) {
            onStateUpdatedListener.onStateUpdated(i, false);
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

    private void onRemoteMediaStateUpdated(int i, int i2) {
        Instance.OnRemoteMediaStateUpdatedListener onRemoteMediaStateUpdatedListener = this.onRemoteMediaStateUpdatedListener;
        if (onRemoteMediaStateUpdatedListener != null) {
            onRemoteMediaStateUpdatedListener.onMediaStateUpdated(i, i2);
        }
    }

    private void onNetworkStateUpdated(final boolean z, final boolean z2) {
        if (this.onStateUpdatedListener != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NativeInstance.this.lambda$onNetworkStateUpdated$0(z, z2);
                }
            });
        }
    }

    public void lambda$onNetworkStateUpdated$0(boolean z, boolean z2) {
        this.onStateUpdatedListener.onStateUpdated(z ? 1 : 0, z2);
    }

    private void onAudioLevelsUpdated(final int[] iArr, final float[] fArr, final boolean[] zArr) {
        if (this.isGroup && iArr != null && iArr.length == 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NativeInstance.this.lambda$onAudioLevelsUpdated$1(iArr, fArr, zArr);
            }
        });
    }

    public void lambda$onAudioLevelsUpdated$1(int[] iArr, float[] fArr, boolean[] zArr) {
        this.audioLevelsCallback.run(iArr, fArr, zArr);
    }

    private void onParticipantDescriptionsRequired(final long j, final int[] iArr) {
        if (this.unknownParticipantsCallback == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                NativeInstance.this.lambda$onParticipantDescriptionsRequired$2(j, iArr);
            }
        });
    }

    public void lambda$onParticipantDescriptionsRequired$2(long j, int[] iArr) {
        this.unknownParticipantsCallback.run(j, iArr);
    }

    public void lambda$onEmitJoinPayload$3(int i, String str) {
        this.payloadCallback.run(i, str);
    }

    private void onEmitJoinPayload(final String str, final int i) {
        try {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NativeInstance.this.lambda$onEmitJoinPayload$3(i, str);
                }
            });
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void onRequestBroadcastPart(long j, long j2, int i, int i2) {
        this.requestBroadcastPartCallback.run(j, j2, i, i2);
    }

    private void onCancelRequestBroadcastPart(long j, int i, int i2) {
        this.cancelRequestBroadcastPartCallback.run(j, 0L, 0, 0);
    }

    private void requestCurrentTime(long j) {
        this.requestCurrentTimeCallback.run(j);
    }

    private void onStop(Instance.FinalState finalState) {
        this.finalState = finalState;
        CountDownLatch countDownLatch = this.stopBarrier;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public Instance.FinalState stop() {
        this.stopBarrier = new CountDownLatch(1);
        stopNative();
        try {
            this.stopBarrier.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return this.finalState;
    }

    public void stopGroup() {
        stopGroupNative();
    }
}
