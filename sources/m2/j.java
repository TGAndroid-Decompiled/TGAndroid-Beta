package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class j {
    public static final j f20157c;
    public final String f20158a;
    public final i f20159b;

    static {
        new j("");
        f20157c = new j("preload");
    }

    public j(String str) {
        i iVar;
        this.f20158a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new i();
        } else {
            iVar = null;
        }
        this.f20159b = iVar;
    }

    public final synchronized LogSessionId a() {
        i iVar;
        iVar = this.f20159b;
        iVar.getClass();
        return (LogSessionId) iVar.f20156b;
    }
}
