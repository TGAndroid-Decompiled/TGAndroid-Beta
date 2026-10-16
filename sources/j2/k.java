package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class k {
    public static final k f12558c;
    public final String f12559a;
    public final j f12560b;

    static {
        new k("");
        f12558c = new k("preload");
    }

    public k(String str) {
        j jVar;
        this.f12559a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f12560b = jVar;
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f12560b;
        jVar.getClass();
        return (LogSessionId) jVar.f12557b;
    }
}
