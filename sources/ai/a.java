package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.m01;
import org.telegram.ui.zn;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f493a;
    public final Object f494b;

    public a(Object obj, int i10) {
        this.f493a = i10;
        this.f494b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f493a) {
            case 0:
                c cVar = (c) this.f494b;
                cVar.getClass();
                cVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                cVar.invalidate();
                return;
            case 1:
                a0 a0Var = (a0) this.f494b;
                a0Var.O.e = AndroidUtilities.lerp(0.0f, 1.0f - a0Var.f498b0.f546d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a0Var.invalidate();
                return;
            case 2:
                ((o1) this.f494b).invalidate();
                return;
            case 3:
                r3 r3Var = (r3) this.f494b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r3Var.f1330c.setAlpha(floatValue);
                r3Var.f1326a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue));
                r3Var.invalidate();
                return;
            case 4:
                h1 h1Var = (h1) this.f494b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = h1Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(h1Var.f932f, 1.0f, floatValue2) * 255.0f));
                    h1Var.h.invalidate();
                    return;
                }
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var2 = (h1) ((b) this.f494b).f539b;
                Drawable drawable2 = h1Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, h1Var2.f932f, floatValue3) * 255.0f));
                    h1Var2.h.invalidate();
                    return;
                }
                return;
            case 6:
                m2 m2Var = (m2) this.f494b;
                m2Var.getClass();
                m2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                w2 w2Var = (w2) this.f494b;
                w2Var.getClass();
                w2Var.f1645n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                return;
            case 8:
                b6 b6Var = (b6) this.f494b;
                b6Var.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = b6Var.f584c;
                textViewArr[0].setAlpha(floatValue4);
                float f7 = 1.0f - floatValue4;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue4 * AndroidUtilities.dp(4.0f));
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f494b;
                m01 m01Var = profileStoriesView.h;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue5;
                m01Var.R = floatValue5;
                m01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 10:
                y6 y6Var = (y6) this.f494b;
                y6Var.f1758r = ((Float) y6Var.f1760w.getAnimatedValue()).floatValue();
                y6Var.invalidate();
                return;
            case 11:
                r7 r7Var = (r7) this.f494b;
                r7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.e.setTranslationY(((-r7Var.d) + r7Var.getMeasuredHeight()) - r7Var.v);
                return;
            case 12:
                p9 p9Var = (p9) this.f494b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = p9Var.f1399a;
                o9 o9Var = (o9) arrayList.get(p9Var.d);
                o9Var.f1363n = floatValue6;
                o9Var.invalidate();
                int i10 = p9Var.f1401c;
                if (i10 != -1) {
                    o9 o9Var2 = (o9) arrayList.get(i10);
                    o9Var2.f1363n = 1.0f - floatValue6;
                    o9Var2.invalidate();
                    return;
                }
                return;
            case 13:
                wa waVar = (wa) this.f494b;
                waVar.getClass();
                waVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                waVar.invalidate();
                waVar.requestLayout();
                waVar.J.requestLayout();
                return;
            case 14:
                bi.z zVar = (bi.z) this.f494b;
                zVar.f3614w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.f3612r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, zVar.f3614w));
                zVar.f3611n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), zVar.f3614w));
                return;
            case 15:
                ci.m mVar = (ci.m) this.f494b;
                mVar.f5005o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci.g gVar = mVar.f4995f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f5005o0));
                FrameLayout frameLayout = mVar.f5010s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f5005o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f5005o0));
                gVar.getEmojiButton().setAlpha(mVar.f5005o0);
                mVar.f5008r.setAlpha((float) Math.pow(mVar.f5005o0, 16.0d));
                mVar.u(mVar.f5005o0);
                ci.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f5005o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 16:
                ci.y yVar = (ci.y) this.f494b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f5799a.invalidate();
                return;
            case 17:
                ci.y2 y2Var = (ci.y2) this.f494b;
                y2Var.getClass();
                y2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.i();
                return;
            case 18:
                ((ci.b4) this.f494b).f4388b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                ci.f4 f4Var = (ci.f4) this.f494b;
                f4Var.getClass();
                f4Var.f4641o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f4Var.invalidate();
                return;
            case 20:
                ((ci.u4) this.f494b).invalidate();
                return;
            case 21:
                ci.v6 v6Var = (ci.v6) this.f494b;
                v6Var.getClass();
                v6Var.f5660n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v6Var.e();
                return;
            case 22:
                ci.u6 u6Var = (ci.u6) this.f494b;
                u6Var.getClass();
                u6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var.invalidate();
                return;
            case 23:
                ci.q7 q7Var = (ci.q7) this.f494b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q7Var.E = floatValue7;
                ci.p7 p7Var = q7Var.f5349a;
                p7Var.setScaleX(1.0f - floatValue7);
                p7Var.setScaleY(1.0f - q7Var.E);
                q7Var.invalidate();
                return;
            case 24:
                ci.a9 a9Var = (ci.a9) this.f494b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a9Var.f4361r = floatValue8;
                Utilities.Callback callback = a9Var.f4364x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue8, 1.0f, -1.0f)));
                }
                a9Var.f4356a.invalidate();
                return;
            case 25:
                ((ci.ba) this.f494b).f4409x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                ci.fa faVar = (ci.fa) this.f494b;
                faVar.getClass();
                faVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                ig.h hVar = (ig.h) this.f494b;
                hVar.f11178f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f11179g.f11180a.invalidate();
                return;
            case 28:
                ii.u4 u4Var = (ii.u4) this.f494b;
                u4Var.getClass();
                u4Var.f11663a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u4Var.requestLayout();
                u4Var.invalidate();
                return;
            default:
                ji.n nVar = (ji.n) this.f494b;
                zn znVar = nVar.F;
                if (znVar != null) {
                    znVar.r9();
                    if (znVar.J8 != null) {
                        znVar.fragmentView.invalidate();
                        return;
                    }
                    return;
                }
                nVar.G.invalidate();
                return;
        }
    }
}
