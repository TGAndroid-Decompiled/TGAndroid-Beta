package ci;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class o implements TextView.OnEditorActionListener {
    public final int f5661a;
    public final Object f5662b;

    public o(Object obj, int i3) {
        this.f5661a = i3;
        this.f5662b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        mi.g1 g1Var;
        switch (this.f5661a) {
            case 0:
                v vVar = (v) this.f5662b;
                if (i3 == 5) {
                    vVar.y0();
                    return true;
                }
                vVar.getClass();
                return false;
            case 1:
                lg.r0 r0Var = (lg.r0) this.f5662b;
                lg.l0 l0Var = r0Var.G;
                boolean z10 = false;
                if (i3 == 6) {
                    r0Var.f18448y = false;
                    org.telegram.messenger.g0.r(l0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(r0Var.f18442f.getText())) {
                        r0Var.E = null;
                        r0Var.d.b();
                        r0Var.f18440c.f35594g3.O(true);
                    } else {
                        org.telegram.messenger.g0.h3(l0Var);
                    }
                    r0Var.g0();
                }
                return z10;
            case 2:
                mi.h1 h1Var = (mi.h1) this.f5662b;
                if (i3 == 5 && (g1Var = h1Var.Z1) != null && !h1Var.f19653i2) {
                    if (h1Var.f19650f2) {
                        h1Var.L();
                    } else {
                        g1Var.V0(h1Var);
                    }
                    return true;
                }
                return false;
            case 3:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f5662b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(q0Var.f28445e);
                        org.telegram.ui.ActionBar.m0 m0Var = q0Var.I;
                        if (m0Var != null) {
                            m0Var.k(q0Var.f28445e);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.ActionBar.y4.e((org.telegram.ui.ActionBar.y4) this.f5662b, i3, keyEvent);
                return false;
        }
    }
}
