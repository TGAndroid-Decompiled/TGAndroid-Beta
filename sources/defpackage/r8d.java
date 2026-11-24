package defpackage;

import android.content.Context;
public final class r8d implements aq2, cs3 {
    @Override
    public final Object K(gl2 gl2Var) {
        return new u44(gl2Var.d(ce7.class));
    }

    @Override
    public final pc0 a(Context context, String str, bs3 bs3Var) {
        pc0 pc0Var = new pc0();
        int a = bs3Var.a(context, str, true);
        pc0Var.b = a;
        if (a != 0) {
            pc0Var.c = 1;
            return pc0Var;
        }
        int b = bs3Var.b(context, str);
        pc0Var.a = b;
        if (b != 0) {
            pc0Var.c = -1;
        }
        return pc0Var;
    }
}
