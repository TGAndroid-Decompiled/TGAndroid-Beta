package defpackage;

import android.graphics.Rect;
import android.view.View;
public final class wl0 implements View.OnLayoutChangeListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public wl0(hm4 hm4Var) {
        this.a = (byte) 1;
        this.d = hm4Var;
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
                ((dx9) obj3).setProgress(xl0.m1);
                ((dx9) obj2).setProgress(xl0.n1);
                ((dx9) obj).setProgress(xl0.o1);
                return;
            default:
                Rect rect = (Rect) obj3;
                rect.set(i, i2, i3, i4);
                Rect rect2 = (Rect) obj2;
                rect2.set(i5, i6, i7, i8);
                hm4 hm4Var = (hm4) obj;
                fm4 fm4Var = hm4Var.b;
                if (fm4Var.e() && !rect.equals(rect2)) {
                    hm4Var.h = true;
                    if (fm4Var.e()) {
                        hm4Var.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public wl0(dx9 dx9Var, dx9 dx9Var2, dx9 dx9Var3) {
        this.a = (byte) 0;
        this.b = dx9Var;
        this.c = dx9Var2;
        this.d = dx9Var3;
    }
}
