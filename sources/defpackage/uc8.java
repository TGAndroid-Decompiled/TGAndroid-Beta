package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class uc8 {
    public static final uc8 c;
    public final String a;
    public final tc8 b;

    static {
        new uc8("");
        c = new uc8("preload");
    }

    public uc8(String str) {
        tc8 tc8Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            tc8Var = new tc8();
        } else {
            tc8Var = null;
        }
        this.b = tc8Var;
    }

    public final synchronized LogSessionId a() {
        tc8 tc8Var;
        tc8Var = this.b;
        tc8Var.getClass();
        return tc8Var.a;
    }
}
