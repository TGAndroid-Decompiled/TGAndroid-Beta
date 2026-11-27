package defpackage;

import android.view.View;
public final class kk implements ps3 {
    public final byte a = 0;
    public final float b;
    public final Object c;
    public final Object d;

    public kk(float f, View view, Runnable runnable) {
        this.c = runnable;
        this.d = view;
        this.b = f;
    }

    @Override
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
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
                au4 au4Var = (au4) obj2;
                xt4 xt4Var = (xt4) obj;
                zt4 zt4Var = au4Var.l1;
                if (!z) {
                    zt4Var.setTranslationY(f3);
                    zt4Var.L = false;
                    au4Var.n1 = null;
                    au4Var.o1 = null;
                    if (xt4Var != null) {
                        xt4Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public kk(au4 au4Var, float f, xt4 xt4Var) {
        this.c = au4Var;
        this.b = f;
        this.d = xt4Var;
    }
}
