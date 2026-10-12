package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class k {
    public static final k f12554c;
    public final String f12555a;
    public final j f12556b;

    static {
        new k("");
        f12554c = new k("preload");
    }

    public k(String str) {
        j jVar;
        this.f12555a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f12556b = jVar;
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f12556b;
        jVar.getClass();
        return (LogSessionId) jVar.f12553b;
    }
}
