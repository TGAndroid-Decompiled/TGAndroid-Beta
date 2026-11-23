package di;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class n implements TextView.OnEditorActionListener {
    public final int f9342a;
    public final Object f9343b;

    public n(Object obj, int i7) {
        this.f9342a = i7;
        this.f9343b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        oi.e1 e1Var;
        switch (this.f9342a) {
            case 0:
                t tVar = (t) this.f9343b;
                if (i7 == 5) {
                    tVar.z0();
                    return true;
                }
                tVar.getClass();
                return false;
            case 1:
                kg.s0 s0Var = (kg.s0) this.f9343b;
                kg.m0 m0Var = s0Var.G;
                boolean z10 = false;
                if (i7 == 6) {
                    s0Var.f18564y = false;
                    org.telegram.messenger.g0.r(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(s0Var.f18558f.getText())) {
                        s0Var.E = null;
                        s0Var.d.b();
                        s0Var.f18556c.f35323g3.O(true);
                    } else {
                        org.telegram.messenger.g0.g3(m0Var);
                    }
                    s0Var.g0();
                }
                return z10;
            case 2:
                oi.f1 f1Var = (oi.f1) this.f9343b;
                if (i7 == 5 && (e1Var = f1Var.f22166e2) != null && !f1Var.f22175n2) {
                    if (f1Var.f22172k2) {
                        f1Var.M();
                    } else {
                        e1Var.A(f1Var);
                    }
                    return true;
                }
                return false;
            case 3:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f9343b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(q0Var.f29964e);
                        org.telegram.ui.ActionBar.m0 m0Var2 = q0Var.I;
                        if (m0Var2 != null) {
                            m0Var2.k(q0Var.f29964e);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.ActionBar.z4.i((org.telegram.ui.ActionBar.z4) this.f9343b, i7, keyEvent);
                return false;
        }
    }
}
