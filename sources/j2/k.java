package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class k {
    public static final k f13963c;
    public final String f13964a;
    public final j f13965b;

    static {
        new k("");
        f13963c = new k("preload");
    }

    public k(String str) {
        j jVar;
        this.f13964a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            jVar = new j();
        } else {
            jVar = null;
        }
        this.f13965b = jVar;
    }

    public final synchronized LogSessionId a() {
        j jVar;
        jVar = this.f13965b;
        jVar.getClass();
        return (LogSessionId) jVar.f13962b;
    }
}
