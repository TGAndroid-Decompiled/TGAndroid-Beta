package ai;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.wo0;
import org.telegram.ui.c51;
import org.telegram.ui.e51;
import org.telegram.ui.yi0;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f619a;
    public final boolean f620b;
    public final Object f621c;

    public bb(int i10, Object obj, boolean z10) {
        this.f619a = i10;
        this.f621c = obj;
        this.f620b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        c51 c51Var;
        sr srVar;
        switch (this.f619a) {
            case 0:
                db dbVar = (db) this.f621c;
                dbVar.getClass();
                dbVar.f757y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dbVar.invalidate();
                if (this.f620b) {
                    dbVar.requestLayout();
                    return;
                }
                return;
            case 1:
                ci.n6 n6Var = (ci.n6) this.f621c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n6Var.e = floatValue2;
                if (!this.f620b) {
                    n6Var.f5209c.setAlpha(1.0f - floatValue2);
                }
                n6Var.f5208b.invalidate();
                return;
            case 2:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.f621c;
                u1Var.f21399jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.invalidate();
                if (this.f620b && u1Var.getParent() != null) {
                    ((View) u1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.r9 r9Var = (org.telegram.ui.Cells.r9) this.f621c;
                r9Var.getClass();
                r9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                org.telegram.ui.Cells.ca caVar = r9Var.C;
                if (caVar != null) {
                    caVar.invalidate();
                }
                org.telegram.ui.Cells.y9 y9Var = r9Var.W;
                if (y9Var != null && ((org.telegram.ui.Cells.u1) y9Var).getCurrentMessagesGroup() == null && this.f620b) {
                    ((org.telegram.ui.Cells.u1) r9Var.W).setSelectedBackgroundProgress(1.0f - r9Var.U);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.w9 w9Var = (org.telegram.ui.Components.w9) this.f621c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w9Var.setScaleX(floatValue3);
                w9Var.setScaleY(floatValue3);
                if (!this.f620b) {
                    w9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.f621c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e9Var.i0(floatValue4, false);
                if (this.f620b) {
                    org.telegram.ui.Components.x8 x8Var = e9Var.f23977a;
                    x8Var.f23607w = floatValue4;
                    x8Var.invalidate();
                    return;
                }
                return;
            case 6:
                e60 e60Var = (e60) this.f621c;
                if (this.f620b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (e60Var.getMeasuredHeight() / 2.0f);
                }
                e60Var.f23935z0 = floatValue;
                e60Var.v();
                return;
            case 7:
                gb0 gb0Var = (gb0) this.f621c;
                gb0Var.getClass();
                gb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gb0Var.invalidate();
                if (this.f620b) {
                    gb0Var.requestLayout();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.f621c;
                TextView[] textViewArr = w2Var.h;
                w2Var.f29673s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.f620b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.f29673s);
                    textViewArr[0].setScaleX(1.0f - w2Var.f29673s);
                    textViewArr[0].setScaleY(1.0f - w2Var.f29673s);
                    textViewArr[1].setAlpha(w2Var.f29673s);
                    textViewArr[1].setScaleX(w2Var.f29673s);
                    textViewArr[1].setScaleY(w2Var.f29673s);
                    return;
                }
                return;
            case 9:
                yi0 yi0Var = (yi0) this.f621c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yi0Var.E = floatValue5;
                yi0Var.H.setAlpha(floatValue5);
                yi0Var.K.setAlpha(yi0Var.E);
                if (!this.f620b && (viewGroup = yi0Var.Z) != null) {
                    viewGroup.setAlpha(yi0Var.E);
                }
                yi0Var.F.invalidate();
                yi0Var.G.invalidate();
                return;
            case 10:
                e51 e51Var = (e51) this.f621c;
                e51Var.f33147s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e51Var.f33138b.invalidate();
                e51Var.f33140c.invalidate();
                if (e51Var.S) {
                    e51Var.N.invalidate();
                }
                e51Var.e();
                TextView textView = e51Var.f33150y;
                if (textView != null) {
                    textView.setAlpha(e51Var.f33147s);
                }
                if (!e51Var.S && (c51Var = e51Var.N) != null && c51Var.getSeekBarWaveform() != null) {
                    wo0 seekBarWaveform = e51Var.N.getSeekBarWaveform();
                    if (this.f620b) {
                        srVar = sr.f28360g;
                    } else {
                        srVar = sr.f28361i;
                    }
                    seekBarWaveform.L = srVar.getInterpolation(Utilities.clamp(e51Var.f33147s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.u1 u1Var2 = seekBarWaveform.f30140n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                qg.l0 l0Var = (qg.l0) this.f621c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.e = floatValue6;
                if (!this.f620b) {
                    l0Var.f41768c.setAlpha(1.0f - floatValue6);
                }
                l0Var.f41767b.invalidate();
                return;
            default:
                zg.c0 c0Var = (zg.c0) this.f621c;
                c0Var.f49318x = null;
                c0Var.f49305j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c0Var.k();
                c0Var.l();
                c0Var.f49309n.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.f49305j, 1.0f, 0.0f));
                c0Var.f49299a.invalidate();
                c0Var.f49308m.invalidateOutline();
                if (c0Var.f49317w) {
                    c0Var.j(c0Var.f49305j, this.f620b);
                    return;
                }
                return;
        }
    }
}
