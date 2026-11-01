package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class l {
    public static final l f9381c;
    public final String f9382a;
    public final k f9383b;

    static {
        new l("");
        f9381c = new l("preload");
    }

    public l(String str) {
        k kVar;
        this.f9382a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            kVar = new k();
        } else {
            kVar = null;
        }
        this.f9383b = kVar;
    }

    public final synchronized LogSessionId a() {
        k kVar;
        kVar = this.f9383b;
        kVar.getClass();
        return (LogSessionId) kVar.f9380b;
    }
}
