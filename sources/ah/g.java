package ah;

import ai.f0;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.m8;
import ch.s;
import ci.b0;
import ci.j0;
import di.b5;
import di.db;
import di.eb;
import di.f6;
import di.jc;
import di.k6;
import di.u4;
import di.v4;
import fi.a2;
import fi.i5;
import fi.m0;
import fi.m1;
import fi.q4;
import fi.s6;
import fi.t0;
import fi.t6;
import fi.v3;
import fi.w7;
import hi.h3;
import hi.n2;
import hi.y;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.xv0;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f1071a;
    public final Object f1072b;

    public g(Object obj, int i7) {
        this.f1071a = i7;
        this.f1072b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        u4 u4Var;
        boolean z10;
        switch (this.f1071a) {
            case 0:
                o oVar = (o) this.f1072b;
                oVar.getClass();
                oVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                m8 m8Var = (m8) this.f1072b;
                m8Var.getClass();
                m8Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m8Var.k0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch.r rVar = ((s) this.f1072b).f5502b;
                if (rVar != null) {
                    rVar.setAlpha(floatValue);
                    return;
                }
                return;
            case 3:
                b0 b0Var = (b0) this.f1072b;
                b0Var.getClass();
                b0Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b0Var.invalidate();
                return;
            case 4:
                ((j0) this.f1072b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                f6 f6Var = (f6) this.f1072b;
                f6Var.X2.f8702a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.X1();
                return;
            case 6:
                ((b5) this.f1072b).h.invalidate();
                return;
            case 7:
                v4 v4Var = (v4) this.f1072b;
                v4Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v4Var.F = floatValue2;
                if (floatValue2 >= 0.8f && (u4Var = v4Var.I) != null && (z10 = u4Var.f9862l) && z10) {
                    u4Var.f9862l = false;
                    u4Var.b();
                }
                v4Var.invalidate();
                return;
            case 8:
                View view = (View) this.f1072b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 9:
                k6 k6Var = (k6) this.f1072b;
                k6Var.getClass();
                k6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.invalidate();
                return;
            case 10:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                db dbVar = ((eb) this.f1072b).f8716c;
                dbVar.setScaleX(floatValue3);
                dbVar.setScaleY(floatValue3);
                return;
            case 11:
                jc jcVar = (jc) this.f1072b;
                jcVar.getClass();
                jcVar.f9102d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jcVar.invalidate();
                return;
            case 12:
                fi.a aVar = (fi.a) this.f1072b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 13:
                fi.p pVar = (fi.p) this.f1072b;
                pVar.P.f11887e = g0.T1(0.0f, 1.0f - pVar.f12352c0.f12412e0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pVar.invalidate();
                return;
            case 14:
                ((t0) this.f1072b).invalidate();
                return;
            case 15:
                a2 a2Var = (a2) this.f1072b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a2Var.f12553c.setAlpha(floatValue4);
                a2Var.f12549a.setAlpha(g0.T1(0.0f, 0.5f, floatValue4));
                a2Var.invalidate();
                return;
            case 16:
                m0 m0Var = (m0) this.f1072b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = m0Var.f12239e;
                if (drawable != null) {
                    drawable.setAlpha((int) (g0.T1(m0Var.f12240f, 1.0f, floatValue5) * 255.0f));
                    m0Var.h.invalidate();
                    return;
                }
                return;
            case 17:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0 m0Var2 = (m0) ((f0) this.f1072b).f1189b;
                Drawable drawable2 = m0Var2.f12239e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (g0.T1(1.0f, m0Var2.f12240f, floatValue6) * 255.0f));
                    m0Var2.h.invalidate();
                    return;
                }
                return;
            case 18:
                m1 m1Var = (m1) this.f1072b;
                m1Var.getClass();
                m1Var.f12252n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m1Var.invalidate();
                return;
            case 19:
                v3 v3Var = (v3) this.f1072b;
                v3Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = v3Var.f12634c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-g0.L(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * g0.L(4.0f));
                return;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1072b;
                xv0 xv0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.H = floatValue8;
                xv0Var.S = floatValue8;
                xv0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 21:
                q4 q4Var = (q4) this.f1072b;
                q4Var.f12453r = ((Float) q4Var.f12456x.getAnimatedValue()).floatValue();
                q4Var.invalidate();
                return;
            case 22:
                i5 i5Var = (i5) this.f1072b;
                i5Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i5Var.f12096e.setTranslationY(((-i5Var.d) + i5Var.getMeasuredHeight()) - i5Var.f12101w);
                return;
            case 23:
                t6 t6Var = (t6) this.f1072b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = t6Var.f12579a;
                s6 s6Var = (s6) arrayList.get(t6Var.d);
                s6Var.f12523n = floatValue9;
                s6Var.invalidate();
                int i7 = t6Var.f12581c;
                if (i7 != -1) {
                    s6 s6Var2 = (s6) arrayList.get(i7);
                    s6Var2.f12523n = 1.0f - floatValue9;
                    s6Var2.invalidate();
                    return;
                }
                return;
            case 24:
                w7 w7Var = (w7) this.f1072b;
                w7Var.getClass();
                w7Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.invalidate();
                w7Var.requestLayout();
                w7Var.K.requestLayout();
                return;
            case 25:
                gi.q qVar = (gi.q) this.f1072b;
                qVar.f13668x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar.f13665r.setTranslationY(g0.W1(qVar.f13668x, -g0.L(42.0f), 0));
                qVar.f13664n.setTranslationY(g0.W1(qVar.f13668x, 0, g0.L(42.0f)));
                return;
            case 26:
                hi.m mVar = (hi.m) this.f1072b;
                mVar.f14981o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hi.g gVar = mVar.f14971f;
                ot editText = gVar.getEditText();
                int L = g0.L(-26.0f);
                editText.setTranslationX(g0.W1(mVar.f14981o0, mVar.getEditTextLeft() + L, g0.L(2.0f)));
                FrameLayout frameLayout = mVar.f14986s;
                frameLayout.setTranslationX(g0.W1(mVar.f14981o0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(mVar.f14981o0, -g0.L(8.0f), 0));
                gVar.getEmojiButton().setAlpha(mVar.f14981o0);
                mVar.f14984r.setAlpha((float) Math.pow(mVar.f14981o0, 16.0d));
                mVar.u(mVar.f14981o0);
                hi.i iVar = mVar.N;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f14981o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 27:
                y yVar = (y) this.f1072b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f15701a.invalidate();
                return;
            case 28:
                n2 n2Var = (n2) this.f1072b;
                n2Var.getClass();
                n2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.i();
                return;
            default:
                ((h3) this.f1072b).f14675m1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
