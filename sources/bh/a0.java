package bh;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.t8;
import fi.b6;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.voip.w2;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.a41;
import org.telegram.ui.c41;
import org.telegram.ui.ni0;
public final class a0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3986a;
    public final boolean f3987b;
    public final Object f3988c;

    public a0(int i10, Object obj, boolean z10) {
        this.f3986a = i10;
        this.f3988c = obj;
        this.f3987b = z10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        a41 a41Var;
        ds dsVar;
        switch (this.f3986a) {
            case 0:
                i0 i0Var = (i0) this.f3988c;
                i0Var.f4066x = null;
                i0Var.f4053j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i0Var.k();
                i0Var.l();
                i0Var.f4057n.setCustomEmojiEnterProgress(Utilities.clamp(i0Var.f4053j, 1.0f, 0.0f));
                i0Var.f4047a.invalidate();
                i0Var.f4056m.invalidateOutline();
                if (i0Var.f4065w) {
                    i0Var.j(i0Var.f4053j, this.f3987b);
                    return;
                }
                return;
            case 1:
                t8 t8Var = (t8) this.f3988c;
                t8Var.getClass();
                t8Var.f9216y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t8Var.invalidate();
                if (this.f3987b) {
                    t8Var.requestLayout();
                    return;
                }
                return;
            case 2:
                b6 b6Var = (b6) this.f3988c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.e = floatValue2;
                if (!this.f3987b) {
                    b6Var.f10562c.setAlpha(1.0f - floatValue2);
                }
                b6Var.f10561b.invalidate();
                return;
            case 3:
                s1 s1Var = (s1) this.f3988c;
                s1Var.f25153jd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                if (this.f3987b && s1Var.getParent() != null) {
                    ((View) s1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                t9 t9Var = (t9) this.f3988c;
                t9Var.getClass();
                t9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ea eaVar = t9Var.C;
                if (eaVar != null) {
                    eaVar.invalidate();
                }
                aa aaVar = t9Var.W;
                if (aaVar != null && ((s1) aaVar).getCurrentMessagesGroup() == null && this.f3987b) {
                    ((s1) t9Var.W).setSelectedBackgroundProgress(1.0f - t9Var.U);
                    return;
                }
                return;
            case 5:
                y9 y9Var = (y9) this.f3988c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y9Var.setScaleX(floatValue3);
                y9Var.setScaleY(floatValue3);
                if (!this.f3987b) {
                    y9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                g9 g9Var = (g9) this.f3988c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9Var.j0(floatValue4, false);
                if (this.f3987b) {
                    z8 z8Var = g9Var.f28489a;
                    z8Var.f28099w = floatValue4;
                    z8Var.invalidate();
                    return;
                }
                return;
            case 7:
                o60 o60Var = (o60) this.f3988c;
                if (this.f3987b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (o60Var.getMeasuredHeight() / 2.0f);
                }
                o60Var.E0 = floatValue;
                o60Var.w();
                return;
            case 8:
                mb0 mb0Var = (mb0) this.f3988c;
                mb0Var.getClass();
                mb0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb0Var.invalidate();
                if (this.f3987b) {
                    mb0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                w2 w2Var = (w2) this.f3988c;
                TextView[] textViewArr = w2Var.h;
                w2Var.f34193s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                if (this.f3987b) {
                    textViewArr[0].setAlpha(1.0f - w2Var.f34193s);
                    textViewArr[0].setScaleX(1.0f - w2Var.f34193s);
                    textViewArr[0].setScaleY(1.0f - w2Var.f34193s);
                    textViewArr[1].setAlpha(w2Var.f34193s);
                    textViewArr[1].setScaleX(w2Var.f34193s);
                    textViewArr[1].setScaleY(w2Var.f34193s);
                    return;
                }
                return;
            case 10:
                ni0 ni0Var = (ni0) this.f3988c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ni0Var.f41936y = floatValue5;
                ni0Var.G.setAlpha(floatValue5);
                ni0Var.J.setAlpha(ni0Var.f41936y);
                if (!this.f3987b && (viewGroup = ni0Var.Y) != null) {
                    viewGroup.setAlpha(ni0Var.f41936y);
                }
                ni0Var.E.invalidate();
                ni0Var.F.invalidate();
                return;
            case 11:
                c41 c41Var = (c41) this.f3988c;
                c41Var.f38260s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c41Var.f38251b.invalidate();
                c41Var.f38253c.invalidate();
                if (c41Var.S) {
                    c41Var.N.invalidate();
                }
                c41Var.e();
                TextView textView = c41Var.f38263y;
                if (textView != null) {
                    textView.setAlpha(c41Var.f38260s);
                }
                if (!c41Var.S && (a41Var = c41Var.N) != null && a41Var.getSeekBarWaveform() != null) {
                    pp0 seekBarWaveform = c41Var.N.getSeekBarWaveform();
                    if (this.f3987b) {
                        dsVar = ds.f27587g;
                    } else {
                        dsVar = ds.f27588i;
                    }
                    seekBarWaveform.L = dsVar.getInterpolation(Utilities.clamp(c41Var.f38260s * 1.25f, 1.0f, 0.0f));
                    s1 s1Var2 = seekBarWaveform.f31685n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                sg.m0 m0Var = (sg.m0) this.f3988c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.e = floatValue6;
                if (!this.f3987b) {
                    m0Var.f48307c.setAlpha(1.0f - floatValue6);
                }
                m0Var.f48306b.invalidate();
                return;
        }
    }
}
