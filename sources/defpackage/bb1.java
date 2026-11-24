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
public final class bb1 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public bb1(a32 a32Var, d49 d49Var) {
        this.a = (byte) 26;
        this.b = a32Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 17:
                ((u42) this.b).a.P = null;
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
                ib1 ib1Var = ((cb1) obj).d0;
                if (ib1Var.g0 == animator) {
                    ib1Var.g0 = null;
                    ib1Var.f.getEditText().setScrollY(ib1Var.c0);
                    return;
                }
                return;
            case 1:
                nf1 nf1Var = (nf1) ((y) obj).b;
                if (animator.equals(nf1Var.S)) {
                    nf1Var.S = null;
                    return;
                }
                return;
            case 2:
                nf1 nf1Var2 = (nf1) obj;
                if (animator.equals(nf1Var2.S)) {
                    nf1Var2.S = null;
                    return;
                }
                return;
            case 3:
                ((kg1) obj).I.setVisibility(8);
                return;
            case 4:
                nh1 nh1Var = (nh1) obj;
                xg1 xg1Var = nh1Var.n0;
                if (xg1Var != null) {
                    if (xg1Var.getParent() != null) {
                        ((ViewGroup) nh1Var.n0.getParent()).removeView(nh1Var.n0);
                    }
                    nh1Var.n0 = null;
                }
                nh1Var.p0 = null;
                super.onAnimationEnd(animator);
                return;
            case 5:
                po1 po1Var = (po1) obj;
                if (po1Var.a) {
                    po1Var.d.setTranslationY(0.0f);
                }
                if (po1Var.b) {
                    po1Var.e.setTranslationY(0.0f);
                }
                if (po1Var.f) {
                    po1Var.h.setTranslationY(0.0f);
                }
                be0 be0Var = po1Var.c;
                if (be0Var != null) {
                    be0Var.setTranslationY(0.0f);
                }
                po1Var.n.W2[1] = null;
                return;
            case 6:
                ar1 ar1Var = (ar1) obj;
                ar1Var.setAnimatedTop(0);
                View view = ar1Var.w2;
                if (view != null && view.getVisibility() == 0) {
                    ar1Var.w2.setTranslationY(((1.0f - ar1Var.getTopViewEnterProgress()) * ar1Var.w2.getLayoutParams().height) + ar1Var.J2);
                }
                ar1Var.v7.M9 = null;
                return;
            case 7:
                ts1 ts1Var = (ts1) ((u5) obj).c;
                q qVar = ts1Var.c.R.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(false);
                    ts1Var.c.R.q3.m();
                    ts1Var.c.R.q3.setVisibility(4);
                    return;
                }
                return;
            case 8:
                ts1 ts1Var2 = (ts1) obj;
                vs1 vs1Var = ts1Var2.c;
                ArrayList arrayList = vs1Var.R.F6;
                gb2 gb2Var = ts1Var2.b;
                arrayList.remove(gb2Var);
                View view2 = vs1Var.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    vs1Var.R.A0.invalidate();
                }
                gb2Var.setAlpha(1.0f);
                gb2Var.getTransitionParams().y0 = false;
                return;
            case 9:
                ((hx1) obj).f.c0.setVisibility(8);
                return;
            case 10:
                ((ky1) obj).g0 = 1.0f;
                return;
            case 11:
                ((x02) ((a02) obj).d).t1.setVisibility(8);
                return;
            case 12:
                ((d02) obj).d.u1.setVisibility(8);
                return;
            case 13:
                x02 x02Var = (x02) obj;
                x02Var.W2 = null;
                if (!x02Var.n3) {
                    if (x02Var.U2.getTag() == null && x02Var.N2 == 0 && !x02Var.Q2) {
                        x02Var.X2.setVisibility(4);
                    }
                    x02Var.f3.setVisibility(4);
                    return;
                }
                r7 r7Var = x02Var.b3;
                if (r7Var != null) {
                    r7Var.setVisibility(4);
                    return;
                }
                return;
            case 14:
                ((s12) obj).J.setVisibility(8);
                return;
            case 15:
                super.onAnimationEnd(animator);
                d32 d32Var = (d32) obj;
                d32Var.s.setVisibility(8);
                d32Var.n = (byte) 0;
                r22 r22Var = d32Var.r;
                r22Var.setAlpha(1.0f);
                r22Var.setScaleX(1.0f);
                r22Var.setScaleY(1.0f);
                r22Var.setTranslationX(0.0f);
                r22Var.invalidate();
                return;
            case 16:
                d32 d32Var2 = ((c32) obj).Y;
                if (d32Var2.I.getTag() == null) {
                    d32Var2.I.setVisibility(4);
                }
                d32Var2.J = null;
                return;
            case 17:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((u42) obj).a;
                if (animator.equals(chatAttachAlertPhotoLayout.P)) {
                    chatAttachAlertPhotoLayout.d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    return;
                }
                return;
            case 18:
                l52 l52Var = (l52) obj;
                m52 m52Var = l52Var.Q;
                m52Var.K = null;
                m52Var.L = false;
                l52Var.invalidate();
                return;
            case 19:
                j52 j52Var = (j52) obj;
                j52Var.b.R = true;
                j52Var.O.z.invalidate();
                return;
            case 20:
                ((c82) obj).w.setVisibility(4);
                return;
            case 21:
                e27 e27Var = (e27) obj;
                e27Var.j = false;
                e27Var.i = false;
                return;
            case 22:
                kc2 kc2Var = (kc2) obj;
                kc2Var.M = 0.0f;
                kc2Var.L = 1.0f;
                jq1 jq1Var = kc2Var.b0;
                if (jq1Var != null) {
                    jq1Var.invalidate();
                }
                kc2Var.U.invalidate();
                hq1 hq1Var = kc2Var.Z;
                if (hq1Var != null) {
                    hq1Var.run();
                    kc2Var.Z = null;
                    return;
                }
                return;
            case 23:
                fd2 fd2Var = (fd2) obj;
                fd2Var.setVisibility(8);
                ed2 ed2Var = fd2Var.b;
                if (ed2Var != null) {
                    fd2Var.removeView(ed2Var);
                    fd2Var.b = null;
                }
                fd2Var.e = null;
                return;
            case 24:
                xd2 xd2Var = (xd2) obj;
                umb umbVar = xd2Var.K1;
                if (umbVar != null) {
                    if (umbVar.getParent() != null) {
                        ((ViewGroup) xd2Var.K1.getParent()).removeView(xd2Var.K1);
                    }
                    xd2Var.K1 = null;
                }
                xd2Var.M1 = null;
                super.onAnimationEnd(animator);
                return;
            case 25:
                umb umbVar2 = (umb) obj;
                umbVar2.c = null;
                umbVar2.a.setShader(null);
                umbVar2.n = null;
                umbVar2.r = null;
                umbVar2.setImageDrawable(null);
                gl.B2(umbVar2);
                return;
            case 26:
                a32 a32Var = (a32) obj;
                pi4 pi4Var = a32Var.b;
                pi4Var.setAlpha(1.0f);
                d49.w0(pi4Var);
                ((kf2) a32Var.d).c.removeView(pi4Var);
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
                pk2 pk2Var = (pk2) obj;
                pk2Var.l = 1.0f;
                qk2 qk2Var = pk2Var.p;
                if (qk2Var.n.contains(pk2Var)) {
                    pk2Var.c.K();
                    ok2 ok2Var = pk2Var.d;
                    if (ok2Var != null) {
                        ok2Var.pause();
                        pk2Var.d.release(null);
                        pk2Var.d = null;
                    }
                    TextureView textureView = pk2Var.e;
                    if (textureView != null) {
                        gl.B2(textureView);
                        pk2Var.e = null;
                    }
                    pk2Var.f = false;
                    qk2Var.n.remove(pk2Var);
                }
                qk2Var.invalidate();
                return;
        }
    }

    public bb1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
