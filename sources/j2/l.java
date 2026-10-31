package j2;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class l {
    public static final l f9380c;
    public final String f9381a;
    public final k f9382b;

    static {
        new l("");
        f9380c = new l("preload");
    }

    public l(String str) {
        k kVar;
        this.f9381a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            kVar = new k();
        } else {
            kVar = null;
        }
        this.f9382b = kVar;
    }

    public final synchronized LogSessionId a() {
        k kVar;
        kVar = this.f9382b;
        kVar.getClass();
        return (LogSessionId) kVar.f9379b;
    }
}
