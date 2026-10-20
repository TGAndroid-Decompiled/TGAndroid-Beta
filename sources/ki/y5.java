package ki;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Wallet.h7;
public final class y5 extends CharacterStyle {
    public final int f15666a;
    public final Object f15667b;

    public y5(Object obj, int i10) {
        this.f15666a = i10;
        this.f15667b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f15666a) {
            case 0:
                textPaint.setColor(h6.v(h6.m1(0.55f, textPaint.getColor()), h6.m1(0.4f, h6.w0(h6.Oh, ((c6) this.f15667b).f15179a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = h6.f21173n6;
                ((ob0) this.f15667b).getClass();
                textPaint.setColor(h6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setColor(h6.v(h6.m1(0.55f, textPaint.getColor()), h6.m1(0.4f, ((qj0) this.f15667b).I)));
                return;
            case 3:
                textPaint.setColor(((org.telegram.ui.Wallet.n3) this.f15667b).f34589t0);
                return;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.x5) this.f15667b).f35097a0;
                int i11 = -9577217;
                if (fArr != null) {
                    i11 = i0.a.f(fArr[8], h7.p(fArr, -9577217, 0), h7.p(fArr, -9577217, 3));
                }
                textPaint.setColor(i11);
                return;
        }
    }

    public y5(qj0 qj0Var) {
        this.f15666a = 2;
        this.f15667b = qj0Var;
    }
}
