package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.ActionBar.e;
public final class m11 implements View.OnLayoutChangeListener {
    public final boolean a;
    public final v21 b;

    public m11(v21 v21Var, boolean z) {
        this.b = v21Var;
        this.a = z;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        r11 r11Var;
        int i9;
        v21 v21Var = this.b;
        z11 z11Var = v21Var.e;
        z11Var.removeOnLayoutChangeListener(this);
        if (v21Var.m) {
            z11Var.onShow();
            e eVar = v21Var.g;
            boolean z = this.a;
            if (z && (eVar instanceof iic)) {
                eVar = ((iic) eVar).b0();
            }
            FrameLayout frameLayout = v21Var.h;
            if (eVar == null || (r11Var = eVar.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296353);
                    if (tag instanceof r11) {
                        r11Var = (r11) tag;
                    }
                }
                r11Var = null;
            }
            v21Var.q = r11Var;
            if (r11Var == null && eVar != null) {
                r11Var = new zf0(eVar, (byte) 1);
                v21Var.q = r11Var;
            }
            vpa vpaVar = v21Var.d;
            if (vpaVar == null || !vpaVar.f) {
                if (r11Var != null) {
                    i9 = r11Var.e(v21Var.a);
                } else {
                    i9 = 0;
                }
                v21Var.p = i9;
            }
            r11 r11Var2 = v21Var.q;
            if (r11Var2 != null) {
                r11Var2.g(v21Var);
            }
            if (eVar != null) {
                eVar.setupBulletinGlass(v21Var);
            }
            if (uc7.e1().getBoolean("view_animations", true) && !v21Var.t) {
                if (z11Var != null && v21Var.r == null) {
                    v21Var.r = z11Var.createTransition();
                }
                z11Var.transitionRunningEnter = true;
                z11Var.delegate = v21Var.q;
                z11Var.invalidate();
                y11 y11Var = v21Var.r;
                Objects.requireNonNull(z11Var);
                y11Var.c(z11Var, new j11(z11Var, (byte) 1), new fv0(this, (byte) 9), new y42((byte) 2, this, z));
                return;
            }
            r11 r11Var3 = v21Var.q;
            z11Var.delegate = r11Var3;
            if (r11Var3 != null && !z) {
                r11Var3.b(z11Var.getHeight());
            }
            v21Var.l();
            z11Var.onEnterTransitionStart();
            z11Var.onEnterTransitionEnd();
            if (v21Var.v) {
                v21Var.i(true);
            }
        }
    }
}
