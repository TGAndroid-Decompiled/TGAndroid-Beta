package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class i {
    public static final i f20549c;
    public final String f20550a;
    public final h f20551b;

    static {
        new i("");
        f20549c = new i("preload");
    }

    public i(String str) {
        h hVar;
        this.f20550a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            hVar = new h();
        } else {
            hVar = null;
        }
        this.f20551b = hVar;
    }

    public final synchronized LogSessionId a() {
        h hVar;
        hVar = this.f20551b;
        hVar.getClass();
        return (LogSessionId) hVar.f20548b;
    }
}
