package bh;

import ai.e1;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.a0;
import bi.j0;
import ci.a5;
import ci.b5;
import ci.h5;
import ci.kb;
import ci.l6;
import ci.lb;
import ci.q6;
import ci.qc;
import dh.q;
import dh.r;
import ei.c7;
import ei.d7;
import ei.f4;
import ei.g8;
import ei.k2;
import ei.n1;
import ei.p0;
import ei.s5;
import ei.v1;
import ei.w0;
import gi.h3;
import gi.n2;
import gi.y;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.nv0;
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final int f3314a;
    public final Object f3315b;

    public f(Object obj, int i3) {
        this.f3314a = i3;
        this.f3315b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a5 a5Var;
        boolean z10;
        switch (this.f3314a) {
            case 0:
                m mVar = (m) this.f3315b;
                mVar.getClass();
                mVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                a0 a0Var = (a0) this.f3315b;
                a0Var.getClass();
                a0Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a0Var.invalidate();
                return;
            case 2:
                ((j0) this.f3315b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 3:
                l6 l6Var = (l6) this.f3315b;
                l6Var.U2.f5380a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l6Var.P1();
                return;
            case 4:
                ((h5) this.f3315b).h.invalidate();
                return;
            case 5:
                b5 b5Var = (b5) this.f3315b;
                b5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b5Var.F = floatValue;
                if (floatValue >= 0.8f && (a5Var = b5Var.I) != null && (z10 = a5Var.f4825l) && z10) {
                    a5Var.f4825l = false;
                    a5Var.b();
                }
                b5Var.invalidate();
                return;
            case 6:
                View view = (View) this.f3315b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 7:
                q6 q6Var = (q6) this.f3315b;
                q6Var.getClass();
                q6Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.invalidate();
                return;
            case 8:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kb kbVar = ((lb) this.f3315b).f5508c;
                kbVar.setScaleX(floatValue2);
                kbVar.setScaleY(floatValue2);
                return;
            case 9:
                qc qcVar = (qc) this.f3315b;
                qcVar.getClass();
                qcVar.f5862d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qcVar.invalidate();
                return;
            case 10:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q qVar = ((r) this.f3315b).f9141b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue3);
                    return;
                }
                return;
            case 11:
                ei.a aVar = (ei.a) this.f3315b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 12:
                ei.q qVar2 = (ei.q) this.f3315b;
                qVar2.P.f10699e = g0.T1(0.0f, 1.0f - qVar2.f10785c0.f10830e0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar2.invalidate();
                return;
            case 13:
                ((w0) this.f3315b).invalidate();
                return;
            case 14:
                k2 k2Var = (k2) this.f3315b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.f11150c.setAlpha(floatValue4);
                k2Var.f11146a.setAlpha(g0.T1(0.0f, 0.5f, floatValue4));
                k2Var.invalidate();
                return;
            case 15:
                p0 p0Var = (p0) this.f3315b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = p0Var.f10744e;
                if (drawable != null) {
                    drawable.setAlpha((int) (g0.T1(p0Var.f10745f, 1.0f, floatValue5) * 255.0f));
                    p0Var.h.invalidate();
                    return;
                }
                return;
            case 16:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0 p0Var2 = (p0) ((e1) this.f3315b).f615b;
                Drawable drawable2 = p0Var2.f10744e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (g0.T1(1.0f, p0Var2.f10745f, floatValue6) * 255.0f));
                    p0Var2.h.invalidate();
                    return;
                }
                return;
            case 17:
                n1 n1Var = (n1) this.f3315b;
                n1Var.getClass();
                n1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 18:
                v1 v1Var = (v1) this.f3315b;
                v1Var.getClass();
                v1Var.f11115n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v1Var.invalidate();
                return;
            case 19:
                f4 f4Var = (f4) this.f3315b;
                f4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = f4Var.f10265c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-g0.L(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * g0.L(4.0f));
                return;
            case 20:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f3315b;
                nv0 nv0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.H = floatValue8;
                nv0Var.S = floatValue8;
                nv0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 21:
                ei.a5 a5Var2 = (ei.a5) this.f3315b;
                a5Var2.f10085r = ((Float) a5Var2.f10088x.getAnimatedValue()).floatValue();
                a5Var2.invalidate();
                return;
            case 22:
                s5 s5Var = (s5) this.f3315b;
                s5Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.f11000e.setTranslationY(((-s5Var.d) + s5Var.getMeasuredHeight()) - s5Var.f11005w);
                return;
            case 23:
                d7 d7Var = (d7) this.f3315b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = d7Var.f10202a;
                c7 c7Var = (c7) arrayList.get(d7Var.d);
                c7Var.f10158n = floatValue9;
                c7Var.invalidate();
                int i3 = d7Var.f10204c;
                if (i3 != -1) {
                    c7 c7Var2 = (c7) arrayList.get(i3);
                    c7Var2.f10158n = 1.0f - floatValue9;
                    c7Var2.invalidate();
                    return;
                }
                return;
            case 24:
                g8 g8Var = (g8) this.f3315b;
                g8Var.getClass();
                g8Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g8Var.invalidate();
                g8Var.requestLayout();
                g8Var.K.requestLayout();
                return;
            case 25:
                fi.q qVar3 = (fi.q) this.f3315b;
                qVar3.f11640x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qVar3.f11637r.setTranslationY(g0.W1(qVar3.f11640x, -g0.L(42.0f), 0));
                qVar3.f11636n.setTranslationY(g0.W1(qVar3.f11640x, 0, g0.L(42.0f)));
                return;
            case 26:
                gi.m mVar2 = (gi.m) this.f3315b;
                mVar2.f13154o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gi.g gVar = mVar2.f13144f;
                xs editText = gVar.getEditText();
                int L = g0.L(-26.0f);
                editText.setTranslationX(g0.W1(mVar2.f13154o0, mVar2.getEditTextLeft() + L, g0.L(2.0f)));
                FrameLayout frameLayout = mVar2.f13159s;
                frameLayout.setTranslationX(g0.W1(mVar2.f13154o0, -g0.L(8.0f), g0.L(2.0f)));
                frameLayout.setTranslationY(g0.W1(mVar2.f13154o0, -g0.L(8.0f), 0));
                gVar.getEmojiButton().setAlpha(mVar2.f13154o0);
                mVar2.f13157r.setAlpha((float) Math.pow(mVar2.f13154o0, 16.0d));
                mVar2.u(mVar2.f13154o0);
                gi.i iVar = mVar2.N;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar2.f13154o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar2.invalidate();
                return;
            case 27:
                y yVar = (y) this.f3315b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.f13875a.invalidate();
                return;
            case 28:
                n2 n2Var = (n2) this.f3315b;
                n2Var.getClass();
                n2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.i();
                return;
            default:
                ((h3) this.f3315b).f12871j1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
