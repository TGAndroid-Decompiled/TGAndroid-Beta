package b2;

import java.util.List;
public interface z0 {
    void onAudioAttributesChanged(e eVar);

    void onAudioSessionIdChanged(int i10);

    void onAvailableCommandsChanged(x0 x0Var);

    void onCues(d2.c cVar);

    void onCues(List list);

    void onEvents(b1 b1Var, y0 y0Var);

    void onIsLoadingChanged(boolean z10);

    void onIsPlayingChanged(boolean z10);

    void onLoadingChanged(boolean z10);

    void onMediaItemTransition(k0 k0Var, int i10);

    void onMediaMetadataChanged(n0 n0Var);

    void onMetadata(p0 p0Var);

    void onPlayWhenReadyChanged(boolean z10, int i10);

    void onPlaybackParametersChanged(v0 v0Var);

    void onPlaybackStateChanged(int i10);

    void onPlaybackSuppressionReasonChanged(int i10);

    void onPlayerError(u0 u0Var);

    void onPlayerErrorChanged(u0 u0Var);

    void onPlayerStateChanged(boolean z10, int i10);

    void onPlaylistMetadataChanged(n0 n0Var);

    void onPositionDiscontinuity(int i10);

    void onPositionDiscontinuity(a1 a1Var, a1 a1Var2, int i10);

    void onRenderedFirstFrame();

    void onRepeatModeChanged(int i10);

    void onShuffleModeEnabledChanged(boolean z10);

    void onSkipSilenceEnabledChanged(boolean z10);

    void onSurfaceSizeChanged(int i10, int i11);

    void onTimelineChanged(k1 k1Var, int i10);

    void onTrackSelectionParametersChanged(q1 q1Var);

    void onTracksChanged(s1 s1Var);

    void onVideoSizeChanged(x1 x1Var);

    void onVolumeChanged(float f7);
}
