package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class i {
    public static final i f20515c;
    public final String f20516a;
    public final h f20517b;

    static {
        new i("");
        f20515c = new i("preload");
    }

    public i(String str) {
        h hVar;
        this.f20516a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            hVar = new h();
        } else {
            hVar = null;
        }
        this.f20517b = hVar;
    }

    public final synchronized LogSessionId a() {
        h hVar;
        hVar = this.f20517b;
        hVar.getClass();
        return (LogSessionId) hVar.f20514b;
    }
}
