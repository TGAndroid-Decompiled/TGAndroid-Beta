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
import org.telegram.messenger.voip.VoIPService;
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
        void run(int i10, String str);
    }

    public interface RequestBroadcastPartCallback {
        void run(long j10, long j11, int i10, int i11);
    }

    public interface RequestCurrentTimeCallback {
        void run(long j10);
    }

    public static class SsrcGroup {
        public String semantics;
        public int[] ssrcs;
    }

    public interface VideoSourcesCallback {
        void run(long j10, int[] iArr);
    }

    public static native long createVideoCapturer(VideoSink videoSink, int i10);

    public static native void destroyVideoCapturer(long j10);

    public static native String[] getAllVersions();

    public void lambda$onAudioLevelsUpdated$1(int[] iArr, float[] fArr, boolean[] zArr) {
        this.audioLevelsCallback.run(iArr, fArr, zArr);
    }

    public void lambda$onEmitJoinPayload$3(int i10, String str) {
        this.payloadCallback.run(i10, str);
    }

    public void lambda$onNetworkStateUpdated$0(boolean z10, boolean z11) {
        this.onStateUpdatedListener.onStateUpdated(z10 ? 1 : 0, z11);
    }

    public void lambda$onParticipantDescriptionsRequired$2(long j10, int[] iArr) {
        this.unknownParticipantsCallback.run(j10, iArr);
    }

    public static NativeInstance make(String str, Instance.Config config, String str2, Instance.Endpoint[] endpointArr, Instance.Proxy proxy, int i10, Instance.EncryptionKey encryptionKey, VideoSink videoSink, long j10, AudioLevelsCallback audioLevelsCallback) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("create new tgvoip instance, version " + str);
        }
        NativeInstance nativeInstance = new NativeInstance();
        nativeInstance.persistentStateFilePath = str2;
        nativeInstance.audioLevelsCallback = audioLevelsCallback;
        Point point = AndroidUtilities.displaySize;
        Point point2 = AndroidUtilities.displaySize;
        nativeInstance.nativePtr = makeNativeInstance(str, nativeInstance, config, str2, endpointArr, proxy, i10, encryptionKey, videoSink, j10, Math.min(point.x, point.y) / Math.max(point2.x, point2.y));
        return nativeInstance;
    }

    public static NativeInstance makeGroup(String str, long j10, boolean z10, boolean z11, PayloadCallback payloadCallback, AudioLevelsCallback audioLevelsCallback, VideoSourcesCallback videoSourcesCallback, RequestBroadcastPartCallback requestBroadcastPartCallback, RequestBroadcastPartCallback requestBroadcastPartCallback2, RequestCurrentTimeCallback requestCurrentTimeCallback, boolean z12) {
        ContextUtils.initialize(ApplicationLoader.applicationContext);
        NativeInstance nativeInstance = new NativeInstance();
        nativeInstance.payloadCallback = payloadCallback;
        nativeInstance.audioLevelsCallback = audioLevelsCallback;
        nativeInstance.unknownParticipantsCallback = videoSourcesCallback;
        nativeInstance.requestBroadcastPartCallback = requestBroadcastPartCallback;
        nativeInstance.cancelRequestBroadcastPartCallback = requestBroadcastPartCallback2;
        nativeInstance.requestCurrentTimeCallback = requestCurrentTimeCallback;
        nativeInstance.isGroup = true;
        nativeInstance.nativePtr = makeGroupNativeInstance(nativeInstance, str, SharedConfig.disableVoiceAudioEffects, j10, z10, z11, z12);
        return nativeInstance;
    }

    private static native long makeGroupNativeInstance(NativeInstance nativeInstance, String str, boolean z10, long j10, boolean z11, boolean z12, boolean z13);

    private static native long makeNativeInstance(String str, NativeInstance nativeInstance, Instance.Config config, String str2, Instance.Endpoint[] endpointArr, Instance.Proxy proxy, int i10, Instance.EncryptionKey encryptionKey, VideoSink videoSink, long j10, float f9);

    private void onAudioLevelsUpdated(int[] iArr, float[] fArr, boolean[] zArr) {
        if (this.isGroup && iArr != null && iArr.length == 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new k(this, iArr, fArr, zArr, 1));
    }

    private void onCancelRequestBroadcastPart(long j10, int i10, int i11) {
        this.cancelRequestBroadcastPartCallback.run(j10, 0L, 0, 0);
    }

    private void onEmitJoinPayload(String str, int i10) {
        try {
            AndroidUtilities.runOnUIThread(new ag.v0(this, i10, str, 19));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    private void onNetworkStateUpdated(boolean z10, boolean z11) {
        if (this.onStateUpdatedListener != null) {
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.k(this, z10, z11, 1));
        }
    }

    private void onParticipantDescriptionsRequired(long j10, int[] iArr) {
        if (this.unknownParticipantsCallback == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new g5.v(this, j10, iArr, 13));
    }

    private void onRemoteMediaStateUpdated(int i10, int i11) {
        Instance.OnRemoteMediaStateUpdatedListener onRemoteMediaStateUpdatedListener = this.onRemoteMediaStateUpdatedListener;
        if (onRemoteMediaStateUpdatedListener != null) {
            onRemoteMediaStateUpdatedListener.onMediaStateUpdated(i10, i11);
        }
    }

    private void onRequestBroadcastPart(long j10, long j11, int i10, int i11) {
        this.requestBroadcastPartCallback.run(j10, j11, i10, i11);
    }

    private void onSignalBarsUpdated(int i10) {
        Instance.OnSignalBarsUpdatedListener onSignalBarsUpdatedListener = this.onSignalBarsUpdatedListener;
        if (onSignalBarsUpdatedListener != null) {
            onSignalBarsUpdatedListener.onSignalBarsUpdated(i10);
        }
    }

    private void onSignalingData(byte[] bArr) {
        Instance.OnSignalingDataListener onSignalingDataListener = this.onSignalDataListener;
        if (onSignalingDataListener != null) {
            onSignalingDataListener.onSignalingData(bArr);
        }
    }

    private void onStateUpdated(int i10) {
        Instance.OnStateUpdatedListener onStateUpdatedListener = this.onStateUpdatedListener;
        if (onStateUpdatedListener != null) {
            onStateUpdatedListener.onStateUpdated(i10, false);
        }
    }

    private void onStop(Instance.FinalState finalState) {
        this.finalState = finalState;
        CountDownLatch countDownLatch = this.stopBarrier;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private void requestCurrentTime(long j10) {
        this.requestCurrentTimeCallback.run(j10);
    }

    public static native void setVideoStateCapturer(long j10, int i10);

    private native void stopGroupNative();

    private native void stopNative();

    public static native void switchCameraCapturer(long j10, boolean z10);

    public native void activateVideoCapturer(long j10);

    public native long addIncomingVideoOutput(int i10, String str, SsrcGroup[] ssrcGroupArr, VideoSink videoSink, long j10);

    public native void clearVideoCapturer();

    public native String getDebugInfo();

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

    public native void onMediaDescriptionAvailable(long j10, VoIPService.RequestedParticipant[] requestedParticipantArr);

    public native void onRequestTimeComplete(long j10, long j11);

    public native void onSignalingDataReceive(byte[] bArr);

    public native void onStreamPartAvailable(long j10, ByteBuffer byteBuffer, int i10, long j11, int i11, int i12);

    public native void prepareForStream(boolean z10);

    public native void removeIncomingVideoOutput(long j10);

    public native void resetGroupInstance(boolean z10, boolean z11);

    public native void setAudioOutputGainControlEnabled(boolean z10);

    public native void setBufferSize(int i10);

    public native void setConferenceCallId(long j10);

    public native void setEchoCancellationStrength(int i10);

    public native void setGlobalServerConfig(String str);

    public native void setJoinResponsePayload(String str);

    public native void setMuteMicrophone(boolean z10);

    public native void setNetworkType(int i10);

    public native void setNoiseSuppressionEnabled(boolean z10);

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

    public native void setVideoEndpointQuality(String str, int i10);

    public native void setVideoState(int i10);

    public native void setVolume(int i10, double d);

    public native void setupOutgoingVideo(VideoSink videoSink, int i10);

    public native void setupOutgoingVideoCreated(long j10);

    public Instance.FinalState stop() {
        this.stopBarrier = new CountDownLatch(1);
        stopNative();
        try {
            this.stopBarrier.await();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        return this.finalState;
    }

    public void stopGroup() {
        stopGroupNative();
    }

    public native void switchCamera(boolean z10);
}
