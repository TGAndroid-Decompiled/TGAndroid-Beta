package defpackage;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;
public final class lu1 extends jia {
    public boolean N0;
    public final mu1 O0;

    public lu1(mu1 mu1Var, Activity activity) {
        super(activity);
        this.O0 = mu1Var;
        this.N0 = true;
    }

    @Override
    public final void d(int i) {
        super.d(i);
        if (this.N0 && getVisibility() == 0) {
            int L = gl.L(4.0f) + getTextWidth();
            mu1 mu1Var = this.O0;
            mu1Var.V2 = L;
            NumberTextView numberTextView = mu1Var.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
