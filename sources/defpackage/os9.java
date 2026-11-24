package defpackage;

import android.view.View;
public final class os9 extends gb3 {
    @Override
    public final boolean r(s49 s49Var, zw8 zw8Var, int i, int i2, int i3, int i4) {
        us9 us9Var;
        ts9 ts9Var;
        View view = s49Var.a;
        if ((view instanceof us9) && (ts9Var = (us9Var = (us9) view).a) != null) {
            ts9Var.h = ts9Var.M;
            ts9Var.f = ts9Var.N;
            ts9Var.g = ts9Var.O;
            us9Var.b.e(true, 0.0f);
            us9Var.invalidate();
        }
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        R(s49Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                v(s49Var);
                return false;
            }
        } else {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.r.add(new fb3(s49Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override
    public final boolean t(s49 s49Var) {
        return true;
    }
}
