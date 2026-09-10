package bi;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.cj0;
import org.telegram.ui.l51;
import org.telegram.ui.n51;
public final class m7 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3101a;
    public final boolean f3102b;
    public final Object f3103c;

    public m7(int i10, Object obj, boolean z10) {
        this.f3101a = i10;
        this.f3103c = obj;
        this.f3102b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        l51 l51Var;
        wr wrVar;
        switch (this.f3101a) {
            case 0:
                o7 o7Var = (o7) this.f3103c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.e = floatValue2;
                if (!this.f3102b) {
                    o7Var.f3323c.setAlpha(1.0f - floatValue2);
                }
                o7Var.f3322b.invalidate();
                return;
            case 1:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.f3103c;
                t1Var.f20192jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                if (this.f3102b && t1Var.getParent() != null) {
                    ((View) t1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.t9 t9Var = (org.telegram.ui.Cells.t9) this.f3103c;
                t9Var.getClass();
                t9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.ea eaVar = t9Var.C;
                if (eaVar != null) {
                    eaVar.invalidate();
                }
                org.telegram.ui.Cells.aa aaVar = t9Var.W;
                if (aaVar != null && ((org.telegram.ui.Cells.t1) aaVar).getCurrentMessagesGroup() == null && this.f3102b) {
                    ((org.telegram.ui.Cells.t1) t9Var.W).setSelectedBackgroundProgress(1.0f - t9Var.U);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f3103c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue3);
                w9Var.setScaleY(floatValue3);
                if (!this.f3102b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.f3103c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d9Var.i0(floatValue4, false);
                if (this.f3102b) {
                    org.telegram.ui.Components.w8 w8Var = d9Var.f22325a;
                    w8Var.f22051w = floatValue4;
                    w8Var.invalidate();
                    return;
                }
                return;
            case 5:
                f60 f60Var = (f60) this.f3103c;
                if (this.f3102b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (f60Var.getMeasuredHeight() / 2.0f);
                }
                f60Var.f22901u0 = floatValue;
                f60Var.s();
                return;
            case 6:
                db0 db0Var = (db0) this.f3103c;
                db0Var.getClass();
                db0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                db0Var.invalidate();
                if (this.f3102b) {
                    db0Var.requestLayout();
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f3103c;
                TextView[] textViewArr = u2Var.h;
                u2Var.f28487s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.invalidate();
                if (this.f3102b) {
                    textViewArr[0].setAlpha(1.0f - u2Var.f28487s);
                    textViewArr[0].setScaleX(1.0f - u2Var.f28487s);
                    textViewArr[0].setScaleY(1.0f - u2Var.f28487s);
                    textViewArr[1].setAlpha(u2Var.f28487s);
                    textViewArr[1].setScaleX(u2Var.f28487s);
                    textViewArr[1].setScaleY(u2Var.f28487s);
                    return;
                }
                return;
            case 8:
                cj0 cj0Var = (cj0) this.f3103c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cj0Var.E = floatValue5;
                cj0Var.H.setAlpha(floatValue5);
                cj0Var.K.setAlpha(cj0Var.E);
                if (!this.f3102b && (viewGroup = cj0Var.Z) != null) {
                    viewGroup.setAlpha(cj0Var.E);
                }
                cj0Var.F.invalidate();
                cj0Var.G.invalidate();
                return;
            case 9:
                n51 n51Var = (n51) this.f3103c;
                n51Var.f35131s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n51Var.f35122b.invalidate();
                n51Var.f35124c.invalidate();
                if (n51Var.S) {
                    n51Var.N.invalidate();
                }
                n51Var.e();
                TextView textView = n51Var.f35134y;
                if (textView != null) {
                    textView.setAlpha(n51Var.f35131s);
                }
                if (!n51Var.S && (l51Var = n51Var.N) != null && l51Var.getSeekBarWaveform() != null) {
                    ro0 seekBarWaveform = n51Var.N.getSeekBarWaveform();
                    if (this.f3102b) {
                        wrVar = wr.f28820g;
                    } else {
                        wrVar = wr.f28821i;
                    }
                    seekBarWaveform.L = wrVar.getInterpolation(Utilities.clamp(n51Var.f35131s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.t1 t1Var2 = seekBarWaveform.f26721n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 10:
                pg.l0 l0Var = (pg.l0) this.f3103c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue6;
                if (!this.f3102b) {
                    l0Var.f40096c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f40095b.invalidate();
                return;
            case 11:
                yg.c0 c0Var = (yg.c0) this.f3103c;
                c0Var.f46969x = null;
                c0Var.f46956j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.k();
                c0Var.l();
                c0Var.f46960n.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f46956j, 1.0f, 0.0f));
                c0Var.f46950a.invalidate();
                c0Var.f46959m.invalidateOutline();
                if (c0Var.f46968w) {
                    c0Var.j(c0Var.f46956j, this.f3102b);
                    return;
                }
                return;
            default:
                zh.r6 r6Var = (zh.r6) this.f3103c;
                r6Var.getClass();
                r6Var.f48840y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.invalidate();
                if (this.f3102b) {
                    r6Var.requestLayout();
                    return;
                }
                return;
        }
    }
}
