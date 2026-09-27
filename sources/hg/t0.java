package hg;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class t0 implements TextView.OnEditorActionListener {
    public final int f10401a;
    public final Object f10402b;

    public t0(Object obj, int i10) {
        this.f10401a = i10;
        this.f10402b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ii.h1 h1Var;
        switch (this.f10401a) {
            case 0:
                u0 u0Var = (u0) this.f10402b;
                n0 n0Var = u0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    u0Var.f10428x = false;
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(u0Var.f10423f.getText())) {
                        u0Var.f10429y = null;
                        u0Var.d.b();
                        u0Var.f10422c.Y2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(n0Var);
                    }
                    u0Var.b0();
                }
                return z10;
            case 1:
                ii.i1 i1Var = (ii.i1) this.f10402b;
                if (i10 == 5 && (h1Var = i1Var.f11418c) != null && !i1Var.f11423w) {
                    if (i1Var.f11421r) {
                        i1Var.p();
                    } else {
                        h1Var.m(i1Var);
                    }
                    return true;
                }
                return false;
            default:
                yh.g gVar = (yh.g) this.f10402b;
                if (i10 == 5) {
                    gVar.k0();
                    return true;
                }
                gVar.getClass();
                return false;
        }
    }
}
