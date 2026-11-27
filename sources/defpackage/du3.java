package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class du3 extends xt3 {
    public Drawable f2;
    public final int g2;
    public final iu3 h2;

    public du3(iu3 iu3Var, Context context, vnb vnbVar, int i) {
        super(context, vnbVar);
        this.h2 = iu3Var;
        this.g2 = i;
        this.f2 = null;
    }

    @Override
    public final void G(int i, int i2) {
        this.h2.q(i, i2);
    }

    @Override
    public final int e() {
        return this.h2.h();
    }

    @Override
    public final int getActionModeStyle() {
        int i = this.g2;
        if (i == 2 || i == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        boolean z;
        iu3 iu3Var = this.h2;
        if (iu3Var.a()) {
            if (iu3Var.M == 3) {
                z = true;
            } else {
                z = false;
            }
            zu1.E6(menu, null, z, true, true, true);
            return;
        }
        iu3Var.i(actionMode, menu);
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        boolean z;
        super.onSelectionChanged(i, i2);
        iu3 iu3Var = this.h2;
        ya9 ya9Var = iu3Var.c;
        if (ya9Var != null) {
            boolean z2 = false;
            if (i2 != i) {
                z = true;
            } else {
                z = false;
            }
            if (iu3Var.a() && z) {
                f3f.b();
                z2 = true;
            }
            if (iu3Var.n != z2) {
                iu3Var.n = z2;
                if (z2) {
                    this.f2 = ya9Var.d;
                    ya9Var.a(2131232121, true);
                    return;
                }
                ya9Var.b(this.f2, true);
                this.f2 = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        eu3 eu3Var;
        iu3 iu3Var = this.h2;
        if (iu3Var.e && motionEvent.getAction() == 0) {
            iu3Var.u();
            if (iu3Var.y && (eu3Var = iu3Var.d) != null) {
                eu3Var.r(false);
                iu3Var.y = false;
                iu3Var.k(true);
                hl.E3(this);
            } else {
                if (hl.D) {
                    i = 0;
                } else {
                    i = 2;
                }
                iu3Var.x(i);
            }
            iu3Var.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!hl.E3(this)) {
                clearFocus();
                requestFocus();
            }
            if (!isFocused) {
                setSelection(getText().length());
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            cc4.g(e, true);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i, int i2) {
        if (this.h2.t(i2)) {
            super.scrollTo(i, i2);
        }
    }
}
