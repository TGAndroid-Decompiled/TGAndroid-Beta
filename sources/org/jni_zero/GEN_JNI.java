package org.jni_zero;
public class GEN_JNI {
    public static native void org_jni_1zero_CommonApis_deleteDeleterBasePtr(long j, long j2);

    public static native void org_jni_1zero_CommonApis_releaseRawPtr(long j);

    public static native void org_jni_1zero_JniZero_setJniClassLoader(Object obj);

    public static native void org_webrtc_AudioTrack_setVolume(long j, double d);

    public static native long org_webrtc_BuiltinAudioDecoderFactoryFactory_createBuiltinAudioDecoderFactory();

    public static native long org_webrtc_BuiltinAudioEncoderFactoryFactory_createBuiltinAudioEncoderFactory();

    public static native long org_webrtc_CallSessionFileRotatingLogSink_addSink(Object obj, int i, int i2);

    public static native void org_webrtc_CallSessionFileRotatingLogSink_deleteSink(long j);

    public static native Object org_webrtc_CallSessionFileRotatingLogSink_getLogData(Object obj);

    public static native long org_webrtc_DataChannel_bufferedAmount(Object obj);

    public static native void org_webrtc_DataChannel_close(Object obj);

    public static native int org_webrtc_DataChannel_id(Object obj);

    public static native Object org_webrtc_DataChannel_label(Object obj);

    public static native long org_webrtc_DataChannel_registerObserver(Object obj, Object obj2);

    public static native boolean org_webrtc_DataChannel_send(Object obj, Object obj2, boolean z);

    public static native Object org_webrtc_DataChannel_state(Object obj);

    public static native void org_webrtc_DataChannel_unregisterObserver(Object obj, long j);

    public static native long org_webrtc_Dav1dDecoder_createDecoder();

    public static native boolean org_webrtc_DtmfSender_canInsertDtmf(long j);

    public static native int org_webrtc_DtmfSender_duration(long j);

    public static native boolean org_webrtc_DtmfSender_insertDtmf(long j, Object obj, int i, int i2);

    public static native int org_webrtc_DtmfSender_interToneGap(long j);

    public static native Object org_webrtc_DtmfSender_tones(long j);

    public static native long org_webrtc_EglBase10Impl_getCurrentNativeEGLContext();

    public static native long org_webrtc_Environment_create(Object obj);

    public static native long org_webrtc_Environment_currentTimeNanos(long j);

    public static native void org_webrtc_Environment_free(long j);

    public static native boolean org_webrtc_H264Utils_isSameH264Profile(Object obj, Object obj2);

    public static native void org_webrtc_Histogram_addSample(long j, int i);

    public static native long org_webrtc_Histogram_createCounts(Object obj, int i, int i2, int i3);

    public static native long org_webrtc_Histogram_createEnumeration(Object obj, int i);

    public static native void org_webrtc_JavaI420Buffer_cropAndScaleI420(Object obj, int i, Object obj2, int i2, Object obj3, int i3, int i4, int i5, int i6, int i7, Object obj4, int i8, Object obj5, int i9, Object obj6, int i10, int i11, int i12);

    public static native void org_webrtc_JniCommon_addRef(long j);

    public static native Object org_webrtc_JniCommon_allocateByteBuffer(int i);

    public static native void org_webrtc_JniCommon_freeByteBuffer(Object obj);

    public static native void org_webrtc_JniCommon_releaseRef(long j);

    public static native long org_webrtc_LibaomAv1Encoder_create(long j);

    public static native long org_webrtc_LibvpxVp8Decoder_createDecoder(long j);

    public static native long org_webrtc_LibvpxVp8Encoder_create(long j);

    public static native long org_webrtc_LibvpxVp9Decoder_createDecoder();

    public static native boolean org_webrtc_LibvpxVp9Decoder_isSupported();

    public static native long org_webrtc_LibvpxVp9Encoder_create(long j);

    public static native boolean org_webrtc_LibvpxVp9Encoder_isSupported();

    public static native void org_webrtc_Logging_enableLogThreads();

    public static native void org_webrtc_Logging_enableLogTimeStamps();

    public static native void org_webrtc_Logging_enableLogToDebugOutput(int i);

    public static native void org_webrtc_Logging_log(int i, Object obj, Object obj2);

    public static native Object org_webrtc_MediaSource_getState(long j);

    public static native boolean org_webrtc_MediaStreamTrack_getEnabled(long j);

    public static native Object org_webrtc_MediaStreamTrack_getId(long j);

    public static native Object org_webrtc_MediaStreamTrack_getKind(long j);

    public static native Object org_webrtc_MediaStreamTrack_getState(long j);

    public static native boolean org_webrtc_MediaStreamTrack_setEnabled(long j, boolean z);

    public static native boolean org_webrtc_MediaStream_addAudioTrackToNativeStream(long j, long j2);

    public static native boolean org_webrtc_MediaStream_addVideoTrackToNativeStream(long j, long j2);

    public static native Object org_webrtc_MediaStream_getId(long j);

    public static native boolean org_webrtc_MediaStream_removeAudioTrack(long j, long j2);

    public static native boolean org_webrtc_MediaStream_removeVideoTrack(long j, long j2);

    public static native void org_webrtc_Metrics_enable();

    public static native Object org_webrtc_Metrics_getAndReset();

    public static native void org_webrtc_NV12Buffer_cropAndScale(int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, int i9, int i10, Object obj2, int i11, Object obj3, int i12, Object obj4, int i13);

    public static native void org_webrtc_NV21Buffer_cropAndScale(int i, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, int i8, Object obj2, int i9, Object obj3, int i10, Object obj4, int i11);

    public static native Object org_webrtc_NativeAndroidVideoTrackSource_adaptFrame(long j, int i, int i2, int i3, long j2);

    public static native void org_webrtc_NativeAndroidVideoTrackSource_adaptOutputFormat(long j, int i, int i2, Object obj, int i3, int i4, Object obj2, Object obj3);

    public static native void org_webrtc_NativeAndroidVideoTrackSource_onFrameCaptured(long j, int i, long j2, Object obj);

    public static native void org_webrtc_NativeAndroidVideoTrackSource_setIsScreencast(long j, boolean z);

    public static native void org_webrtc_NativeAndroidVideoTrackSource_setState(long j, boolean z);

    public static native void org_webrtc_NetworkMonitor_notifyConnectionTypeChanged(long j);

    public static native void org_webrtc_NetworkMonitor_notifyOfActiveNetworkList(long j, Object obj);

    public static native void org_webrtc_NetworkMonitor_notifyOfNetworkConnect(long j, Object obj);

    public static native void org_webrtc_NetworkMonitor_notifyOfNetworkDisconnect(long j, long j2);

    public static native void org_webrtc_NetworkMonitor_notifyOfNetworkPreference(long j, Object obj, int i);

    public static native long org_webrtc_PeerConnectionFactory_createAudioSource(long j, Object obj);

    public static native long org_webrtc_PeerConnectionFactory_createAudioTrack(long j, Object obj, long j2);

    public static native long org_webrtc_PeerConnectionFactory_createLocalMediaStream(long j, Object obj);

    public static native long org_webrtc_PeerConnectionFactory_createPeerConnection(long j, Object obj, Object obj2, long j2, Object obj3);

    public static native Object org_webrtc_PeerConnectionFactory_createPeerConnectionFactory(Object obj, Object obj2, long j, long j2, long j3, long j4, Object obj3, Object obj4, long j5, long j6, long j7, long j8, long j9, long j10);

    public static native long org_webrtc_PeerConnectionFactory_createVideoSource(long j, boolean z, boolean z2);

    public static native long org_webrtc_PeerConnectionFactory_createVideoTrack(long j, Object obj, long j2);

    public static native void org_webrtc_PeerConnectionFactory_deleteLoggable();

    public static native void org_webrtc_PeerConnectionFactory_freeFactory(long j);

    public static native long org_webrtc_PeerConnectionFactory_getNativePeerConnectionFactory(long j);

    public static native Object org_webrtc_PeerConnectionFactory_getRtpReceiverCapabilities(long j, Object obj);

    public static native Object org_webrtc_PeerConnectionFactory_getRtpSenderCapabilities(long j, Object obj);

    public static native void org_webrtc_PeerConnectionFactory_initializeAndroidGlobals();

    public static native void org_webrtc_PeerConnectionFactory_initializeFieldTrials(Object obj);

    public static native void org_webrtc_PeerConnectionFactory_initializeInternalTracer();

    public static native void org_webrtc_PeerConnectionFactory_injectLoggable(Object obj, int i);

    public static native void org_webrtc_PeerConnectionFactory_printStackTrace(int i);

    public static native void org_webrtc_PeerConnectionFactory_shutdownInternalTracer();

    public static native boolean org_webrtc_PeerConnectionFactory_startAecDump(long j, int i, int i2);

    public static native boolean org_webrtc_PeerConnectionFactory_startInternalTracingCapture(Object obj);

    public static native void org_webrtc_PeerConnectionFactory_stopAecDump(long j);

    public static native void org_webrtc_PeerConnectionFactory_stopInternalTracingCapture();

    public static native boolean org_webrtc_PeerConnection_addIceCandidate(Object obj, Object obj2, int i, Object obj3);

    public static native void org_webrtc_PeerConnection_addIceCandidateWithObserver(Object obj, Object obj2, int i, Object obj3, Object obj4);

    public static native boolean org_webrtc_PeerConnection_addLocalStream(Object obj, long j);

    public static native Object org_webrtc_PeerConnection_addTrack(Object obj, long j, Object obj2);

    public static native Object org_webrtc_PeerConnection_addTransceiverOfType(Object obj, Object obj2, Object obj3);

    public static native Object org_webrtc_PeerConnection_addTransceiverWithTrack(Object obj, long j, Object obj2);

    public static native void org_webrtc_PeerConnection_close(Object obj);

    public static native Object org_webrtc_PeerConnection_connectionState(Object obj);

    public static native void org_webrtc_PeerConnection_createAnswer(Object obj, Object obj2, Object obj3);

    public static native Object org_webrtc_PeerConnection_createDataChannel(Object obj, Object obj2, Object obj3);

    public static native void org_webrtc_PeerConnection_createOffer(Object obj, Object obj2, Object obj3);

    public static native long org_webrtc_PeerConnection_createPeerConnectionObserver(Object obj);

    public static native Object org_webrtc_PeerConnection_createSender(Object obj, Object obj2, Object obj3);

    public static native void org_webrtc_PeerConnection_freeOwnedPeerConnection(long j);

    public static native Object org_webrtc_PeerConnection_getCertificate(Object obj);

    public static native Object org_webrtc_PeerConnection_getLocalDescription(Object obj);

    public static native long org_webrtc_PeerConnection_getNativePeerConnection(Object obj);

    public static native Object org_webrtc_PeerConnection_getReceivers(Object obj);

    public static native Object org_webrtc_PeerConnection_getRemoteDescription(Object obj);

    public static native Object org_webrtc_PeerConnection_getSenders(Object obj);

    public static native Object org_webrtc_PeerConnection_getTransceivers(Object obj);

    public static native Object org_webrtc_PeerConnection_iceConnectionState(Object obj);

    public static native Object org_webrtc_PeerConnection_iceGatheringState(Object obj);

    public static native void org_webrtc_PeerConnection_newGetStats(Object obj, Object obj2);

    public static native void org_webrtc_PeerConnection_newGetStatsReceiver(Object obj, long j, Object obj2);

    public static native void org_webrtc_PeerConnection_newGetStatsSender(Object obj, long j, Object obj2);

    public static native boolean org_webrtc_PeerConnection_oldGetStats(Object obj, Object obj2, long j);

    public static native boolean org_webrtc_PeerConnection_removeIceCandidates(Object obj, Object obj2);

    public static native void org_webrtc_PeerConnection_removeLocalStream(Object obj, long j);

    public static native boolean org_webrtc_PeerConnection_removeTrack(Object obj, long j);

    public static native void org_webrtc_PeerConnection_restartIce(Object obj);

    public static native void org_webrtc_PeerConnection_setAudioPlayout(Object obj, boolean z);

    public static native void org_webrtc_PeerConnection_setAudioRecording(Object obj, boolean z);

    public static native boolean org_webrtc_PeerConnection_setBitrate(Object obj, Object obj2, Object obj3, Object obj4);

    public static native boolean org_webrtc_PeerConnection_setConfiguration(Object obj, Object obj2);

    public static native void org_webrtc_PeerConnection_setLocalDescription(Object obj, Object obj2, Object obj3);

    public static native void org_webrtc_PeerConnection_setLocalDescriptionAutomatically(Object obj, Object obj2);

    public static native void org_webrtc_PeerConnection_setRemoteDescription(Object obj, Object obj2, Object obj3);

    public static native Object org_webrtc_PeerConnection_signalingState(Object obj);

    public static native boolean org_webrtc_PeerConnection_startRtcEventLog(Object obj, int i, int i2);

    public static native void org_webrtc_PeerConnection_stopRtcEventLog(Object obj);

    public static native Object org_webrtc_RtcCertificatePem_generateCertificate(Object obj, long j);

    public static native Object org_webrtc_RtcCertificatePem_getFingerprint(Object obj, Object obj2);

    public static native Object org_webrtc_RtpReceiver_getId(long j);

    public static native Object org_webrtc_RtpReceiver_getParameters(long j);

    public static native long org_webrtc_RtpReceiver_getTrack(long j);

    public static native void org_webrtc_RtpReceiver_setFrameDecryptor(long j, long j2);

    public static native long org_webrtc_RtpReceiver_setObserver(long j, Object obj);

    public static native void org_webrtc_RtpReceiver_unsetObserver(long j, long j2);

    public static native long org_webrtc_RtpSender_getDtmfSender(long j);

    public static native Object org_webrtc_RtpSender_getId(long j);

    public static native Object org_webrtc_RtpSender_getMediaType(long j);

    public static native Object org_webrtc_RtpSender_getParameters(long j);

    public static native Object org_webrtc_RtpSender_getStreams(long j);

    public static native long org_webrtc_RtpSender_getTrack(long j);

    public static native void org_webrtc_RtpSender_setFrameEncryptor(long j, long j2);

    public static native boolean org_webrtc_RtpSender_setParameters(long j, Object obj);

    public static native void org_webrtc_RtpSender_setStreams(long j, Object obj);

    public static native boolean org_webrtc_RtpSender_setTrack(long j, long j2);

    public static native Object org_webrtc_RtpTransceiver_currentDirection(long j);

    public static native Object org_webrtc_RtpTransceiver_direction(long j);

    public static native Object org_webrtc_RtpTransceiver_getMediaType(long j);

    public static native Object org_webrtc_RtpTransceiver_getMid(long j);

    public static native Object org_webrtc_RtpTransceiver_getReceiver(long j);

    public static native Object org_webrtc_RtpTransceiver_getSender(long j);

    public static native Object org_webrtc_RtpTransceiver_setCodecPreferences(long j, Object obj);

    public static native boolean org_webrtc_RtpTransceiver_setDirection(long j, Object obj);

    public static native void org_webrtc_RtpTransceiver_stopInternal(long j);

    public static native void org_webrtc_RtpTransceiver_stopStandard(long j);

    public static native boolean org_webrtc_RtpTransceiver_stopped(long j);

    public static native long org_webrtc_SoftwareVideoDecoderFactory_create(long j, long j2, Object obj);

    public static native long org_webrtc_SoftwareVideoDecoderFactory_createFactory();

    public static native Object org_webrtc_SoftwareVideoDecoderFactory_getSupportedCodecs(long j);

    public static native boolean org_webrtc_SoftwareVideoDecoderFactory_isSupported(long j, Object obj);

    public static native long org_webrtc_SoftwareVideoEncoderFactory_create(long j, long j2, Object obj);

    public static native long org_webrtc_SoftwareVideoEncoderFactory_createFactory();

    public static native Object org_webrtc_SoftwareVideoEncoderFactory_getSupportedCodecs(long j);

    public static native boolean org_webrtc_SoftwareVideoEncoderFactory_isSupported(long j, Object obj);

    public static native long org_webrtc_TimestampAligner_createTimestampAligner(long j);

    public static native void org_webrtc_TimestampAligner_releaseTimestampAligner(long j);

    public static native long org_webrtc_TimestampAligner_translateTimestamp(long j, long j2);

    public static native void org_webrtc_TurnCustomizer_freeTurnCustomizer(long j);

    public static native long org_webrtc_VideoDecoderFallback_create(long j, Object obj, Object obj2);

    public static native void org_webrtc_VideoDecoderWrapper_onDecodedFrame(long j, Object obj, Object obj2, Object obj3);

    public static native long org_webrtc_VideoEncoderFallback_create(long j, Object obj, Object obj2);

    public static native void org_webrtc_VideoEncoderWrapper_onEncodedFrame(long j, Object obj);

    public static native void org_webrtc_VideoTrack_addSink(long j, long j2);

    public static native void org_webrtc_VideoTrack_freeSink(long j);

    public static native void org_webrtc_VideoTrack_removeSink(long j, long j2);

    public static native long org_webrtc_VideoTrack_wrapSink(Object obj);

    public static native void org_webrtc_YuvHelper_abgrToI420(Object obj, int i, Object obj2, int i2, Object obj3, int i3, Object obj4, int i4, int i5, int i6);

    public static native void org_webrtc_YuvHelper_copyPlane(Object obj, int i, Object obj2, int i2, int i3, int i4);

    public static native void org_webrtc_YuvHelper_i420Copy(Object obj, int i, Object obj2, int i2, Object obj3, int i3, Object obj4, int i4, Object obj5, int i5, Object obj6, int i6, int i7, int i8);

    public static native void org_webrtc_YuvHelper_i420Rotate(Object obj, int i, Object obj2, int i2, Object obj3, int i3, Object obj4, int i4, Object obj5, int i5, Object obj6, int i6, int i7, int i8, int i9);

    public static native void org_webrtc_YuvHelper_i420ToNV12(Object obj, int i, Object obj2, int i2, Object obj3, int i3, Object obj4, int i4, Object obj5, int i5, int i6, int i7);

    public static native long org_webrtc_audio_JavaAudioDeviceModule_createAudioDeviceModule(Object obj, Object obj2, Object obj3, Object obj4, long j, int i, int i2, boolean z, boolean z2);

    public static native void org_webrtc_audio_WebRtcAudioRecord_cacheDirectBufferAddress(long j, Object obj, Object obj2);

    public static native void org_webrtc_audio_WebRtcAudioRecord_dataIsRecorded(long j, Object obj, int i, long j2);

    public static native void org_webrtc_audio_WebRtcAudioTrack_cacheDirectBufferAddress(long j, Object obj);

    public static native void org_webrtc_audio_WebRtcAudioTrack_getPlayoutData(long j, int i);
}
