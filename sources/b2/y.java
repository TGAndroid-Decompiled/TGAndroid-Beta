package b2;

import java.util.List;
public final class y implements e1 {
    public final m4.n1 f3596a;
    public final e1 f3597b;

    public y(m4.n1 n1Var, e1 e1Var) {
        this.f3596a = n1Var;
        this.f3597b = e1Var;
    }

    @Override
    public final void onAudioAttributesChanged(f fVar) {
        this.f3597b.onAudioAttributesChanged(fVar);
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        this.f3597b.onAudioSessionIdChanged(i10);
    }

    @Override
    public final void onAvailableCommandsChanged(c1 c1Var) {
        this.f3597b.onAvailableCommandsChanged(c1Var);
    }

    @Override
    public final void onCues(List list) {
        this.f3597b.onCues(list);
    }

    @Override
    public final void onEvents(g1 g1Var, d1 d1Var) {
        this.f3597b.onEvents(this.f3596a, d1Var);
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        this.f3597b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        this.f3597b.onIsPlayingChanged(z10);
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
        this.f3597b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onMediaItemTransition(p0 p0Var, int i10) {
        this.f3597b.onMediaItemTransition(p0Var, i10);
    }

    @Override
    public final void onMediaMetadataChanged(s0 s0Var) {
        this.f3597b.onMediaMetadataChanged(s0Var);
    }

    @Override
    public final void onMetadata(u0 u0Var) {
        this.f3597b.onMetadata(u0Var);
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.f3597b.onPlayWhenReadyChanged(z10, i10);
    }

    @Override
    public final void onPlaybackParametersChanged(a1 a1Var) {
        this.f3597b.onPlaybackParametersChanged(a1Var);
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        this.f3597b.onPlaybackStateChanged(i10);
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        this.f3597b.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override
    public final void onPlayerError(z0 z0Var) {
        this.f3597b.onPlayerError(z0Var);
    }

    @Override
    public final void onPlayerErrorChanged(z0 z0Var) {
        this.f3597b.onPlayerErrorChanged(z0Var);
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        this.f3597b.onPlayerStateChanged(z10, i10);
    }

    @Override
    public final void onPlaylistMetadataChanged(s0 s0Var) {
        this.f3597b.onPlaylistMetadataChanged(s0Var);
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
        this.f3597b.onPositionDiscontinuity(i10);
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.f3597b.onRenderedFirstFrame();
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        this.f3597b.onRepeatModeChanged(i10);
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        this.f3597b.onShuffleModeEnabledChanged(z10);
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        this.f3597b.onSkipSilenceEnabledChanged(z10);
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.f3597b.onSurfaceSizeChanged(i10, i11);
    }

    @Override
    public final void onTimelineChanged(p1 p1Var, int i10) {
        this.f3597b.onTimelineChanged(p1Var, i10);
    }

    @Override
    public final void onTrackSelectionParametersChanged(u1 u1Var) {
        this.f3597b.onTrackSelectionParametersChanged(u1Var);
    }

    @Override
    public final void onTracksChanged(w1 w1Var) {
        this.f3597b.onTracksChanged(w1Var);
    }

    @Override
    public final void onVideoSizeChanged(b2 b2Var) {
        this.f3597b.onVideoSizeChanged(b2Var);
    }

    @Override
    public final void onVolumeChanged(float f7) {
        this.f3597b.onVolumeChanged(f7);
    }

    @Override
    public final void onCues(d2.c cVar) {
        this.f3597b.onCues(cVar);
    }

    @Override
    public final void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        this.f3597b.onPositionDiscontinuity(f1Var, f1Var2, i10);
    }
}
