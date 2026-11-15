package org.telegram.messenger.voip;

import org.webrtc.voiceengine.WebRtcAudioRecord;
public final class g implements WebRtcAudioRecord.WebRtcAudioRecordSamplesReadyCallback {
    @Override
    public final void onWebRtcAudioRecordSamplesReady(WebRtcAudioRecord.AudioSamples audioSamples) {
        NativeInstance.lambda$setIncomingAudioCapture$4(audioSamples);
    }
}
