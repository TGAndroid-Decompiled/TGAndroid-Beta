package ah;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.a6;
import ci.a0;
import ci.i0;
import di.ab;
import di.bb;
import di.c6;
import di.gc;
import di.h6;
import di.r4;
import di.s4;
import di.y4;
import fi.c2;
import fi.k5;
import fi.n0;
import fi.o1;
import fi.u0;
import fi.v6;
import fi.w6;
import fi.x3;
import fi.z7;
import hi.h3;
import hi.n2;
import hi.y;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.vv0;
public final class h implements ValueAnimator.AnimatorUpdateListener {
    public final int f1075a;
    public final Object f1076b;

    public h(Object obj, int i7) {
        this.f1075a = i7;
        this.f1076b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        r4 r4Var;
        boolean z10;
        switch (this.f1075a) {
            case 0:
                o oVar = (o) this.f1076b;
                oVar.getClass();
                oVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                a6 a6Var = (a6) this.f1076b;
                a6Var.getClass();
                a6Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a6Var.j0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch.q qVar = ((ch.r) this.f1076b).f5215b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue);
                    return;
                }
                return;
            case 3:
                a0 a0Var = (a0) this.f1076b;
                a0Var.getClass();
                a0Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.invalidate();
                return;
            case 4:
                ((i0) this.f1076b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                c6 c6Var = (c6) this.f1076b;
                c6Var.X2.f8249a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.P1();
                return;
            case 6:
                ((y4) this.f1076b).h.invalidate();
                return;
            case 7:
                s4 s4Var = (s4) this.f1076b;
                s4Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s4Var.F = floatValue2;
                if (floatValue2 >= 0.8f && (r4Var = s4Var.I) != null && (z10 = r4Var.f9334l) && z10) {
                    r4Var.f9334l = false;
                    r4Var.b();
                }
                s4Var.invalidate();
                return;
            case 8:
                View view = (View) this.f1076b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 9:
                h6 h6Var = (h6) this.f1076b;
                h6Var.getClass();
                h6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h6Var.invalidate();
                return;
            case 10:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ab abVar = ((bb) this.f1076b).f8263c;
                abVar.setScaleX(floatValue3);
                abVar.setScaleY(floatValue3);
                return;
            case 11:
                gc gcVar = (gc) this.f1076b;
                gcVar.getClass();
                gcVar.f8631d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gcVar.invalidate();
                return;
            case 12:
                fi.a aVar = (fi.a) this.f1076b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 13:
                fi.p pVar = (fi.p) this.f1076b;
                pVar.P.f11781e = g0.T1(0.0f, 1.0f - pVar.f12148c0.f12192e0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                pVar.invalidate();
                return;
            case 14:
                ((u0) this.f1076b).invalidate();
                return;
            case 15:
                c2 c2Var = (c2) this.f1076b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.f12379c.setAlpha(floatValue4);
                c2Var.f12375a.setAlpha(g0.T1(0.0f, 0.5f, floatValue4));
                c2Var.invalidate();
                return;
            case 16:
                n0 n0Var = (n0) this.f1076b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = n0Var.f12053e;
                if (drawable != null) {
                    drawable.setAlpha((int) (g0.T1(n0Var.f12054f, 1.0f, floatValue5) * 255.0f));
                    n0Var.h.invalidate();
                    return;
                }
                return;
            case 17:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0 n0Var2 = (n0) ((ai.i0) this.f1076b).f1249b;
                Drawable drawable2 = n0Var2.f12053e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (g0.T1(1.0f, n0Var2.f12054f, floatValue6) * 255.0f));
                    n0Var2.h.invalidate();
                    return;
                }
                return;
            case 18:
                o1 o1Var = (o1) this.f1076b;
                o1Var.getClass();
                o1Var.f12108n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.invalidate();
                return;
            case 19:
                x3 x3Var = (x3) this.f1076b;
                x3Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = x3Var.f12495c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-g0.L(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * g0.L(4.0f));
                return;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f1076b;
                vv0 vv0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.H = floatValue8;
                vv0Var.S = floatValue8;
                vv0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 21:
                fi.s4 s4Var2 = (fi.s4) this.f1076b;
                s4Var2.f12311r = ((Float) s4Var2.f12314x.getAnimatedValue()).floatValue();
                s4Var2.invalidate();
                return;
            case 22:
                k5 k5Var = (k5) this.f1076b;
                k5Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.f11930e.setTranslationY(((-k5Var.d) + k5Var.getMeasuredHeight()) - k5Var.f11935w);
                return;
            case 23:
                w6 w6Var = (w6) this.f1076b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = w6Var.f12466a;
                v6 v6Var = (v6) arrayList.get(w6Var.d);
                v6Var.f12425n = floatValue9;
                v6Var.invalidate();
                int i7 = w6Var.f12468c;
                if (i7 != -1) {
                    v6 v6Var2 = (v6) arrayList.get(i7);
                    v6Var2.f12425n = 1.0f - floatValue9;
                    v6Var2.invalidate();
                    return;
                }
                return;
            case 24:
                z7 z7Var = (z7) this.f1076b;
                z7Var.getClass();
                z7Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.K.requestLayout();
                return;
            case 25:
                gi.q qVar2 = (gi.q) this.f1076b;
                qVar2.f13361x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar2.f13358r.setTranslationY(g0.W1(qVar2.f13361x, -g0.L(42.0f), 0));
                qVar2.f13357n.setTranslationY(g0.W1(qVar2.f13361x, 0, g0.L(42.0f)));
                return;
            case 26:
                hi.m mVar = (hi.m) this.f1076b;
                mVar.f14633o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hi.g gVar = mVar.f14623f;
                ft editText = gVar.getEditText();
                int L = g0.L(-26.0f);
                editText.setTranslationX(g0.W1(mVar.f14633o0, mVar.getEditTextLeft() + L, g0.L(2.0f)));
                FrameLayout frameLayout = mVar.f14638s;
                frameLayout.setTranslationX(g0.W1(mVar.f14633o0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(mVar.f14633o0, -g0.L(8.0f), 0));
                gVar.getEmojiButton().setAlpha(mVar.f14633o0);
                mVar.f14636r.setAlpha((float) Math.pow(mVar.f14633o0, 16.0d));
                mVar.u(mVar.f14633o0);
                hi.i iVar = mVar.N;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.f14633o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                return;
            case 27:
                y yVar = (y) this.f1076b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f15400a.invalidate();
                return;
            case 28:
                n2 n2Var = (n2) this.f1076b;
                n2Var.getClass();
                n2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.i();
                return;
            default:
                ((h3) this.f1076b).f14368m1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
