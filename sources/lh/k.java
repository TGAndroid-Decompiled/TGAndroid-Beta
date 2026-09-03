package lh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k implements TextView.OnEditorActionListener {
    public final int f12673a;
    public final Object f12674b;

    public k(Object obj, int i10) {
        this.f12673a = i10;
        this.f12674b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        vh.d1 d1Var;
        switch (this.f12673a) {
            case 0:
                q qVar = (q) this.f12674b;
                if (i10 == 5) {
                    qVar.k0();
                    return true;
                }
                qVar.getClass();
                return false;
            case 1:
                uf.l0 l0Var = (uf.l0) this.f12674b;
                uf.h0 h0Var = l0Var.C;
                boolean z4 = false;
                if (i10 == 6) {
                    l0Var.f45435x = false;
                    AndroidUtilities.cancelRunOnUIThread(h0Var);
                    z4 = true;
                    if (TextUtils.isEmpty(l0Var.f45430f.getText())) {
                        l0Var.f45436y = null;
                        l0Var.d.b();
                        l0Var.f45429c.V2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(h0Var);
                    }
                    l0Var.b0();
                }
                return z4;
            default:
                vh.e1 e1Var = (vh.e1) this.f12674b;
                if (i10 == 5 && (d1Var = e1Var.f45942c) != null && !e1Var.f45947w) {
                    if (e1Var.f45945r) {
                        e1Var.p();
                    } else {
                        d1Var.g1(e1Var);
                    }
                    return true;
                }
                return false;
        }
    }
}
