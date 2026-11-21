package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class i {
    public static final i f20546c;
    public final String f20547a;
    public final h f20548b;

    static {
        new i("");
        f20546c = new i("preload");
    }

    public i(String str) {
        h hVar;
        this.f20547a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            hVar = new h();
        } else {
            hVar = null;
        }
        this.f20548b = hVar;
    }

    public final synchronized LogSessionId a() {
        h hVar;
        hVar = this.f20548b;
        hVar.getClass();
        return (LogSessionId) hVar.f20545b;
    }
}
