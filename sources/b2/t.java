package b2;

import java.util.List;
public final class t implements z0 {
    public final m4.l1 f2015a;
    public final z0 f2016b;

    public t(m4.l1 l1Var, z0 z0Var) {
        this.f2015a = l1Var;
        this.f2016b = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (!this.f2015a.equals(tVar.f2015a)) {
            return false;
        }
        return this.f2016b.equals(tVar.f2016b);
    }

    public final int hashCode() {
        return this.f2016b.hashCode() + (this.f2015a.hashCode() * 31);
    }

    @Override
    public final void onAudioAttributesChanged(e eVar) {
        this.f2016b.onAudioAttributesChanged(eVar);
    }

    @Override
    public final void onAudioSessionIdChanged(int i10) {
        this.f2016b.onAudioSessionIdChanged(i10);
    }

    @Override
    public final void onAvailableCommandsChanged(x0 x0Var) {
        this.f2016b.onAvailableCommandsChanged(x0Var);
    }

    @Override
    public final void onCues(List list) {
        this.f2016b.onCues(list);
    }

    @Override
    public final void onEvents(b1 b1Var, y0 y0Var) {
        this.f2016b.onEvents(this.f2015a, y0Var);
    }

    @Override
    public final void onIsLoadingChanged(boolean z10) {
        this.f2016b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onIsPlayingChanged(boolean z10) {
        this.f2016b.onIsPlayingChanged(z10);
    }

    @Override
    public final void onLoadingChanged(boolean z10) {
        this.f2016b.onIsLoadingChanged(z10);
    }

    @Override
    public final void onMediaItemTransition(k0 k0Var, int i10) {
        this.f2016b.onMediaItemTransition(k0Var, i10);
    }

    @Override
    public final void onMediaMetadataChanged(n0 n0Var) {
        this.f2016b.onMediaMetadataChanged(n0Var);
    }

    @Override
    public final void onMetadata(p0 p0Var) {
        this.f2016b.onMetadata(p0Var);
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z10, int i10) {
        this.f2016b.onPlayWhenReadyChanged(z10, i10);
    }

    @Override
    public final void onPlaybackParametersChanged(v0 v0Var) {
        this.f2016b.onPlaybackParametersChanged(v0Var);
    }

    @Override
    public final void onPlaybackStateChanged(int i10) {
        this.f2016b.onPlaybackStateChanged(i10);
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i10) {
        this.f2016b.onPlaybackSuppressionReasonChanged(i10);
    }

    @Override
    public final void onPlayerError(u0 u0Var) {
        this.f2016b.onPlayerError(u0Var);
    }

    @Override
    public final void onPlayerErrorChanged(u0 u0Var) {
        this.f2016b.onPlayerErrorChanged(u0Var);
    }

    @Override
    public final void onPlayerStateChanged(boolean z10, int i10) {
        this.f2016b.onPlayerStateChanged(z10, i10);
    }

    @Override
    public final void onPlaylistMetadataChanged(n0 n0Var) {
        this.f2016b.onPlaylistMetadataChanged(n0Var);
    }

    @Override
    public final void onPositionDiscontinuity(int i10) {
        this.f2016b.onPositionDiscontinuity(i10);
    }

    @Override
    public final void onRenderedFirstFrame() {
        this.f2016b.onRenderedFirstFrame();
    }

    @Override
    public final void onRepeatModeChanged(int i10) {
        this.f2016b.onRepeatModeChanged(i10);
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z10) {
        this.f2016b.onShuffleModeEnabledChanged(z10);
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z10) {
        this.f2016b.onSkipSilenceEnabledChanged(z10);
    }

    @Override
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.f2016b.onSurfaceSizeChanged(i10, i11);
    }

    @Override
    public final void onTimelineChanged(k1 k1Var, int i10) {
        this.f2016b.onTimelineChanged(k1Var, i10);
    }

    @Override
    public final void onTrackSelectionParametersChanged(q1 q1Var) {
        this.f2016b.onTrackSelectionParametersChanged(q1Var);
    }

    @Override
    public final void onTracksChanged(s1 s1Var) {
        this.f2016b.onTracksChanged(s1Var);
    }

    @Override
    public final void onVideoSizeChanged(x1 x1Var) {
        this.f2016b.onVideoSizeChanged(x1Var);
    }

    @Override
    public final void onVolumeChanged(float f7) {
        this.f2016b.onVolumeChanged(f7);
    }

    @Override
    public final void onCues(d2.c cVar) {
        this.f2016b.onCues(cVar);
    }

    @Override
    public final void onPositionDiscontinuity(a1 a1Var, a1 a1Var2, int i10) {
        this.f2016b.onPositionDiscontinuity(a1Var, a1Var2, i10);
    }
}
