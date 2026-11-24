package defpackage;

import android.media.metrics.LogSessionId;
public final class ve8 {
    public LogSessionId a;

    public ve8() {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        this.a = logSessionId;
    }

    public final void a(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        LogSessionId logSessionId3 = this.a;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        jte.p(logSessionId3.equals(logSessionId2));
        this.a = logSessionId;
    }
}
