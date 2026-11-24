package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class kh2 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public kh2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        qu1 qu1Var;
        byte b = this.a;
        float f = 0.0f;
        Object obj = this.b;
        switch (b) {
            case 0:
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 1:
                bm2 bm2Var = (bm2) obj;
                bm2Var.l = 1.0f;
                cm2 cm2Var = bm2Var.p;
                if (cm2Var.n.contains(bm2Var)) {
                    bm2Var.c.K();
                    am2 am2Var = bm2Var.d;
                    if (am2Var != null) {
                        am2Var.pause();
                        bm2Var.d.release(null);
                        bm2Var.d = null;
                    }
                    TextureView textureView = bm2Var.e;
                    if (textureView != null) {
                        gm.B2(textureView);
                        bm2Var.e = null;
                    }
                    bm2Var.f = false;
                    cm2Var.n.remove(bm2Var);
                }
                cm2Var.invalidate();
                return;
            case 2:
                vn2 vn2Var = (vn2) obj;
                vn2Var.h = 1.0f;
                vn2Var.invalidate();
                return;
            case 3:
                ty2 ty2Var = (ty2) obj;
                ty2Var.l = 1.0f;
                ty2Var.o = null;
                ty2Var.p = null;
                ty2Var.q = null;
                View view = ty2Var.G;
                if (view != null) {
                    if (ty2Var.h == 0 && ty2Var.F) {
                        view.setVisibility(8);
                    }
                    ty2Var.G.invalidate();
                }
                ty2Var.c = -1;
                return;
            case 4:
                ((CropAreaView) obj).d0 = null;
                return;
            case 5:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) obj;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 6:
                AnimatorSet[] animatorSetArr2 = ((h73) obj).n;
                if (animator.equals(animatorSetArr2[0])) {
                    animatorSetArr2[0] = null;
                    return;
                }
                return;
            case 7:
                sg3 sg3Var = (sg3) obj;
                ug3 ug3Var = sg3Var.n;
                ug3Var.h = null;
                boolean z2 = ug3Var.s;
                tg3[] tg3VarArr = ug3Var.f;
                if (z2) {
                    tg3VarArr[1].setVisibility(8);
                } else {
                    tg3 tg3Var = tg3VarArr[0];
                    tg3VarArr[0] = tg3VarArr[1];
                    tg3VarArr[1] = tg3Var;
                    tg3Var.setVisibility(8);
                    if (ug3Var.f[0].f == ug3Var.e.getFirstTabId()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ug3Var.x = z;
                    ug3Var.e.i(1.0f, ug3Var.f[0].f);
                }
                ug3Var.n = false;
                sg3Var.c = false;
                sg3Var.b = false;
                ug3.j0(ug3Var).setEnabled(true);
                ug3Var.e.setEnabled(true);
                return;
            case 8:
                super.onAnimationEnd(animator);
                ((hh3) obj).P.p = false;
                return;
            case 9:
                mi3 mi3Var = (mi3) obj;
                mi3Var.M.a5(mi3Var.L, 0.0f);
                return;
            case 10:
                nk3 nk3Var = (nk3) obj;
                boolean z3 = nk3Var.H0;
                if (z3) {
                    f = 1.0f;
                }
                nk3Var.I0 = f;
                if (!z3) {
                    nk3Var.F0.setVisibility(8);
                }
                View view2 = nk3Var.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 11:
                nk3 nk3Var2 = ((gk3) obj).u0;
                nk3Var2.i3 = null;
                if (!nk3Var2.m3) {
                    mk3[] mk3VarArr = nk3Var2.f0;
                    mk3 mk3Var = mk3VarArr[0];
                    mk3 mk3Var2 = mk3VarArr[1];
                    mk3VarArr[0] = mk3Var2;
                    mk3VarArr[1] = mk3Var;
                    nk3Var2.A0.h(1.0f, mk3Var2.h);
                    nk3Var2.p5(false);
                    nk3Var2.F5(-1, true);
                    nk3Var2.f0[0].d.getClass();
                    nk3Var2.f0[1].d.getClass();
                }
                nk3Var2.f0[1].setVisibility(8);
                nk3Var2.j5(true);
                nk3Var2.j3 = false;
                nk3Var2.p3 = false;
                nk3.w2(nk3Var2).setEnabled(true);
                nk3Var2.A0.setEnabled(true);
                nk3Var2.M2(nk3Var2.f0[0]);
                return;
            case 12:
                super.onAnimationEnd(animator);
                ((jk3) obj).setScrollEnabled(true);
                return;
            case 13:
                int i = sm3.L;
                ((sm3) ((rm3) obj).b).c();
                return;
            case 14:
                sm3 sm3Var = (sm3) obj;
                sm3Var.d = null;
                sm3Var.e();
                return;
            case 15:
                un3 un3Var = (un3) obj;
                if (un3Var.F0 <= 0.0f && (qu1Var = un3Var.E0) != null && un3Var.G0 == animator) {
                    qu1Var.r0(un3Var.H0);
                    un3Var.E0 = null;
                    return;
                }
                return;
            case 16:
                cv3 cv3Var = (cv3) obj;
                cv3Var.P = false;
                cv3Var.d.setTranslationY(0.0f);
                cv3Var.d.setAlpha(0.0f);
                cv3Var.c(0.0f);
                cv3Var.S = 0.0f;
                cv3Var.j();
                return;
            case 17:
                ((wv3) obj).a.I1 = false;
                return;
            case 18:
                super.onAnimationEnd(animator);
                ((ty3) obj).d = null;
                return;
            case 19:
                ((e34) obj).a0 = null;
                return;
            case 20:
                super.onAnimationEnd(animator);
                ((n24) obj).n = null;
                return;
            case 21:
                w34 w34Var = (w34) obj;
                if (w34Var.w == animator) {
                    w34Var.w = null;
                    return;
                }
                return;
            case 22:
                de4 de4Var = (de4) obj;
                FrameLayout frameLayout = de4Var.b;
                a91 a91Var = (a91) de4Var.c;
                if (a91Var.getParent() != null) {
                    frameLayout.removeView(a91Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((fb) de4Var.d);
                return;
            case 23:
                ((gg4) obj).a();
                return;
            case 24:
                ((tl4) obj).v = null;
                return;
            case 25:
                hn4 hn4Var = (hn4) obj;
                hn4Var.w = 1.0f;
                hn4Var.invalidate();
                return;
            case 26:
                super.onAnimationEnd(animator);
                ft4 ft4Var = ((at4) obj).b;
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                return;
            case 27:
                tt4 tt4Var = (tt4) ((cn0) obj).c;
                tt4Var.G.setVisibility(8);
                tt4Var.d.setVisibility(8);
                return;
            case 28:
                ((cw4) obj).b.v1.setVisibility(8);
                return;
            default:
                g95 g95Var = ((k85) obj).o;
                g95 g95Var2 = g95.s5;
                g95Var.R0();
                g95Var.b.invalidate();
                g95Var.J1.invalidate();
                if (g95Var.l2) {
                    g95Var.l2 = false;
                    g95Var.D0(true);
                    return;
                }
                return;
        }
    }
}
