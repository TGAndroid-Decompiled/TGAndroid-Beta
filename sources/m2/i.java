package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class i {
    public static final i f20611c;
    public final String f20612a;
    public final h f20613b;

    static {
        new i("");
        f20611c = new i("preload");
    }

    public i(String str) {
        h hVar;
        this.f20612a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            hVar = new h();
        } else {
            hVar = null;
        }
        this.f20613b = hVar;
    }

    public final synchronized LogSessionId a() {
        h hVar;
        hVar = this.f20613b;
        hVar.getClass();
        return (LogSessionId) hVar.f20610b;
    }
}
