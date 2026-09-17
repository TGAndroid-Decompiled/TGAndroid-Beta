package ah;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.a2;
import bi.a7;
import bi.da;
import bi.e3;
import bi.h6;
import bi.k2;
import bi.k5;
import bi.x8;
import bi.y8;
import di.a9;
import di.b4;
import di.ba;
import di.f4;
import di.fa;
import di.p7;
import di.q7;
import di.t6;
import di.u4;
import di.u6;
import di.y2;
import java.util.ArrayList;
import ji.w4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.n01;
public final class d0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f493a;
    public final Object f494b;

    public d0(Object obj, int i10) {
        this.f493a = i10;
        this.f494b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f493a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0 f0Var = ((g0) this.f494b).f548b;
                if (f0Var != null) {
                    f0Var.setAlpha(floatValue);
                    return;
                }
                return;
            case 1:
                bi.a aVar = (bi.a) this.f494b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 2:
                bi.u uVar = (bi.u) this.f494b;
                uVar.O.f3177e = AndroidUtilities.lerp(0.0f, 1.0f - uVar.f3797b0.f3879d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                uVar.invalidate();
                return;
            case 3:
                ((bi.g1) this.f494b).invalidate();
                return;
            case 4:
                e3 e3Var = (e3) this.f494b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.f3031c.setAlpha(floatValue2);
                e3Var.f3027a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue2));
                e3Var.invalidate();
                return;
            case 5:
                bi.z0 z0Var = (bi.z0) this.f494b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = z0Var.f4062e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(z0Var.f4063f, 1.0f, floatValue3) * 255.0f));
                    z0Var.h.invalidate();
                    return;
                }
                return;
            case 6:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi.z0 z0Var2 = (bi.z0) ((b) this.f494b).f454b;
                Drawable drawable2 = z0Var2.f4062e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, z0Var2.f4063f, floatValue4) * 255.0f));
                    z0Var2.h.invalidate();
                    return;
                }
                return;
            case 7:
                a2 a2Var = (a2) this.f494b;
                a2Var.getClass();
                a2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                k2 k2Var = (k2) this.f494b;
                k2Var.getClass();
                k2Var.f3218n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.invalidate();
                return;
            case 9:
                k5 k5Var = (k5) this.f494b;
                k5Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = k5Var.f3224c;
                textViewArr[0].setAlpha(floatValue5);
                float f7 = 1.0f - floatValue5;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue5 * AndroidUtilities.dp(4.0f));
                return;
            case 10:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f494b;
                n01 n01Var = profileStoriesView.h;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue6;
                n01Var.R = floatValue6;
                n01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 11:
                h6 h6Var = (h6) this.f494b;
                h6Var.f3088r = ((Float) h6Var.f3090w.getAnimatedValue()).floatValue();
                h6Var.invalidate();
                return;
            case 12:
                a7 a7Var = (a7) this.f494b;
                a7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a7Var.f2791e.setTranslationY(((-a7Var.d) + a7Var.getMeasuredHeight()) - a7Var.v);
                return;
            case 13:
                y8 y8Var = (y8) this.f494b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = y8Var.f4047a;
                x8 x8Var = (x8) arrayList.get(y8Var.d);
                x8Var.f4022n = floatValue7;
                x8Var.invalidate();
                int i10 = y8Var.f4049c;
                if (i10 != -1) {
                    x8 x8Var2 = (x8) arrayList.get(i10);
                    x8Var2.f4022n = 1.0f - floatValue7;
                    x8Var2.invalidate();
                    return;
                }
                return;
            case 14:
                da daVar = (da) this.f494b;
                daVar.getClass();
                daVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.invalidate();
                daVar.requestLayout();
                daVar.J.requestLayout();
                return;
            case 15:
                ci.y yVar = (ci.y) this.f494b;
                yVar.f4883w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f4881r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, yVar.f4883w));
                yVar.f4880n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), yVar.f4883w));
                return;
            case 16:
                di.m mVar = (di.m) this.f494b;
                mVar.f7631o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di.g gVar = mVar.f7621f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f7631o0));
                FrameLayout frameLayout = mVar.f7636s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f7631o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f7631o0));
                gVar.getEmojiButton().setAlpha(mVar.f7631o0);
                mVar.f7634r.setAlpha((float) Math.pow(mVar.f7631o0, 16.0d));
                mVar.u(mVar.f7631o0);
                di.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f7631o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 17:
                di.y yVar2 = (di.y) this.f494b;
                yVar2.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar2.f8468a.invalidate();
                return;
            case 18:
                y2 y2Var = (y2) this.f494b;
                y2Var.getClass();
                y2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.i();
                return;
            case 19:
                ((b4) this.f494b).f6970b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                f4 f4Var = (f4) this.f494b;
                f4Var.getClass();
                f4Var.f7241o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f4Var.invalidate();
                return;
            case 21:
                ((u4) this.f494b).invalidate();
                return;
            case 22:
                u6 u6Var = (u6) this.f494b;
                u6Var.getClass();
                u6Var.f8280n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var.e();
                return;
            case 23:
                t6 t6Var = (t6) this.f494b;
                t6Var.getClass();
                t6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.invalidate();
                return;
            case 24:
                q7 q7Var = (q7) this.f494b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q7Var.E = floatValue8;
                p7 p7Var = q7Var.f8030a;
                p7Var.setScaleX(1.0f - floatValue8);
                p7Var.setScaleY(1.0f - q7Var.E);
                q7Var.invalidate();
                return;
            case 25:
                a9 a9Var = (a9) this.f494b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a9Var.f6943r = floatValue9;
                Utilities.Callback callback = a9Var.f6946x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue9, 1.0f, -1.0f)));
                }
                a9Var.f6937a.invalidate();
                return;
            case 26:
                ((ba) this.f494b).f6993x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                fa faVar = (fa) this.f494b;
                faVar.getClass();
                faVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                jg.h hVar = (jg.h) this.f494b;
                hVar.f13730f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f13731g.f13732a.invalidate();
                return;
            default:
                w4 w4Var = (w4) this.f494b;
                w4Var.getClass();
                w4Var.f14319a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.requestLayout();
                w4Var.invalidate();
                return;
        }
    }
}
