package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class k {
    public static final k f13970c;
    public final String f13971a;
    public final j f13972b;

    static {
        new k("");
        f13970c = new k("preload");
    }

    public k(String str) {
        j jVar;
        this.f13971a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13972b = jVar;
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13972b;
        jVar.getClass();
        return (LogSessionId) jVar.f13969b;
    }
}
