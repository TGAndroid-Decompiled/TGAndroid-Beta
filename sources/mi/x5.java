package mi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Wallet.p7;
public final class x5 extends CharacterStyle {
    public final int f20027a;
    public final Object f20028b;

    public x5(Object obj, int i3) {
        this.f20027a = i3;
        this.f20028b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f20027a) {
            case 0:
                textPaint.setColor(k6.w(k6.r1(0.55f, textPaint.getColor()), k6.r1(0.4f, k6.w0(k6.Ci, ((b6) this.f20028b).f19480a))));
                return;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(k6.w0(k6.f28062n6, (org.telegram.ui.ActionBar.e6) this.f20028b));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i3 = k6.f28062n6;
                ((h90) this.f20028b).getClass();
                textPaint.setColor(k6.v0(i3));
                textPaint.setAlpha(alpha2);
                return;
            case 3:
                textPaint.setColor(k6.w(k6.r1(0.55f, textPaint.getColor()), k6.r1(0.4f, ((xg0) this.f20028b).J)));
                return;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.b4) this.f20028b).f42268t0);
                return;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.f6) this.f20028b).f42525b0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], p7.p(-9577217, 0, fArr), p7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                return;
        }
    }

    public x5(xg0 xg0Var) {
        this.f20027a = 3;
        this.f20028b = xg0Var;
    }
}
