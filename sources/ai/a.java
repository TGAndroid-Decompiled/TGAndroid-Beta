package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.l01;
import org.telegram.ui.zn;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f618a;
    public final Object f619b;

    public a(Object obj, int i10) {
        this.f618a = i10;
        this.f619b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f618a) {
            case 0:
                c cVar = (c) this.f619b;
                cVar.getClass();
                cVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                cVar.invalidate();
                return;
            case 1:
                a0 a0Var = (a0) this.f619b;
                a0Var.O.f841e = AndroidUtilities.lerp(0.0f, 1.0f - a0Var.f623b0.f666d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a0Var.invalidate();
                return;
            case 2:
                ((o1) this.f619b).invalidate();
                return;
            case 3:
                s3 s3Var = (s3) this.f619b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s3Var.f1509c.setAlpha(floatValue);
                s3Var.f1505a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue));
                s3Var.invalidate();
                return;
            case 4:
                h1 h1Var = (h1) this.f619b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = h1Var.f1073e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(h1Var.f1074f, 1.0f, floatValue2) * 255.0f));
                    h1Var.h.invalidate();
                    return;
                }
                return;
            case 5:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var2 = (h1) ((b) this.f619b).f659b;
                Drawable drawable2 = h1Var2.f1073e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, h1Var2.f1074f, floatValue3) * 255.0f));
                    h1Var2.h.invalidate();
                    return;
                }
                return;
            case 6:
                n2 n2Var = (n2) this.f619b;
                n2Var.getClass();
                n2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 7:
                x2 x2Var = (x2) this.f619b;
                x2Var.getClass();
                x2Var.f1900n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.invalidate();
                return;
            case 8:
                b6 b6Var = (b6) this.f619b;
                b6Var.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = b6Var.f713c;
                textViewArr[0].setAlpha(floatValue4);
                float f7 = 1.0f - floatValue4;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue4 * AndroidUtilities.dp(4.0f));
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f619b;
                l01 l01Var = profileStoriesView.h;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue5;
                l01Var.R = floatValue5;
                l01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 10:
                z6 z6Var = (z6) this.f619b;
                z6Var.f2013r = ((Float) z6Var.f2015w.getAnimatedValue()).floatValue();
                z6Var.invalidate();
                return;
            case 11:
                t7 t7Var = (t7) this.f619b;
                t7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.f1741e.setTranslationY(((-t7Var.d) + t7Var.getMeasuredHeight()) - t7Var.v);
                return;
            case 12:
                q9 q9Var = (q9) this.f619b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = q9Var.f1625a;
                p9 p9Var = (p9) arrayList.get(q9Var.d);
                p9Var.f1584n = floatValue6;
                p9Var.invalidate();
                int i10 = q9Var.f1627c;
                if (i10 != -1) {
                    p9 p9Var2 = (p9) arrayList.get(i10);
                    p9Var2.f1584n = 1.0f - floatValue6;
                    p9Var2.invalidate();
                    return;
                }
                return;
            case 13:
                xa xaVar = (xa) this.f619b;
                xaVar.getClass();
                xaVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar.invalidate();
                xaVar.requestLayout();
                xaVar.J.requestLayout();
                return;
            case 14:
                bi.z zVar = (bi.z) this.f619b;
                zVar.f3948w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.f3946r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, zVar.f3948w));
                zVar.f3945n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), zVar.f3948w));
                return;
            case 15:
                ci.m mVar = (ci.m) this.f619b;
                mVar.f5565o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci.g gVar = mVar.f5555f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f5565o0));
                FrameLayout frameLayout = mVar.f5570s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f5565o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f5565o0));
                gVar.getEmojiButton().setAlpha(mVar.f5565o0);
                mVar.f5568r.setAlpha((float) Math.pow(mVar.f5565o0, 16.0d));
                mVar.u(mVar.f5565o0);
                ci.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f5565o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 16:
                ci.y yVar = (ci.y) this.f619b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f6333a.invalidate();
                return;
            case 17:
                ci.w2 w2Var = (ci.w2) this.f619b;
                w2Var.getClass();
                w2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.i();
                return;
            case 18:
                ((ci.z3) this.f619b).f6416b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 19:
                ci.d4 d4Var = (ci.d4) this.f619b;
                d4Var.getClass();
                d4Var.f4921o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                d4Var.invalidate();
                return;
            case 20:
                ((ci.s4) this.f619b).invalidate();
                return;
            case 21:
                ci.u6 u6Var = (ci.u6) this.f619b;
                u6Var.getClass();
                u6Var.f6074n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var.e();
                return;
            case 22:
                ci.t6 t6Var = (ci.t6) this.f619b;
                t6Var.getClass();
                t6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.invalidate();
                return;
            case 23:
                ci.o7 o7Var = (ci.o7) this.f619b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.E = floatValue7;
                ci.n7 n7Var = o7Var.f5680a;
                n7Var.setScaleX(1.0f - floatValue7);
                n7Var.setScaleY(1.0f - o7Var.E);
                o7Var.invalidate();
                return;
            case 24:
                ci.x8 x8Var = (ci.x8) this.f619b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x8Var.f6317r = floatValue8;
                Utilities.Callback callback = x8Var.f6320x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue8, 1.0f, -1.0f)));
                }
                x8Var.f6311a.invalidate();
                return;
            case 25:
                ((ci.y9) this.f619b).f6369x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 26:
                ci.ca caVar = (ci.ca) this.f619b;
                caVar.getClass();
                caVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                ig.h hVar = (ig.h) this.f619b;
                hVar.f12206f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.f12207g.f12208a.invalidate();
                return;
            case 28:
                ii.w4 w4Var = (ii.w4) this.f619b;
                w4Var.getClass();
                w4Var.f12772a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.requestLayout();
                w4Var.invalidate();
                return;
            default:
                ji.n nVar = (ji.n) this.f619b;
                zn znVar = nVar.F;
                if (znVar != null) {
                    znVar.w9();
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
