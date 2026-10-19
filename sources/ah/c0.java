package ah;

import ai.ad;
import ai.e6;
import ai.ie;
import ai.l7;
import ai.q7;
import ai.w5;
import ai.x5;
import ai.zc;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.c6;
import ci.j5;
import ci.m4;
import ci.m7;
import ci.n2;
import ci.p1;
import ci.r8;
import ci.x1;
import ei.k6;
import ei.l4;
import ei.s2;
import ei.u3;
import ei.x3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.oz0;
public final class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f666a;
    public final Object f667b;

    public c0(Object obj, int i10) {
        this.f666a = i10;
        this.f667b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        w5 w5Var;
        boolean z10;
        switch (this.f666a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0 e0Var = ((f0) this.f667b).f724b;
                if (e0Var != null) {
                    e0Var.setAlpha(floatValue);
                    return;
                }
                return;
            case 1:
                l7 l7Var = (l7) this.f667b;
                l7Var.f1721b1.f1423a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l7Var.o2();
                return;
            case 2:
                ((e6) this.f667b).h.invalidate();
                return;
            case 3:
                x5 x5Var = (x5) this.f667b;
                x5Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var.E = floatValue2;
                if (floatValue2 >= 0.8f && (w5Var = x5Var.H) != null && (z10 = w5Var.f2359l) && z10) {
                    w5Var.f2359l = false;
                    w5Var.b();
                }
                x5Var.invalidate();
                return;
            case 4:
                View view = (View) this.f667b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 5:
                q7 q7Var = (q7) this.f667b;
                q7Var.getClass();
                q7Var.f2073y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q7Var.invalidate();
                return;
            case 6:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zc zcVar = ((ad) this.f667b).f988c;
                zcVar.setScaleX(floatValue3);
                zcVar.setScaleY(floatValue3);
                return;
            case 7:
                ie ieVar = (ie) this.f667b;
                ieVar.getClass();
                ieVar.f1521c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ieVar.invalidate();
                return;
            case 8:
                ci.a aVar = (ci.a) this.f667b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 9:
                ci.q qVar = (ci.q) this.f667b;
                qVar.O.e = AndroidUtilities.lerp(0.0f, 1.0f - qVar.f5739b0.f5872d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar.invalidate();
                return;
            case 10:
                ((ci.x0) this.f667b).invalidate();
                return;
            case 11:
                n2 n2Var = (n2) this.f667b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.f6133c.setAlpha(floatValue4);
                n2Var.f6129a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue4));
                n2Var.invalidate();
                return;
            case 12:
                ci.q0 q0Var = (ci.q0) this.f667b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = q0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(q0Var.f5751f, 1.0f, floatValue5) * 255.0f));
                    q0Var.h.invalidate();
                    return;
                }
                return;
            case 13:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci.q0 q0Var2 = (ci.q0) ((b) this.f667b).f659b;
                Drawable drawable2 = q0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, q0Var2.f5751f, floatValue6) * 255.0f));
                    q0Var2.h.invalidate();
                    return;
                }
                return;
            case 14:
                p1 p1Var = (p1) this.f667b;
                p1Var.getClass();
                p1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 15:
                x1 x1Var = (x1) this.f667b;
                x1Var.getClass();
                x1Var.f6150n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1Var.invalidate();
                return;
            case 16:
                m4 m4Var = (m4) this.f667b;
                m4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = m4Var.f5610c;
                textViewArr[0].setAlpha(floatValue7);
                float f7 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue7 * AndroidUtilities.dp(4.0f));
                return;
            case 17:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f667b;
                oz0 oz0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                oz0Var.R = floatValue8;
                oz0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 18:
                j5 j5Var = (j5) this.f667b;
                j5Var.f5537r = ((Float) j5Var.f5539w.getAnimatedValue()).floatValue();
                j5Var.invalidate();
                return;
            case 19:
                c6 c6Var = (c6) this.f667b;
                c6Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.e.setTranslationY(((-c6Var.d) + c6Var.getMeasuredHeight()) - c6Var.v);
                return;
            case 20:
                m7 m7Var = (m7) this.f667b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = m7Var.f5620a;
                ci.l7 l7Var2 = (ci.l7) arrayList.get(m7Var.d);
                l7Var2.f5593n = floatValue9;
                l7Var2.invalidate();
                int i10 = m7Var.f5622c;
                if (i10 != -1) {
                    ci.l7 l7Var3 = (ci.l7) arrayList.get(i10);
                    l7Var3.f5593n = 1.0f - floatValue9;
                    l7Var3.invalidate();
                    return;
                }
                return;
            case 21:
                r8 r8Var = (r8) this.f667b;
                r8Var.getClass();
                r8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.invalidate();
                r8Var.requestLayout();
                r8Var.J.requestLayout();
                return;
            case 22:
                di.v vVar = (di.v) this.f667b;
                vVar.f8075w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.f8073r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.f8075w));
                vVar.f8072n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.f8075w));
                return;
            case 23:
                ei.m mVar = (ei.m) this.f667b;
                mVar.f9409o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei.g gVar = mVar.f9399f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.f9409o0));
                FrameLayout frameLayout = mVar.f9414s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.f9409o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.f9409o0));
                gVar.getEmojiButton().setAlpha(mVar.f9409o0);
                mVar.f9412r.setAlpha((float) Math.pow(mVar.f9409o0, 16.0d));
                mVar.u(mVar.f9409o0);
                ei.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f9409o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 24:
                ei.y yVar = (ei.y) this.f667b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f10119a.invalidate();
                return;
            case 25:
                s2 s2Var = (s2) this.f667b;
                s2Var.getClass();
                s2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.i();
                return;
            case 26:
                ((u3) this.f667b).f9885b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 27:
                x3 x3Var = (x3) this.f667b;
                x3Var.getClass();
                x3Var.f10083o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x3Var.invalidate();
                return;
            case 28:
                ((l4) this.f667b).invalidate();
                return;
            default:
                k6 k6Var = (k6) this.f667b;
                k6Var.getClass();
                k6Var.f9318n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.e();
                return;
        }
    }
}
