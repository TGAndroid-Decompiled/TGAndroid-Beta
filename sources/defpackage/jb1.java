package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.q;
public final class jb1 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public jb1(r32 r32Var, q79 q79Var) {
        this.a = (byte) 26;
        this.b = r32Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 17:
                ((k52) this.b).a.P = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qb1 qb1Var = ((kb1) obj).d0;
                if (qb1Var.g0 == animator) {
                    qb1Var.g0 = null;
                    qb1Var.f.getEditText().setScrollY(qb1Var.c0);
                    return;
                }
                return;
            case 1:
                wf1 wf1Var = (wf1) ((y) obj).b;
                if (animator.equals(wf1Var.S)) {
                    wf1Var.S = null;
                    return;
                }
                return;
            case 2:
                wf1 wf1Var2 = (wf1) obj;
                if (animator.equals(wf1Var2.S)) {
                    wf1Var2.S = null;
                    return;
                }
                return;
            case 3:
                ((tg1) obj).I.setVisibility(8);
                return;
            case 4:
                wh1 wh1Var = (wh1) obj;
                gh1 gh1Var = wh1Var.n0;
                if (gh1Var != null) {
                    if (gh1Var.getParent() != null) {
                        ((ViewGroup) wh1Var.n0.getParent()).removeView(wh1Var.n0);
                    }
                    wh1Var.n0 = null;
                }
                wh1Var.p0 = null;
                super.onAnimationEnd(animator);
                return;
            case 5:
                dp1 dp1Var = (dp1) obj;
                if (dp1Var.a) {
                    dp1Var.d.setTranslationY(0.0f);
                }
                if (dp1Var.b) {
                    dp1Var.e.setTranslationY(0.0f);
                }
                if (dp1Var.f) {
                    dp1Var.h.setTranslationY(0.0f);
                }
                de0 de0Var = dp1Var.c;
                if (de0Var != null) {
                    de0Var.setTranslationY(0.0f);
                }
                dp1Var.n.W2[1] = null;
                return;
            case 6:
                nr1 nr1Var = (nr1) obj;
                nr1Var.setAnimatedTop(0);
                View view = nr1Var.v2;
                if (view != null && view.getVisibility() == 0) {
                    nr1Var.v2.setTranslationY(((1.0f - nr1Var.getTopViewEnterProgress()) * nr1Var.v2.getLayoutParams().height) + nr1Var.I2);
                }
                nr1Var.b8.M9 = null;
                return;
            case 7:
                gt1 gt1Var = (gt1) ((v5) obj).c;
                q qVar = gt1Var.c.R.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(false);
                    gt1Var.c.R.q3.m();
                    gt1Var.c.R.q3.setVisibility(4);
                    return;
                }
                return;
            case 8:
                gt1 gt1Var2 = (gt1) obj;
                it1 it1Var = gt1Var2.c;
                ArrayList arrayList = it1Var.R.F6;
                wb2 wb2Var = gt1Var2.b;
                arrayList.remove(wb2Var);
                View view2 = it1Var.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    it1Var.R.A0.invalidate();
                }
                wb2Var.setAlpha(1.0f);
                wb2Var.getTransitionParams().y0 = false;
                return;
            case 9:
                ((xx1) obj).f.c0.setVisibility(8);
                return;
            case 10:
                ((bz1) obj).g0 = 1.0f;
                return;
            case 11:
                ((n12) ((q02) obj).d).t1.setVisibility(8);
                return;
            case 12:
                ((t02) obj).d.u1.setVisibility(8);
                return;
            case 13:
                n12 n12Var = (n12) obj;
                n12Var.W2 = null;
                if (!n12Var.n3) {
                    if (n12Var.U2.getTag() == null && n12Var.N2 == 0 && !n12Var.Q2) {
                        n12Var.X2.setVisibility(4);
                    }
                    n12Var.f3.setVisibility(4);
                    return;
                }
                s7 s7Var = n12Var.b3;
                if (s7Var != null) {
                    s7Var.setVisibility(4);
                    return;
                }
                return;
            case 14:
                ((j22) obj).J.setVisibility(8);
                return;
            case 15:
                super.onAnimationEnd(animator);
                u32 u32Var = (u32) obj;
                u32Var.s.setVisibility(8);
                u32Var.n = (byte) 0;
                i32 i32Var = u32Var.r;
                i32Var.setAlpha(1.0f);
                i32Var.setScaleX(1.0f);
                i32Var.setScaleY(1.0f);
                i32Var.setTranslationX(0.0f);
                i32Var.invalidate();
                return;
            case 16:
                u32 u32Var2 = ((t32) obj).Y;
                if (u32Var2.I.getTag() == null) {
                    u32Var2.I.setVisibility(4);
                }
                u32Var2.J = null;
                return;
            case 17:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((k52) obj).a;
                if (animator.equals(chatAttachAlertPhotoLayout.P)) {
                    chatAttachAlertPhotoLayout.d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    return;
                }
                return;
            case 18:
                b62 b62Var = (b62) obj;
                c62 c62Var = b62Var.Q;
                c62Var.K = null;
                c62Var.L = false;
                b62Var.invalidate();
                return;
            case 19:
                z52 z52Var = (z52) obj;
                z52Var.b.R = true;
                z52Var.O.z.invalidate();
                return;
            case 20:
                ((t82) obj).w.setVisibility(4);
                return;
            case 21:
                l47 l47Var = (l47) obj;
                l47Var.j = false;
                l47Var.i = false;
                return;
            case 22:
                ad2 ad2Var = (ad2) obj;
                ad2Var.M = 0.0f;
                ad2Var.L = 1.0f;
                wq1 wq1Var = ad2Var.b0;
                if (wq1Var != null) {
                    wq1Var.invalidate();
                }
                ad2Var.U.invalidate();
                go1 go1Var = ad2Var.Z;
                if (go1Var != null) {
                    go1Var.run();
                    ad2Var.Z = null;
                    return;
                }
                return;
            case 23:
                wd2 wd2Var = (wd2) obj;
                wd2Var.setVisibility(8);
                ud2 ud2Var = wd2Var.b;
                if (ud2Var != null) {
                    wd2Var.removeView(ud2Var);
                    wd2Var.b = null;
                }
                wd2Var.e = null;
                return;
            case 24:
                oe2 oe2Var = (oe2) obj;
                tqb tqbVar = oe2Var.K1;
                if (tqbVar != null) {
                    if (tqbVar.getParent() != null) {
                        ((ViewGroup) oe2Var.K1.getParent()).removeView(oe2Var.K1);
                    }
                    oe2Var.K1 = null;
                }
                oe2Var.M1 = null;
                super.onAnimationEnd(animator);
                return;
            case 25:
                tqb tqbVar2 = (tqb) obj;
                tqbVar2.c = null;
                tqbVar2.a.setShader(null);
                tqbVar2.n = null;
                tqbVar2.r = null;
                tqbVar2.setImageDrawable(null);
                hl.B2(tqbVar2);
                return;
            case 26:
                r32 r32Var = (r32) obj;
                tk4 tk4Var = r32Var.b;
                tk4Var.setAlpha(1.0f);
                q79.w0(tk4Var);
                ((bg2) r32Var.d).c.removeView(tk4Var);
                return;
            case 27:
                CheckBox checkBox = (CheckBox) obj;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.y) {
                    checkBox.H = null;
                    return;
                }
                return;
            case 28:
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            default:
                jl2 jl2Var = (jl2) obj;
                jl2Var.l = 1.0f;
                kl2 kl2Var = jl2Var.p;
                if (kl2Var.n.contains(jl2Var)) {
                    jl2Var.c.K();
                    il2 il2Var = jl2Var.d;
                    if (il2Var != null) {
                        il2Var.pause();
                        jl2Var.d.release(null);
                        jl2Var.d = null;
                    }
                    TextureView textureView = jl2Var.e;
                    if (textureView != null) {
                        hl.B2(textureView);
                        jl2Var.e = null;
                    }
                    jl2Var.f = false;
                    kl2Var.n.remove(jl2Var);
                }
                kl2Var.invalidate();
                return;
        }
    }

    public jb1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
