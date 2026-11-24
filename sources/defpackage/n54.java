package defpackage;

import android.content.Context;
public final class n54 implements lv8 {
    public final byte a;
    public final lq5 b;

    public n54(lq5 lq5Var, byte b) {
        this.a = b;
        this.b = lq5Var;
    }

    @Override
    public final Object mo8get() {
        byte b = this.a;
        lq5 lq5Var = this.b;
        switch (b) {
            case 0:
                return new m54((nv8) lq5Var.a);
            default:
                return new va6((Context) lq5Var.a);
        }
    }
}
