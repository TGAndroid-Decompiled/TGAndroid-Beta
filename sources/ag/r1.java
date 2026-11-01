package ag;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.i5;
public final class r1 implements TextView.OnEditorActionListener {
    public final int f696a;
    public final Object f697b;

    public r1(Object obj, int i10) {
        this.f696a = i10;
        this.f697b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        bi.m1 m1Var;
        switch (this.f696a) {
            case 0:
                t1 t1Var = (t1) this.f697b;
                l1 l1Var = t1Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    t1Var.f736y = false;
                    org.telegram.messenger.i0.r(l1Var);
                    z10 = true;
                    if (TextUtils.isEmpty(t1Var.f730f.getText())) {
                        t1Var.D = null;
                        t1Var.d.b();
                        t1Var.f729c.f31183f3.O(true);
                    } else {
                        org.telegram.messenger.i0.g3(l1Var);
                    }
                    t1Var.g0();
                }
                return z10;
            case 1:
                bi.n1 n1Var = (bi.n1) this.f697b;
                if (i10 == 5 && (m1Var = n1Var.Y1) != null && !n1Var.f3223h2) {
                    if (n1Var.f3220e2) {
                        n1Var.L();
                    } else {
                        m1Var.e(n1Var);
                    }
                    return true;
                }
                return false;
            case 2:
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f697b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        org.telegram.messenger.i0.v1(t0Var.e);
                        org.telegram.ui.ActionBar.p0 p0Var = t0Var.H;
                        if (p0Var != null) {
                            p0Var.k(t0Var.e);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            case 3:
                i5.e((i5) this.f697b, i10, keyEvent);
                return false;
            default:
                rh.i iVar = (rh.i) this.f697b;
                if (i10 == 5) {
                    iVar.y0();
                    return true;
                }
                iVar.getClass();
                return false;
        }
    }
}
