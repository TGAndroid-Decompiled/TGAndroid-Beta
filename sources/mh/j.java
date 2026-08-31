package mh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j implements TextView.OnEditorActionListener {
    public final int f14279a;
    public final Object f14280b;

    public j(Object obj, int i10) {
        this.f14279a = i10;
        this.f14280b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        wh.d1 d1Var;
        switch (this.f14279a) {
            case 0:
                p pVar = (p) this.f14280b;
                if (i10 == 5) {
                    pVar.k0();
                    return true;
                }
                pVar.getClass();
                return false;
            case 1:
                vf.l0 l0Var = (vf.l0) this.f14280b;
                vf.h0 h0Var = l0Var.C;
                boolean z4 = false;
                if (i10 == 6) {
                    l0Var.f49118x = false;
                    AndroidUtilities.cancelRunOnUIThread(h0Var);
                    z4 = true;
                    if (TextUtils.isEmpty(l0Var.f49113f.getText())) {
                        l0Var.f49119y = null;
                        l0Var.d.b();
                        l0Var.f49111c.V2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(h0Var);
                    }
                    l0Var.b0();
                }
                return z4;
            default:
                wh.e1 e1Var = (wh.e1) this.f14280b;
                if (i10 == 5 && (d1Var = e1Var.f49709c) != null && !e1Var.f49715w) {
                    if (e1Var.f49713r) {
                        e1Var.p();
                    } else {
                        d1Var.o(e1Var);
                    }
                    return true;
                }
                return false;
        }
    }
}
