package b2;

import java.util.List;
public interface e1 {
    void onAudioAttributesChanged(f fVar);

    void onAudioSessionIdChanged(int i10);

    void onAvailableCommandsChanged(c1 c1Var);

    void onCues(d2.c cVar);

    void onCues(List list);

    void onEvents(g1 g1Var, d1 d1Var);

    void onIsLoadingChanged(boolean z10);

    void onIsPlayingChanged(boolean z10);

    void onLoadingChanged(boolean z10);

    void onMediaItemTransition(p0 p0Var, int i10);

    void onMediaMetadataChanged(s0 s0Var);

    void onMetadata(u0 u0Var);

    void onPlayWhenReadyChanged(boolean z10, int i10);

    void onPlaybackParametersChanged(a1 a1Var);

    void onPlaybackStateChanged(int i10);

    void onPlaybackSuppressionReasonChanged(int i10);

    void onPlayerError(z0 z0Var);

    void onPlayerErrorChanged(z0 z0Var);

    void onPlayerStateChanged(boolean z10, int i10);

    void onPlaylistMetadataChanged(s0 s0Var);

    void onPositionDiscontinuity(int i10);

    void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10);

    void onRenderedFirstFrame();

    void onRepeatModeChanged(int i10);

    void onShuffleModeEnabledChanged(boolean z10);

    void onSkipSilenceEnabledChanged(boolean z10);

    void onSurfaceSizeChanged(int i10, int i11);

    void onTimelineChanged(p1 p1Var, int i10);

    void onTrackSelectionParametersChanged(u1 u1Var);

    void onTracksChanged(w1 w1Var);

    void onVideoSizeChanged(b2 b2Var);

    void onVolumeChanged(float f7);
}
