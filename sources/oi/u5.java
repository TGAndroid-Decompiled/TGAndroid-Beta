package oi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Wallet.h6;
import org.telegram.ui.Wallet.q7;
public final class u5 extends CharacterStyle {
    public final int f22035a;
    public final Object f22036b;

    public u5(Object obj, int i7) {
        this.f22035a = i7;
        this.f22036b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f22035a) {
            case 0:
                textPaint.setColor(j6.w(j6.r1(0.55f, textPaint.getColor()), j6.r1(0.4f, j6.w0(j6.Fi, ((y5) this.f22036b).f22140a))));
                return;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(j6.w0(j6.f29031n6, (e6) this.f22036b));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = j6.f29031n6;
                ((n90) this.f22036b).getClass();
                textPaint.setColor(j6.v0(i7));
                textPaint.setAlpha(alpha2);
                return;
            case 3:
                textPaint.setColor(j6.w(j6.r1(0.55f, textPaint.getColor()), j6.r1(0.4f, ((xg0) this.f22036b).J)));
                return;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.c4) this.f22036b).f43607t0);
                return;
            default:
                float[] fArr = ((h6) this.f22036b).f43919b0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], q7.p(-9577217, 0, fArr), q7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                return;
        }
    }

    public u5(xg0 xg0Var) {
        this.f22035a = 3;
        this.f22036b = xg0Var;
    }
}
