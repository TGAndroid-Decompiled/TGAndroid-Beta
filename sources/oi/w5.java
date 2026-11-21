package oi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Wallet.f8;
import org.telegram.ui.Wallet.x6;
public final class w5 extends CharacterStyle {
    public final int f22506a;
    public final Object f22507b;

    public w5(Object obj, int i7) {
        this.f22506a = i7;
        this.f22507b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f22506a) {
            case 0:
                textPaint.setColor(m6.w(m6.r1(0.55f, textPaint.getColor()), m6.r1(0.4f, m6.w0(m6.Fi, ((a6) this.f22507b).f21964a))));
                return;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(m6.w0(m6.f29560n6, (h6) this.f22507b));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = m6.f29560n6;
                ((aa0) this.f22507b).getClass();
                textPaint.setColor(m6.v0(i7));
                textPaint.setAlpha(alpha2);
                return;
            case 3:
                textPaint.setColor(m6.w(m6.r1(0.55f, textPaint.getColor()), m6.r1(0.4f, ((jh0) this.f22507b).J)));
                return;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.m4) this.f22507b).f44591t0);
                return;
            default:
                float[] fArr = ((x6) this.f22507b).f45299b0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], f8.p(-9577217, 0, fArr), f8.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                return;
        }
    }

    public w5(jh0 jh0Var) {
        this.f22506a = 3;
        this.f22507b = jh0Var;
    }
}
