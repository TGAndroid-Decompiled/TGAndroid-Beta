package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.ui.ActionBar.d;
public final class d11 implements View.OnLayoutChangeListener {
    public final boolean a;
    public final m21 b;

    public d11(m21 m21Var, boolean z) {
        this.b = m21Var;
        this.a = z;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i11 i11Var;
        int i9;
        m21 m21Var = this.b;
        q11 q11Var = m21Var.e;
        q11Var.removeOnLayoutChangeListener(this);
        if (m21Var.l) {
            q11Var.onShow();
            d dVar = m21Var.g;
            boolean z = this.a;
            if (z && (dVar instanceof jec)) {
                dVar = ((jec) dVar).b0();
            }
            FrameLayout frameLayout = m21Var.h;
            if (dVar == null || (i11Var = dVar.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(2131296353);
                    if (tag instanceof i11) {
                        i11Var = (i11) tag;
                    }
                }
                i11Var = null;
            }
            m21Var.p = i11Var;
            if (i11Var == null && dVar != null) {
                i11Var = new xf0(dVar, (byte) 1);
                m21Var.p = i11Var;
            }
            yla ylaVar = m21Var.d;
            if (ylaVar == null || !ylaVar.f) {
                if (i11Var != null) {
                    i9 = i11Var.e(m21Var.a);
                } else {
                    i9 = 0;
                }
                m21Var.o = i9;
            }
            i11 i11Var2 = m21Var.p;
            if (i11Var2 != null) {
                i11Var2.g(m21Var);
            }
            if (dVar != null) {
                dVar.setupBulletinGlass(m21Var);
            }
            if (na7.c1().getBoolean("view_animations", true) && !m21Var.s) {
                if (q11Var != null && m21Var.q == null) {
                    m21Var.q = q11Var.createTransition();
                }
                q11Var.transitionRunningEnter = true;
                q11Var.delegate = m21Var.p;
                q11Var.invalidate();
                p11 p11Var = m21Var.q;
                Objects.requireNonNull(q11Var);
                p11Var.f(q11Var, new b11(q11Var, (byte) 1), new nv0(this, (byte) 7), new i42((byte) 2, this, z));
                return;
            }
            i11 i11Var3 = m21Var.p;
            q11Var.delegate = i11Var3;
            if (i11Var3 != null && !z) {
                i11Var3.b(q11Var.getHeight());
            }
            m21Var.l();
            q11Var.onEnterTransitionStart();
            q11Var.onEnterTransitionEnd();
            if (m21Var.u) {
                m21Var.i(true);
            }
        }
    }
}
