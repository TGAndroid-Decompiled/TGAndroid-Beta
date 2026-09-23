package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.f01;
import org.telegram.ui.xn;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f490a;
    public final Object f491b;

    public a(Object obj, int i10) {
        this.f490a = i10;
        this.f491b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f490a) {
            case 0:
                c cVar = (c) this.f491b;
                cVar.getClass();
                cVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                cVar.invalidate();
                return;
            case 1:
                a0 a0Var = (a0) this.f491b;
                a0Var.O.e = AndroidUtilities.lerp(0.0f, 1.0f - a0Var.f495b0.f550d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a0Var.invalidate();
                return;
            case 2:
                ((o1) this.f491b).invalidate();
                return;
            case 3:
                r3 r3Var = (r3) this.f491b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r3Var.f1331c.setAlpha(floatValue);
                r3Var.f1327a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue));
                r3Var.invalidate();
                return;
            case 4:
                h1 h1Var = (h1) this.f491b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = h1Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(h1Var.f930f, 1.0f, floatValue2) * 255.0f));
                    h1Var.h.invalidate();
                    return;
                }
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var2 = (h1) ((b) this.f491b).f543b;
                Drawable drawable2 = h1Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, h1Var2.f930f, floatValue3) * 255.0f));
                    h1Var2.h.invalidate();
                    return;
                }
                return;
            case 6:
                m2 m2Var = (m2) this.f491b;
                m2Var.getClass();
                m2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                w2 w2Var = (w2) this.f491b;
                w2Var.getClass();
                w2Var.f1646n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                return;
            case 8:
                a6 a6Var = (a6) this.f491b;
                a6Var.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = a6Var.f522c;
                textViewArr[0].setAlpha(floatValue4);
                float f7 = 1.0f - floatValue4;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue4 * AndroidUtilities.dp(4.0f));
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f491b;
                f01 f01Var = profileStoriesView.h;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue5;
                f01Var.R = floatValue5;
                f01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 10:
                y6 y6Var = (y6) this.f491b;
                y6Var.f1753r = ((Float) y6Var.f1755w.getAnimatedValue()).floatValue();
                y6Var.invalidate();
                return;
            case 11:
                s7 s7Var = (s7) this.f491b;
                s7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.e.setTranslationY(((-s7Var.d) + s7Var.getMeasuredHeight()) - s7Var.v);
                return;
            case 12:
                p9 p9Var = (p9) this.f491b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = p9Var.f1397a;
                o9 o9Var = (o9) arrayList.get(p9Var.d);
                o9Var.f1361n = floatValue6;
                o9Var.invalidate();
                int i10 = p9Var.f1399c;
                if (i10 != -1) {
                    o9 o9Var2 = (o9) arrayList.get(i10);
                    o9Var2.f1361n = 1.0f - floatValue6;
                    o9Var2.invalidate();
                    return;
                }
                return;
            case 13:
                wa waVar = (wa) this.f491b;
                waVar.getClass();
                waVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                waVar.invalidate();
                waVar.requestLayout();
                waVar.J.requestLayout();
                return;
            case 14:
                bi.z zVar = (bi.z) this.f491b;
                zVar.f3606w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.f3604r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, zVar.f3606w));
                zVar.f3603n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), zVar.f3606w));
                return;
            case 15:
                ci.m mVar = (ci.m) this.f491b;
                mVar.f5131o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci.g gVar = mVar.f5121f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f5131o0));
                FrameLayout frameLayout = mVar.f5136s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f5131o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f5131o0));
                gVar.getEmojiButton().setAlpha(mVar.f5131o0);
                mVar.f5134r.setAlpha((float) Math.pow(mVar.f5131o0, 16.0d));
                mVar.u(mVar.f5131o0);
                ci.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f5131o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 16:
                ci.y yVar = (ci.y) this.f491b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f5858a.invalidate();
                return;
            case 17:
                ci.x2 x2Var = (ci.x2) this.f491b;
                x2Var.getClass();
                x2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.i();
                return;
            case 18:
                ((ci.a4) this.f491b).f4339b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                ci.e4 e4Var = (ci.e4) this.f491b;
                e4Var.getClass();
                e4Var.f4618o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e4Var.invalidate();
                return;
            case 20:
                ((ci.t4) this.f491b).invalidate();
                return;
            case 21:
                ci.u6 u6Var = (ci.u6) this.f491b;
                u6Var.getClass();
                u6Var.f5612n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var.e();
                return;
            case 22:
                ci.t6 t6Var = (ci.t6) this.f491b;
                t6Var.getClass();
                t6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.invalidate();
                return;
            case 23:
                ci.o7 o7Var = (ci.o7) this.f491b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.E = floatValue7;
                ci.n7 n7Var = o7Var.f5243a;
                n7Var.setScaleX(1.0f - floatValue7);
                n7Var.setScaleY(1.0f - o7Var.E);
                o7Var.invalidate();
                return;
            case 24:
                ci.x8 x8Var = (ci.x8) this.f491b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x8Var.f5843r = floatValue8;
                Utilities.Callback callback = x8Var.f5846x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue8, 1.0f, -1.0f)));
                }
                x8Var.f5838a.invalidate();
                return;
            case 25:
                ((ci.y9) this.f491b).f5888x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                ci.ca caVar = (ci.ca) this.f491b;
                caVar.getClass();
                caVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                ig.h hVar = (ig.h) this.f491b;
                hVar.f11165f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f11166g.f11167a.invalidate();
                return;
            case 28:
                ii.v4 v4Var = (ii.v4) this.f491b;
                v4Var.getClass();
                v4Var.f11670a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v4Var.requestLayout();
                v4Var.invalidate();
                return;
            default:
                ji.n nVar = (ji.n) this.f491b;
                xn xnVar = nVar.F;
                if (xnVar != null) {
                    xnVar.r9();
                    if (xnVar.J8 != null) {
                        xnVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                nVar.G.invalidate();
                return;
        }
    }
}
