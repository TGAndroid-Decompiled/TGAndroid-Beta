package b2;

import java.util.List;
public final class y implements e1 {
    public final m4.n1 f2529a;
    public final e1 f2530b;

    public y(m4.n1 n1Var, e1 e1Var) {
        this.f2529a = n1Var;
        this.f2530b = e1Var;
    }

    @Override
    public final void onAudioAttributesChanged(f fVar) {
        this.f2530b.onAudioAttributesChanged(fVar);
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        this.f2530b.onAudioSessionIdChanged(i10);
    }

    @Override
    public final void onAvailableCommandsChanged(c1 c1Var) {
        this.f2530b.onAvailableCommandsChanged(c1Var);
    }

    @Override
    public final void onCues(List list) {
        this.f2530b.onCues(list);
    }

    @Override
    public final void onEvents(g1 g1Var, d1 d1Var) {
        this.f2530b.onEvents(this.f2529a, d1Var);
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        this.f2530b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        this.f2530b.onIsPlayingChanged(z10);
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
        this.f2530b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onMediaItemTransition(p0 p0Var, int i10) {
        this.f2530b.onMediaItemTransition(p0Var, i10);
    }

    @Override
    public final void onMediaMetadataChanged(s0 s0Var) {
        this.f2530b.onMediaMetadataChanged(s0Var);
    }

    @Override
    public final void onMetadata(u0 u0Var) {
        this.f2530b.onMetadata(u0Var);
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.f2530b.onPlayWhenReadyChanged(z10, i10);
    }

    @Override
    public final void onPlaybackParametersChanged(a1 a1Var) {
        this.f2530b.onPlaybackParametersChanged(a1Var);
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        this.f2530b.onPlaybackStateChanged(i10);
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        this.f2530b.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override
    public final void onPlayerError(z0 z0Var) {
        this.f2530b.onPlayerError(z0Var);
    }

    @Override
    public final void onPlayerErrorChanged(z0 z0Var) {
        this.f2530b.onPlayerErrorChanged(z0Var);
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        this.f2530b.onPlayerStateChanged(z10, i10);
    }

    @Override
    public final void onPlaylistMetadataChanged(s0 s0Var) {
        this.f2530b.onPlaylistMetadataChanged(s0Var);
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
        this.f2530b.onPositionDiscontinuity(i10);
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.f2530b.onRenderedFirstFrame();
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        this.f2530b.onRepeatModeChanged(i10);
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        this.f2530b.onShuffleModeEnabledChanged(z10);
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        this.f2530b.onSkipSilenceEnabledChanged(z10);
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.f2530b.onSurfaceSizeChanged(i10, i11);
    }

    @Override
    public final void onTimelineChanged(p1 p1Var, int i10) {
        this.f2530b.onTimelineChanged(p1Var, i10);
    }

    @Override
    public final void onTrackSelectionParametersChanged(u1 u1Var) {
        this.f2530b.onTrackSelectionParametersChanged(u1Var);
    }

    @Override
    public final void onTracksChanged(w1 w1Var) {
        this.f2530b.onTracksChanged(w1Var);
    }

    @Override
    public final void onVideoSizeChanged(b2 b2Var) {
        this.f2530b.onVideoSizeChanged(b2Var);
    }

    @Override
    public final void onVolumeChanged(float f7) {
        this.f2530b.onVolumeChanged(f7);
    }

    @Override
    public final void onCues(d2.c cVar) {
        this.f2530b.onCues(cVar);
    }

    @Override
    public final void onPositionDiscontinuity(f1 f1Var, f1 f1Var2, int i10) {
        this.f2530b.onPositionDiscontinuity(f1Var, f1Var2, i10);
    }
}
