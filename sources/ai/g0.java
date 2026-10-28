package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.h7;
import bi.m7;
import bi.qc;
import bi.r5;
import bi.rc;
import bi.s5;
import bi.yd;
import bi.z5;
import di.b6;
import di.i5;
import di.k7;
import di.l7;
import di.m2;
import di.m4;
import di.o8;
import fi.q2;
import fi.s3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.yz0;
public final class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1512a;
    public final Object f1513b;

    public g0(Object obj, int i10) {
        this.f1512a = i10;
        this.f1513b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        r5 r5Var;
        boolean z10;
        switch (this.f1512a) {
            case 0:
                o0 o0Var = (o0) this.f1513b;
                o0Var.getClass();
                o0Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.invalidate();
                return;
            case 1:
                ((z0) this.f1513b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh.w wVar = ((bh.x) this.f1513b).f4196b;
                if (wVar != null) {
                    wVar.setAlpha(floatValue);
                    return;
                }
                return;
            case 3:
                h7 h7Var = (h7) this.f1513b;
                h7Var.f4730b1.f4430a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h7Var.n2();
                return;
            case 4:
                ((z5) this.f1513b).h.invalidate();
                return;
            case 5:
                s5 s5Var = (s5) this.f1513b;
                s5Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.E = floatValue2;
                if (floatValue2 >= 0.8f && (r5Var = s5Var.H) != null && (z10 = r5Var.f5335l) && z10) {
                    r5Var.f5335l = false;
                    r5Var.b();
                }
                s5Var.invalidate();
                return;
            case 6:
                View view = (View) this.f1513b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 7:
                m7 m7Var = (m7) this.f1513b;
                m7Var.getClass();
                m7Var.f5096y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m7Var.invalidate();
                return;
            case 8:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc qcVar = ((rc) this.f1513b).f5373c;
                qcVar.setScaleX(floatValue3);
                qcVar.setScaleY(floatValue3);
                return;
            case 9:
                yd ydVar = (yd) this.f1513b;
                ydVar.getClass();
                ydVar.f5796c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ydVar.invalidate();
                return;
            case 10:
                di.a aVar = (di.a) this.f1513b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 11:
                di.q qVar = (di.q) this.f1513b;
                qVar.O.e = AndroidUtilities.lerp(0.0f, 1.0f - qVar.f8937b0.f9076d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar.invalidate();
                return;
            case 12:
                ((di.x0) this.f1513b).invalidate();
                return;
            case 13:
                m2 m2Var = (m2) this.f1513b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.f9343c.setAlpha(floatValue4);
                m2Var.f9339a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue4));
                m2Var.invalidate();
                return;
            case 14:
                di.q0 q0Var = (di.q0) this.f1513b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = q0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(q0Var.f8949f, 1.0f, floatValue5) * 255.0f));
                    q0Var.h.invalidate();
                    return;
                }
                return;
            case 15:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di.q0 q0Var2 = (di.q0) ((bh.b) this.f1513b).f3990b;
                Drawable drawable2 = q0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, q0Var2.f8949f, floatValue6) * 255.0f));
                    q0Var2.h.invalidate();
                    return;
                }
                return;
            case 16:
                di.o1 o1Var = (di.o1) this.f1513b;
                o1Var.getClass();
                o1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 17:
                di.w1 w1Var = (di.w1) this.f1513b;
                w1Var.getClass();
                w1Var.f9291n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w1Var.invalidate();
                return;
            case 18:
                m4 m4Var = (m4) this.f1513b;
                m4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = m4Var.f8777c;
                textViewArr[0].setAlpha(floatValue7);
                float f7 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue7 * AndroidUtilities.dp(4.0f));
                return;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1513b;
                yz0 yz0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                yz0Var.R = floatValue8;
                yz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 20:
                i5 i5Var = (i5) this.f1513b;
                i5Var.f8676r = ((Float) i5Var.f8678w.getAnimatedValue()).floatValue();
                i5Var.invalidate();
                return;
            case 21:
                b6 b6Var = (b6) this.f1513b;
                b6Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.e.setTranslationY(((-b6Var.d) + b6Var.getMeasuredHeight()) - b6Var.v);
                return;
            case 22:
                l7 l7Var = (l7) this.f1513b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = l7Var.f8761a;
                k7 k7Var = (k7) arrayList.get(l7Var.d);
                k7Var.f8724n = floatValue9;
                k7Var.invalidate();
                int i10 = l7Var.f8763c;
                if (i10 != -1) {
                    k7 k7Var2 = (k7) arrayList.get(i10);
                    k7Var2.f8724n = 1.0f - floatValue9;
                    k7Var2.invalidate();
                    return;
                }
                return;
            case 23:
                o8 o8Var = (o8) this.f1513b;
                o8Var.getClass();
                o8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.invalidate();
                o8Var.requestLayout();
                o8Var.J.requestLayout();
                return;
            case 24:
                ei.v vVar = (ei.v) this.f1513b;
                vVar.f10021w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.f10019r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.f10021w));
                vVar.f10018n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.f10021w));
                return;
            case 25:
                fi.m mVar = (fi.m) this.f1513b;
                mVar.f11208o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fi.g gVar = mVar.f11198f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f11208o0));
                FrameLayout frameLayout = mVar.f11213s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f11208o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f11208o0));
                gVar.getEmojiButton().setAlpha(mVar.f11208o0);
                mVar.f11211r.setAlpha((float) Math.pow(mVar.f11208o0, 16.0d));
                mVar.u(mVar.f11208o0);
                fi.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f11208o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 26:
                fi.y yVar = (fi.y) this.f1513b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f11976a.invalidate();
                return;
            case 27:
                q2 q2Var = (q2) this.f1513b;
                q2Var.getClass();
                q2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.i();
                return;
            default:
                ((s3) this.f1513b).f11580b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
