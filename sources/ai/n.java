package ai;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class n implements TextView.OnEditorActionListener {
    public final int f1849a;
    public final Object f1850b;

    public n(Object obj, int i10) {
        this.f1849a = i10;
        this.f1850b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ki.g1 g1Var;
        switch (this.f1849a) {
            case 0:
                x xVar = (x) this.f1850b;
                if (i10 == 5) {
                    xVar.k0();
                    return true;
                }
                xVar.getClass();
                return false;
            case 1:
                ig.s0 s0Var = (ig.s0) this.f1850b;
                ig.m0 m0Var = s0Var.H;
                boolean z10 = false;
                if (i10 == 6) {
                    s0Var.E = false;
                    AndroidUtilities.cancelRunOnUIThread(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(s0Var.f13060n.getText())) {
                        s0Var.F = null;
                        s0Var.f13059f.b();
                        s0Var.e.Z2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(m0Var);
                    }
                    s0Var.b0();
                }
                return z10;
            default:
                ki.h1 h1Var = (ki.h1) this.f1850b;
                if (i10 == 5 && (g1Var = h1Var.f15359c) != null && !h1Var.f15364w) {
                    if (h1Var.f15362r) {
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
