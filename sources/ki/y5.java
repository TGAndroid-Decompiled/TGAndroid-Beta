package ki;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pb0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Wallet.h7;
public final class y5 extends CharacterStyle {
    public final int f15728a;
    public final Object f15729b;

    public y5(Object obj, int i10) {
        this.f15728a = i10;
        this.f15729b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f15728a) {
            case 0:
                textPaint.setColor(k6.v(k6.o1(0.55f, textPaint.getColor()), k6.o1(0.4f, k6.w0(k6.Oh, ((c6) this.f15729b).f15237a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = k6.f21366n6;
                ((pb0) this.f15729b).getClass();
                textPaint.setColor(k6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setColor(k6.v(k6.o1(0.55f, textPaint.getColor()), k6.o1(0.4f, ((tj0) this.f15729b).I)));
                return;
            case 3:
                textPaint.setColor(((org.telegram.ui.Wallet.m3) this.f15729b).f34839t0);
                return;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.x5) this.f15729b).f35395a0;
                int i11 = -9577217;
                if (fArr != null) {
                    i11 = i0.a.f(fArr[8], h7.p(fArr, -9577217, 0), h7.p(fArr, -9577217, 3));
                }
                textPaint.setColor(i11);
                return;
        }
    }

    public y5(tj0 tj0Var) {
        this.f15728a = 2;
        this.f15729b = tj0Var;
    }
}
