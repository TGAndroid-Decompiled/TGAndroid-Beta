package j3;

import java.util.List;
public interface y1 {
    void onAudioAttributesChanged(l3.d dVar);

    void onAvailableCommandsChanged(w1 w1Var);

    void onCues(List list);

    void onCues(v4.c cVar);

    void onEvents(a2 a2Var, x1 x1Var);

    void onIsLoadingChanged(boolean z4);

    void onIsPlayingChanged(boolean z4);

    void onLoadingChanged(boolean z4);

    void onMediaItemTransition(c1 c1Var, int i10);

    void onMediaMetadataChanged(e1 e1Var);

    void onMetadata(e4.c cVar);

    void onPlayWhenReadyChanged(boolean z4, int i10);

    void onPlaybackParametersChanged(v1 v1Var);

    void onPlaybackStateChanged(int i10);

    void onPlaybackSuppressionReasonChanged(int i10);

    void onPlayerError(t1 t1Var);

    void onPlayerErrorChanged(t1 t1Var);

    void onPlayerStateChanged(boolean z4, int i10);

    void onPositionDiscontinuity(int i10);

    void onPositionDiscontinuity(z1 z1Var, z1 z1Var2, int i10);

    void onRenderedFirstFrame();

    void onRepeatModeChanged(int i10);

    void onShuffleModeEnabledChanged(boolean z4);

    void onSkipSilenceEnabledChanged(boolean z4);

    void onSurfaceSizeChanged(int i10, int i11);

    void onTimelineChanged(o2 o2Var, int i10);

    void onTracksChanged(q2 q2Var);

    void onVideoSizeChanged(i5.y yVar);

    void onVolumeChanged(float f10);
}
