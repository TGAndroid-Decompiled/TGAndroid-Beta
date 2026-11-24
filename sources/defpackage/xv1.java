package defpackage;

import android.app.Activity;
import org.telegram.ui.Components.NumberTextView;
public final class xv1 extends lka {
    public boolean N0;
    public final yv1 O0;

    public xv1(yv1 yv1Var, Activity activity) {
        super(activity);
        this.O0 = yv1Var;
        this.N0 = true;
    }

    @Override
    public final void d(int i) {
        super.d(i);
        if (this.N0 && getVisibility() == 0) {
            int L = gm.L(4.0f) + getTextWidth();
            yv1 yv1Var = this.O0;
            yv1Var.V2 = L;
            NumberTextView numberTextView = yv1Var.U2;
            if (numberTextView != null) {
                numberTextView.setTranslationX(L);
            }
        }
    }
}
