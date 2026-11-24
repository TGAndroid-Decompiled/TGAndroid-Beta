package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class wu3 extends qu3 {
    public Drawable e2;
    public final int f2;
    public final cv3 g2;

    public wu3(cv3 cv3Var, Context context, ylb ylbVar, int i) {
        super(context, ylbVar);
        this.g2 = cv3Var;
        this.f2 = i;
        this.e2 = null;
    }

    @Override
    public final void G(int i, int i2) {
        this.g2.q(i, i2);
    }

    @Override
    public final int e() {
        return this.g2.h();
    }

    @Override
    public final int getActionModeStyle() {
        int i = this.f2;
        if (i == 2 || i == 3) {
            return 2;
        }
        return super.getActionModeStyle();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        boolean z;
        cv3 cv3Var = this.g2;
        if (cv3Var.a()) {
            if (cv3Var.M == 3) {
                z = true;
            } else {
                z = false;
            }
            yv1.E6(menu, null, z, true, true, true);
            return;
        }
        cv3Var.i(actionMode, menu);
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        boolean z;
        super.onSelectionChanged(i, i2);
        cv3 cv3Var = this.g2;
        n99 n99Var = cv3Var.c;
        if (n99Var != null) {
            boolean z2 = false;
            if (i2 != i) {
                z = true;
            } else {
                z = false;
            }
            if (cv3Var.a() && z) {
                p0f.b();
                z2 = true;
            }
            if (cv3Var.n != z2) {
                cv3Var.n = z2;
                if (z2) {
                    this.e2 = n99Var.d;
                    n99Var.a(2131232122, true);
                    return;
                }
                n99Var.b(this.e2, true);
                this.e2 = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        xu3 xu3Var;
        cv3 cv3Var = this.g2;
        if (cv3Var.e && motionEvent.getAction() == 0) {
            cv3Var.u();
            if (cv3Var.y && (xu3Var = cv3Var.d) != null) {
                xu3Var.r(false);
                cv3Var.y = false;
                cv3Var.k(true);
                gm.E3(this);
            } else {
                if (gm.D) {
                    i = 0;
                } else {
                    i = 2;
                }
                cv3Var.x(i);
            }
            cv3Var.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!gm.E3(this)) {
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
            fc4.g(e, true);
            return false;
        }
    }

    @Override
    public final void scrollTo(int i, int i2) {
        if (this.g2.t(i2)) {
            super.scrollTo(i, i2);
        }
    }
}
