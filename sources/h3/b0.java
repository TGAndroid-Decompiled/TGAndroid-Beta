package h3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
public abstract class b0 {
    public static i3.l a(Context context, k0 k0Var, boolean z10) {
        i3.j jVar;
        LogSessionId logSessionId;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            jVar = null;
        } else {
            jVar = new i3.j(context, mediaMetricsManager.createPlaybackSession());
        }
        if (jVar == null) {
            d5.a.K("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new i3.l(logSessionId);
        }
        if (z10) {
            i3.f fVar = k0Var.f9557r;
            fVar.getClass();
            fVar.f10893f.a(jVar);
        }
        return new i3.l(jVar.f10911c.getSessionId());
    }
}
