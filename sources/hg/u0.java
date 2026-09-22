package hg;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u0 implements TextView.OnEditorActionListener {
    public final int f10415a;
    public final Object f10416b;

    public u0(Object obj, int i10) {
        this.f10415a = i10;
        this.f10416b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ii.h1 h1Var;
        switch (this.f10415a) {
            case 0:
                v0 v0Var = (v0) this.f10416b;
                o0 o0Var = v0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    v0Var.f10445x = false;
                    AndroidUtilities.cancelRunOnUIThread(o0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(v0Var.f10440f.getText())) {
                        v0Var.f10446y = null;
                        v0Var.d.b();
                        v0Var.f10439c.Y2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(o0Var);
                    }
                    v0Var.b0();
                }
                return z10;
            case 1:
                ii.i1 i1Var = (ii.i1) this.f10416b;
                if (i10 == 5 && (h1Var = i1Var.f11432c) != null && !i1Var.f11437w) {
                    if (i1Var.f11435r) {
                        i1Var.p();
                    } else {
                        h1Var.m(i1Var);
                    }
                    return true;
                }
                return false;
            default:
                yh.g gVar = (yh.g) this.f10416b;
                if (i10 == 5) {
                    gVar.k0();
                    return true;
                }
                gVar.getClass();
                return false;
        }
    }
}
