package gh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k implements TextView.OnEditorActionListener {
    public final int f8378a;
    public final Object f8379b;

    public k(Object obj, int i9) {
        this.f8378a = i9;
        this.f8379b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        qh.c1 c1Var;
        switch (this.f8378a) {
            case 0:
                r rVar = (r) this.f8379b;
                if (i9 == 5) {
                    rVar.j0();
                    return true;
                }
                rVar.getClass();
                return false;
            case 1:
                pf.m0 m0Var = (pf.m0) this.f8379b;
                pf.i0 i0Var = m0Var.B;
                boolean z10 = false;
                if (i9 == 6) {
                    m0Var.f45709x = false;
                    AndroidUtilities.cancelRunOnUIThread(i0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(m0Var.f45704f.getText())) {
                        m0Var.f45710y = null;
                        m0Var.d.b();
                        m0Var.f45702c.U2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(i0Var);
                    }
                    m0Var.a0();
                }
                return z10;
            default:
                qh.d1 d1Var = (qh.d1) this.f8379b;
                if (i9 == 5 && (c1Var = d1Var.f46335c) != null && !d1Var.f46341w) {
                    if (d1Var.f46339r) {
                        d1Var.p();
                    } else {
                        c1Var.L0(d1Var);
                    }
                    return true;
                }
                return false;
        }
    }
}
