package di;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class m implements TextView.OnEditorActionListener {
    public final int f9036a;
    public final Object f9037b;

    public m(Object obj, int i7) {
        this.f9036a = i7;
        this.f9037b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        oi.d1 d1Var;
        switch (this.f9036a) {
            case 0:
                t tVar = (t) this.f9037b;
                if (i7 == 5) {
                    tVar.y0();
                    return true;
                }
                tVar.getClass();
                return false;
            case 1:
                kg.q0 q0Var = (kg.q0) this.f9037b;
                kg.k0 k0Var = q0Var.G;
                boolean z10 = false;
                if (i7 == 6) {
                    q0Var.f18069y = false;
                    org.telegram.messenger.g0.r(k0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(q0Var.f18063f.getText())) {
                        q0Var.E = null;
                        q0Var.d.b();
                        q0Var.f18061c.f39892g3.O(true);
                    } else {
                        org.telegram.messenger.g0.h3(k0Var);
                    }
                    q0Var.g0();
                }
                return z10;
            case 2:
                oi.e1 e1Var = (oi.e1) this.f9037b;
                if (i7 == 5 && (d1Var = e1Var.f21653e2) != null && !e1Var.f21662n2) {
                    if (e1Var.f21659k2) {
                        e1Var.M();
                    } else {
                        d1Var.z(e1Var);
                    }
                    return true;
                }
                return false;
            case 3:
                org.telegram.ui.ActionBar.q0 q0Var2 = (org.telegram.ui.ActionBar.q0) this.f9037b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(q0Var2.f29502e);
                        org.telegram.ui.ActionBar.m0 m0Var = q0Var2.I;
                        if (m0Var != null) {
                            m0Var.k(q0Var2.f29502e);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.ActionBar.w4.c((org.telegram.ui.ActionBar.w4) this.f9037b, i7, keyEvent);
                return false;
        }
    }
}
