package li;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Wallet.i6;
import org.telegram.ui.Wallet.r7;
public final class w5 extends CharacterStyle {
    public final int f18966a;
    public final Object f18967b;

    public w5(Object obj, int i7) {
        this.f18966a = i7;
        this.f18967b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f18966a) {
            case 0:
                textPaint.setColor(m6.w(m6.r1(0.55f, textPaint.getColor()), m6.r1(0.4f, m6.w0(m6.Ci, ((a6) this.f18967b).f18428a))));
                return;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(m6.w0(m6.f28072n6, (h6) this.f18967b));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = m6.f28072n6;
                ((l90) this.f18967b).getClass();
                textPaint.setColor(m6.v0(i7));
                textPaint.setAlpha(alpha2);
                return;
            case 3:
                textPaint.setColor(m6.w(m6.r1(0.55f, textPaint.getColor()), m6.r1(0.4f, ((ug0) this.f18967b).I)));
                return;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.d4) this.f18967b).f42338t0);
                return;
            default:
                float[] fArr = ((i6) this.f18967b).f42621a0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], r7.p(-9577217, 0, fArr), r7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                return;
        }
    }

    public w5(ug0 ug0Var) {
        this.f18966a = 3;
        this.f18967b = ug0Var;
    }
}
