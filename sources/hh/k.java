package hh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class k implements TextView.OnEditorActionListener {

    public final int f9566a;

    public final Object f9567b;

    public k(Object obj, int i10) {
        this.f9566a = i10;
        this.f9567b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        rh.c1 c1Var;
        switch (this.f9566a) {
            case 0:
                r rVar = (r) this.f9567b;
                if (i10 == 5) {
                    rVar.k0();
                    return true;
                }
                rVar.getClass();
                return false;
            case 1:
                qf.m0 m0Var = (qf.m0) this.f9567b;
                qf.i0 i0Var = m0Var.B;
                boolean z10 = false;
                if (i10 == 6) {
                    m0Var.f46379x = false;
                    AndroidUtilities.cancelRunOnUIThread(i0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(m0Var.f46374f.getText())) {
                        m0Var.f46380y = null;
                        m0Var.d.b();
                        m0Var.f46372c.U2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(i0Var);
                    }
                    m0Var.b0();
                }
                return z10;
            default:
                rh.d1 d1Var = (rh.d1) this.f9567b;
                if (i10 != 5 || (c1Var = d1Var.f47099c) == null || d1Var.f47105w) {
                    return false;
                }
                if (d1Var.f47103r) {
                    d1Var.p();
                } else {
                    c1Var.w1(d1Var);
                }
                return true;
        }
    }
}
