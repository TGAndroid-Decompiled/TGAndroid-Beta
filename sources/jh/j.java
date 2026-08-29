package jh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j implements TextView.OnEditorActionListener {
    public final int f12278a;
    public final Object f12279b;

    public j(Object obj, int i10) {
        this.f12278a = i10;
        this.f12279b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        th.c1 c1Var;
        switch (this.f12278a) {
            case 0:
                q qVar = (q) this.f12279b;
                if (i10 == 5) {
                    qVar.k0();
                    return true;
                }
                qVar.getClass();
                return false;
            case 1:
                sf.l0 l0Var = (sf.l0) this.f12279b;
                sf.h0 h0Var = l0Var.B;
                boolean z10 = false;
                if (i10 == 6) {
                    l0Var.f47869x = false;
                    AndroidUtilities.cancelRunOnUIThread(h0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(l0Var.f47864f.getText())) {
                        l0Var.f47870y = null;
                        l0Var.d.b();
                        l0Var.f47862c.U2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(h0Var);
                    }
                    l0Var.b0();
                }
                return z10;
            default:
                th.d1 d1Var = (th.d1) this.f12279b;
                if (i10 == 5 && (c1Var = d1Var.f48399c) != null && !d1Var.f48405w) {
                    if (d1Var.f48403r) {
                        d1Var.p();
                    } else {
                        c1Var.S0(d1Var);
                    }
                    return true;
                }
                return false;
        }
    }
}
