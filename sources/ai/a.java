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
import org.telegram.ui.yn;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f535a;
    public final Object f536b;

    public a(Object obj, int i10) {
        this.f535a = i10;
        this.f536b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f535a) {
            case 0:
                c cVar = (c) this.f536b;
                cVar.getClass();
                cVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                cVar.invalidate();
                return;
            case 1:
                a0 a0Var = (a0) this.f536b;
                a0Var.O.f715e = AndroidUtilities.lerp(0.0f, 1.0f - a0Var.f540b0.f599d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a0Var.invalidate();
                return;
            case 2:
                ((o1) this.f536b).invalidate();
                return;
            case 3:
                r3 r3Var = (r3) this.f536b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r3Var.f1439c.setAlpha(floatValue);
                r3Var.f1435a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue));
                r3Var.invalidate();
                return;
            case 4:
                h1 h1Var = (h1) this.f536b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = h1Var.f1008e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(h1Var.f1009f, 1.0f, floatValue2) * 255.0f));
                    h1Var.h.invalidate();
                    return;
                }
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var2 = (h1) ((b) this.f536b).f592b;
                Drawable drawable2 = h1Var2.f1008e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, h1Var2.f1009f, floatValue3) * 255.0f));
                    h1Var2.h.invalidate();
                    return;
                }
                return;
            case 6:
                m2 m2Var = (m2) this.f536b;
                m2Var.getClass();
                m2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                w2 w2Var = (w2) this.f536b;
                w2Var.getClass();
                w2Var.f1794n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                return;
            case 8:
                a6 a6Var = (a6) this.f536b;
                a6Var.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = a6Var.f570c;
                textViewArr[0].setAlpha(floatValue4);
                float f7 = 1.0f - floatValue4;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue4 * AndroidUtilities.dp(4.0f));
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f536b;
                f01 f01Var = profileStoriesView.h;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue5;
                f01Var.R = floatValue5;
                f01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 10:
                y6 y6Var = (y6) this.f536b;
                y6Var.f1907r = ((Float) y6Var.f1909w.getAnimatedValue()).floatValue();
                y6Var.invalidate();
                return;
            case 11:
                s7 s7Var = (s7) this.f536b;
                s7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.f1634e.setTranslationY(((-s7Var.d) + s7Var.getMeasuredHeight()) - s7Var.v);
                return;
            case 12:
                p9 p9Var = (p9) this.f536b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = p9Var.f1516a;
                o9 o9Var = (o9) arrayList.get(p9Var.d);
                o9Var.f1473n = floatValue6;
                o9Var.invalidate();
                int i10 = p9Var.f1518c;
                if (i10 != -1) {
                    o9 o9Var2 = (o9) arrayList.get(i10);
                    o9Var2.f1473n = 1.0f - floatValue6;
                    o9Var2.invalidate();
                    return;
                }
                return;
            case 13:
                wa waVar = (wa) this.f536b;
                waVar.getClass();
                waVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                waVar.invalidate();
                waVar.requestLayout();
                waVar.J.requestLayout();
                return;
            case 14:
                bi.z zVar = (bi.z) this.f536b;
                zVar.f3899w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.f3897r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, zVar.f3899w));
                zVar.f3896n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), zVar.f3899w));
                return;
            case 15:
                ci.m mVar = (ci.m) this.f536b;
                mVar.f5528o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci.g gVar = mVar.f5518f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f5528o0));
                FrameLayout frameLayout = mVar.f5533s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f5528o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f5528o0));
                gVar.getEmojiButton().setAlpha(mVar.f5528o0);
                mVar.f5531r.setAlpha((float) Math.pow(mVar.f5528o0, 16.0d));
                mVar.u(mVar.f5528o0);
                ci.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f5528o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 16:
                ci.y yVar = (ci.y) this.f536b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f6324a.invalidate();
                return;
            case 17:
                ci.x2 x2Var = (ci.x2) this.f536b;
                x2Var.getClass();
                x2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.i();
                return;
            case 18:
                ((ci.a4) this.f536b).f4692b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                ci.e4 e4Var = (ci.e4) this.f536b;
                e4Var.getClass();
                e4Var.f5001o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e4Var.invalidate();
                return;
            case 20:
                ((ci.t4) this.f536b).invalidate();
                return;
            case 21:
                ci.u6 u6Var = (ci.u6) this.f536b;
                u6Var.getClass();
                u6Var.f6070n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var.e();
                return;
            case 22:
                ci.t6 t6Var = (ci.t6) this.f536b;
                t6Var.getClass();
                t6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.invalidate();
                return;
            case 23:
                ci.o7 o7Var = (ci.o7) this.f536b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.E = floatValue7;
                ci.n7 n7Var = o7Var.f5656a;
                n7Var.setScaleX(1.0f - floatValue7);
                n7Var.setScaleY(1.0f - o7Var.E);
                o7Var.invalidate();
                return;
            case 24:
                ci.w8 w8Var = (ci.w8) this.f536b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.f6245r = floatValue8;
                Utilities.Callback callback = w8Var.f6248x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue8, 1.0f, -1.0f)));
                }
                w8Var.f6239a.invalidate();
                return;
            case 25:
                ((ci.x9) this.f536b).f6312x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                ci.ba baVar = (ci.ba) this.f536b;
                baVar.getClass();
                baVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                ig.h hVar = (ig.h) this.f536b;
                hVar.f12159f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f12160g.f12161a.invalidate();
                return;
            case 28:
                ii.w4 w4Var = (ii.w4) this.f536b;
                w4Var.getClass();
                w4Var.f12725a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.requestLayout();
                w4Var.invalidate();
                return;
            default:
                ji.n nVar = (ji.n) this.f536b;
                yn ynVar = nVar.F;
                if (ynVar != null) {
                    ynVar.q9();
                    if (ynVar.H8 != null) {
                        ynVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                nVar.G.invalidate();
                return;
        }
    }
}
