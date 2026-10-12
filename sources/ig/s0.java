package ig;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s0 implements TextView.OnEditorActionListener {
    public final int f11622a;
    public final Object f11623b;

    public s0(Object obj, int i10) {
        this.f11622a = i10;
        this.f11623b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ji.g1 g1Var;
        switch (this.f11622a) {
            case 0:
                u0 u0Var = (u0) this.f11623b;
                m0 m0Var = u0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    u0Var.f11655x = false;
                    AndroidUtilities.cancelRunOnUIThread(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(u0Var.f11650f.getText())) {
                        u0Var.f11656y = null;
                        u0Var.d.b();
                        u0Var.f11649c.W2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(m0Var);
                    }
                    u0Var.b0();
                }
                return z10;
            case 1:
                ji.h1 h1Var = (ji.h1) this.f11623b;
                if (i10 == 5 && (g1Var = h1Var.f13292c) != null && !h1Var.f13297w) {
                    if (h1Var.f13295r) {
                        h1Var.p();
                    } else {
                        g1Var.p0(h1Var);
                    }
                    return true;
                }
                return false;
            default:
                zh.g gVar = (zh.g) this.f11623b;
                if (i10 == 5) {
                    gVar.k0();
                    return true;
                }
                gVar.getClass();
                return false;
        }
    }
}
