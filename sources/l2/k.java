package l2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class k {
    public static final k f17727c;
    public final String f17728a;
    public final j f17729b;

    static {
        new k("");
        f17727c = new k("preload");
    }

    public k(String str) {
        j jVar;
        this.f17728a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f17729b = jVar;
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f17729b;
        jVar.getClass();
        return (LogSessionId) jVar.f17726b;
    }
}
