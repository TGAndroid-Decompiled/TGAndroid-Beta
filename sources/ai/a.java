package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.eo;
import org.telegram.ui.n01;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f620a;
    public final Object f621b;

    public a(Object obj, int i10) {
        this.f620a = i10;
        this.f621b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f620a) {
            case 0:
                c cVar = (c) this.f621b;
                cVar.getClass();
                cVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                cVar.invalidate();
                return;
            case 1:
                a0 a0Var = (a0) this.f621b;
                a0Var.O.f839e = AndroidUtilities.lerp(0.0f, 1.0f - a0Var.f625b0.f668d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a0Var.invalidate();
                return;
            case 2:
                ((o1) this.f621b).invalidate();
                return;
            case 3:
                s3 s3Var = (s3) this.f621b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s3Var.f1507c.setAlpha(floatValue);
                s3Var.f1503a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue));
                s3Var.invalidate();
                return;
            case 4:
                h1 h1Var = (h1) this.f621b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = h1Var.f1071e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(h1Var.f1072f, 1.0f, floatValue2) * 255.0f));
                    h1Var.h.invalidate();
                    return;
                }
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var2 = (h1) ((b) this.f621b).f661b;
                Drawable drawable2 = h1Var2.f1071e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, h1Var2.f1072f, floatValue3) * 255.0f));
                    h1Var2.h.invalidate();
                    return;
                }
                return;
            case 6:
                n2 n2Var = (n2) this.f621b;
                n2Var.getClass();
                n2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                x2 x2Var = (x2) this.f621b;
                x2Var.getClass();
                x2Var.f1898n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.invalidate();
                return;
            case 8:
                b6 b6Var = (b6) this.f621b;
                b6Var.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = b6Var.f711c;
                textViewArr[0].setAlpha(floatValue4);
                float f7 = 1.0f - floatValue4;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue4 * AndroidUtilities.dp(4.0f));
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f621b;
                n01 n01Var = profileStoriesView.h;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue5;
                n01Var.R = floatValue5;
                n01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 10:
                z6 z6Var = (z6) this.f621b;
                z6Var.f2011r = ((Float) z6Var.f2013w.getAnimatedValue()).floatValue();
                z6Var.invalidate();
                return;
            case 11:
                t7 t7Var = (t7) this.f621b;
                t7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.f1739e.setTranslationY(((-t7Var.d) + t7Var.getMeasuredHeight()) - t7Var.v);
                return;
            case 12:
                q9 q9Var = (q9) this.f621b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = q9Var.f1623a;
                p9 p9Var = (p9) arrayList.get(q9Var.d);
                p9Var.f1582n = floatValue6;
                p9Var.invalidate();
                int i10 = q9Var.f1625c;
                if (i10 != -1) {
                    p9 p9Var2 = (p9) arrayList.get(i10);
                    p9Var2.f1582n = 1.0f - floatValue6;
                    p9Var2.invalidate();
                    return;
                }
                return;
            case 13:
                xa xaVar = (xa) this.f621b;
                xaVar.getClass();
                xaVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar.invalidate();
                xaVar.requestLayout();
                xaVar.J.requestLayout();
                return;
            case 14:
                bi.z zVar = (bi.z) this.f621b;
                zVar.f3947w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.f3945r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, zVar.f3947w));
                zVar.f3944n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), zVar.f3947w));
                return;
            case 15:
                ci.m mVar = (ci.m) this.f621b;
                mVar.f5563o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci.g gVar = mVar.f5553f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f5563o0));
                FrameLayout frameLayout = mVar.f5568s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f5563o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f5563o0));
                gVar.getEmojiButton().setAlpha(mVar.f5563o0);
                mVar.f5566r.setAlpha((float) Math.pow(mVar.f5563o0, 16.0d));
                mVar.u(mVar.f5563o0);
                ci.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f5563o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 16:
                ci.y yVar = (ci.y) this.f621b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f6331a.invalidate();
                return;
            case 17:
                ci.w2 w2Var = (ci.w2) this.f621b;
                w2Var.getClass();
                w2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.i();
                return;
            case 18:
                ((ci.z3) this.f621b).f6414b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                ci.d4 d4Var = (ci.d4) this.f621b;
                d4Var.getClass();
                d4Var.f4919o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                d4Var.invalidate();
                return;
            case 20:
                ((ci.s4) this.f621b).invalidate();
                return;
            case 21:
                ci.u6 u6Var = (ci.u6) this.f621b;
                u6Var.getClass();
                u6Var.f6072n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var.e();
                return;
            case 22:
                ci.t6 t6Var = (ci.t6) this.f621b;
                t6Var.getClass();
                t6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.invalidate();
                return;
            case 23:
                ci.o7 o7Var = (ci.o7) this.f621b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.E = floatValue7;
                ci.n7 n7Var = o7Var.f5678a;
                n7Var.setScaleX(1.0f - floatValue7);
                n7Var.setScaleY(1.0f - o7Var.E);
                o7Var.invalidate();
                return;
            case 24:
                ci.x8 x8Var = (ci.x8) this.f621b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x8Var.f6315r = floatValue8;
                Utilities.Callback callback = x8Var.f6318x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue8, 1.0f, -1.0f)));
                }
                x8Var.f6309a.invalidate();
                return;
            case 25:
                ((ci.y9) this.f621b).f6367x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                ci.ca caVar = (ci.ca) this.f621b;
                caVar.getClass();
                caVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                ig.h hVar = (ig.h) this.f621b;
                hVar.f12204f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f12205g.f12206a.invalidate();
                return;
            case 28:
                ii.v4 v4Var = (ii.v4) this.f621b;
                v4Var.getClass();
                v4Var.f12750a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v4Var.requestLayout();
                v4Var.invalidate();
                return;
            default:
                ji.n nVar = (ji.n) this.f621b;
                eo eoVar = nVar.F;
                if (eoVar != null) {
                    eoVar.w9();
                    if (eoVar.J8 != null) {
                        eoVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                nVar.G.invalidate();
                return;
        }
    }
}
