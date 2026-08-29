package j3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
public abstract class b0 {
    public static k3.k a(Context context, k0 k0Var, boolean z10) {
        k3.i iVar;
        LogSessionId logSessionId;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            iVar = null;
        } else {
            iVar = new k3.i(context, mediaMetricsManager.createPlaybackSession());
        }
        if (iVar == null) {
            f5.a.K("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new k3.k(logSessionId);
        }
        if (z10) {
            k3.f fVar = k0Var.f10594r;
            fVar.getClass();
            fVar.f13417f.a(iVar);
        }
        return new k3.k(iVar.f13434c.getSessionId());
    }
}
