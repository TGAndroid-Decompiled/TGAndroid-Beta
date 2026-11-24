package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
public final class mt3 extends gt3 {
    public Drawable e2;
    public final int f2;
    public final rt3 g2;

    public mt3(rt3 rt3Var, Context context, wjb wjbVar, int i) {
        super(context, wjbVar);
        this.g2 = rt3Var;
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
        rt3 rt3Var = this.g2;
        if (rt3Var.a()) {
            if (rt3Var.M == 3) {
                z = true;
            } else {
                z = false;
            }
            mu1.x6(menu, null, z, true, true, true);
            return;
        }
        rt3Var.i(actionMode, menu);
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        boolean z;
        super.onSelectionChanged(i, i2);
        rt3 rt3Var = this.g2;
        l79 l79Var = rt3Var.c;
        if (l79Var != null) {
            boolean z2 = false;
            if (i2 != i) {
                z = true;
            } else {
                z = false;
            }
            if (rt3Var.a() && z) {
                nye.b();
                z2 = true;
            }
            if (rt3Var.n != z2) {
                rt3Var.n = z2;
                if (z2) {
                    this.e2 = l79Var.d;
                    l79Var.a(2131232121, true);
                    return;
                }
                l79Var.b(this.e2, true);
                this.e2 = null;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        nt3 nt3Var;
        rt3 rt3Var = this.g2;
        if (rt3Var.e && motionEvent.getAction() == 0) {
            rt3Var.u();
            if (rt3Var.y && (nt3Var = rt3Var.d) != null) {
                nt3Var.s(false);
                rt3Var.y = false;
                rt3Var.k(true);
                gl.E3(this);
            } else {
                if (gl.D) {
                    i = 0;
                } else {
                    i = 2;
                }
                rt3Var.x(i);
            }
            rt3Var.v();
        }
        if (motionEvent.getAction() == 0) {
            boolean isFocused = isFocused();
            requestFocus();
            if (!gl.E3(this)) {
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
            fa4.g(e, true);
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
