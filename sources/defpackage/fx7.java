package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.v;
public final class fx7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public fx7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeActivity.w.setAlpha(floatValue);
                passcodeActivity.w.setTranslationY((1.0f - floatValue) * gm.L(230.0f) * 0.75f);
                passcodeActivity.fragmentView.requestLayout();
                return;
            case 1:
                by7 by7Var = ((ux7) obj).d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                by7Var.b0 = floatValue2;
                by7Var.h(floatValue2);
                return;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = ((x48) obj).c;
                textViewArr[0].setAlpha(floatValue3);
                float f = 1.0f - floatValue3;
                textViewArr[0].setTranslationY((-gm.L(4.0f)) * f);
                textViewArr[1].setAlpha(f);
                textViewArr[1].setTranslationY(floatValue3 * gm.L(4.0f));
                return;
            case 3:
                PhotoViewer photoViewer = ((ua8) obj).d;
                photoViewer.U1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                return;
            case 4:
                PhotoViewer photoViewer2 = ((ua8) obj).d;
                photoViewer2.U1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((wa8) obj).b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                PhotoViewer photoViewer3 = ((v) obj).r;
                photoViewer3.l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.H0();
                return;
            case 7:
                ((kb8) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                pc8 pc8Var = (pc8) obj;
                pc8Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pc8Var.e();
                return;
            case 9:
                cd8 cd8Var = (cd8) obj;
                cd8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cd8Var.invalidate();
                return;
            case 10:
                bn2 bn2Var = (bn2) obj;
                bn2Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bn2Var.invalidate();
                return;
            case 11:
                cj8 cj8Var = (cj8) obj;
                cj8Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cj8Var.f.invalidate();
                aj8 aj8Var = cj8Var.h;
                if (aj8Var != null) {
                    aj8Var.invalidate();
                    return;
                }
                return;
            case 12:
                yk8 yk8Var = (yk8) obj;
                yk8Var.getClass();
                yk8Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yk8Var.e();
                return;
            case 13:
                xk8 xk8Var = (xk8) obj;
                xk8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xk8Var.invalidate();
                return;
            case 14:
                cic cicVar = (cic) obj;
                cicVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (gm.q.x - gm.L(36.0f)) - gm.L(52.0f);
                sm8 sm8Var = cicVar.c;
                sm8Var.getLayoutParams().width = gm.L(52.0f) + ((int) (L * cicVar.F));
                sm8Var.requestLayout();
                return;
            case 15:
                ((qo8) obj).G.a.invalidate();
                return;
            case 16:
                ProfileActivity profileActivity = ((wp8) obj).y2;
                RectF rectF = ProfileActivity.e7;
                profileActivity.M3();
                return;
            case 17:
                mq8 mq8Var = (mq8) obj;
                float[] fArr = mq8Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                mq8Var.G = animatedFraction;
                mq8Var.e(true, gm.S1(animatedFraction, fArr));
                return;
            case 18:
                nq8 nq8Var = (nq8) obj;
                float S1 = gm.S1(valueAnimator.getAnimatedFraction(), nq8Var.e);
                ProfileActivity profileActivity2 = nq8Var.n;
                zja zjaVar = profileActivity2.U0;
                if (zjaVar != null && !profileActivity2.q2) {
                    float f2 = 1.0f - S1;
                    zjaVar.setScaleX(f2);
                    profileActivity2.U0.setScaleY(f2);
                    profileActivity2.U0.setAlpha(f2);
                }
                nq8Var.setScaleX(S1);
                nq8Var.setScaleY(S1);
                nq8Var.setAlpha(S1);
                return;
            case 19:
                or8 or8Var = (or8) obj;
                or8Var.I.E = gm.R1(or8Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 20:
                yt8 yt8Var = (yt8) obj;
                yt8Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yt8Var.b();
                return;
            case 21:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                int i = ProfileStoriesView.t0;
                yo8 yo8Var = profileStoriesView.h;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.H = floatValue4;
                yo8Var.S = floatValue4;
                yo8Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 22:
                gw8 gw8Var = (gw8) obj;
                gw8Var.E = gm.S1(valueAnimator.getAnimatedFraction(), gw8Var.F);
                gw8Var.h.setTextColor(on2.f(gw8Var.E, cmb.w0(null, cmb.y6, false), cmb.w0(null, cmb.p6, false)));
                return;
            case 23:
                zx8 zx8Var = (zx8) obj;
                zx8Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zx8Var.invalidate();
                return;
            case 24:
                ((iy8) obj).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 25:
                r19 r19Var = (r19) obj;
                r19Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r19Var.invalidate();
                return;
            case 26:
                c29 c29Var = (c29) obj;
                c29Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c29Var.e.setAlpha(floatValue5);
                c29Var.h.setAlpha(1.0f - floatValue5);
                return;
            case 27:
                v29 v29Var = (v29) obj;
                v29Var.C0 = ((Float) v29Var.z0.getAnimatedValue()).floatValue();
                su suVar = v29Var.T;
                if (suVar != null) {
                    suVar.invalidate();
                }
                v29Var.invalidate();
                return;
            case 28:
                b63 b63Var = (b63) obj;
                b63Var.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b63Var.setScaleX(floatValue6);
                b63Var.setScaleY(floatValue6);
                ((v29) b63Var.c).T.invalidate();
                return;
            default:
                ((gu2) obj).accept((Float) valueAnimator.getAnimatedValue());
                return;
        }
    }
}
