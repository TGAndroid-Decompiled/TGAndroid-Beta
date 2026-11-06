package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class j {
    public static final j f19558c;
    public final String f19559a;
    public final i f19560b;

    static {
        new j("");
        f19558c = new j("preload");
    }

    public j(String str) {
        i iVar;
        this.f19559a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new i();
        } else {
            iVar = null;
        }
        this.f19560b = iVar;
    }

    public final synchronized LogSessionId a() {
        i iVar;
        iVar = this.f19560b;
        iVar.getClass();
        return (LogSessionId) iVar.f19557b;
    }
}
