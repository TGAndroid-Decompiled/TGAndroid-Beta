package li;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Wallet.h7;
public final class z5 extends CharacterStyle {
    public final int f17665a;
    public final Object f17666b;

    public z5(Object obj, int i10) {
        this.f17665a = i10;
        this.f17666b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f17665a) {
            case 0:
                textPaint.setColor(y6.v(y6.o1(0.55f, textPaint.getColor()), y6.o1(0.4f, y6.w0(y6.Oh, ((d6) this.f17666b).f17193a))));
                return;
            case 1:
                textPaint.setTypeface(AndroidUtilities.bold());
                int alpha = textPaint.getAlpha();
                int i10 = y6.f23541n6;
                ((nb0) this.f17666b).getClass();
                textPaint.setColor(y6.x0(null, i10, false));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setColor(y6.v(y6.o1(0.55f, textPaint.getColor()), y6.o1(0.4f, ((tj0) this.f17666b).I)));
                return;
            case 3:
                textPaint.setColor(((org.telegram.ui.Wallet.m3) this.f17666b).f36927t0);
                return;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.w5) this.f17666b).f37445a0;
                int i11 = -9577217;
                if (fArr != null) {
                    i11 = i0.a.f(fArr[8], h7.p(fArr, -9577217, 0), h7.p(fArr, -9577217, 3));
                }
                textPaint.setColor(i11);
                return;
        }
    }

    public z5(tj0 tj0Var) {
        this.f17665a = 2;
        this.f17666b = tj0Var;
    }
}
