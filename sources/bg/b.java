package bg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import gh.a4;
import gh.b4;
import gh.ca;
import gh.da;
import gh.gb;
import gh.i4;
import gh.k5;
import gh.p5;
import ih.d8;
import ih.e4;
import ih.o5;
import ih.w4;
import ih.y6;
import ih.z6;
import java.util.ArrayList;
import kh.u3;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f1699a;
    public final Object f1700b;

    public b(Object obj, int i9) {
        this.f1699a = i9;
        this.f1700b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a4 a4Var;
        boolean z10;
        switch (this.f1699a) {
            case 0:
                c cVar = (c) this.f1700b;
                cVar.getClass();
                cVar.f1710b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                cVar.invalidate();
                return;
            case 1:
                fg.m mVar = (fg.m) this.f1700b;
                mVar.getClass();
                mVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                k5 k5Var = (k5) this.f1700b;
                k5Var.U0.f8488a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.T1();
                return;
            case 3:
                ((i4) this.f1700b).h.invalidate();
                return;
            case 4:
                b4 b4Var = (b4) this.f1700b;
                b4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.A = floatValue;
                if (floatValue >= 0.8f && (a4Var = b4Var.D) != null && (z10 = a4Var.f7787l) && z10) {
                    a4Var.f7787l = false;
                    a4Var.b();
                }
                b4Var.invalidate();
                return;
            case 5:
                View view = (View) this.f1700b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 6:
                p5 p5Var = (p5) this.f1700b;
                p5Var.getClass();
                p5Var.f8723y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.invalidate();
                return;
            case 7:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ca caVar = ((da) this.f1700b).f7988c;
                caVar.setScaleX(floatValue2);
                caVar.setScaleY(floatValue2);
                return;
            case 8:
                gb gbVar = (gb) this.f1700b;
                gbVar.getClass();
                gbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.invalidate();
                return;
            case 9:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg.u uVar = ((hg.v) this.f1700b).f10762b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue3);
                    return;
                }
                return;
            case 10:
                ih.a aVar = (ih.a) this.f1700b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 11:
                ih.q qVar = (ih.q) this.f1700b;
                qVar.K.f11719e = AndroidUtilities.lerp(0.0f, 1.0f - qVar.U.W, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar.invalidate();
                return;
            case 12:
                ((ih.w0) this.f1700b).invalidate();
                return;
            case 13:
                ih.h2 h2Var = (ih.h2) this.f1700b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2Var.f12276c.setAlpha(floatValue4);
                h2Var.f12272a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue4));
                h2Var.invalidate();
                return;
            case 14:
                ih.p0 p0Var = (ih.p0) this.f1700b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = p0Var.f11924e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(p0Var.f11925f, 1.0f, floatValue5) * 255.0f));
                    p0Var.h.invalidate();
                    return;
                }
                return;
            case 15:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ih.p0 p0Var2 = (ih.p0) ((ag.e) this.f1700b).f195b;
                Drawable drawable2 = p0Var2.f11924e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, p0Var2.f11925f, floatValue6) * 255.0f));
                    p0Var2.h.invalidate();
                    return;
                }
                return;
            case 16:
                ih.k1 k1Var = (ih.k1) this.f1700b;
                k1Var.getClass();
                k1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                ih.s1 s1Var = (ih.s1) this.f1700b;
                s1Var.getClass();
                s1Var.f12105n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                return;
            case 18:
                e4 e4Var = (e4) this.f1700b;
                e4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = e4Var.f11356c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * AndroidUtilities.dp(4.0f));
                return;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1700b;
                iz0 iz0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.C = floatValue8;
                iz0Var.N = floatValue8;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 20:
                w4 w4Var = (w4) this.f1700b;
                w4Var.f12298r = ((Float) w4Var.f12300w.getAnimatedValue()).floatValue();
                w4Var.invalidate();
                return;
            case 21:
                o5 o5Var = (o5) this.f1700b;
                o5Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.f11893e.setTranslationY(((-o5Var.d) + o5Var.getMeasuredHeight()) - o5Var.v);
                return;
            case 22:
                z6 z6Var = (z6) this.f1700b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = z6Var.f12376a;
                y6 y6Var = (y6) arrayList.get(z6Var.d);
                y6Var.f12352n = floatValue9;
                y6Var.invalidate();
                int i9 = z6Var.f12378c;
                if (i9 != -1) {
                    y6 y6Var2 = (y6) arrayList.get(i9);
                    y6Var2.f12352n = 1.0f - floatValue9;
                    y6Var2.invalidate();
                    return;
                }
                return;
            case 23:
                d8 d8Var = (d8) this.f1700b;
                d8Var.getClass();
                d8Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                d8Var.requestLayout();
                d8Var.F.requestLayout();
                return;
            case 24:
                jh.u uVar2 = (jh.u) this.f1700b;
                uVar2.f14386w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar2.f14384r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, uVar2.f14386w));
                uVar2.f14383n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), uVar2.f14386w));
                return;
            case 25:
                kh.m mVar2 = (kh.m) this.f1700b;
                mVar2.f15638k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kh.g gVar = mVar2.f15632f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar2.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar2.f15638k0));
                FrameLayout frameLayout = mVar2.f15647s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar2.f15638k0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar2.f15638k0));
                gVar.getEmojiButton().setAlpha(mVar2.f15638k0);
                mVar2.f15645r.setAlpha((float) Math.pow(mVar2.f15638k0, 16.0d));
                mVar2.u(mVar2.f15638k0);
                kh.i iVar = mVar2.I;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar2.f15638k0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar2.invalidate();
                return;
            case 26:
                kh.z zVar = (kh.z) this.f1700b;
                zVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.f16415a.invalidate();
                return;
            case 27:
                kh.s2 s2Var = (kh.s2) this.f1700b;
                s2Var.getClass();
                s2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.i();
                return;
            case 28:
                ((u3) this.f1700b).f16138b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                x3 x3Var = (x3) this.f1700b;
                x3Var.getClass();
                x3Var.f16355k0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x3Var.invalidate();
                return;
        }
    }
}
