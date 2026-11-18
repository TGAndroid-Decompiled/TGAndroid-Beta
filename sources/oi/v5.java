package oi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.y90;
import org.telegram.ui.Wallet.f8;
import org.telegram.ui.Wallet.x6;
public final class v5 extends CharacterStyle {
    public final int f22422a;
    public final Object f22423b;

    public v5(Object obj, int i7) {
        this.f22422a = i7;
        this.f22423b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f22422a) {
            case 0:
                textPaint.setColor(n6.w(n6.r1(0.55f, textPaint.getColor()), n6.r1(0.4f, n6.w0(n6.Fi, ((z5) this.f22423b).f22554a))));
                return;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(n6.w0(n6.f29576n6, (i6) this.f22423b));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = n6.f29576n6;
                ((y90) this.f22423b).getClass();
                textPaint.setColor(n6.v0(i7));
                textPaint.setAlpha(alpha2);
                return;
            case 3:
                textPaint.setColor(n6.w(n6.r1(0.55f, textPaint.getColor()), n6.r1(0.4f, ((hh0) this.f22423b).J)));
                return;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.m4) this.f22423b).f44551t0);
                return;
            default:
                float[] fArr = ((x6) this.f22423b).f45259b0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], f8.p(-9577217, 0, fArr), f8.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                return;
        }
    }

    public v5(hh0 hh0Var) {
        this.f22422a = 3;
        this.f22423b = hh0Var;
    }
}
