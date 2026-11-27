package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class ur1 extends b0f {
    public final byte a;
    public final Object b;

    public ur1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(boolean z) {
        byte b = this.a;
        r47 r47Var = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj;
                zu1Var.K9 = !z;
                if (z) {
                    if (zu1Var.v9 != null) {
                        zu1Var.Bc(0.0f);
                        zu1Var.v9 = null;
                    }
                    zu1Var.w9 = false;
                    zu1Var.C9 = false;
                    ss1 ss1Var = zu1Var.E9;
                    if (ss1Var != null) {
                        hl.r(ss1Var.I);
                        ss1Var.a();
                    }
                }
                zu1Var.dd();
                return;
            case 1:
                m57 m57Var = (m57) obj;
                g57 g57Var = m57Var.e;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m57Var.s;
                s57 s57Var = m57Var.d0;
                if (s57Var.s) {
                    if (!z) {
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b > 0.0f) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                            return;
                        }
                        return;
                    } else if (g57Var.v - g57Var.u > uc7.s1(s57Var.x).k4.V1.f()) {
                        m57Var.f();
                        return;
                    } else {
                        hmb hmbVar = g57Var.W;
                        if (hmbVar != null) {
                            r47Var = ((wb2) hmbVar).getMessageObject();
                        }
                        r47 a = m57Var.a(r47Var);
                        v47 v47Var = s57Var.d;
                        if (v47Var.d == null) {
                            int i = g57Var.u;
                            v47Var.e = i;
                            int i2 = g57Var.v;
                            v47Var.f = i2;
                            v47Var.d = ou1.b(i, i2, a);
                            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(m57Var.J);
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                o68 o68Var = (o68) obj;
                k68 k68Var = o68Var.A1;
                boolean w = o68Var.u0.W.w();
                lcb lcbVar = ((ccb) k68Var).d;
                lcbVar.j1 = w;
                lcbVar.U();
                return;
        }
    }

    @Override
    public final void b() {
        a aVar;
        a aVar2;
        switch (this.a) {
            case 0:
                zu1 zu1Var = (zu1) this.b;
                aVar = ((e) zu1Var).actionBar;
                if (aVar != null) {
                    aVar2 = ((e) zu1Var).actionBar;
                    if (aVar2.z()) {
                        zu1Var.L5(false);
                    }
                }
                zu1Var.i6();
                zu1Var.N3.j(58, 0L, null);
                return;
            default:
                return;
        }
    }
}
