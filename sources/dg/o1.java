package dg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import lh.bb;
import lh.f4;
import lh.g5;
import lh.l5;
import lh.x9;
import lh.y9;
import nh.t4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.et0;
import org.telegram.ui.tz0;
public final class o1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4689a;
    public final Object f4690b;

    public o1(Object obj, int i10) {
        this.f4689a = i10;
        this.f4690b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        lh.x3 x3Var;
        boolean z4;
        int i10 = this.f4689a;
        Object obj = this.f4690b;
        switch (i10) {
            case 0:
                ((et0) ((q1) obj)).H.f31705b0.invalidate();
                return;
            case 1:
                o2 o2Var = (o2) obj;
                o2Var.getClass();
                o2Var.f4695n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2Var.invalidate();
                return;
            case 2:
                x2 x2Var = (x2) obj;
                x2Var.getClass();
                x2Var.f4853x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.invalidate();
                return;
            case 3:
                cg.p pVar = (cg.p) obj;
                pVar.f4853x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.invalidate();
                return;
            case 4:
                q3 q3Var = (q3) obj;
                q3Var.getClass();
                q3Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                y3 y3Var = (y3) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.f4871y = floatValue;
                u3 u3Var = y3Var.f4864c;
                u3Var.setAlpha(floatValue);
                u3Var.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, y3Var.f4871y));
                u3Var.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, y3Var.f4871y));
                y3Var.f4863b.invalidate();
                return;
            case 6:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f23090i0;
                limitPreviewView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    f10 = (floatValue2 / 0.5f) * (-7.0f);
                } else {
                    f10 = (1.0f - ((floatValue2 - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.V = f10;
                return;
            case 7:
                eg.c1 c1Var = (eg.c1) obj;
                c1Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.d.invalidate();
                eg.a1 a1Var = c1Var.e;
                if (a1Var != null) {
                    a1Var.invalidate();
                    return;
                }
                return;
            case 8:
                ((eg.q2) obj).f5468a.f5438o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                gg.b bVar = (gg.b) obj;
                bVar.getClass();
                bVar.f6558b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 10:
                kg.k kVar = (kg.k) obj;
                kVar.getClass();
                kVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                g5 g5Var = (g5) obj;
                g5Var.V0.f2084c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g5Var.T1();
                return;
            case 12:
                ((f4) obj).h.invalidate();
                return;
            case 13:
                lh.y3 y3Var2 = (lh.y3) obj;
                y3Var2.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var2.B = floatValue3;
                if (floatValue3 >= 0.8f && (x3Var = y3Var2.E) != null && (z4 = x3Var.f13345l) && z4) {
                    x3Var.f13345l = false;
                    x3Var.b();
                }
                y3Var2.invalidate();
                return;
            case 14:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 15:
                l5 l5Var = (l5) obj;
                l5Var.getClass();
                l5Var.f12760y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.invalidate();
                return;
            case 16:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9 x9Var = ((y9) obj).f13408c;
                x9Var.setScaleX(floatValue4);
                x9Var.setScaleY(floatValue4);
                return;
            case 17:
                bb bbVar = (bb) obj;
                bbVar.getClass();
                bbVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bbVar.invalidate();
                return;
            case 18:
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mg.u uVar = ((mg.v) obj).f14151b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue5);
                    return;
                }
                return;
            case 19:
                nh.a aVar = (nh.a) obj;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 20:
                nh.p pVar2 = (nh.p) obj;
                pVar2.L.e = AndroidUtilities.lerp(0.0f, 1.0f - pVar2.V.f15756a0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pVar2.invalidate();
                return;
            case 21:
                ((nh.v0) obj).invalidate();
                return;
            case 22:
                nh.g2 g2Var = (nh.g2) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.f15973c.setAlpha(floatValue6);
                g2Var.f15969a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue6));
                g2Var.invalidate();
                return;
            case 23:
                nh.o0 o0Var = (nh.o0) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = o0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(o0Var.f15685f, 1.0f, floatValue7) * 255.0f));
                    o0Var.h.invalidate();
                    return;
                }
                return;
            case 24:
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh.o0 o0Var2 = (nh.o0) ((cg.l0) obj).f2444b;
                Drawable drawable2 = o0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, o0Var2.f15685f, floatValue8) * 255.0f));
                    o0Var2.h.invalidate();
                    return;
                }
                return;
            case 25:
                nh.j1 j1Var = (nh.j1) obj;
                j1Var.getClass();
                j1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                nh.r1 r1Var = (nh.r1) obj;
                r1Var.getClass();
                r1Var.f15829n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 27:
                nh.z3 z3Var = (nh.z3) obj;
                z3Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = z3Var.f16114c;
                textViewArr[0].setAlpha(floatValue9);
                float f11 = 1.0f - floatValue9;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f11);
                textViewArr[1].setAlpha(f11);
                textViewArr[1].setTranslationY(floatValue9 * AndroidUtilities.dp(4.0f));
                return;
            case 28:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                tz0 tz0Var = profileStoriesView.h;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.D = floatValue10;
                tz0Var.O = floatValue10;
                tz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            default:
                t4 t4Var = (t4) obj;
                t4Var.f15910r = ((Float) t4Var.f15912w.getAnimatedValue()).floatValue();
                t4Var.invalidate();
                return;
        }
    }
}
