package oi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.Wallet.y6;
public final class w5 extends CharacterStyle {
    public final int f22576a;
    public final Object f22577b;

    public w5(Object obj, int i7) {
        this.f22576a = i7;
        this.f22577b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f22576a) {
            case 0:
                textPaint.setColor(n6.w(n6.r1(0.55f, textPaint.getColor()), n6.r1(0.4f, n6.w0(n6.Fi, ((a6) this.f22577b).f22033a))));
                return;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(n6.w0(n6.f29633n6, (i6) this.f22577b));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = n6.f29633n6;
                ((x90) this.f22577b).getClass();
                textPaint.setColor(n6.v0(i7));
                textPaint.setAlpha(alpha2);
                return;
            case 3:
                textPaint.setColor(n6.w(n6.r1(0.55f, textPaint.getColor()), n6.r1(0.4f, ((ih0) this.f22577b).J)));
                return;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.n4) this.f22577b).f44731t0);
                return;
            default:
                float[] fArr = ((y6) this.f22577b).f45431b0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], g8.p(-9577217, 0, fArr), g8.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                return;
        }
    }

    public w5(ih0 ih0Var) {
        this.f22576a = 3;
        this.f22577b = ih0Var;
    }
}
