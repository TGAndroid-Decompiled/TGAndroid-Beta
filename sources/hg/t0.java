package hg;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t0 implements TextView.OnEditorActionListener {
    public final int f10414a;
    public final Object f10415b;

    public t0(Object obj, int i10) {
        this.f10414a = i10;
        this.f10415b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ii.h1 h1Var;
        switch (this.f10414a) {
            case 0:
                u0 u0Var = (u0) this.f10415b;
                n0 n0Var = u0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    u0Var.f10441x = false;
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(u0Var.f10436f.getText())) {
                        u0Var.f10442y = null;
                        u0Var.d.b();
                        u0Var.f10435c.Y2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(n0Var);
                    }
                    u0Var.b0();
                }
                return z10;
            case 1:
                ii.i1 i1Var = (ii.i1) this.f10415b;
                if (i10 == 5 && (h1Var = i1Var.f11434c) != null && !i1Var.f11439w) {
                    if (i1Var.f11437r) {
                        i1Var.p();
                    } else {
                        h1Var.l(i1Var);
                    }
                    return true;
                }
                return false;
            default:
                yh.g gVar = (yh.g) this.f10415b;
                if (i10 == 5) {
                    gVar.k0();
                    return true;
                }
                gVar.getClass();
                return false;
        }
    }
}
