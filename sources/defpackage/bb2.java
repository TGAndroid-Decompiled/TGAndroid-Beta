package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public abstract class bb2 extends zb3 {
    public static final k43 V = new k43(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final zu1 F;
    public final d79 G;
    public boolean N;
    public f89 O;
    public y92 P;
    public boolean Q;
    public final vnb R;
    public wo1 T;
    public fl1 U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public bb2(zu1 zu1Var, d79 d79Var, vnb vnbVar) {
        this.R = vnbVar;
        this.F = zu1Var;
        this.G = d79Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override
    public final void B(xb3 xb3Var) {
        View view;
        bb2 bb2Var;
        xb3 xb3Var2;
        f89 f89Var = xb3Var.a;
        View view2 = null;
        if (f89Var == null) {
            view = null;
        } else {
            view = f89Var.a;
        }
        f89 f89Var2 = xb3Var.b;
        if (f89Var2 != null) {
            view2 = f89Var2.a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(xb3Var.a);
            duration.translationX(xb3Var.e - xb3Var.c);
            duration.translationY(xb3Var.f - xb3Var.d);
            bb2Var = this;
            xb3Var2 = xb3Var;
            duration.alpha(0.0f).setListener(new ya2(bb2Var, xb3Var2, duration, view, (byte) 0)).start();
        } else {
            bb2Var = this;
            xb3Var2 = xb3Var;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(xb3Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new ya2(bb2Var, xb3Var2, animate, view3, (byte) 1)).start();
        }
    }

    @Override
    public final void C(f89 f89Var, yb3 yb3Var) {
        S(f89Var, yb3Var, false);
    }

    @Override
    public final boolean J(xb3 xb3Var, f89 f89Var) {
        hnb hnbVar;
        if (f11.a) {
            cc4.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(f89Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f89Var.a;
        if (this.K.contains(view) && (hnbVar = (hnb) this.U.run()) != null) {
            hnbVar.a(view);
        }
        if (xb3Var.b == f89Var) {
            xb3Var.b = null;
        } else if (xb3Var.a == f89Var) {
            xb3Var.a = null;
        } else {
            return false;
        }
        W(view);
        d(f89Var);
        return true;
    }

    @Override
    public final long L() {
        return 0L;
    }

    @Override
    public void N() {
        this.G.setClipChildren(true);
        while (true) {
            ArrayList arrayList = this.L;
            if (!arrayList.isEmpty()) {
                ((Runnable) arrayList.remove(0)).run();
            } else {
                T();
                return;
            }
        }
    }

    public final void S(final defpackage.f89 r21, defpackage.yb3 r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb2.S(f89, yb3, boolean):void");
    }

    public final void T() {
        hnb hnbVar;
        HashMap hashMap = this.J;
        ArrayList arrayList = new ArrayList(hashMap.values());
        hashMap.clear();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (!this.K.isEmpty() && (hnbVar = (hnb) this.U.run()) != null) {
            ArrayList arrayList2 = hnbVar.c;
            if (!hnbVar.e) {
                hnbVar.e = true;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    gnb gnbVar = (gnb) obj2;
                    Runnable runnable = gnbVar.d;
                    if (runnable != null) {
                        hnb.b(runnable);
                        gnbVar.d = null;
                    }
                }
                arrayList2.clear();
                fnb fnbVar = hnbVar.a;
                if (fnbVar != null) {
                    fnbVar.g();
                }
                Runnable runnable2 = hnbVar.d;
                if (runnable2 != null) {
                    hnbVar.d = null;
                    hnb.b(runnable2);
                }
            }
        }
    }

    public final void U(m47 m47Var) {
        if (m47Var == null) {
            return;
        }
        ArrayList arrayList = m47Var.d;
        l47 l47Var = m47Var.m;
        if (arrayList.size() == 0) {
            l47Var.i = true;
            return;
        }
        if (l47Var.b == 0 && l47Var.d == 0 && l47Var.a == 0 && l47Var.c == 0) {
            d79 d79Var = this.G;
            int childCount = d79Var.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = d79Var.getChildAt(i);
                if (childAt instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt;
                    r47 messageObject = wb2Var.getMessageObject();
                    if (wb2Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        l47Var.b = wb2Var.getBackgroundDrawableTop() + wb2Var.getPaddingTop() + wb2Var.getTop();
                        l47Var.d = wb2Var.getBackgroundDrawableBottom() + wb2Var.getPaddingTop() + wb2Var.getTop();
                        l47Var.a = wb2Var.getBackgroundDrawableLeft() + wb2Var.getLeft();
                        l47Var.c = wb2Var.getBackgroundDrawableRight() + wb2Var.getLeft();
                        l47Var.o = wb2Var.f2();
                        l47Var.k = wb2Var.L2();
                        l47Var.l = wb2Var.K2();
                        l47Var.p = true;
                        break;
                    }
                }
                i++;
            }
        }
        this.I.add(m47Var);
    }

    public abstract void V();

    public final void W(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z = view instanceof eq0;
        d79 d79Var = this.G;
        if (z) {
            int measuredHeight = (d79Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((eq0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof gbc) {
            int measuredHeight2 = (d79Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((gbc) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            wb2Var.getTransitionParams().e();
            wb2Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof dl1) {
            cl1 transitionParams = ((dl1) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void X(wo1 wo1Var, fl1 fl1Var) {
        this.T = wo1Var;
        this.U = fl1Var;
    }

    public final boolean Y(View view) {
        f89 U;
        if (!this.N && (U = this.G.U(view)) != null) {
            if (this.q.contains(U) || this.y.contains(U)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Z(View view) {
        f89 U = this.G.U(view);
        if (U != null) {
            if (this.p.contains(U) || this.A.contains(U)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(f89 f89Var, m09 m09Var, m09 m09Var2) {
        ArrayList arrayList;
        int i;
        boolean a = super.a(f89Var, m09Var, m09Var2);
        if (a && this.N) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                arrayList = this.q;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((f89) arrayList.get(i2)).c() == 0) {
                    z = true;
                }
                i2++;
            }
            if (z) {
                i = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    i += ((f89) arrayList.get(i3)).a.getHeight();
                }
            } else {
                i = 0;
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((f89) arrayList.get(i4)).a.setTranslationY(i);
            }
        }
        return a;
    }

    @Override
    public final void f(f89 f89Var) {
        hnb hnbVar;
        Animator animator = (Animator) this.J.remove(f89Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = f89Var.a;
        if (this.K.contains(view) && (hnbVar = (hnb) this.U.run()) != null) {
            hnbVar.a(view);
        }
        super.f(f89Var);
        W(view);
    }

    @Override
    public void g() {
        if (f11.a) {
            cc4.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((m47) obj).m.p = false;
        }
        arrayList.clear();
        T();
        y92 y92Var = this.P;
        if (y92Var != null) {
            y92Var.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            yb3 yb3Var = (yb3) arrayList2.get(size2);
            W(yb3Var.a.a);
            v(yb3Var.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            f89 f89Var = (f89) arrayList3.get(size3);
            W(f89Var.a);
            d(f89Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            f89 f89Var2 = (f89) arrayList4.get(size4);
            W(f89Var2.a);
            u(f89Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((xb3) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                yb3 yb3Var2 = (yb3) arrayList7.get(size7);
                W(yb3Var2.a.a);
                v(yb3Var2.a);
                arrayList7.remove(size7);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(arrayList7);
                }
            }
        }
        ArrayList arrayList8 = this.t;
        for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
            ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                f89 f89Var3 = (f89) arrayList9.get(size9);
                W(f89Var3.a);
                u(f89Var3);
                arrayList9.remove(size9);
                if (arrayList9.isEmpty()) {
                    arrayList8.remove(arrayList9);
                }
            }
        }
        ArrayList arrayList10 = this.v;
        for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
            ArrayList arrayList11 = (ArrayList) arrayList10.get(size10);
            for (int size11 = arrayList11.size() - 1; size11 >= 0; size11--) {
                I((xb3) arrayList11.get(size11));
                if (arrayList11.isEmpty()) {
                    arrayList10.remove(arrayList11);
                }
            }
        }
        E(this.A);
        E(this.z);
        E(this.y);
        E(this.B);
        e();
    }

    @Override
    public final long i() {
        return 250L;
    }

    @Override
    public final long j() {
        return 250L;
    }

    @Override
    public final m09 l(c89 c89Var, f89 f89Var, int i, List list) {
        m09 l = super.l(c89Var, f89Var, i, list);
        View view = f89Var.a;
        if (view instanceof wb2) {
            ?? m09Var = new m09((byte) 4);
            m09Var.b = l.b;
            m09Var.c = l.c;
            dc2 transitionParams = ((wb2) view).getTransitionParams();
            m09Var.e = transitionParams.b;
            m09Var.f = transitionParams.c;
            m09Var.g = transitionParams.d;
            m09Var.h = transitionParams.e;
            return m09Var;
        }
        return l;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb2.m():void");
    }

    @Override
    public final void p(f89 f89Var) {
        R(f89Var);
        View view = f89Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof wb2) {
            ((wb2) view).getTransitionParams().i = true;
        }
        this.q.add(f89Var);
    }

    @Override
    public final boolean q(f89 f89Var, f89 f89Var2, m09 m09Var, int i, int i2, int i3, int i4) {
        float translationX;
        if (f89Var == f89Var2) {
            return r(f89Var, m09Var, i, i2, i3, i4);
        }
        View view = f89Var.a;
        if (view instanceof wb2) {
            translationX = ((wb2) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(f89Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        if (view instanceof wb2) {
            ((wb2) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = f89Var2.a;
        R(f89Var2);
        if (view2 instanceof wb2) {
            ((wb2) view2).setAnimationOffsetX(-i5);
        } else {
            view2.setTranslationX(-i5);
        }
        view2.setTranslationY(-i6);
        view2.setAlpha(0.0f);
        this.s.add(new xb3(f89Var, f89Var2, i, i2, i3, i4));
        F();
        return true;
    }

    @Override
    public final boolean r(defpackage.f89 r23, defpackage.m09 r24, int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb2.r(f89, m09, int, int, int, int):boolean");
    }

    @Override
    public final void s(f89 f89Var, m09 m09Var) {
        if (f11.a) {
            cc4.b("animate remove");
        }
        super.s(f89Var, m09Var);
        View view = f89Var.a;
        if (m09Var != null) {
            int i = m09Var.c;
            int top = view.getTop();
            int left = view.getLeft() - m09Var.b;
            int i2 = top - i;
            if (i2 != 0) {
                view.setTranslationY(-i2);
            }
            if (view instanceof wb2) {
                wb2 wb2Var = (wb2) view;
                if (left != 0) {
                    wb2Var.setAnimationOffsetX(-left);
                }
                if (m09Var instanceof za2) {
                    za2 za2Var = (za2) m09Var;
                    wb2Var.x3(za2Var.e, za2Var.f, za2Var.g, za2Var.h);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
