package defpackage;

import android.view.View;
public final class qu9 extends sc3 {
    @Override
    public final boolean r(u69 u69Var, az8 az8Var, int i, int i2, int i3, int i4) {
        wu9 wu9Var;
        vu9 vu9Var;
        View view = u69Var.a;
        if ((view instanceof wu9) && (vu9Var = (wu9Var = (wu9) view).a) != null) {
            vu9Var.h = vu9Var.M;
            vu9Var.f = vu9Var.N;
            vu9Var.g = vu9Var.O;
            wu9Var.b.e(true, 0.0f);
            wu9Var.invalidate();
        }
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        R(u69Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                v(u69Var);
                return false;
            }
        } else {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.r.add(new rc3(u69Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override
    public final boolean t(u69 u69Var) {
        return true;
    }
}
