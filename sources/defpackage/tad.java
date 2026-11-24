package defpackage;

import android.content.Context;
public final class tad implements lr2, mt3 {
    @Override
    public final Object X(sm2 sm2Var) {
        return new f64(sm2Var.d(eg7.class));
    }

    @Override
    public final pd0 a(Context context, String str, lt3 lt3Var) {
        pd0 pd0Var = new pd0();
        int a = lt3Var.a(context, str, true);
        pd0Var.b = a;
        if (a != 0) {
            pd0Var.c = 1;
            return pd0Var;
        }
        int b = lt3Var.b(context, str);
        pd0Var.a = b;
        if (b != 0) {
            pd0Var.c = -1;
        }
        return pd0Var;
    }
}
