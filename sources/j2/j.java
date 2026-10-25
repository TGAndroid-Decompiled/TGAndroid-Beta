package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class j {
    public static final j f15226c;
    public final String f15227a;
    public final i f15228b;

    static {
        new j("");
        f15226c = new j("preload");
    }

    public j(String str) {
        i iVar;
        this.f15227a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            iVar = new i();
        } else {
            iVar = null;
        }
        this.f15228b = iVar;
    }

    public final synchronized LogSessionId a() {
        i iVar;
        iVar = this.f15228b;
        iVar.getClass();
        return (LogSessionId) iVar.f15225b;
    }
}
