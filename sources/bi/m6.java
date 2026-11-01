package bi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Wallet.v7;
public final class m6 extends CharacterStyle {
    public final int f3206a;
    public final Object f3207b;

    public m6(Object obj, int i10) {
        this.f3206a = i10;
        this.f3207b = obj;
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3206a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.r1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, ((q6) this.f3207b).f3300a))));
                return;
            case 1:
                textPaint.setTypeface(org.telegram.messenger.i0.o());
                int alpha = textPaint.getAlpha();
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, (org.telegram.ui.ActionBar.p6) this.f3207b));
                textPaint.setAlpha(alpha);
                return;
            case 2:
                textPaint.setTypeface(org.telegram.messenger.i0.o());
                int alpha2 = textPaint.getAlpha();
                int i10 = org.telegram.ui.ActionBar.t6.f21116n6;
                ((da0) this.f3207b).getClass();
                textPaint.setColor(org.telegram.ui.ActionBar.t6.v0(i10));
                textPaint.setAlpha(alpha2);
                return;
            case 3:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.r1(0.55f, textPaint.getColor()), org.telegram.ui.ActionBar.t6.r1(0.4f, ((xh0) this.f3207b).I)));
                return;
            case 4:
                textPaint.setColor(((org.telegram.ui.Wallet.d4) this.f3207b).f34417t0);
                return;
            default:
                float[] fArr = ((org.telegram.ui.Wallet.l6) this.f3207b).f34849a0;
                int i11 = -9577217;
                if (fArr != null) {
                    i11 = i0.b.f(fArr[8], v7.p(-9577217, 0, fArr), v7.p(-9577217, 3, fArr));
                }
                textPaint.setColor(i11);
                return;
        }
    }

    public m6(xh0 xh0Var) {
        this.f3206a = 3;
        this.f3207b = xh0Var;
    }
}
