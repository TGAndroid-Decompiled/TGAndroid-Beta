package hg;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class u0 implements TextView.OnEditorActionListener {
    public final int f10401a;
    public final Object f10402b;

    public u0(Object obj, int i10) {
        this.f10401a = i10;
        this.f10402b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ii.h1 h1Var;
        switch (this.f10401a) {
            case 0:
                v0 v0Var = (v0) this.f10402b;
                o0 o0Var = v0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    v0Var.f10431x = false;
                    AndroidUtilities.cancelRunOnUIThread(o0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(v0Var.f10426f.getText())) {
                        v0Var.f10432y = null;
                        v0Var.d.b();
                        v0Var.f10425c.Y2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(o0Var);
                    }
                    v0Var.b0();
                }
                return z10;
            case 1:
                ii.i1 i1Var = (ii.i1) this.f10402b;
                if (i10 == 5 && (h1Var = i1Var.f11415c) != null && !i1Var.f11420w) {
                    if (i1Var.f11418r) {
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
