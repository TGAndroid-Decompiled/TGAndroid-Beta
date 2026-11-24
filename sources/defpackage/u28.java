package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.v;
public final class u28 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;

    public u28(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        byte b = this.a;
        float f2 = 1.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = ((v28) obj).c;
                textViewArr[0].setAlpha(floatValue);
                float f3 = 1.0f - floatValue;
                textViewArr[0].setTranslationY((-gl.L(4.0f)) * f3);
                textViewArr[1].setAlpha(f3);
                textViewArr[1].setTranslationY(floatValue * gl.L(4.0f));
                return;
            case 1:
                PhotoViewer photoViewer = ((s88) obj).d;
                photoViewer.U1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer.U1.invalidate();
                return;
            case 2:
                PhotoViewer photoViewer2 = ((s88) obj).d;
                photoViewer2.U1.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer2.U1.invalidate();
                return;
            case 3:
                ((PhotoViewer) ((u88) obj).b).U1.scrollTo(0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 4:
                PhotoViewer photoViewer3 = ((v) obj).r;
                photoViewer3.l6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                photoViewer3.H0();
                return;
            case 5:
                ((j98) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                ma8 ma8Var = (ma8) obj;
                ma8Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ma8Var.e();
                return;
            case 7:
                za8 za8Var = (za8) obj;
                za8Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                za8Var.invalidate();
                return;
            case 8:
                ol2 ol2Var = (ol2) obj;
                ol2Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ol2Var.invalidate();
                return;
            case 9:
                ah8 ah8Var = (ah8) obj;
                ah8Var.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ah8Var.f.invalidate();
                yg8 yg8Var = ah8Var.h;
                if (yg8Var != null) {
                    yg8Var.invalidate();
                    return;
                }
                return;
            case 10:
                vi8 vi8Var = (vi8) obj;
                vi8Var.getClass();
                vi8Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vi8Var.e();
                return;
            case 11:
                ui8 ui8Var = (ui8) obj;
                ui8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ui8Var.invalidate();
                return;
            case 12:
                bgc bgcVar = (bgc) obj;
                bgcVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L = (gl.q.x - gl.L(36.0f)) - gl.L(52.0f);
                qk8 qk8Var = bgcVar.c;
                qk8Var.getLayoutParams().width = gl.L(52.0f) + ((int) (L * bgcVar.F));
                qk8Var.requestLayout();
                return;
            case 13:
                ((pm8) obj).G.a.invalidate();
                return;
            case 14:
                ProfileActivity profileActivity = ((vn8) obj).y2;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.I3();
                return;
            case 15:
                lo8 lo8Var = (lo8) obj;
                float[] fArr = lo8Var.n;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                lo8Var.G = animatedFraction;
                lo8Var.e(true, gl.S1(animatedFraction, fArr));
                return;
            case 16:
                mo8 mo8Var = (mo8) obj;
                float S1 = gl.S1(valueAnimator.getAnimatedFraction(), mo8Var.e);
                ProfileActivity profileActivity2 = mo8Var.n;
                xha xhaVar = profileActivity2.U0;
                if (xhaVar != null && !profileActivity2.q2) {
                    float f4 = 1.0f - S1;
                    xhaVar.setScaleX(f4);
                    profileActivity2.U0.setScaleY(f4);
                    profileActivity2.U0.setAlpha(f4);
                }
                mo8Var.setScaleX(S1);
                mo8Var.setScaleY(S1);
                mo8Var.setAlpha(S1);
                return;
            case 17:
                np8 np8Var = (np8) obj;
                np8Var.I.E = gl.R1(np8Var.K, 0.0f, valueAnimator.getAnimatedFraction());
                return;
            case 18:
                xr8 xr8Var = (xr8) obj;
                xr8Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xr8Var.b();
                return;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                int i = ProfileStoriesView.t0;
                xm8 xm8Var = profileStoriesView.h;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.H = floatValue2;
                xm8Var.S = floatValue2;
                xm8Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 20:
                fu8 fu8Var = (fu8) obj;
                fu8Var.E = gl.S1(valueAnimator.getAnimatedFraction(), fu8Var.F);
                fu8Var.h.setTextColor(bm2.f(fu8Var.E, bkb.w0(null, bkb.y6, false), bkb.w0(null, bkb.p6, false)));
                return;
            case 21:
                yv8 yv8Var = (yv8) obj;
                yv8Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv8Var.invalidate();
                return;
            case 22:
                ((gw8) obj).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                qz8 qz8Var = (qz8) obj;
                qz8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qz8Var.invalidate();
                return;
            case 24:
                a09 a09Var = (a09) obj;
                a09Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a09Var.e.setAlpha(floatValue3);
                a09Var.h.setAlpha(1.0f - floatValue3);
                return;
            case 25:
                t09 t09Var = (t09) obj;
                t09Var.C0 = ((Float) t09Var.z0.getAnimatedValue()).floatValue();
                st stVar = t09Var.T;
                if (stVar != null) {
                    stVar.invalidate();
                }
                t09Var.invalidate();
                return;
            case 26:
                q43 q43Var = (q43) obj;
                q43Var.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q43Var.setScaleX(floatValue4);
                q43Var.setScaleY(floatValue4);
                ((t09) q43Var.c).T.invalidate();
                return;
            case 27:
                ((vs2) obj).accept((Float) valueAnimator.getAnimatedValue());
                return;
            case 28:
                r09 r09Var = (r09) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r09Var.J = floatValue5;
                q09 q09Var = r09Var.b;
                if (r09Var.x) {
                    f = 0.76f;
                } else {
                    f = 1.0f;
                }
                q09Var.setScaleY(floatValue5 * f);
                float f5 = r09Var.J;
                if (r09Var.x) {
                    f2 = 0.76f;
                }
                q09Var.setScaleX(f5 * f2);
                return;
            default:
                l79 l79Var = (l79) obj;
                l79Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l79Var.invalidateSelf();
                return;
        }
    }
}
