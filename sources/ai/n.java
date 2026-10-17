package ai;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n implements TextView.OnEditorActionListener {
    public final int f1877a;
    public final Object f1878b;

    public n(Object obj, int i10) {
        this.f1877a = i10;
        this.f1878b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ki.g1 g1Var;
        switch (this.f1877a) {
            case 0:
                x xVar = (x) this.f1878b;
                if (i10 == 5) {
                    xVar.k0();
                    return true;
                }
                xVar.getClass();
                return false;
            case 1:
                ig.r0 r0Var = (ig.r0) this.f1878b;
                ig.n0 n0Var = r0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    r0Var.f13018x = false;
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(r0Var.f13013f.getText())) {
                        r0Var.f13019y = null;
                        r0Var.d.b();
                        r0Var.f13012c.W2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(n0Var);
                    }
                    r0Var.b0();
                }
                return z10;
            default:
                ki.h1 h1Var = (ki.h1) this.f1878b;
                if (i10 == 5 && (g1Var = h1Var.f15293c) != null && !h1Var.f15298w) {
                    if (h1Var.f15296r) {
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
