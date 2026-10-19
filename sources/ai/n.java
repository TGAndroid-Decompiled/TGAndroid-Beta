package ai;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n implements TextView.OnEditorActionListener {
    public final int f1859a;
    public final Object f1860b;

    public n(Object obj, int i10) {
        this.f1859a = i10;
        this.f1860b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ki.g1 g1Var;
        switch (this.f1859a) {
            case 0:
                x xVar = (x) this.f1860b;
                if (i10 == 5) {
                    xVar.k0();
                    return true;
                }
                xVar.getClass();
                return false;
            case 1:
                ig.t0 t0Var = (ig.t0) this.f1860b;
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
                ki.h1 h1Var = (ki.h1) this.f1860b;
                if (i10 == 5 && (g1Var = h1Var.f15299c) != null && !h1Var.f15304w) {
                    if (h1Var.f15302r) {
                        h1Var.p();
                    } else {
                        g1Var.k(h1Var);
                    }
                    return true;
                }
                return false;
        }
    }
}
