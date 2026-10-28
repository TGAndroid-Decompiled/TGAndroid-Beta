package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class j {
    public static final j f15225c;
    public final String f15226a;
    public final i f15227b;

    static {
        new j("");
        f15225c = new j("preload");
    }

    public j(String str) {
        i iVar;
        this.f15226a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new i();
        } else {
            iVar = null;
        }
        this.f15227b = iVar;
    }

    public final synchronized LogSessionId a() {
        i iVar;
        iVar = this.f15227b;
        iVar.getClass();
        return (LogSessionId) iVar.f15224b;
    }
}
