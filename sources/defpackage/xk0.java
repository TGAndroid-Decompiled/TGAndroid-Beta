package defpackage;

import android.graphics.Rect;
import android.view.View;
public final class xk0 implements View.OnLayoutChangeListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public xk0(lm4 lm4Var) {
        this.a = (byte) 1;
        this.d = lm4Var;
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
                ((uy9) obj3).setProgress(yk0.m1);
                ((uy9) obj2).setProgress(yk0.n1);
                ((uy9) obj).setProgress(yk0.o1);
                return;
            default:
                Rect rect = (Rect) obj3;
                rect.set(i, i2, i3, i4);
                Rect rect2 = (Rect) obj2;
                rect2.set(i5, i6, i7, i8);
                lm4 lm4Var = (lm4) obj;
                jm4 jm4Var = lm4Var.b;
                if (jm4Var.e() && !rect.equals(rect2)) {
                    lm4Var.h = true;
                    if (jm4Var.e()) {
                        lm4Var.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xk0(uy9 uy9Var, uy9 uy9Var2, uy9 uy9Var3) {
        this.a = (byte) 0;
        this.b = uy9Var;
        this.c = uy9Var2;
        this.d = uy9Var3;
    }
}
