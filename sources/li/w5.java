package li;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Wallet.h6;
import org.telegram.ui.Wallet.q7;
public final class w5 extends CharacterStyle {
    public final int f18958a;
    public final Object f18959b;

    public w5(Object obj, int i7) {
        this.f18958a = i7;
        this.f18959b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f18958a) {
            case 0:
                textPaint.setColor(k6.w(k6.r1(0.55f, textPaint.getColor()), k6.r1(0.4f, k6.w0(k6.Ci, ((a6) this.f18959b).f18422a))));
                return;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(k6.w0(k6.f28031n6, (f6) this.f18959b));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = k6.f28031n6;
                ((l90) this.f18959b).getClass();
                textPaint.setColor(k6.v0(i7));
                textPaint.setAlpha(alpha2);
                return;
            case 3:
                textPaint.setColor(k6.w(k6.r1(0.55f, textPaint.getColor()), k6.r1(0.4f, ((ug0) this.f18959b).I)));
                return;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.d4) this.f18959b).f42373t0);
                return;
            default:
                float[] fArr = ((h6) this.f18959b).f42566a0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], q7.p(-9577217, 0, fArr), q7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                return;
        }
    }

    public w5(ug0 ug0Var) {
        this.f18958a = 3;
        this.f18959b = ug0Var;
    }
}
