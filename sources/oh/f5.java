package oh;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zh;
import org.telegram.ui.vh1;
import org.telegram.ui.xn;
public final class f5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17135a;
    public final Object f17136b;

    public f5(ja.c cVar, View view) {
        this.f17135a = 24;
        this.f17136b = cVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17135a) {
            case 0:
                n5 n5Var = (n5) this.f17136b;
                n5Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n5Var.f17490e.setTranslationY(((-n5Var.d) + n5Var.getMeasuredHeight()) - n5Var.v);
                return;
            case 1:
                x6 x6Var = (x6) this.f17136b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = x6Var.f17928a;
                w6 w6Var = (w6) arrayList.get(x6Var.d);
                w6Var.f17904n = floatValue;
                w6Var.invalidate();
                int i10 = x6Var.f17930c;
                if (i10 != -1) {
                    w6 w6Var2 = (w6) arrayList.get(i10);
                    w6Var2.f17904n = 1.0f - floatValue;
                    w6Var2.invalidate();
                    return;
                }
                return;
            case 2:
                z7 z7Var = (z7) this.f17136b;
                z7Var.getClass();
                z7Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.G.requestLayout();
                return;
            case 3:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f17136b;
                q0Var.getClass();
                q0Var.f32285i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 4:
                vh1 vh1Var = (vh1) this.f17136b;
                vh1Var.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = vh1Var.f31967c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * vh1Var.B));
                z0Var.requestLayout();
                return;
            case 5:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f17136b;
                h1Var.getClass();
                h1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                org.telegram.ui.Components.voip.t1 t1Var = (org.telegram.ui.Components.voip.t1) this.f17136b;
                t1Var.getClass();
                t1Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 7:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.f17136b;
                n2Var.getClass();
                n2Var.f32208s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.f32202b.invalidate();
                return;
            case 8:
                z2 z2Var = (z2) this.f17136b;
                ((a4) z2Var.f17992b).f29998a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                z2Var.invalidate();
                return;
            case 9:
                org.telegram.ui.web.t1 t1Var2 = (org.telegram.ui.web.t1) this.f17136b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var2.R = floatValue2;
                t1Var2.S.setAlpha(floatValue2);
                t1Var2.invalidate();
                return;
            case 10:
                org.telegram.ui.m0 m0Var = (org.telegram.ui.m0) this.f17136b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.U = floatValue3;
                m0Var.j(floatValue3);
                m0Var.V.setAlpha(m0Var.U);
                m0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.U);
                m0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.U);
                m0Var.invalidate();
                return;
            case 11:
                ph.p pVar = (ph.p) this.f17136b;
                pVar.f44414w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pVar.f44412r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, pVar.f44414w));
                pVar.f44411n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), pVar.f44414w));
                return;
            case 12:
                qh.k kVar = (qh.k) this.f17136b;
                kVar.f45524l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh.f fVar = kVar.f45517f;
                fVar.getEditText().setTranslationX(AndroidUtilities.lerp(kVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), kVar.f45524l0));
                FrameLayout frameLayout = kVar.f45532s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), kVar.f45524l0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, kVar.f45524l0));
                fVar.getEmojiButton().setAlpha(kVar.f45524l0);
                kVar.f45530r.setAlpha((float) Math.pow(kVar.f45524l0, 16.0d));
                kVar.u(kVar.f45524l0);
                zh zhVar = kVar.J;
                if (zhVar != null) {
                    zhVar.setAlpha((float) Math.pow(kVar.f45524l0, 4.0d));
                }
                fVar.getEditText().invalidate();
                kVar.invalidate();
                return;
            case 13:
                qh.u uVar = (qh.u) this.f17136b;
                uVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar.f46134a.invalidate();
                return;
            case 14:
                qh.d2 d2Var = (qh.d2) this.f17136b;
                d2Var.getClass();
                d2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d2Var.i();
                return;
            case 15:
                ((qh.d3) this.f17136b).f45198b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                qh.f3 f3Var = (qh.f3) this.f17136b;
                f3Var.getClass();
                f3Var.f45301l0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f3Var.invalidate();
                return;
            case 17:
                ((qh.r3) this.f17136b).invalidate();
                return;
            case 18:
                qh.e5 e5Var = (qh.e5) this.f17136b;
                e5Var.getClass();
                e5Var.f45250n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e5Var.e();
                return;
            case 19:
                qh.d5 d5Var = (qh.d5) this.f17136b;
                d5Var.getClass();
                d5Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d5Var.invalidate();
                return;
            case 20:
                qh.w5 w5Var = (qh.w5) this.f17136b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.B = floatValue4;
                qh.v5 v5Var = w5Var.f46227a;
                v5Var.setScaleX(1.0f - floatValue4);
                v5Var.setScaleY(1.0f - w5Var.B);
                w5Var.invalidate();
                return;
            case 21:
                qh.e7 e7Var = (qh.e7) this.f17136b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.f45261r = floatValue5;
                Utilities.Callback callback = e7Var.f45264x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue5, 1.0f, -1.0f)));
                }
                e7Var.f45255a.invalidate();
                return;
            case 22:
                ((qh.x7) this.f17136b).f46298x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 23:
                qh.a8 a8Var = (qh.a8) this.f17136b;
                a8Var.getClass();
                a8Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 24:
                ((View) ((g.a0) ((ja.c) this.f17136b).f9988a).d.getParent()).invalidate();
                return;
            case 25:
                wf.h hVar = (wf.h) this.f17136b;
                hVar.f49589f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f49590g.f49591a.invalidate();
                return;
            case 26:
                wh.o4 o4Var = (wh.o4) this.f17136b;
                o4Var.getClass();
                o4Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.requestLayout();
                o4Var.invalidate();
                return;
            default:
                xh.n nVar = (xh.n) this.f17136b;
                xn xnVar = nVar.F;
                if (xnVar != null) {
                    xnVar.r9();
                    if (xnVar.G8 != null) {
                        xnVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                nVar.G.invalidate();
                return;
        }
    }

    public f5(Object obj, int i10) {
        this.f17135a = i10;
        this.f17136b = obj;
    }
}
