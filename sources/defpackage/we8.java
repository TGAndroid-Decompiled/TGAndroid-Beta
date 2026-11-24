package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
public final class we8 {
    public static final we8 c;
    public final String a;
    public final ve8 b;

    static {
        new we8("");
        c = new we8("preload");
    }

    public we8(String str) {
        ve8 ve8Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            ve8Var = new ve8();
        } else {
            ve8Var = null;
        }
        this.b = ve8Var;
    }

    public final synchronized LogSessionId a() {
        ve8 ve8Var;
        ve8Var = this.b;
        ve8Var.getClass();
        return ve8Var.a;
    }
}
