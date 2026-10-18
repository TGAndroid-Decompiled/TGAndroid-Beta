package ai;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n implements TextView.OnEditorActionListener {
    public final int f1872a;
    public final Object f1873b;

    public n(Object obj, int i10) {
        this.f1872a = i10;
        this.f1873b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ki.g1 g1Var;
        switch (this.f1872a) {
            case 0:
                x xVar = (x) this.f1873b;
                if (i10 == 5) {
                    xVar.k0();
                    return true;
                }
                xVar.getClass();
                return false;
            case 1:
                ig.t0 t0Var = (ig.t0) this.f1873b;
                ig.n0 n0Var = t0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    t0Var.f13038x = false;
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(t0Var.f13033f.getText())) {
                        t0Var.f13039y = null;
                        t0Var.d.b();
                        t0Var.f13032c.W2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(n0Var);
                    }
                    t0Var.b0();
                }
                return z10;
            default:
                ki.h1 h1Var = (ki.h1) this.f1873b;
                if (i10 == 5 && (g1Var = h1Var.f15298c) != null && !h1Var.f15303w) {
                    if (h1Var.f15301r) {
                        h1Var.p();
                    } else {
                        g1Var.l(h1Var);
                    }
                    return true;
                }
                return false;
        }
    }
}
