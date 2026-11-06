package org.telegram.messenger.voip;

import android.graphics.Point;
import bi.d3;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a8;
import org.telegram.messenger.iz;
import org.telegram.messenger.r2;
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
        void run(int i7, String str);
    }

    public interface RequestBroadcastPartCallback {
        void run(long j3, long j10, int i7, int i10);
    }

    public interface RequestCurrentTimeCallback {
        void run(long j3);
    }

    public static class SsrcGroup {
        public String semantics;
        public int[] ssrcs;
    }

    public interface VideoSourcesCallback {
        void run(long j3, int[] iArr);
    }

    public static void b(NativeInstance nativeInstance, long j3, int[] iArr) {
        nativeInstance.lambda$onParticipantDescriptionsRequired$2(j3, iArr);
    }

    public static native long createVideoCapturer(VideoSink videoSink, int i7);

    public static native void destroyVideoCapturer(long j3);

    public static native String[] getAllVersions();

    public void lambda$onAudioLevelsUpdated$1(int[] iArr, float[] fArr, boolean[] zArr) {
        this.audioLevelsCallback.run(iArr, fArr, zArr);
    }

    public void lambda$onEmitJoinPayload$3(int i7, String str) {
        this.payloadCallback.run(i7, str);
    }

    public void lambda$onNetworkStateUpdated$0(boolean z9, boolean z10) {
        this.onStateUpdatedListener.onStateUpdated(z9 ? 1 : 0, z10);
    }

    public void lambda$onParticipantDescriptionsRequired$2(long j3, int[] iArr) {
        this.unknownParticipantsCallback.run(j3, iArr);
    }

    public static NativeInstance make(String str, Instance.Config config, String str2, Instance.Endpoint[] endpointArr, Instance.Proxy proxy, int i7, Instance.EncryptionKey encryptionKey, VideoSink videoSink, long j3, AudioLevelsCallback audioLevelsCallback) {
        if (r2.f25191a) {
            a8.b("create new tgvoip instance, version " + str);
        }
        NativeInstance nativeInstance = new NativeInstance();
        nativeInstance.persistentStateFilePath = str2;
        nativeInstance.audioLevelsCallback = audioLevelsCallback;
        Point point = org.telegram.messenger.g0.f22537q;
        nativeInstance.nativePtr = makeNativeInstance(str, nativeInstance, config, str2, endpointArr, proxy, i7, encryptionKey, videoSink, j3, Math.min(point.x, point.y) / Math.max(point.x, point.y));
        return nativeInstance;
    }

    public static NativeInstance makeGroup(String str, long j3, boolean z9, boolean z10, PayloadCallback payloadCallback, AudioLevelsCallback audioLevelsCallback, VideoSourcesCallback videoSourcesCallback, RequestBroadcastPartCallback requestBroadcastPartCallback, RequestBroadcastPartCallback requestBroadcastPartCallback2, RequestCurrentTimeCallback requestCurrentTimeCallback, boolean z11) {
        ContextUtils.initialize(org.telegram.messenger.t0.f25555b);
        NativeInstance nativeInstance = new NativeInstance();
        nativeInstance.payloadCallback = payloadCallback;
        nativeInstance.audioLevelsCallback = audioLevelsCallback;
        nativeInstance.unknownParticipantsCallback = videoSourcesCallback;
        nativeInstance.requestBroadcastPartCallback = requestBroadcastPartCallback;
        nativeInstance.cancelRequestBroadcastPartCallback = requestBroadcastPartCallback2;
        nativeInstance.requestCurrentTimeCallback = requestCurrentTimeCallback;
        nativeInstance.isGroup = true;
        nativeInstance.nativePtr = makeGroupNativeInstance(nativeInstance, str, iz.V, j3, z9, z10, z11);
        return nativeInstance;
    }

    private static native long makeGroupNativeInstance(NativeInstance nativeInstance, String str, boolean z9, long j3, boolean z10, boolean z11, boolean z12);

    private static native long makeNativeInstance(String str, NativeInstance nativeInstance, Instance.Config config, String str2, Instance.Endpoint[] endpointArr, Instance.Proxy proxy, int i7, Instance.EncryptionKey encryptionKey, VideoSink videoSink, long j3, float f10);

    private void onAudioLevelsUpdated(int[] iArr, float[] fArr, boolean[] zArr) {
        if (this.isGroup && iArr != null && iArr.length == 0) {
            return;
        }
        org.telegram.messenger.g0.h3(new l(this, iArr, fArr, zArr, 1));
    }

    private void onCancelRequestBroadcastPart(long j3, int i7, int i10) {
        this.cancelRequestBroadcastPartCallback.run(j3, 0L, 0, 0);
    }

    private void onEmitJoinPayload(String str, int i7) {
        try {
            org.telegram.messenger.g0.h3(new ai.e0(this, i7, str, 23));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    private void onNetworkStateUpdated(boolean z9, boolean z10) {
        if (this.onStateUpdatedListener != null) {
            org.telegram.messenger.g0.h3(new h2.n0(this, z9, z10, 2));
        }
    }

    private void onParticipantDescriptionsRequired(long j3, int[] iArr) {
        if (this.unknownParticipantsCallback == null) {
            return;
        }
        org.telegram.messenger.g0.h3(new d3(this, j3, iArr, 13));
    }

    private void onRemoteMediaStateUpdated(int i7, int i10) {
        Instance.OnRemoteMediaStateUpdatedListener onRemoteMediaStateUpdatedListener = this.onRemoteMediaStateUpdatedListener;
        if (onRemoteMediaStateUpdatedListener != null) {
            onRemoteMediaStateUpdatedListener.onMediaStateUpdated(i7, i10);
        }
    }

    private void onRequestBroadcastPart(long j3, long j10, int i7, int i10) {
        this.requestBroadcastPartCallback.run(j3, j10, i7, i10);
    }

    private void onSignalBarsUpdated(int i7) {
        Instance.OnSignalBarsUpdatedListener onSignalBarsUpdatedListener = this.onSignalBarsUpdatedListener;
        if (onSignalBarsUpdatedListener != null) {
            onSignalBarsUpdatedListener.onSignalBarsUpdated(i7);
        }
    }

    private void onSignalingData(byte[] bArr) {
        Instance.OnSignalingDataListener onSignalingDataListener = this.onSignalDataListener;
        if (onSignalingDataListener != null) {
            onSignalingDataListener.onSignalingData(bArr);
        }
    }

    private void onStateUpdated(int i7) {
        Instance.OnStateUpdatedListener onStateUpdatedListener = this.onStateUpdatedListener;
        if (onStateUpdatedListener != null) {
            onStateUpdatedListener.onStateUpdated(i7, false);
        }
    }

    private void onStop(Instance.FinalState finalState) {
        this.finalState = finalState;
        CountDownLatch countDownLatch = this.stopBarrier;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    private void requestCurrentTime(long j3) {
        this.requestCurrentTimeCallback.run(j3);
    }

    public static native void setVideoStateCapturer(long j3, int i7);

    private native void stopGroupNative();

    private native void stopNative();

    public static native void switchCameraCapturer(long j3, boolean z9);

    public native void activateVideoCapturer(long j3);

    public native long addIncomingVideoOutput(int i7, String str, SsrcGroup[] ssrcGroupArr, VideoSink videoSink, long j3);

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

    public native void onMediaDescriptionAvailable(long j3, VoIPService.RequestedParticipant[] requestedParticipantArr);

    public native void onRequestTimeComplete(long j3, long j10);

    public native void onSignalingDataReceive(byte[] bArr);

    public native void onStreamPartAvailable(long j3, ByteBuffer byteBuffer, int i7, long j10, int i10, int i11);

    public native void prepareForStream(boolean z9);

    public native void removeIncomingVideoOutput(long j3);

    public native void resetGroupInstance(boolean z9, boolean z10);

    public native void setAudioOutputGainControlEnabled(boolean z9);

    public native void setBufferSize(int i7);

    public native void setConferenceCallId(long j3);

    public native void setEchoCancellationStrength(int i7);

    public native void setGlobalServerConfig(String str);

    public native void setJoinResponsePayload(String str);

    public native void setMuteMicrophone(boolean z9);

    public native void setNetworkType(int i7);

    public native void setNoiseSuppressionEnabled(boolean z9);

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

    public native void setVideoEndpointQuality(String str, int i7);

    public native void setVideoState(int i7);

    public native void setVolume(int i7, double d);

    public native void setupOutgoingVideo(VideoSink videoSink, int i7);

    public native void setupOutgoingVideoCreated(long j3);

    public Instance.FinalState stop() {
        this.stopBarrier = new CountDownLatch(1);
        stopNative();
        try {
            this.stopBarrier.await();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return this.finalState;
    }

    public void stopGroup() {
        stopGroupNative();
    }

    public native void switchCamera(boolean z9);
}
