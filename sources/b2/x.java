package b2;

import java.util.List;
public final class x implements d1 {
    public final m4.m1 f4145a;
    public final d1 f4146b;

    public x(m4.m1 m1Var, d1 d1Var) {
        this.f4145a = m1Var;
        this.f4146b = d1Var;
    }

    @Override
    public final void onAudioAttributesChanged(f fVar) {
        this.f4146b.onAudioAttributesChanged(fVar);
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        this.f4146b.onAudioSessionIdChanged(i10);
    }

    @Override
    public final void onAvailableCommandsChanged(b1 b1Var) {
        this.f4146b.onAvailableCommandsChanged(b1Var);
    }

    @Override
    public final void onCues(List list) {
        this.f4146b.onCues(list);
    }

    @Override
    public final void onEvents(f1 f1Var, c1 c1Var) {
        this.f4146b.onEvents(this.f4145a, c1Var);
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        this.f4146b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        this.f4146b.onIsPlayingChanged(z10);
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
        this.f4146b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onMediaItemTransition(o0 o0Var, int i10) {
        this.f4146b.onMediaItemTransition(o0Var, i10);
    }

    @Override
    public final void onMediaMetadataChanged(r0 r0Var) {
        this.f4146b.onMediaMetadataChanged(r0Var);
    }

    @Override
    public final void onMetadata(t0 t0Var) {
        this.f4146b.onMetadata(t0Var);
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.f4146b.onPlayWhenReadyChanged(z10, i10);
    }

    @Override
    public final void onPlaybackParametersChanged(z0 z0Var) {
        this.f4146b.onPlaybackParametersChanged(z0Var);
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        this.f4146b.onPlaybackStateChanged(i10);
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        this.f4146b.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override
    public final void onPlayerError(y0 y0Var) {
        this.f4146b.onPlayerError(y0Var);
    }

    @Override
    public final void onPlayerErrorChanged(y0 y0Var) {
        this.f4146b.onPlayerErrorChanged(y0Var);
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        this.f4146b.onPlayerStateChanged(z10, i10);
    }

    @Override
    public final void onPlaylistMetadataChanged(r0 r0Var) {
        this.f4146b.onPlaylistMetadataChanged(r0Var);
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
        this.f4146b.onPositionDiscontinuity(i10);
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.f4146b.onRenderedFirstFrame();
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        this.f4146b.onRepeatModeChanged(i10);
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        this.f4146b.onShuffleModeEnabledChanged(z10);
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        this.f4146b.onSkipSilenceEnabledChanged(z10);
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.f4146b.onSurfaceSizeChanged(i10, i11);
    }

    @Override
    public final void onTimelineChanged(o1 o1Var, int i10) {
        this.f4146b.onTimelineChanged(o1Var, i10);
    }

    @Override
    public final void onTrackSelectionParametersChanged(t1 t1Var) {
        this.f4146b.onTrackSelectionParametersChanged(t1Var);
    }

    @Override
    public final void onTracksChanged(v1 v1Var) {
        this.f4146b.onTracksChanged(v1Var);
    }

    @Override
    public final void onVideoSizeChanged(a2 a2Var) {
        this.f4146b.onVideoSizeChanged(a2Var);
    }

    @Override
    public final void onVolumeChanged(float f7) {
        this.f4146b.onVolumeChanged(f7);
    }

    @Override
    public final void onCues(d2.c cVar) {
        this.f4146b.onCues(cVar);
    }

    @Override
    public final void onPositionDiscontinuity(e1 e1Var, e1 e1Var2, int i10) {
        this.f4146b.onPositionDiscontinuity(e1Var, e1Var2, i10);
    }
}
