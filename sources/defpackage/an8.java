package defpackage;

import android.content.Context;
public final class an8 implements lv8 {
    public final byte a = 0;
    public final lv8 b;
    public final lq5 c;

    public an8(lq5 lq5Var, lv8 lv8Var) {
        this.c = lq5Var;
        this.b = lv8Var;
    }

    @Override
    public final Object mo8get() {
        byte b = this.a;
        lq5 lq5Var = this.c;
        lv8 lv8Var = this.b;
        switch (b) {
            case 0:
                return new zm8((Context) lq5Var.a, (wac) lv8Var.mo8get());
            default:
                return new r89((ss) lv8Var.mo8get(), (cy2) lq5Var.a);
        }
    }

    public an8(lv8 lv8Var, lq5 lq5Var) {
        this.b = lv8Var;
        this.c = lq5Var;
    }
}
