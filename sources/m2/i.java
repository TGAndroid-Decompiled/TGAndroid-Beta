package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class i {
    public static final i f20518c;
    public final String f20519a;
    public final h f20520b;

    static {
        new i("");
        f20518c = new i("preload");
    }

    public i(String str) {
        h hVar;
        this.f20519a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            hVar = new h();
        } else {
            hVar = null;
        }
        this.f20520b = hVar;
    }

    public final synchronized LogSessionId a() {
        h hVar;
        hVar = this.f20520b;
        hVar.getClass();
        return (LogSessionId) hVar.f20517b;
    }
}
