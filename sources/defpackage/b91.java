package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.q;
public final class b91 extends AnimatorListenerAdapter {
    public final byte a;
    public final Object b;

    public b91(m42 m42Var, f69 f69Var) {
        this.a = (byte) 28;
        this.b = m42Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 19:
                ((f62) this.b).a.P = null;
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
            case 1:
                ((lb1) obj).w = null;
                return;
            case 2:
                pc1 pc1Var = ((jc1) obj).d0;
                if (pc1Var.g0 == animator) {
                    pc1Var.g0 = null;
                    pc1Var.f.getEditText().setScrollY(pc1Var.c0);
                    return;
                }
                return;
            case 3:
                vg1 vg1Var = (vg1) ((y) obj).b;
                if (animator.equals(vg1Var.S)) {
                    vg1Var.S = null;
                    return;
                }
                return;
            case 4:
                vg1 vg1Var2 = (vg1) obj;
                if (animator.equals(vg1Var2.S)) {
                    vg1Var2.S = null;
                    return;
                }
                return;
            case 5:
                ((sh1) obj).I.setVisibility(8);
                return;
            case 6:
                vi1 vi1Var = (vi1) obj;
                fi1 fi1Var = vi1Var.n0;
                if (fi1Var != null) {
                    if (fi1Var.getParent() != null) {
                        ((ViewGroup) vi1Var.n0.getParent()).removeView(vi1Var.n0);
                    }
                    vi1Var.n0 = null;
                }
                vi1Var.p0 = null;
                super.onAnimationEnd(animator);
                return;
            case 7:
                cq1 cq1Var = (cq1) obj;
                if (cq1Var.a) {
                    cq1Var.d.setTranslationY(0.0f);
                }
                if (cq1Var.b) {
                    cq1Var.e.setTranslationY(0.0f);
                }
                if (cq1Var.f) {
                    cq1Var.h.setTranslationY(0.0f);
                }
                bf0 bf0Var = cq1Var.c;
                if (bf0Var != null) {
                    bf0Var.setTranslationY(0.0f);
                }
                cq1Var.n.W2[1] = null;
                return;
            case 8:
                ms1 ms1Var = (ms1) obj;
                ms1Var.setAnimatedTop(0);
                View view = ms1Var.w2;
                if (view != null && view.getVisibility() == 0) {
                    ms1Var.w2.setTranslationY(((1.0f - ms1Var.getTopViewEnterProgress()) * ms1Var.w2.getLayoutParams().height) + ms1Var.J2);
                }
                ms1Var.D7.M9 = null;
                return;
            case 9:
                fu1 fu1Var = (fu1) ((u5) obj).c;
                q qVar = fu1Var.c.R.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(false);
                    fu1Var.c.R.q3.m();
                    fu1Var.c.R.q3.setVisibility(4);
                    return;
                }
                return;
            case 10:
                fu1 fu1Var2 = (fu1) obj;
                hu1 hu1Var = fu1Var2.c;
                ArrayList arrayList = hu1Var.R.F6;
                rc2 rc2Var = fu1Var2.b;
                arrayList.remove(rc2Var);
                View view2 = hu1Var.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    hu1Var.R.A0.invalidate();
                }
                rc2Var.setAlpha(1.0f);
                rc2Var.getTransitionParams().y0 = false;
                return;
            case 11:
                ((vy1) obj).f.c0.setVisibility(8);
                return;
            case 12:
                ((xz1) obj).g0 = 1.0f;
                return;
            case 13:
                ((i22) ((l12) obj).d).t1.setVisibility(8);
                return;
            case 14:
                ((o12) obj).d.u1.setVisibility(8);
                return;
            case 15:
                i22 i22Var = (i22) obj;
                i22Var.W2 = null;
                if (!i22Var.n3) {
                    if (i22Var.U2.getTag() == null && i22Var.N2 == 0 && !i22Var.Q2) {
                        i22Var.X2.setVisibility(4);
                    }
                    i22Var.f3.setVisibility(4);
                    return;
                }
                r7 r7Var = i22Var.b3;
                if (r7Var != null) {
                    r7Var.setVisibility(4);
                    return;
                }
                return;
            case 16:
                ((e32) obj).J.setVisibility(8);
                return;
            case 17:
                super.onAnimationEnd(animator);
                p42 p42Var = (p42) obj;
                p42Var.s.setVisibility(8);
                p42Var.n = (byte) 0;
                d42 d42Var = p42Var.r;
                d42Var.setAlpha(1.0f);
                d42Var.setScaleX(1.0f);
                d42Var.setScaleY(1.0f);
                d42Var.setTranslationX(0.0f);
                d42Var.invalidate();
                return;
            case 18:
                p42 p42Var2 = ((o42) obj).Y;
                if (p42Var2.I.getTag() == null) {
                    p42Var2.I.setVisibility(4);
                }
                p42Var2.J = null;
                return;
            case 19:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ((f62) obj).a;
                if (animator.equals(chatAttachAlertPhotoLayout.P)) {
                    chatAttachAlertPhotoLayout.d0 = true;
                    chatAttachAlertPhotoLayout.P = null;
                    return;
                }
                return;
            case 20:
                w62 w62Var = (w62) obj;
                x62 x62Var = w62Var.Q;
                x62Var.K = null;
                x62Var.L = false;
                w62Var.invalidate();
                return;
            case 21:
                u62 u62Var = (u62) obj;
                u62Var.b.R = true;
                u62Var.O.z.invalidate();
                return;
            case 22:
                ((n92) obj).w.setVisibility(4);
                return;
            case 23:
                e47 e47Var = (e47) obj;
                e47Var.j = false;
                e47Var.i = false;
                return;
            case 24:
                vd2 vd2Var = (vd2) obj;
                vd2Var.M = 0.0f;
                vd2Var.L = 1.0f;
                vr1 vr1Var = vd2Var.b0;
                if (vr1Var != null) {
                    vr1Var.invalidate();
                }
                vd2Var.U.invalidate();
                fo1 fo1Var = vd2Var.Z;
                if (fo1Var != null) {
                    fo1Var.run();
                    vd2Var.Z = null;
                    return;
                }
                return;
            case 25:
                qe2 qe2Var = (qe2) obj;
                qe2Var.setVisibility(8);
                pe2 pe2Var = qe2Var.b;
                if (pe2Var != null) {
                    qe2Var.removeView(pe2Var);
                    qe2Var.b = null;
                }
                qe2Var.e = null;
                return;
            case 26:
                if2 if2Var = (if2) obj;
                vob vobVar = if2Var.K1;
                if (vobVar != null) {
                    if (vobVar.getParent() != null) {
                        ((ViewGroup) if2Var.K1.getParent()).removeView(if2Var.K1);
                    }
                    if2Var.K1 = null;
                }
                if2Var.M1 = null;
                super.onAnimationEnd(animator);
                return;
            case 27:
                vob vobVar2 = (vob) obj;
                vobVar2.c = null;
                vobVar2.a.setShader(null);
                vobVar2.n = null;
                vobVar2.r = null;
                vobVar2.setImageDrawable(null);
                gm.B2(vobVar2);
                return;
            case 28:
                m42 m42Var = (m42) obj;
                tk4 tk4Var = m42Var.b;
                tk4Var.setAlpha(1.0f);
                f69.w0(tk4Var);
                ((wg2) m42Var.d).c.removeView(tk4Var);
                return;
            case 29:
                CheckBox checkBox = (CheckBox) obj;
                if (animator.equals(checkBox.s)) {
                    checkBox.s = null;
                }
                if (!checkBox.y) {
                    checkBox.H = null;
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                k91 k91Var = (k91) this.b;
                for (int i = 0; i < k91Var.b.getChildCount(); i++) {
                    int i2 = k91Var.Q;
                    int i3 = k91Var.R;
                    int i4 = h91.E;
                    ((h91) k91Var.b.getChildAt(i)).c(i2, i3);
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public b91(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
