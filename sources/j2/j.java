package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class j {
    public static final j f14013c;
    public final String f14014a;
    public final i f14015b;

    static {
        new j("");
        f14013c = new j("preload");
    }

    public j(String str) {
        i iVar;
        this.f14014a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new i();
        } else {
            iVar = null;
        }
        this.f14015b = iVar;
    }

    public final synchronized LogSessionId a() {
        i iVar;
        iVar = this.f14015b;
        iVar.getClass();
        return (LogSessionId) iVar.f14012b;
    }
}
