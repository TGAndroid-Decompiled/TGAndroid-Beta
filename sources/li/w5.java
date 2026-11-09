package li;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Wallet.f6;
import org.telegram.ui.Wallet.o7;
public final class w5 extends CharacterStyle {
    public final int f18961a;
    public final Object f18962b;

    public w5(Object obj, int i7) {
        this.f18961a = i7;
        this.f18962b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f18961a) {
            case 0:
                textPaint.setColor(l6.w(l6.r1(0.55f, textPaint.getColor()), l6.r1(0.4f, l6.w0(l6.Ci, ((a6) this.f18962b).f18425a))));
                return;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(l6.w0(l6.f28047n6, (g6) this.f18962b));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int alpha2 = textPaint.getAlpha();
                int i7 = l6.f28047n6;
                ((m90) this.f18962b).getClass();
                textPaint.setColor(l6.v0(i7));
                textPaint.setAlpha(alpha2);
                return;
            case 3:
                textPaint.setColor(l6.w(l6.r1(0.55f, textPaint.getColor()), l6.r1(0.4f, ((vg0) this.f18962b).I)));
                return;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.b4) this.f18962b).f42258t0);
                return;
            default:
                float[] fArr = ((f6) this.f18962b).f42455a0;
                int i10 = -9577217;
                if (fArr != null) {
                    i10 = i0.a.f(fArr[8], o7.p(-9577217, 0, fArr), o7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i10);
                return;
        }
    }

    public w5(vg0 vg0Var) {
        this.f18961a = 3;
        this.f18962b = vg0Var;
    }
}
