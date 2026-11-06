package ah;

import ai.i0;
import ai.s0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.d6;
import bi.k7;
import bi.p7;
import bi.rc;
import bi.sc;
import bi.t5;
import bi.v5;
import bi.w5;
import bi.zd;
import di.a5;
import di.b7;
import di.c7;
import di.e4;
import di.g2;
import di.g8;
import di.n0;
import di.q1;
import di.s5;
import di.u0;
import fi.j3;
import fi.m3;
import fi.p2;
import fi.y;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.wv0;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f1077a;
    public final Object f1078b;

    public h(Object obj, int i7) {
        this.f1077a = i7;
        this.f1078b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        v5 v5Var;
        boolean z9;
        switch (this.f1077a) {
            case 0:
                o oVar = (o) this.f1078b;
                oVar.getClass();
                oVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                i0 i0Var = (i0) this.f1078b;
                i0Var.getClass();
                i0Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i0Var.invalidate();
                return;
            case 2:
                ((s0) this.f1078b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                k7 k7Var = (k7) this.f1078b;
                k7Var.T2.f3942a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k7Var.P1();
                return;
            case 4:
                ((d6) this.f1078b).h.invalidate();
                return;
            case 5:
                w5 w5Var = (w5) this.f1078b;
                w5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.E = floatValue;
                if (floatValue >= 0.8f && (v5Var = w5Var.H) != null && (z9 = v5Var.f4882l) && z9) {
                    v5Var.f4882l = false;
                    v5Var.b();
                }
                w5Var.invalidate();
                return;
            case 6:
                View view = (View) this.f1078b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 7:
                p7 p7Var = (p7) this.f1078b;
                p7Var.getClass();
                p7Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                return;
            case 8:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rc rcVar = ((sc) this.f1078b).f4722c;
                rcVar.setScaleX(floatValue2);
                rcVar.setScaleY(floatValue2);
                return;
            case 9:
                zd zdVar = (zd) this.f1078b;
                zdVar.getClass();
                zdVar.f5198c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zdVar.invalidate();
                return;
            case 10:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch.q qVar = ((ch.r) this.f1078b).f6385b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue3);
                    return;
                }
                return;
            case 11:
                di.a aVar = (di.a) this.f1078b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 12:
                di.p pVar = (di.p) this.f1078b;
                pVar.O.f9411e = g0.T1(0.0f, 1.0f - pVar.f9485b0.f9591d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pVar.invalidate();
                return;
            case 13:
                ((u0) this.f1078b).invalidate();
                return;
            case 14:
                g2 g2Var = (g2) this.f1078b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.f9813c.setAlpha(floatValue4);
                g2Var.f9809a.setAlpha(g0.T1(0.0f, 0.5f, floatValue4));
                g2Var.invalidate();
                return;
            case 15:
                n0 n0Var = (n0) this.f1078b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = n0Var.f9379e;
                if (drawable != null) {
                    drawable.setAlpha((int) (g0.T1(n0Var.f9380f, 1.0f, floatValue5) * 255.0f));
                    n0Var.h.invalidate();
                    return;
                }
                return;
            case 16:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var2 = (n0) ((t5) this.f1078b).f4748b;
                Drawable drawable2 = n0Var2.f9379e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (g0.T1(1.0f, n0Var2.f9380f, floatValue6) * 255.0f));
                    n0Var2.h.invalidate();
                    return;
                }
                return;
            case 17:
                q1 q1Var = (q1) this.f1078b;
                q1Var.getClass();
                q1Var.f9627n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 18:
                e4 e4Var = (e4) this.f1078b;
                e4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = e4Var.f8961c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-g0.L(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * g0.L(4.0f));
                return;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1078b;
                wv0 wv0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                wv0Var.R = floatValue8;
                wv0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 20:
                a5 a5Var = (a5) this.f1078b;
                a5Var.f8810r = ((Float) a5Var.f8813x.getAnimatedValue()).floatValue();
                a5Var.invalidate();
                return;
            case 21:
                s5 s5Var = (s5) this.f1078b;
                s5Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.f9758e.setTranslationY(((-s5Var.d) + s5Var.getMeasuredHeight()) - s5Var.f9763w);
                return;
            case 22:
                c7 c7Var = (c7) this.f1078b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = c7Var.f8874a;
                b7 b7Var = (b7) arrayList.get(c7Var.d);
                b7Var.f8854n = floatValue9;
                b7Var.invalidate();
                int i7 = c7Var.f8876c;
                if (i7 != -1) {
                    b7 b7Var2 = (b7) arrayList.get(i7);
                    b7Var2.f8854n = 1.0f - floatValue9;
                    b7Var2.invalidate();
                    return;
                }
                return;
            case 23:
                g8 g8Var = (g8) this.f1078b;
                g8Var.getClass();
                g8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g8Var.invalidate();
                g8Var.requestLayout();
                g8Var.J.requestLayout();
                return;
            case 24:
                ei.r rVar = (ei.r) this.f1078b;
                rVar.f10853x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f10850r.setTranslationY(g0.W1(rVar.f10853x, -g0.L(42.0f), 0));
                rVar.f10849n.setTranslationY(g0.W1(rVar.f10853x, 0, g0.L(42.0f)));
                return;
            case 25:
                fi.m mVar = (fi.m) this.f1078b;
                mVar.f12374n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fi.g gVar = mVar.f12365f;
                ys editText = gVar.getEditText();
                int L = g0.L(-26.0f);
                editText.setTranslationX(g0.W1(mVar.f12374n0, mVar.getEditTextLeft() + L, g0.L(2.0f)));
                FrameLayout frameLayout = mVar.f12380s;
                frameLayout.setTranslationX(g0.W1(mVar.f12374n0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(mVar.f12374n0, -g0.L(8.0f), 0));
                gVar.getEmojiButton().setAlpha(mVar.f12374n0);
                mVar.f12378r.setAlpha((float) Math.pow(mVar.f12374n0, 16.0d));
                mVar.u(mVar.f12374n0);
                fi.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f12374n0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 26:
                y yVar = (y) this.f1078b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f13105a.invalidate();
                return;
            case 27:
                p2 p2Var = (p2) this.f1078b;
                p2Var.getClass();
                p2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.i();
                return;
            case 28:
                ((j3) this.f1078b).f12221i1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m3 m3Var = (m3) this.f1078b;
                m3Var.getClass();
                m3Var.f12450z0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m3Var.invalidate();
                return;
        }
    }
}
