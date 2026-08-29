package lh;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.hh1;
import org.telegram.ui.tn;
public final class d5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15551a;
    public final Object f15552b;

    public d5(Object obj, int i10) {
        this.f15551a = i10;
        this.f15552b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15551a) {
            case 0:
                l5 l5Var = (l5) this.f15552b;
                l5Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.f15885e.setTranslationY(((-l5Var.d) + l5Var.getMeasuredHeight()) - l5Var.v);
                return;
            case 1:
                w6 w6Var = (w6) this.f15552b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = w6Var.f16365a;
                v6 v6Var = (v6) arrayList.get(w6Var.d);
                v6Var.f16320n = floatValue;
                v6Var.invalidate();
                int i10 = w6Var.f16367c;
                if (i10 != -1) {
                    v6 v6Var2 = (v6) arrayList.get(i10);
                    v6Var2.f16320n = 1.0f - floatValue;
                    v6Var2.invalidate();
                    return;
                }
                return;
            case 2:
                z7 z7Var = (z7) this.f15552b;
                z7Var.getClass();
                z7Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.F.requestLayout();
                return;
            case 3:
                mh.v vVar = (mh.v) this.f15552b;
                vVar.f17064w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.f17062r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.f17064w));
                vVar.f17061n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.f17064w));
                return;
            case 4:
                nh.m mVar = (nh.m) this.f15552b;
                mVar.f18082k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nh.g gVar = mVar.f18076f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f18082k0));
                FrameLayout frameLayout = mVar.f18091s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f18082k0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f18082k0));
                gVar.getEmojiButton().setAlpha(mVar.f18082k0);
                mVar.f18089r.setAlpha((float) Math.pow(mVar.f18082k0, 16.0d));
                mVar.u(mVar.f18082k0);
                nh.i iVar = mVar.I;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f18082k0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 5:
                nh.y yVar = (nh.y) this.f15552b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f18845a.invalidate();
                return;
            case 6:
                nh.p2 p2Var = (nh.p2) this.f15552b;
                p2Var.getClass();
                p2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.i();
                return;
            case 7:
                ((nh.r3) this.f15552b).f18508b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                nh.t3 t3Var = (nh.t3) this.f15552b;
                t3Var.getClass();
                t3Var.f18600k0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                t3Var.invalidate();
                return;
            case 9:
                ((nh.g4) this.f15552b).invalidate();
                return;
            case 10:
                nh.w5 w5Var = (nh.w5) this.f15552b;
                w5Var.getClass();
                w5Var.f18793n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.e();
                return;
            case 11:
                nh.v5 v5Var = (nh.v5) this.f15552b;
                v5Var.getClass();
                v5Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var.invalidate();
                return;
            case 12:
                nh.t6 t6Var = (nh.t6) this.f15552b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.A = floatValue2;
                nh.s6 s6Var = t6Var.f18672a;
                s6Var.setScaleX(1.0f - floatValue2);
                s6Var.setScaleY(1.0f - t6Var.A);
                t6Var.invalidate();
                return;
            case 13:
                nh.b8 b8Var = (nh.b8) this.f15552b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b8Var.f17426r = floatValue3;
                Utilities.Callback callback = b8Var.f17429x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue3, 1.0f, -1.0f)));
                }
                b8Var.f17420a.invalidate();
                return;
            case 14:
                ((nh.y8) this.f15552b).f18910x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                nh.b9 b9Var = (nh.b9) this.f15552b;
                b9Var.getClass();
                b9Var.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                org.telegram.ui.Components.voip.q0 q0Var = (org.telegram.ui.Components.voip.q0) this.f15552b;
                q0Var.getClass();
                q0Var.f33936i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 17:
                hh1 hh1Var = (hh1) this.f15552b;
                hh1Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int dp = (AndroidUtilities.displaySize.x - AndroidUtilities.dp(36.0f)) - AndroidUtilities.dp(52.0f);
                org.telegram.ui.Components.voip.z0 z0Var = hh1Var.f33622c;
                z0Var.getLayoutParams().width = AndroidUtilities.dp(52.0f) + ((int) (dp * hh1Var.A));
                z0Var.requestLayout();
                return;
            case 18:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f15552b;
                h1Var.getClass();
                h1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                org.telegram.ui.Components.voip.t1 t1Var = (org.telegram.ui.Components.voip.t1) this.f15552b;
                t1Var.getClass();
                t1Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.invalidate();
                return;
            case 20:
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.f15552b;
                o2Var.getClass();
                o2Var.f33901s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o2Var.f33895b.invalidate();
                return;
            case 21:
                x2 x2Var = (x2) this.f15552b;
                ((y3) x2Var.f16392b).f32903a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                x2Var.invalidate();
                return;
            case 22:
                org.telegram.ui.web.r1 r1Var = (org.telegram.ui.web.r1) this.f15552b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r1Var.Q = floatValue4;
                r1Var.R.setAlpha(floatValue4);
                r1Var.invalidate();
                return;
            case 23:
                org.telegram.ui.o0 o0Var = (org.telegram.ui.o0) this.f15552b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.T = floatValue5;
                o0Var.j(floatValue5);
                o0Var.U.setAlpha(o0Var.T);
                o0Var.N.setTranslationX(AndroidUtilities.dp(56.0f) * o0Var.T);
                o0Var.K.setTranslationX(AndroidUtilities.dp(112.0f) * o0Var.T);
                o0Var.invalidate();
                return;
            case 24:
                ((View) ((g.a0) ((za.c) this.f15552b).f50799b).d.getParent()).invalidate();
                return;
            case 25:
                tf.h hVar = (tf.h) this.f15552b;
                hVar.f48298f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f48299g.f48300a.invalidate();
                return;
            case 26:
                th.m4 m4Var = (th.m4) this.f15552b;
                m4Var.getClass();
                m4Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m4Var.requestLayout();
                m4Var.invalidate();
                return;
            default:
                uh.m mVar2 = (uh.m) this.f15552b;
                tn tnVar = mVar2.F;
                if (tnVar != null) {
                    tnVar.r9();
                    if (tnVar.F8 != null) {
                        tnVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                mVar2.G.invalidate();
                return;
        }
    }

    public d5(za.c cVar, View view) {
        this.f15551a = 24;
        this.f15552b = cVar;
    }
}
