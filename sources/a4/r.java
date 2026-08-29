package a4;

import android.media.metrics.LogSessionId;
public abstract class r {
    public static void a(l lVar, k3.k kVar) {
        LogSessionId logSessionId;
        k3.j jVar = kVar.f13445a;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.f13444a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionId2.equals(logSessionId)) {
            lVar.f100b.setString("log-session-id", logSessionId2.getStringId());
        }
    }
}
