package defpackage;

import android.view.View;
public final class ll implements ht3 {
    public final byte a = 0;
    public final float b;
    public final Object c;
    public final Object d;

    public ll(float f, View view, Runnable runnable) {
        this.c = runnable;
        this.d = view;
        this.b = f;
    }

    @Override
    public final void a(zna znaVar, boolean z, float f, float f2) {
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
                xt4 xt4Var = (xt4) obj2;
                ut4 ut4Var = (ut4) obj;
                wt4 wt4Var = xt4Var.l1;
                if (!z) {
                    wt4Var.setTranslationY(f3);
                    wt4Var.L = false;
                    xt4Var.n1 = null;
                    xt4Var.o1 = null;
                    if (ut4Var != null) {
                        ut4Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ll(xt4 xt4Var, float f, ut4 ut4Var) {
        this.c = xt4Var;
        this.b = f;
        this.d = ut4Var;
    }
}
