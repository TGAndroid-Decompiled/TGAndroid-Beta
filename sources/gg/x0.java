package gg;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class x0 implements TextView.OnEditorActionListener {
    public final int f9069a;
    public final Object f9070b;

    public x0(Object obj, int i10) {
        this.f9069a = i10;
        this.f9070b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        hi.j1 j1Var;
        switch (this.f9069a) {
            case 0:
                y0 y0Var = (y0) this.f9070b;
                r0 r0Var = y0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    y0Var.f9098x = false;
                    AndroidUtilities.cancelRunOnUIThread(r0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(y0Var.f9093f.getText())) {
                        y0Var.f9099y = null;
                        y0Var.d.b();
                        y0Var.f9092c.Y2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(r0Var);
                    }
                    y0Var.b0();
                }
                return z10;
            case 1:
                hi.k1 k1Var = (hi.k1) this.f9070b;
                if (i10 == 5 && (j1Var = k1Var.f9689c) != null && !k1Var.f9694w) {
                    if (k1Var.f9692r) {
                        k1Var.p();
                    } else {
                        j1Var.x(k1Var);
                    }
                    return true;
                }
                return false;
            default:
                xh.h hVar = (xh.h) this.f9070b;
                if (i10 == 5) {
                    hVar.k0();
                    return true;
                }
                hVar.getClass();
                return false;
        }
    }
}
