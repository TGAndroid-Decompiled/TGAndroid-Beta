package bi;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class o implements TextView.OnEditorActionListener {
    public final int f5160a;
    public final Object f5161b;

    public o(Object obj, int i10) {
        this.f5160a = i10;
        this.f5161b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        li.f1 f1Var;
        switch (this.f5160a) {
            case 0:
                y yVar = (y) this.f5161b;
                if (i10 == 5) {
                    yVar.u0();
                    return true;
                }
                yVar.getClass();
                return false;
            case 1:
                jg.t0 t0Var = (jg.t0) this.f5161b;
                jg.m0 m0Var = t0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    t0Var.f15855x = false;
                    AndroidUtilities.cancelRunOnUIThread(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(t0Var.f15850f.getText())) {
                        t0Var.f15856y = null;
                        t0Var.d.b();
                        t0Var.f15849c.f32150g3.O(true);
                    } else {
                        AndroidUtilities.runOnUIThread(m0Var);
                    }
                    t0Var.c0();
                }
                return z10;
            default:
                li.g1 g1Var = (li.g1) this.f5161b;
                if (i10 == 5 && (f1Var = g1Var.f17248c) != null && !g1Var.f17253w) {
                    if (g1Var.f17251r) {
                        g1Var.p();
                    } else {
                        f1Var.t(g1Var);
                    }
                    return true;
                }
                return false;
        }
    }
}
