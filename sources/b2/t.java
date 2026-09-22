package b2;

import java.util.List;
public final class t implements z0 {
    public final m4.j1 f3321a;
    public final z0 f3322b;

    public t(m4.j1 j1Var, z0 z0Var) {
        this.f3321a = j1Var;
        this.f3322b = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f3321a.equals(tVar.f3321a)) {
            return false;
        }
        return this.f3322b.equals(tVar.f3322b);
    }

    public final int hashCode() {
        return this.f3322b.hashCode() + (this.f3321a.hashCode() * 31);
    }

    @Override
    public final void onAudioAttributesChanged(e eVar) {
        this.f3322b.onAudioAttributesChanged(eVar);
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        this.f3322b.onAudioSessionIdChanged(i10);
    }

    @Override
    public final void onAvailableCommandsChanged(x0 x0Var) {
        this.f3322b.onAvailableCommandsChanged(x0Var);
    }

    @Override
    public final void onCues(List list) {
        this.f3322b.onCues(list);
    }

    @Override
    public final void onEvents(b1 b1Var, y0 y0Var) {
        this.f3322b.onEvents(this.f3321a, y0Var);
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        this.f3322b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        this.f3322b.onIsPlayingChanged(z10);
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
        this.f3322b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onMediaItemTransition(k0 k0Var, int i10) {
        this.f3322b.onMediaItemTransition(k0Var, i10);
    }

    @Override
    public final void onMediaMetadataChanged(n0 n0Var) {
        this.f3322b.onMediaMetadataChanged(n0Var);
    }

    @Override
    public final void onMetadata(p0 p0Var) {
        this.f3322b.onMetadata(p0Var);
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.f3322b.onPlayWhenReadyChanged(z10, i10);
    }

    @Override
    public final void onPlaybackParametersChanged(v0 v0Var) {
        this.f3322b.onPlaybackParametersChanged(v0Var);
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        this.f3322b.onPlaybackStateChanged(i10);
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        this.f3322b.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override
    public final void onPlayerError(u0 u0Var) {
        this.f3322b.onPlayerError(u0Var);
    }

    @Override
    public final void onPlayerErrorChanged(u0 u0Var) {
        this.f3322b.onPlayerErrorChanged(u0Var);
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        this.f3322b.onPlayerStateChanged(z10, i10);
    }

    @Override
    public final void onPlaylistMetadataChanged(n0 n0Var) {
        this.f3322b.onPlaylistMetadataChanged(n0Var);
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
        this.f3322b.onPositionDiscontinuity(i10);
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.f3322b.onRenderedFirstFrame();
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        this.f3322b.onRepeatModeChanged(i10);
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        this.f3322b.onShuffleModeEnabledChanged(z10);
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        this.f3322b.onSkipSilenceEnabledChanged(z10);
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.f3322b.onSurfaceSizeChanged(i10, i11);
    }

    @Override
    public final void onTimelineChanged(k1 k1Var, int i10) {
        this.f3322b.onTimelineChanged(k1Var, i10);
    }

    @Override
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        this.f3322b.onTrackSelectionParametersChanged(q1Var);
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        this.f3322b.onTracksChanged(s1Var);
    }

    @Override
    public final void onVideoSizeChanged(x1 x1Var) {
        this.f3322b.onVideoSizeChanged(x1Var);
    }

    @Override
    public final void onVolumeChanged(float f7) {
        this.f3322b.onVolumeChanged(f7);
    }

    @Override
    public final void onCues(d2.d dVar) {
        this.f3322b.onCues(dVar);
    }

    @Override
    public final void onPositionDiscontinuity(a1 a1Var, a1 a1Var2, int i10) {
        this.f3322b.onPositionDiscontinuity(a1Var, a1Var2, i10);
    }
}
