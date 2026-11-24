package defpackage;

import android.graphics.Rect;
import android.view.View;
public final class wk0 implements View.OnLayoutChangeListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public wk0(gk4 gk4Var) {
        this.a = (byte) 1;
        this.d = gk4Var;
        this.b = new Rect();
        this.c = new Rect();
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((av9) obj3).setProgress(xk0.m1);
                ((av9) obj2).setProgress(xk0.n1);
                ((av9) obj).setProgress(xk0.o1);
                return;
            default:
                Rect rect = (Rect) obj3;
                rect.set(i, i2, i3, i4);
                Rect rect2 = (Rect) obj2;
                rect2.set(i5, i6, i7, i8);
                gk4 gk4Var = (gk4) obj;
                ek4 ek4Var = gk4Var.b;
                if (ek4Var.e() && !rect.equals(rect2)) {
                    gk4Var.h = true;
                    if (ek4Var.e()) {
                        gk4Var.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wk0(av9 av9Var, av9 av9Var2, av9 av9Var3) {
        this.a = (byte) 0;
        this.b = av9Var;
        this.c = av9Var2;
        this.d = av9Var3;
    }
}
