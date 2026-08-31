package j3;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
public abstract class y {
    public static k3.k a(Context context, f0 f0Var, boolean z4) {
        k3.i iVar;
        LogSessionId logSessionId;
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            iVar = null;
        } else {
            iVar = new k3.i(context, mediaMetricsManager.createPlaybackSession());
        }
        if (iVar == null) {
            h5.a.K("ExoPlayerImpl", "MediaMetricsService unavailable.");
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new k3.k(logSessionId);
        }
        if (z4) {
            k3.f fVar = f0Var.f9128q;
            fVar.getClass();
            fVar.f10426f.a(iVar);
        }
        return new k3.k(iVar.f10444c.getSessionId());
    }
}
