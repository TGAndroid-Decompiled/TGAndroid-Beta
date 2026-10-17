package b2;

import java.util.List;
public interface d1 {
    void onAudioAttributesChanged(f fVar);

    void onAudioSessionIdChanged(int i10);

    void onAvailableCommandsChanged(b1 b1Var);

    void onCues(d2.c cVar);

    void onCues(List list);

    void onEvents(f1 f1Var, c1 c1Var);

    void onIsLoadingChanged(boolean z10);

    void onIsPlayingChanged(boolean z10);

    void onLoadingChanged(boolean z10);

    void onMediaItemTransition(o0 o0Var, int i10);

    void onMediaMetadataChanged(r0 r0Var);

    void onMetadata(t0 t0Var);

    void onPlayWhenReadyChanged(boolean z10, int i10);

    void onPlaybackParametersChanged(z0 z0Var);

    void onPlaybackStateChanged(int i10);

    void onPlaybackSuppressionReasonChanged(int i10);

    void onPlayerError(y0 y0Var);

    void onPlayerErrorChanged(y0 y0Var);

    void onPlayerStateChanged(boolean z10, int i10);

    void onPlaylistMetadataChanged(r0 r0Var);

    void onPositionDiscontinuity(int i10);

    void onPositionDiscontinuity(e1 e1Var, e1 e1Var2, int i10);

    void onRenderedFirstFrame();

    void onRepeatModeChanged(int i10);

    void onShuffleModeEnabledChanged(boolean z10);

    void onSkipSilenceEnabledChanged(boolean z10);

    void onSurfaceSizeChanged(int i10, int i11);

    void onTimelineChanged(o1 o1Var, int i10);

    void onTrackSelectionParametersChanged(t1 t1Var);

    void onTracksChanged(v1 v1Var);

    void onVideoSizeChanged(a2 a2Var);

    void onVolumeChanged(float f7);
}
