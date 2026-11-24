package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.ActionBar.d;
public final class l21 implements View.OnLayoutChangeListener {
    public final boolean a;
    public final u31 b;

    public l21(u31 u31Var, boolean z) {
        this.b = u31Var;
        this.a = z;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        q21 q21Var;
        int i9;
        u31 u31Var = this.b;
        y21 y21Var = u31Var.e;
        y21Var.removeOnLayoutChangeListener(this);
        if (u31Var.m) {
            y21Var.onShow();
            d dVar = u31Var.g;
            boolean z = this.a;
            if (z && (dVar instanceof jgc)) {
                dVar = ((jgc) dVar).b0();
            }
            FrameLayout frameLayout = u31Var.h;
            if (dVar == null || (q21Var = dVar.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296353);
                    if (tag instanceof q21) {
                        q21Var = (q21) tag;
                    }
                }
                q21Var = null;
            }
            u31Var.q = q21Var;
            if (q21Var == null && dVar != null) {
                q21Var = new yg0(dVar, (byte) 1);
                u31Var.q = q21Var;
            }
            zna znaVar = u31Var.d;
            if (znaVar == null || !znaVar.f) {
                if (q21Var != null) {
                    i9 = q21Var.e(u31Var.a);
                } else {
                    i9 = 0;
                }
                u31Var.p = i9;
            }
            q21 q21Var2 = u31Var.q;
            if (q21Var2 != null) {
                q21Var2.g(u31Var);
            }
            if (dVar != null) {
                dVar.setupBulletinGlass(u31Var);
            }
            if (oc7.d1().getBoolean("view_animations", true) && !u31Var.t) {
                if (y21Var != null && u31Var.r == null) {
                    u31Var.r = y21Var.createTransition();
                }
                y21Var.transitionRunningEnter = true;
                y21Var.delegate = u31Var.q;
                y21Var.invalidate();
                x21 x21Var = u31Var.r;
                Objects.requireNonNull(y21Var);
                x21Var.g0(y21Var, new j21(y21Var, (byte) 1), new yt0(this, (byte) 10), new t52((byte) 2, this, z));
                return;
            }
            q21 q21Var3 = u31Var.q;
            y21Var.delegate = q21Var3;
            if (q21Var3 != null && !z) {
                q21Var3.b(y21Var.getHeight());
            }
            u31Var.l();
            y21Var.onEnterTransitionStart();
            y21Var.onEnterTransitionEnd();
            if (u31Var.v) {
                u31Var.i(true);
            }
        }
    }
}
