package di;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class n implements TextView.OnEditorActionListener {
    public final int f9357a;
    public final Object f9358b;

    public n(Object obj, int i7) {
        this.f9357a = i7;
        this.f9358b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        oi.d1 d1Var;
        switch (this.f9357a) {
            case 0:
                t tVar = (t) this.f9358b;
                if (i7 == 5) {
                    tVar.z0();
                    return true;
                }
                tVar.getClass();
                return false;
            case 1:
                kg.t0 t0Var = (kg.t0) this.f9358b;
                kg.n0 n0Var = t0Var.G;
                boolean z10 = false;
                if (i7 == 6) {
                    t0Var.f18487y = false;
                    org.telegram.messenger.g0.r(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(t0Var.f18481f.getText())) {
                        t0Var.E = null;
                        t0Var.d.b();
                        t0Var.f18479c.f34607g3.O(true);
                    } else {
                        org.telegram.messenger.g0.g3(n0Var);
                    }
                    t0Var.g0();
                }
                return z10;
            case 2:
                oi.e1 e1Var = (oi.e1) this.f9358b;
                if (i7 == 5 && (d1Var = e1Var.f22010e2) != null && !e1Var.f22019n2) {
                    if (e1Var.f22016k2) {
                        e1Var.M();
                    } else {
                        d1Var.x0(e1Var);
                    }
                    return true;
                }
                return false;
            case 3:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f9358b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(r0Var.f29923e);
                        org.telegram.ui.ActionBar.n0 n0Var2 = r0Var.I;
                        if (n0Var2 != null) {
                            n0Var2.k(r0Var.f29923e);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.ActionBar.a5.i((org.telegram.ui.ActionBar.a5) this.f9358b, i7, keyEvent);
                return false;
        }
    }
}
