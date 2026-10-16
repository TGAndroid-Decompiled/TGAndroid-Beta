package ah;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.na;
import di.l6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.ub0;
import org.telegram.ui.Components.voip.u2;
import org.telegram.ui.Components.z9;
import org.telegram.ui.gj0;
import org.telegram.ui.p51;
import org.telegram.ui.r51;
public final class k0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f815a;
    public final boolean f816b;
    public final Object f817c;

    public k0(int i10, Object obj, boolean z10) {
        this.f815a = i10;
        this.f817c = obj;
        this.f816b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        p51 p51Var;
        es esVar;
        switch (this.f815a) {
            case 0:
                t0 t0Var = (t0) this.f817c;
                t0Var.f887x = null;
                t0Var.f874j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t0Var.k();
                t0Var.l();
                t0Var.f878n.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.f874j, 1.0f, 0.0f));
                t0Var.f868a.invalidate();
                t0Var.f877m.invalidateOutline();
                if (t0Var.f886w) {
                    t0Var.j(t0Var.f874j, this.f816b);
                    return;
                }
                return;
            case 1:
                na naVar = (na) this.f817c;
                naVar.getClass();
                naVar.f3402y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                naVar.invalidate();
                if (this.f816b) {
                    naVar.requestLayout();
                    return;
                }
                return;
            case 2:
                l6 l6Var = (l6) this.f817c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.e = floatValue2;
                if (!this.f816b) {
                    l6Var.f7358c.setAlpha(1.0f - floatValue2);
                }
                l6Var.f7357b.invalidate();
                return;
            case 3:
                u1 u1Var = (u1) this.f817c;
                u1Var.f21985jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f816b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                p9 p9Var = (p9) this.f817c;
                p9Var.getClass();
                p9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aa aaVar = p9Var.C;
                if (aaVar != null) {
                    aaVar.invalidate();
                }
                w9 w9Var = p9Var.W;
                if (w9Var != null && ((u1) w9Var).getCurrentMessagesGroup() == null && this.f816b) {
                    ((u1) p9Var.W).setSelectedBackgroundProgress(1.0f - p9Var.U);
                    return;
                }
                return;
            case 5:
                z9 z9Var = (z9) this.f817c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z9Var.setScaleX(floatValue3);
                z9Var.setScaleY(floatValue3);
                if (!this.f816b) {
                    z9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                h9 h9Var = (h9) this.f817c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h9Var.i0(floatValue4, false);
                if (this.f816b) {
                    a9 a9Var = h9Var.f25209a;
                    a9Var.f24927w = floatValue4;
                    a9Var.invalidate();
                    return;
                }
                return;
            case 7:
                p60 p60Var = (p60) this.f817c;
                if (this.f816b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (p60Var.getMeasuredHeight() / 2.0f);
                }
                p60Var.E0 = floatValue;
                p60Var.w();
                return;
            case 8:
                ub0 ub0Var = (ub0) this.f817c;
                ub0Var.getClass();
                ub0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ub0Var.invalidate();
                if (this.f816b) {
                    ub0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                u2 u2Var = (u2) this.f817c;
                TextView[] textViewArr = u2Var.h;
                u2Var.f30207s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.invalidate();
                if (this.f816b) {
                    textViewArr[0].setAlpha(1.0f - u2Var.f30207s);
                    textViewArr[0].setScaleX(1.0f - u2Var.f30207s);
                    textViewArr[0].setScaleY(1.0f - u2Var.f30207s);
                    textViewArr[1].setAlpha(u2Var.f30207s);
                    textViewArr[1].setScaleX(u2Var.f30207s);
                    textViewArr[1].setScaleY(u2Var.f30207s);
                    return;
                }
                return;
            case 10:
                gj0 gj0Var = (gj0) this.f817c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gj0Var.E = floatValue5;
                gj0Var.H.setAlpha(floatValue5);
                gj0Var.K.setAlpha(gj0Var.E);
                if (!this.f816b && (viewGroup = gj0Var.Z) != null) {
                    viewGroup.setAlpha(gj0Var.E);
                }
                gj0Var.F.invalidate();
                gj0Var.G.invalidate();
                return;
            case 11:
                r51 r51Var = (r51) this.f817c;
                r51Var.f39300s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r51Var.f39291b.invalidate();
                r51Var.f39293c.invalidate();
                if (r51Var.S) {
                    r51Var.N.invalidate();
                }
                r51Var.e();
                TextView textView = r51Var.f39303y;
                if (textView != null) {
                    textView.setAlpha(r51Var.f39300s);
                }
                if (!r51Var.S && (p51Var = r51Var.N) != null && p51Var.getSeekBarWaveform() != null) {
                    jp0 seekBarWaveform = r51Var.N.getSeekBarWaveform();
                    if (this.f816b) {
                        esVar = es.f24466g;
                    } else {
                        esVar = es.f24467i;
                    }
                    seekBarWaveform.L = esVar.getInterpolation(Utilities.clamp(r51Var.f39300s * 1.25f, 1.0f, 0.0f));
                    u1 u1Var2 = seekBarWaveform.f26108n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                rg.n0 n0Var = (rg.n0) this.f817c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.e = floatValue6;
                if (!this.f816b) {
                    n0Var.f44132c.setAlpha(1.0f - floatValue6);
                }
                n0Var.f44131b.invalidate();
                return;
        }
    }
}
