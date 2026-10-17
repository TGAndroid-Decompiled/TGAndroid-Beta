package ki;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Wallet.k7;
public final class y5 extends CharacterStyle {
    public final int f15660a;
    public final Object f15661b;

    public y5(Object obj, int i10) {
        this.f15660a = i10;
        this.f15661b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f15660a) {
            case 0:
                textPaint.setColor(h6.v(h6.m1(0.55f, textPaint.getColor()), h6.m1(0.4f, h6.w0(h6.Oh, ((c6) this.f15661b).f15173a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = h6.f21169n6;
                ((ob0) this.f15661b).getClass();
                textPaint.setColor(h6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setColor(h6.v(h6.m1(0.55f, textPaint.getColor()), h6.m1(0.4f, ((pj0) this.f15661b).I)));
                return;
            case 3:
                textPaint.setColor(((org.telegram.ui.Wallet.k3) this.f15661b).f34422u0);
                return;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.v5) this.f15661b).f34974e0;
                int i11 = -9577217;
                if (fArr != null) {
                    i11 = i0.b.f(fArr[8], k7.m(fArr, -9577217, 0), k7.m(fArr, -9577217, 3));
                }
                textPaint.setColor(i11);
                return;
        }
    }

    public y5(pj0 pj0Var) {
        this.f15660a = 2;
        this.f15661b = pj0Var;
    }
}
