package dg;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import nh.d8;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p8;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.y50;
import org.telegram.ui.u41;
import org.telegram.ui.ui0;
import org.telegram.ui.w41;
import ph.a5;
public final class b1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4394a;
    public final boolean f4395b;
    public final Object f4396c;

    public b1(int i10, Object obj, boolean z4) {
        this.f4394a = i10;
        this.f4396c = obj;
        this.f4395b = z4;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue;
        ViewGroup viewGroup;
        u41 u41Var;
        mr mrVar;
        switch (this.f4394a) {
            case 0:
                c1 c1Var = (c1) this.f4396c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.e = floatValue2;
                if (!this.f4395b) {
                    c1Var.f4428c.setAlpha(1.0f - floatValue2);
                }
                c1Var.f4427b.invalidate();
                return;
            case 1:
                mg.d0 d0Var = (mg.d0) this.f4396c;
                d0Var.f13979x = null;
                d0Var.f13966j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d0Var.k();
                d0Var.l();
                d0Var.f13970n.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.f13966j, 1.0f, 0.0f));
                d0Var.f13960a.invalidate();
                d0Var.f13969m.invalidateOutline();
                if (d0Var.f13978w) {
                    d0Var.j(d0Var.f13966j, this.f4395b);
                    return;
                }
                return;
            case 2:
                d8 d8Var = (d8) this.f4396c;
                d8Var.getClass();
                d8Var.f15267y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                if (this.f4395b) {
                    d8Var.requestLayout();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.f4396c;
                s1Var.f22004gd = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                if (this.f4395b && s1Var.getParent() != null) {
                    ((View) s1Var.getParent()).invalidate();
                    return;
                }
                return;
            case 4:
                m9 m9Var = (m9) this.f4396c;
                m9Var.getClass();
                m9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9 x9Var = m9Var.C;
                if (x9Var != null) {
                    x9Var.invalidate();
                }
                t9 t9Var = m9Var.W;
                if (t9Var != null && ((org.telegram.ui.Cells.s1) t9Var).getCurrentMessagesGroup() == null && this.f4395b) {
                    ((org.telegram.ui.Cells.s1) m9Var.W).setSelectedBackgroundProgress(1.0f - m9Var.U);
                    return;
                }
                return;
            case 5:
                p9 p9Var = (p9) this.f4396c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p9Var.setScaleX(floatValue3);
                p9Var.setScaleY(floatValue3);
                if (!this.f4395b) {
                    p9Var.setAlpha(valueAnimator.getAnimatedFraction());
                    return;
                }
                return;
            case 6:
                w8 w8Var = (w8) this.f4396c;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.i0(floatValue4, false);
                if (this.f4395b) {
                    p8 p8Var = w8Var.f30173a;
                    p8Var.f29405w = floatValue4;
                    p8Var.invalidate();
                    return;
                }
                return;
            case 7:
                y50 y50Var = (y50) this.f4396c;
                if (this.f4395b) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * (y50Var.getMeasuredHeight() / 2.0f);
                }
                y50Var.f30893r0 = floatValue;
                y50Var.s();
                return;
            case 8:
                wa0 wa0Var = (wa0) this.f4396c;
                wa0Var.getClass();
                wa0Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wa0Var.invalidate();
                if (this.f4395b) {
                    wa0Var.requestLayout();
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.f4396c;
                TextView[] textViewArr = v2Var.h;
                v2Var.f29975s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                if (this.f4395b) {
                    textViewArr[0].setAlpha(1.0f - v2Var.f29975s);
                    textViewArr[0].setScaleX(1.0f - v2Var.f29975s);
                    textViewArr[0].setScaleY(1.0f - v2Var.f29975s);
                    textViewArr[1].setAlpha(v2Var.f29975s);
                    textViewArr[1].setScaleX(v2Var.f29975s);
                    textViewArr[1].setScaleY(v2Var.f29975s);
                    return;
                }
                return;
            case 10:
                ui0 ui0Var = (ui0) this.f4396c;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui0Var.B = floatValue5;
                ui0Var.E.setAlpha(floatValue5);
                ui0Var.H.setAlpha(ui0Var.B);
                if (!this.f4395b && (viewGroup = ui0Var.W) != null) {
                    viewGroup.setAlpha(ui0Var.B);
                }
                ui0Var.C.invalidate();
                ui0Var.D.invalidate();
                return;
            case 11:
                w41 w41Var = (w41) this.f4396c;
                w41Var.f39271s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w41Var.f39265b.invalidate();
                w41Var.f39267c.invalidate();
                if (w41Var.P) {
                    w41Var.K.invalidate();
                }
                w41Var.e();
                TextView textView = w41Var.f39274y;
                if (textView != null) {
                    textView.setAlpha(w41Var.f39271s);
                }
                if (!w41Var.P && (u41Var = w41Var.K) != null && u41Var.getSeekBarWaveform() != null) {
                    lo0 seekBarWaveform = w41Var.K.getSeekBarWaveform();
                    if (this.f4395b) {
                        mrVar = mr.f27123g;
                    } else {
                        mrVar = mr.f27124i;
                    }
                    seekBarWaveform.L = mrVar.getInterpolation(Utilities.clamp(w41Var.f39271s * 1.25f, 1.0f, 0.0f));
                    org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.f26820n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                        return;
                    }
                    return;
                }
                return;
            default:
                a5 a5Var = (a5) this.f4396c;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.e = floatValue6;
                if (!this.f4395b) {
                    a5Var.f41301c.setAlpha(1.0f - floatValue6);
                }
                a5Var.f41300b.invalidate();
                return;
        }
    }
}
