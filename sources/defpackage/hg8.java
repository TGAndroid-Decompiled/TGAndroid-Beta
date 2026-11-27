package defpackage;

import android.media.metrics.LogSessionId;
public final class hg8 {
    public LogSessionId a;

    public hg8() {
        LogSessionId logSessionId;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        this.a = logSessionId;
    }

    public final void a(LogSessionId logSessionId) {
        LogSessionId logSessionId2;
        LogSessionId logSessionId3 = this.a;
        logSessionId2 = LogSessionId.LOG_SESSION_ID_NONE;
        yve.p(logSessionId3.equals(logSessionId2));
        this.a = logSessionId;
    }
}
