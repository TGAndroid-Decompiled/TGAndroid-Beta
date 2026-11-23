package di;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class n implements TextView.OnEditorActionListener {
    public final int f9346a;
    public final Object f9347b;

    public n(Object obj, int i7) {
        this.f9346a = i7;
        this.f9347b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        oi.d1 d1Var;
        switch (this.f9346a) {
            case 0:
                t tVar = (t) this.f9347b;
                if (i7 == 5) {
                    tVar.z0();
                    return true;
                }
                tVar.getClass();
                return false;
            case 1:
                kg.t0 t0Var = (kg.t0) this.f9347b;
                kg.m0 m0Var = t0Var.G;
                boolean z10 = false;
                if (i7 == 6) {
                    t0Var.f18483y = false;
                    org.telegram.messenger.g0.r(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(t0Var.f18477f.getText())) {
                        t0Var.E = null;
                        t0Var.d.b();
                        t0Var.f18475c.f35742g3.O(true);
                    } else {
                        org.telegram.messenger.g0.g3(m0Var);
                    }
                    t0Var.g0();
                }
                return z10;
            case 2:
                oi.e1 e1Var = (oi.e1) this.f9347b;
                if (i7 == 5 && (d1Var = e1Var.f22036e2) != null && !e1Var.f22045n2) {
                    if (e1Var.f22042k2) {
                        e1Var.M();
                    } else {
                        d1Var.x0(e1Var);
                    }
                    return true;
                }
                return false;
            case 3:
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.f9347b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(q0Var.f29873e);
                        org.telegram.ui.ActionBar.m0 m0Var2 = q0Var.I;
                        if (m0Var2 != null) {
                            m0Var2.k(q0Var.f29873e);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.ActionBar.z4.i((org.telegram.ui.ActionBar.z4) this.f9347b, i7, keyEvent);
                return false;
        }
    }
}
