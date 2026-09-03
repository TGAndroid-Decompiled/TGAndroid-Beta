package d4;

import android.media.metrics.LogSessionId;
public abstract class o {
    public static void a(i iVar, k3.k kVar) {
        LogSessionId logSessionId;
        k3.j jVar = kVar.f9716a;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.f9715a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionId2.equals(logSessionId)) {
            iVar.f4142b.setString("log-session-id", logSessionId2.getStringId());
        }
    }
}
