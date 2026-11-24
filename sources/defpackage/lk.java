package defpackage;

import android.view.View;
public final class lk implements xr3 {
    public final byte a = 0;
    public final float b;
    public final Object c;
    public final Object d;

    public lk(float f, View view, Runnable runnable) {
        this.c = runnable;
        this.d = view;
        this.b = f;
    }

    @Override
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        byte b = this.a;
        Object obj = this.d;
        float f3 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                Runnable runnable = (Runnable) obj2;
                View view = (View) obj;
                if (runnable != null) {
                    runnable.run();
                }
                view.setTranslationX(f3);
                view.setTag(2131296665, null);
                view.setTag(2131296666, null);
                return;
            default:
                wr4 wr4Var = (wr4) obj2;
                tr4 tr4Var = (tr4) obj;
                vr4 vr4Var = wr4Var.l1;
                if (!z) {
                    vr4Var.setTranslationY(f3);
                    vr4Var.L = false;
                    wr4Var.n1 = null;
                    wr4Var.o1 = null;
                    if (tr4Var != null) {
                        tr4Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public lk(wr4 wr4Var, float f, tr4 tr4Var) {
        this.c = wr4Var;
        this.b = f;
        this.d = tr4Var;
    }
}
