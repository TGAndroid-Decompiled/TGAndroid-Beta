package lh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class k implements TextView.OnEditorActionListener {
    public final int f12689a;
    public final Object f12690b;

    public k(Object obj, int i10) {
        this.f12689a = i10;
        this.f12690b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        vh.c1 c1Var;
        switch (this.f12689a) {
            case 0:
                q qVar = (q) this.f12690b;
                if (i10 == 5) {
                    qVar.k0();
                    return true;
                }
                qVar.getClass();
                return false;
            case 1:
                uf.k0 k0Var = (uf.k0) this.f12690b;
                uf.g0 g0Var = k0Var.C;
                boolean z4 = false;
                if (i10 == 6) {
                    k0Var.f45358x = false;
                    AndroidUtilities.cancelRunOnUIThread(g0Var);
                    z4 = true;
                    if (TextUtils.isEmpty(k0Var.f45353f.getText())) {
                        k0Var.f45359y = null;
                        k0Var.d.b();
                        k0Var.f45352c.V2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(g0Var);
                    }
                    k0Var.b0();
                }
                return z4;
            default:
                vh.d1 d1Var = (vh.d1) this.f12690b;
                if (i10 == 5 && (c1Var = d1Var.f45845c) != null && !d1Var.f45850w) {
                    if (d1Var.f45848r) {
                        d1Var.p();
                    } else {
                        c1Var.G(d1Var);
                    }
                    return true;
                }
                return false;
        }
    }
}
