package ah;

import ai.ad;
import ai.d6;
import ai.ie;
import ai.k7;
import ai.p7;
import ai.v5;
import ai.w5;
import ai.zc;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.b6;
import ci.i5;
import ci.l4;
import ci.l7;
import ci.m2;
import ci.o1;
import ci.q8;
import ci.w1;
import ei.k6;
import ei.s2;
import ei.u3;
import ei.x3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.qz0;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f668a;
    public final Object f669b;

    public c0(Object obj, int i10) {
        this.f668a = i10;
        this.f669b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        v5 v5Var;
        boolean z10;
        switch (this.f668a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0 e0Var = ((f0) this.f669b).f726b;
                if (e0Var != null) {
                    e0Var.setAlpha(floatValue);
                    return;
                }
                return;
            case 1:
                k7 k7Var = (k7) this.f669b;
                k7Var.f1660b1.f1342a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k7Var.h2();
                return;
            case 2:
                ((d6) this.f669b).h.invalidate();
                return;
            case 3:
                w5 w5Var = (w5) this.f669b;
                w5Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.E = floatValue2;
                if (floatValue2 >= 0.8f && (v5Var = w5Var.H) != null && (z10 = v5Var.f2305l) && z10) {
                    v5Var.f2305l = false;
                    v5Var.b();
                }
                w5Var.invalidate();
                return;
            case 4:
                View view = (View) this.f669b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 5:
                p7 p7Var = (p7) this.f669b;
                p7Var.getClass();
                p7Var.f2023y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                return;
            case 6:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc zcVar = ((ad) this.f669b).f982c;
                zcVar.setScaleX(floatValue3);
                zcVar.setScaleY(floatValue3);
                return;
            case 7:
                ie ieVar = (ie) this.f669b;
                ieVar.getClass();
                ieVar.f1515c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ieVar.invalidate();
                return;
            case 8:
                ci.a aVar = (ci.a) this.f669b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 9:
                ci.q qVar = (ci.q) this.f669b;
                qVar.O.e = AndroidUtilities.lerp(0.0f, 1.0f - qVar.f5752b0.f5813d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar.invalidate();
                return;
            case 10:
                ((ci.x0) this.f669b).invalidate();
                return;
            case 11:
                m2 m2Var = (m2) this.f669b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.f6076c.setAlpha(floatValue4);
                m2Var.f6072a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue4));
                m2Var.invalidate();
                return;
            case 12:
                ci.q0 q0Var = (ci.q0) this.f669b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = q0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(q0Var.f5764f, 1.0f, floatValue5) * 255.0f));
                    q0Var.h.invalidate();
                    return;
                }
                return;
            case 13:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci.q0 q0Var2 = (ci.q0) ((b) this.f669b).f661b;
                Drawable drawable2 = q0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, q0Var2.f5764f, floatValue6) * 255.0f));
                    q0Var2.h.invalidate();
                    return;
                }
                return;
            case 14:
                o1 o1Var = (o1) this.f669b;
                o1Var.getClass();
                o1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                w1 w1Var = (w1) this.f669b;
                w1Var.getClass();
                w1Var.f6038n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w1Var.invalidate();
                return;
            case 16:
                l4 l4Var = (l4) this.f669b;
                l4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = l4Var.f5512c;
                textViewArr[0].setAlpha(floatValue7);
                float f7 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue7 * AndroidUtilities.dp(4.0f));
                return;
            case 17:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f669b;
                qz0 qz0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                qz0Var.R = floatValue8;
                qz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 18:
                i5 i5Var = (i5) this.f669b;
                i5Var.f5441r = ((Float) i5Var.f5443w.getAnimatedValue()).floatValue();
                i5Var.invalidate();
                return;
            case 19:
                b6 b6Var = (b6) this.f669b;
                b6Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.e.setTranslationY(((-b6Var.d) + b6Var.getMeasuredHeight()) - b6Var.v);
                return;
            case 20:
                l7 l7Var = (l7) this.f669b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = l7Var.f5522a;
                ci.k7 k7Var2 = (ci.k7) arrayList.get(l7Var.d);
                k7Var2.f5496n = floatValue9;
                k7Var2.invalidate();
                int i10 = l7Var.f5524c;
                if (i10 != -1) {
                    ci.k7 k7Var3 = (ci.k7) arrayList.get(i10);
                    k7Var3.f5496n = 1.0f - floatValue9;
                    k7Var3.invalidate();
                    return;
                }
                return;
            case 21:
                q8 q8Var = (q8) this.f669b;
                q8Var.getClass();
                q8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.invalidate();
                q8Var.requestLayout();
                q8Var.J.requestLayout();
                return;
            case 22:
                di.v vVar = (di.v) this.f669b;
                vVar.f8076w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.f8074r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.f8076w));
                vVar.f8073n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.f8076w));
                return;
            case 23:
                ei.m mVar = (ei.m) this.f669b;
                mVar.f9410o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei.g gVar = mVar.f9400f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f9410o0));
                FrameLayout frameLayout = mVar.f9415s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f9410o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f9410o0));
                gVar.getEmojiButton().setAlpha(mVar.f9410o0);
                mVar.f9413r.setAlpha((float) Math.pow(mVar.f9410o0, 16.0d));
                mVar.u(mVar.f9410o0);
                ei.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f9410o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 24:
                ei.y yVar = (ei.y) this.f669b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f10120a.invalidate();
                return;
            case 25:
                s2 s2Var = (s2) this.f669b;
                s2Var.getClass();
                s2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.i();
                return;
            case 26:
                ((u3) this.f669b).f9886b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                x3 x3Var = (x3) this.f669b;
                x3Var.getClass();
                x3Var.f10084o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x3Var.invalidate();
                return;
            case 28:
                ((ei.l4) this.f669b).invalidate();
                return;
            default:
                k6 k6Var = (k6) this.f669b;
                k6Var.getClass();
                k6Var.f9319n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.e();
                return;
        }
    }
}
