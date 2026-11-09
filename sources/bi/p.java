package bi;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
public final class p implements TextView.OnEditorActionListener {
    public final int f4497a;
    public final Object f4498b;

    public p(Object obj, int i7) {
        this.f4497a = i7;
        this.f4498b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        li.f1 f1Var;
        switch (this.f4497a) {
            case 0:
                z zVar = (z) this.f4498b;
                if (i7 == 5) {
                    zVar.y0();
                    return true;
                }
                zVar.getClass();
                return false;
            case 1:
                kg.q0 q0Var = (kg.q0) this.f4498b;
                kg.k0 k0Var = q0Var.F;
                boolean z9 = false;
                if (i7 == 6) {
                    q0Var.f17510y = false;
                    org.telegram.messenger.g0.r(k0Var);
                    z9 = true;
                    if (TextUtils.isEmpty(q0Var.f17504f.getText())) {
                        q0Var.D = null;
                        q0Var.d.b();
                        q0Var.f17502c.f37556f3.O(true);
                    } else {
                        org.telegram.messenger.g0.h3(k0Var);
                    }
                    q0Var.g0();
                }
                return z9;
            case 2:
                li.g1 g1Var = (li.g1) this.f4498b;
                if (i7 == 5 && (f1Var = g1Var.Y1) != null && !g1Var.f18590h2) {
                    if (g1Var.f18587e2) {
                        g1Var.L();
                    } else {
                        f1Var.F(g1Var);
                    }
                    return true;
                }
                return false;
            case 3:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f4498b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.g0.v1(r0Var.f28430e);
                        org.telegram.ui.ActionBar.n0 n0Var = r0Var.H;
                        if (n0Var != null) {
                            n0Var.k(r0Var.f28430e);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                org.telegram.ui.ActionBar.y4.c((org.telegram.ui.ActionBar.y4) this.f4498b, i7, keyEvent);
                return false;
        }
    }
}
