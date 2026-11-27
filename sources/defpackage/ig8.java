package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class ig8 {
    public static final ig8 c;
    public final String a;
    public final hg8 b;

    static {
        new ig8("");
        c = new ig8("preload");
    }

    public ig8(String str) {
        hg8 hg8Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            hg8Var = new hg8();
        } else {
            hg8Var = null;
        }
        this.b = hg8Var;
    }

    public final synchronized LogSessionId a() {
        hg8 hg8Var;
        hg8Var = this.b;
        hg8Var.getClass();
        return hg8Var.a;
    }
}
