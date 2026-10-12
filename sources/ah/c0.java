package ah;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.a9;
import bi.b2;
import bi.b9;
import bi.e7;
import bi.ga;
import bi.h3;
import bi.k6;
import bi.l2;
import bi.m5;
import di.ba;
import di.d4;
import di.m7;
import di.n7;
import di.r6;
import di.s4;
import di.s6;
import di.w2;
import di.w8;
import di.x9;
import di.z3;
import java.util.ArrayList;
import ji.y4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f662a;
    public final Object f663b;

    public c0(Object obj, int i10) {
        this.f662a = i10;
        this.f663b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f662a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0 e0Var = ((f0) this.f663b).f720b;
                if (e0Var != null) {
                    e0Var.setAlpha(floatValue);
                    return;
                }
                return;
            case 1:
                bi.a aVar = (bi.a) this.f663b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 2:
                bi.u uVar = (bi.u) this.f663b;
                uVar.O.e = AndroidUtilities.lerp(0.0f, 1.0f - uVar.f3761b0.f3817d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                uVar.invalidate();
                return;
            case 3:
                ((bi.g1) this.f663b).invalidate();
                return;
            case 4:
                h3 h3Var = (h3) this.f663b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var.f3054c.setAlpha(floatValue2);
                h3Var.f3050a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue2));
                h3Var.invalidate();
                return;
            case 5:
                bi.z0 z0Var = (bi.z0) this.f663b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = z0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(z0Var.f4049f, 1.0f, floatValue3) * 255.0f));
                    z0Var.h.invalidate();
                    return;
                }
                return;
            case 6:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi.z0 z0Var2 = (bi.z0) ((b) this.f663b).f655b;
                Drawable drawable2 = z0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, z0Var2.f4049f, floatValue4) * 255.0f));
                    z0Var2.h.invalidate();
                    return;
                }
                return;
            case 7:
                b2 b2Var = (b2) this.f663b;
                b2Var.getClass();
                b2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                l2 l2Var = (l2) this.f663b;
                l2Var.getClass();
                l2Var.f3267n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.invalidate();
                return;
            case 9:
                m5 m5Var = (m5) this.f663b;
                m5Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = m5Var.f3311c;
                textViewArr[0].setAlpha(floatValue5);
                float f7 = 1.0f - floatValue5;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue5 * AndroidUtilities.dp(4.0f));
                return;
            case 10:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f663b;
                s01 s01Var = profileStoriesView.h;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue6;
                s01Var.R = floatValue6;
                s01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 11:
                k6 k6Var = (k6) this.f663b;
                k6Var.f3241r = ((Float) k6Var.f3243w.getAnimatedValue()).floatValue();
                k6Var.invalidate();
                return;
            case 12:
                e7 e7Var = (e7) this.f663b;
                e7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.e.setTranslationY(((-e7Var.d) + e7Var.getMeasuredHeight()) - e7Var.v);
                return;
            case 13:
                b9 b9Var = (b9) this.f663b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = b9Var.f2876a;
                a9 a9Var = (a9) arrayList.get(b9Var.d);
                a9Var.f2834n = floatValue7;
                a9Var.invalidate();
                int i10 = b9Var.f2878c;
                if (i10 != -1) {
                    a9 a9Var2 = (a9) arrayList.get(i10);
                    a9Var2.f2834n = 1.0f - floatValue7;
                    a9Var2.invalidate();
                    return;
                }
                return;
            case 14:
                ga gaVar = (ga) this.f663b;
                gaVar.getClass();
                gaVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.invalidate();
                gaVar.requestLayout();
                gaVar.J.requestLayout();
                return;
            case 15:
                ci.y yVar = (ci.y) this.f663b;
                yVar.f4803w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f4801r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, yVar.f4803w));
                yVar.f4800n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), yVar.f4803w));
                return;
            case 16:
                di.m mVar = (di.m) this.f663b;
                mVar.f7392o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di.g gVar = mVar.f7382f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f7392o0));
                FrameLayout frameLayout = mVar.f7397s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f7392o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f7392o0));
                gVar.getEmojiButton().setAlpha(mVar.f7392o0);
                mVar.f7395r.setAlpha((float) Math.pow(mVar.f7392o0, 16.0d));
                mVar.u(mVar.f7392o0);
                di.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f7392o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 17:
                di.y yVar2 = (di.y) this.f663b;
                yVar2.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar2.f8112a.invalidate();
                return;
            case 18:
                w2 w2Var = (w2) this.f663b;
                w2Var.getClass();
                w2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.i();
                return;
            case 19:
                ((z3) this.f663b).f8176b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 20:
                d4 d4Var = (d4) this.f663b;
                d4Var.getClass();
                d4Var.f6804o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                d4Var.invalidate();
                return;
            case 21:
                ((s4) this.f663b).invalidate();
                return;
            case 22:
                s6 s6Var = (s6) this.f663b;
                s6Var.getClass();
                s6Var.f7769n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var.e();
                return;
            case 23:
                r6 r6Var = (r6) this.f663b;
                r6Var.getClass();
                r6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.invalidate();
                return;
            case 24:
                n7 n7Var = (n7) this.f663b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.E = floatValue8;
                m7 m7Var = n7Var.f7459a;
                m7Var.setScaleX(1.0f - floatValue8);
                m7Var.setScaleY(1.0f - n7Var.E);
                n7Var.invalidate();
                return;
            case 25:
                w8 w8Var = (w8) this.f663b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.f8062r = floatValue9;
                Utilities.Callback callback = w8Var.f8065x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue9, 1.0f, -1.0f)));
                }
                w8Var.f8057a.invalidate();
                return;
            case 26:
                ((x9) this.f663b).f8102x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                ba baVar = (ba) this.f663b;
                baVar.getClass();
                baVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                jg.h hVar = (jg.h) this.f663b;
                hVar.f13077f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f13078g.f13079a.invalidate();
                return;
            default:
                y4 y4Var = (y4) this.f663b;
                y4Var.getClass();
                y4Var.f13671a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y4Var.requestLayout();
                y4Var.invalidate();
                return;
        }
    }
}
