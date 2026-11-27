package defpackage;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;
public final class yu1 extends ema {
    public boolean N0;
    public final zu1 O0;

    public yu1(zu1 zu1Var, Activity activity) {
        super(activity);
        this.O0 = zu1Var;
        this.N0 = true;
    }

    @Override
    public final void d(int i) {
        super.d(i);
        if (this.N0 && getVisibility() == 0) {
            int L = hl.L(4.0f) + getTextWidth();
            zu1 zu1Var = this.O0;
            zu1Var.V2 = L;
            NumberTextView numberTextView = zu1Var.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
