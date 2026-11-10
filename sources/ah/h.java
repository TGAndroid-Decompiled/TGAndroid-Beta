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
import di.b5;
import di.c7;
import di.d7;
import di.f4;
import di.g2;
import di.h8;
import di.n0;
import di.q1;
import di.u0;
import fi.j3;
import fi.m3;
import fi.p2;
import fi.y;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.zv0;
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
                k7Var.W2.f3939a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k7Var.O1();
                return;
            case 4:
                ((d6) this.f1078b).h.invalidate();
                return;
            case 5:
                w5 w5Var = (w5) this.f1078b;
                w5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.E = floatValue;
                if (floatValue >= 0.8f && (v5Var = w5Var.H) != null && (z9 = v5Var.f4881l) && z9) {
                    v5Var.f4881l = false;
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
                zdVar.f5201c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zdVar.invalidate();
                return;
            case 10:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch.q qVar = ((ch.r) this.f1078b).f6388b;
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
                pVar.O.f9449e = g0.T1(0.0f, 1.0f - pVar.f9479b0.f9537d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pVar.invalidate();
                return;
            case 13:
                ((u0) this.f1078b).invalidate();
                return;
            case 14:
                g2 g2Var = (g2) this.f1078b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.f9810c.setAlpha(floatValue4);
                g2Var.f9806a.setAlpha(g0.T1(0.0f, 0.5f, floatValue4));
                g2Var.invalidate();
                return;
            case 15:
                n0 n0Var = (n0) this.f1078b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = n0Var.f9375e;
                if (drawable != null) {
                    drawable.setAlpha((int) (g0.T1(n0Var.f9376f, 1.0f, floatValue5) * 255.0f));
                    n0Var.h.invalidate();
                    return;
                }
                return;
            case 16:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var2 = (n0) ((t5) this.f1078b).f4746b;
                Drawable drawable2 = n0Var2.f9375e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (g0.T1(1.0f, n0Var2.f9376f, floatValue6) * 255.0f));
                    n0Var2.h.invalidate();
                    return;
                }
                return;
            case 17:
                q1 q1Var = (q1) this.f1078b;
                q1Var.getClass();
                q1Var.f9573n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q1Var.invalidate();
                return;
            case 18:
                f4 f4Var = (f4) this.f1078b;
                f4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = f4Var.f8992c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-g0.L(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * g0.L(4.0f));
                return;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1078b;
                zv0 zv0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                zv0Var.R = floatValue8;
                zv0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 20:
                b5 b5Var = (b5) this.f1078b;
                b5Var.f8849r = ((Float) b5Var.f8852x.getAnimatedValue()).floatValue();
                b5Var.invalidate();
                return;
            case 21:
                di.t5 t5Var = (di.t5) this.f1078b;
                t5Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.f9792e.setTranslationY(((-t5Var.d) + t5Var.getMeasuredHeight()) - t5Var.f9797w);
                return;
            case 22:
                d7 d7Var = (d7) this.f1078b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = d7Var.f8933a;
                c7 c7Var = (c7) arrayList.get(d7Var.d);
                c7Var.f8885n = floatValue9;
                c7Var.invalidate();
                int i7 = d7Var.f8935c;
                if (i7 != -1) {
                    c7 c7Var2 = (c7) arrayList.get(i7);
                    c7Var2.f8885n = 1.0f - floatValue9;
                    c7Var2.invalidate();
                    return;
                }
                return;
            case 23:
                h8 h8Var = (h8) this.f1078b;
                h8Var.getClass();
                h8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h8Var.invalidate();
                h8Var.requestLayout();
                h8Var.J.requestLayout();
                return;
            case 24:
                ei.r rVar = (ei.r) this.f1078b;
                rVar.f10858x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rVar.f10855r.setTranslationY(g0.W1(rVar.f10858x, -g0.L(42.0f), 0));
                rVar.f10854n.setTranslationY(g0.W1(rVar.f10858x, 0, g0.L(42.0f)));
                return;
            case 25:
                fi.m mVar = (fi.m) this.f1078b;
                mVar.f12376n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fi.g gVar = mVar.f12367f;
                ys editText = gVar.getEditText();
                int L = g0.L(-26.0f);
                editText.setTranslationX(g0.W1(mVar.f12376n0, mVar.getEditTextLeft() + L, g0.L(2.0f)));
                FrameLayout frameLayout = mVar.f12382s;
                frameLayout.setTranslationX(g0.W1(mVar.f12376n0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(mVar.f12376n0, -g0.L(8.0f), 0));
                gVar.getEmojiButton().setAlpha(mVar.f12376n0);
                mVar.f12380r.setAlpha((float) Math.pow(mVar.f12376n0, 16.0d));
                mVar.u(mVar.f12376n0);
                fi.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f12376n0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 26:
                y yVar = (y) this.f1078b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f13107a.invalidate();
                return;
            case 27:
                p2 p2Var = (p2) this.f1078b;
                p2Var.getClass();
                p2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p2Var.i();
                return;
            case 28:
                ((j3) this.f1078b).l1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m3 m3Var = (m3) this.f1078b;
                m3Var.getClass();
                m3Var.f12452z0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                m3Var.invalidate();
                return;
        }
    }
}
