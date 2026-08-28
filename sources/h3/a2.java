package h3;

import java.util.List;
public interface a2 {
    void onAudioAttributesChanged(j3.e eVar);

    void onAvailableCommandsChanged(y1 y1Var);

    void onCues(List list);

    void onCues(r4.c cVar);

    void onDeviceInfoChanged(m mVar);

    void onDeviceVolumeChanged(int i9, boolean z10);

    void onEvents(c2 c2Var, z1 z1Var);

    void onIsLoadingChanged(boolean z10);

    void onIsPlayingChanged(boolean z10);

    void onLoadingChanged(boolean z10);

    void onMediaItemTransition(f1 f1Var, int i9);

    void onMediaMetadataChanged(h1 h1Var);

    void onMetadata(z3.c cVar);

    void onPlayWhenReadyChanged(boolean z10, int i9);

    void onPlaybackParametersChanged(x1 x1Var);

    void onPlaybackStateChanged(int i9);

    void onPlaybackSuppressionReasonChanged(int i9);

    void onPlayerError(v1 v1Var);

    void onPlayerErrorChanged(v1 v1Var);

    void onPlayerStateChanged(boolean z10, int i9);

    void onPositionDiscontinuity(int i9);

    void onPositionDiscontinuity(b2 b2Var, b2 b2Var2, int i9);

    void onRenderedFirstFrame();

    void onRepeatModeChanged(int i9);

    void onSeekProcessed();

    void onShuffleModeEnabledChanged(boolean z10);

    void onSkipSilenceEnabledChanged(boolean z10);

    void onSurfaceSizeChanged(int i9, int i10);

    void onTimelineChanged(r2 r2Var, int i9);

    void onTracksChanged(t2 t2Var);

    void onVideoSizeChanged(e5.z zVar);

    void onVolumeChanged(float f10);
}
