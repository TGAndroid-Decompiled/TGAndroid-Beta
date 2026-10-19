package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class k {
    public static final k f13968c;
    public final String f13969a;
    public final j f13970b;

    static {
        new k("");
        f13968c = new k("preload");
    }

    public k(String str) {
        j jVar;
        this.f13969a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13970b = jVar;
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13970b;
        jVar.getClass();
        return (LogSessionId) jVar.f13967b;
    }
}
