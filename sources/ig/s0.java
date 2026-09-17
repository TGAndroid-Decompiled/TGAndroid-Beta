package ig;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s0 implements TextView.OnEditorActionListener {
    public final int f12227a;
    public final Object f12228b;

    public s0(Object obj, int i10) {
        this.f12227a = i10;
        this.f12228b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ji.g1 g1Var;
        switch (this.f12227a) {
            case 0:
                u0 u0Var = (u0) this.f12228b;
                m0 m0Var = u0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    u0Var.f12262x = false;
                    AndroidUtilities.cancelRunOnUIThread(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(u0Var.f12257f.getText())) {
                        u0Var.f12263y = null;
                        u0Var.d.b();
                        u0Var.f12255c.Y2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(m0Var);
                    }
                    u0Var.b0();
                }
                return z10;
            case 1:
                ji.h1 h1Var = (ji.h1) this.f12228b;
                if (i10 == 5 && (g1Var = h1Var.f13973c) != null && !h1Var.f13979w) {
                    if (h1Var.f13977r) {
                        h1Var.p();
                    } else {
                        g1Var.C(h1Var);
                    }
                    return true;
                }
                return false;
            default:
                zh.g gVar = (zh.g) this.f12228b;
                if (i10 == 5) {
                    gVar.k0();
                    return true;
                }
                gVar.getClass();
                return false;
        }
    }
}
