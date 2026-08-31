package eg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import mh.bb;
import mh.f4;
import mh.g5;
import mh.l5;
import mh.x9;
import mh.y9;
import oh.b4;
import oh.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.gt0;
import org.telegram.ui.vz0;
public final class m1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5347a;
    public final Object f5348b;

    public m1(Object obj, int i10) {
        this.f5347a = i10;
        this.f5348b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        mh.x3 x3Var;
        boolean z4;
        int i10 = this.f5347a;
        Object obj = this.f5348b;
        switch (i10) {
            case 0:
                ((gt0) ((o1) obj)).H.f34230b0.invalidate();
                return;
            case 1:
                m2 m2Var = (m2) obj;
                m2Var.getClass();
                m2Var.f5354n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.invalidate();
                return;
            case 2:
                v2 v2Var = (v2) obj;
                v2Var.getClass();
                v2Var.f5520x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.invalidate();
                return;
            case 3:
                dg.p pVar = (dg.p) obj;
                pVar.f5520x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.invalidate();
                return;
            case 4:
                o3 o3Var = (o3) obj;
                o3Var.getClass();
                o3Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 5:
                w3 w3Var = (w3) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w3Var.f5539y = floatValue;
                s3 s3Var = w3Var.f5531c;
                s3Var.setAlpha(floatValue);
                s3Var.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, w3Var.f5539y));
                s3Var.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, w3Var.f5539y));
                w3Var.f5530b.invalidate();
                return;
            case 6:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f24943i0;
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
                fg.b1 b1Var = (fg.b1) obj;
                b1Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b1Var.d.invalidate();
                fg.a1 a1Var = b1Var.f6247e;
                if (a1Var != null) {
                    a1Var.invalidate();
                    return;
                }
                return;
            case 8:
                ((fg.p2) obj).f6501a.f6463o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 9:
                hg.b bVar = (hg.b) obj;
                bVar.getClass();
                bVar.f7396b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 10:
                lg.k kVar = (lg.k) obj;
                kVar.getClass();
                kVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 11:
                g5 g5Var = (g5) obj;
                g5Var.V0.f2267c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g5Var.T1();
                return;
            case 12:
                ((f4) obj).h.invalidate();
                return;
            case 13:
                mh.y3 y3Var = (mh.y3) obj;
                y3Var.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y3Var.B = floatValue3;
                if (floatValue3 >= 0.8f && (x3Var = y3Var.E) != null && (z4 = x3Var.f15044l) && z4) {
                    x3Var.f15044l = false;
                    x3Var.b();
                }
                y3Var.invalidate();
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
                l5Var.f14392y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.invalidate();
                return;
            case 16:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x9 x9Var = ((y9) obj).f15112c;
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
                ng.u uVar = ((ng.v) obj).f16224b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue5);
                    return;
                }
                return;
            case 19:
                oh.a aVar = (oh.a) obj;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 20:
                oh.o oVar = (oh.o) obj;
                oVar.L.f17226e = AndroidUtilities.lerp(0.0f, 1.0f - oVar.V.f17575a0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                oVar.invalidate();
                return;
            case 21:
                ((oh.v0) obj).invalidate();
                return;
            case 22:
                oh.h2 h2Var = (oh.h2) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2Var.f17831c.setAlpha(floatValue6);
                h2Var.f17827a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue6));
                h2Var.invalidate();
                return;
            case 23:
                oh.o0 o0Var = (oh.o0) obj;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = o0Var.f17530e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(o0Var.f17531f, 1.0f, floatValue7) * 255.0f));
                    o0Var.h.invalidate();
                    return;
                }
                return;
            case 24:
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oh.o0 o0Var2 = (oh.o0) ((dg.l0) obj).f4578b;
                Drawable drawable2 = o0Var2.f17530e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, o0Var2.f17531f, floatValue8) * 255.0f));
                    o0Var2.h.invalidate();
                    return;
                }
                return;
            case 25:
                oh.j1 j1Var = (oh.j1) obj;
                j1Var.getClass();
                j1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                oh.r1 r1Var = (oh.r1) obj;
                r1Var.getClass();
                r1Var.f17680n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.invalidate();
                return;
            case 27:
                b4 b4Var = (b4) obj;
                b4Var.getClass();
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = b4Var.f16888c;
                textViewArr[0].setAlpha(floatValue9);
                float f11 = 1.0f - floatValue9;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f11);
                textViewArr[1].setAlpha(f11);
                textViewArr[1].setTranslationY(floatValue9 * AndroidUtilities.dp(4.0f));
                return;
            case 28:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                vz0 vz0Var = profileStoriesView.h;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.D = floatValue10;
                vz0Var.O = floatValue10;
                vz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            default:
                u4 u4Var = (u4) obj;
                u4Var.f17815r = ((Float) u4Var.f17817w.getAnimatedValue()).floatValue();
                u4Var.invalidate();
                return;
        }
    }
}
