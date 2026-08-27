package h3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

public abstract class c0 {
    public static i3.k a(Context context, k0 k0Var, boolean z10) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        i3.i iVar = mediaMetricsManager == null ? null : new i3.i(context, mediaMetricsManager.createPlaybackSession());
        if (iVar == null) {
            d5.a.K("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new i3.k(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z10) {
            i3.f fVar = k0Var.f7987r;
            fVar.getClass();
            fVar.f10534f.a(iVar);
        }
        return new i3.k(iVar.f10551c.getSessionId());
    }
}
