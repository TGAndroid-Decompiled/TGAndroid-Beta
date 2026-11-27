package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.v;
public final class pv7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public pv7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rv7 rv7Var = (rv7) obj;
                rv7Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rv7Var.invalidate();
                return;
            case 1:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.w.setAlpha(floatValue);
                passcodeActivity.w.setTranslationY((1.0f - floatValue) * hl.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 2:
                fz7 fz7Var = ((yy7) obj).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz7Var.b0 = floatValue2;
                fz7Var.h(floatValue2);
                return;
            case 3:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = ((l68) obj).c;
                textViewArr[0].setAlpha(floatValue3);
                float f = 1.0f - floatValue3;
                textViewArr[0].setTranslationY((-hl.L(4.0f)) * f);
                textViewArr[1].setAlpha(f);
                textViewArr[1].setTranslationY(floatValue3 * hl.L(4.0f));
                return;
            case 4:
                PhotoViewer photoViewer = ((jc8) obj).d;
                photoViewer.U1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                return;
            case 5:
                PhotoViewer photoViewer2 = ((jc8) obj).d;
                photoViewer2.U1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                return;
            case 6:
                ((PhotoViewer) ((lc8) obj).b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 7:
                PhotoViewer photoViewer3 = ((v) obj).r;
                photoViewer3.l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.H0();
                return;
            case 8:
                ((zc8) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 9:
                de8 de8Var = (de8) obj;
                de8Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                de8Var.e();
                return;
            case 10:
                oe8 oe8Var = (oe8) obj;
                oe8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oe8Var.invalidate();
                return;
            case 11:
                im2 im2Var = (im2) obj;
                im2Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im2Var.invalidate();
                return;
            case 12:
                ok8 ok8Var = (ok8) obj;
                ok8Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ok8Var.f.invalidate();
                mk8 mk8Var = ok8Var.h;
                if (mk8Var != null) {
                    mk8Var.invalidate();
                    return;
                }
                return;
            case 13:
                im8 im8Var = (im8) obj;
                im8Var.getClass();
                im8Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                im8Var.e();
                return;
            case 14:
                hm8 hm8Var = (hm8) obj;
                hm8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hm8Var.invalidate();
                return;
            case 15:
                gkc gkcVar = (gkc) obj;
                gkcVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (hl.q.x - hl.L(36.0f)) - hl.L(52.0f);
                do8 do8Var = gkcVar.c;
                do8Var.getLayoutParams().width = hl.L(52.0f) + ((int) (L * gkcVar.F));
                do8Var.requestLayout();
                return;
            case 16:
                ((aq8) obj).G.a.invalidate();
                return;
            case 17:
                ProfileActivity profileActivity = ((gr8) obj).y2;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.J3();
                return;
            case 18:
                xr8 xr8Var = (xr8) obj;
                float[] fArr = xr8Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                xr8Var.G = animatedFraction;
                xr8Var.e(true, hl.S1(animatedFraction, fArr));
                return;
            case 19:
                yr8 yr8Var = (yr8) obj;
                float S1 = hl.S1(valueAnimator.getAnimatedFraction(), yr8Var.e);
                ProfileActivity profileActivity2 = yr8Var.n;
                sla slaVar = profileActivity2.U0;
                if (slaVar != null && !profileActivity2.q2) {
                    float f2 = 1.0f - S1;
                    slaVar.setScaleX(f2);
                    profileActivity2.U0.setScaleY(f2);
                    profileActivity2.U0.setAlpha(f2);
                }
                yr8Var.setScaleX(S1);
                yr8Var.setScaleY(S1);
                yr8Var.setAlpha(S1);
                return;
            case 20:
                zs8 zs8Var = (zs8) obj;
                zs8Var.I.E = hl.R1(zs8Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 21:
                gv8 gv8Var = (gv8) obj;
                gv8Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gv8Var.b();
                return;
            case 22:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                int i = ProfileStoriesView.t0;
                iq8 iq8Var = profileStoriesView.h;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.H = floatValue4;
                iq8Var.S = floatValue4;
                iq8Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 23:
                ox8 ox8Var = (ox8) obj;
                ox8Var.E = hl.S1(valueAnimator.getAnimatedFraction(), ox8Var.F);
                ox8Var.h.setTextColor(vm2.f(ox8Var.E, aob.w0(null, aob.z6, false), aob.w0(null, aob.q6, false)));
                return;
            case 24:
                jz8 jz8Var = (jz8) obj;
                jz8Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jz8Var.invalidate();
                return;
            case 25:
                ((rz8) obj).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                e39 e39Var = (e39) obj;
                e39Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e39Var.invalidate();
                return;
            case 27:
                o39 o39Var = (o39) obj;
                o39Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o39Var.e.setAlpha(floatValue5);
                o39Var.h.setAlpha(1.0f - floatValue5);
                return;
            case 28:
                i49 i49Var = (i49) obj;
                i49Var.C0 = ((Float) i49Var.z0.getAnimatedValue()).floatValue();
                tt ttVar = i49Var.T;
                if (ttVar != null) {
                    ttVar.invalidate();
                }
                i49Var.invalidate();
                return;
            default:
                i53 i53Var = (i53) obj;
                i53Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i53Var.setScaleX(floatValue6);
                i53Var.setScaleY(floatValue6);
                ((i49) i53Var.c).T.invalidate();
                return;
        }
    }
}
