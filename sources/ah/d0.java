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
    public final int f481a;
    public final Object f482b;

    public d0(Object obj, int i10) {
        this.f481a = i10;
        this.f482b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f481a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0 f0Var = ((g0) this.f482b).f536b;
                if (f0Var != null) {
                    f0Var.setAlpha(floatValue);
                    return;
                }
                return;
            case 1:
                bi.a aVar = (bi.a) this.f482b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 2:
                bi.u uVar = (bi.u) this.f482b;
                uVar.O.f3150e = AndroidUtilities.lerp(0.0f, 1.0f - uVar.f3770b0.f3852d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                uVar.invalidate();
                return;
            case 3:
                ((bi.g1) this.f482b).invalidate();
                return;
            case 4:
                e3 e3Var = (e3) this.f482b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.f3004c.setAlpha(floatValue2);
                e3Var.f3000a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue2));
                e3Var.invalidate();
                return;
            case 5:
                bi.z0 z0Var = (bi.z0) this.f482b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = z0Var.f4035e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(z0Var.f4036f, 1.0f, floatValue3) * 255.0f));
                    z0Var.h.invalidate();
                    return;
                }
                return;
            case 6:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi.z0 z0Var2 = (bi.z0) ((b) this.f482b).f442b;
                Drawable drawable2 = z0Var2.f4035e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, z0Var2.f4036f, floatValue4) * 255.0f));
                    z0Var2.h.invalidate();
                    return;
                }
                return;
            case 7:
                a2 a2Var = (a2) this.f482b;
                a2Var.getClass();
                a2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                k2 k2Var = (k2) this.f482b;
                k2Var.getClass();
                k2Var.f3191n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.invalidate();
                return;
            case 9:
                k5 k5Var = (k5) this.f482b;
                k5Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = k5Var.f3197c;
                textViewArr[0].setAlpha(floatValue5);
                float f7 = 1.0f - floatValue5;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue5 * AndroidUtilities.dp(4.0f));
                return;
            case 10:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f482b;
                n01 n01Var = profileStoriesView.h;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue6;
                n01Var.R = floatValue6;
                n01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 11:
                h6 h6Var = (h6) this.f482b;
                h6Var.f3061r = ((Float) h6Var.f3063w.getAnimatedValue()).floatValue();
                h6Var.invalidate();
                return;
            case 12:
                a7 a7Var = (a7) this.f482b;
                a7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a7Var.f2764e.setTranslationY(((-a7Var.d) + a7Var.getMeasuredHeight()) - a7Var.v);
                return;
            case 13:
                y8 y8Var = (y8) this.f482b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = y8Var.f4020a;
                x8 x8Var = (x8) arrayList.get(y8Var.d);
                x8Var.f3995n = floatValue7;
                x8Var.invalidate();
                int i10 = y8Var.f4022c;
                if (i10 != -1) {
                    x8 x8Var2 = (x8) arrayList.get(i10);
                    x8Var2.f3995n = 1.0f - floatValue7;
                    x8Var2.invalidate();
                    return;
                }
                return;
            case 14:
                da daVar = (da) this.f482b;
                daVar.getClass();
                daVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.invalidate();
                daVar.requestLayout();
                daVar.J.requestLayout();
                return;
            case 15:
                ci.y yVar = (ci.y) this.f482b;
                yVar.f4856w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f4854r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, yVar.f4856w));
                yVar.f4853n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), yVar.f4856w));
                return;
            case 16:
                di.m mVar = (di.m) this.f482b;
                mVar.f7603o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di.g gVar = mVar.f7593f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f7603o0));
                FrameLayout frameLayout = mVar.f7608s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f7603o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f7603o0));
                gVar.getEmojiButton().setAlpha(mVar.f7603o0);
                mVar.f7606r.setAlpha((float) Math.pow(mVar.f7603o0, 16.0d));
                mVar.u(mVar.f7603o0);
                di.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f7603o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 17:
                di.y yVar2 = (di.y) this.f482b;
                yVar2.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar2.f8440a.invalidate();
                return;
            case 18:
                y2 y2Var = (y2) this.f482b;
                y2Var.getClass();
                y2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.i();
                return;
            case 19:
                ((b4) this.f482b).f6942b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                f4 f4Var = (f4) this.f482b;
                f4Var.getClass();
                f4Var.f7213o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f4Var.invalidate();
                return;
            case 21:
                ((u4) this.f482b).invalidate();
                return;
            case 22:
                u6 u6Var = (u6) this.f482b;
                u6Var.getClass();
                u6Var.f8252n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var.e();
                return;
            case 23:
                t6 t6Var = (t6) this.f482b;
                t6Var.getClass();
                t6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.invalidate();
                return;
            case 24:
                q7 q7Var = (q7) this.f482b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q7Var.E = floatValue8;
                p7 p7Var = q7Var.f8002a;
                p7Var.setScaleX(1.0f - floatValue8);
                p7Var.setScaleY(1.0f - q7Var.E);
                q7Var.invalidate();
                return;
            case 25:
                a9 a9Var = (a9) this.f482b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a9Var.f6915r = floatValue9;
                Utilities.Callback callback = a9Var.f6918x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue9, 1.0f, -1.0f)));
                }
                a9Var.f6909a.invalidate();
                return;
            case 26:
                ((ba) this.f482b).f6965x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                fa faVar = (fa) this.f482b;
                faVar.getClass();
                faVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                jg.h hVar = (jg.h) this.f482b;
                hVar.f13704f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f13705g.f13706a.invalidate();
                return;
            default:
                w4 w4Var = (w4) this.f482b;
                w4Var.getClass();
                w4Var.f14293a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.requestLayout();
                w4Var.invalidate();
                return;
        }
    }
}
