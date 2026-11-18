package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class i {
    public static final i f20521c;
    public final String f20522a;
    public final h f20523b;

    static {
        new i("");
        f20521c = new i("preload");
    }

    public i(String str) {
        h hVar;
        this.f20522a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            hVar = new h();
        } else {
            hVar = null;
        }
        this.f20523b = hVar;
    }

    public final synchronized LogSessionId a() {
        h hVar;
        hVar = this.f20523b;
        hVar.getClass();
        return (LogSessionId) hVar.f20520b;
    }
}
