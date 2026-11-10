package m2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class j {
    public static final j f19566c;
    public final String f19567a;
    public final i f19568b;

    static {
        new j("");
        f19566c = new j("preload");
    }

    public j(String str) {
        i iVar;
        this.f19567a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new i();
        } else {
            iVar = null;
        }
        this.f19568b = iVar;
    }

    public final synchronized LogSessionId a() {
        i iVar;
        iVar = this.f19568b;
        iVar.getClass();
        return (LogSessionId) iVar.f19565b;
    }
}
