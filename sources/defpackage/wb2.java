package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public abstract class wb2 extends sc3 {
    public static final d53 V = new d53(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final yv1 F;
    public final r59 G;
    public boolean N;
    public u69 O;
    public ua2 P;
    public boolean Q;
    public final ylb R;
    public tp1 T;
    public um1 U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public wb2(yv1 yv1Var, r59 r59Var, ylb ylbVar) {
        this.R = ylbVar;
        this.F = yv1Var;
        this.G = r59Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override
    public final void B(qc3 qc3Var) {
        View view;
        wb2 wb2Var;
        qc3 qc3Var2;
        u69 u69Var = qc3Var.a;
        View view2 = null;
        if (u69Var == null) {
            view = null;
        } else {
            view = u69Var.a;
        }
        u69 u69Var2 = qc3Var.b;
        if (u69Var2 != null) {
            view2 = u69Var2.a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(qc3Var.a);
            duration.translationX(qc3Var.e - qc3Var.c);
            duration.translationY(qc3Var.f - qc3Var.d);
            wb2Var = this;
            qc3Var2 = qc3Var;
            duration.alpha(0.0f).setListener(new tb2(wb2Var, qc3Var2, duration, view, (byte) 0)).start();
        } else {
            wb2Var = this;
            qc3Var2 = qc3Var;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(qc3Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new tb2(wb2Var, qc3Var2, animate, view3, (byte) 1)).start();
        }
    }

    @Override
    public final void C(u69 u69Var, rc3 rc3Var) {
        S(u69Var, rc3Var, false);
    }

    @Override
    public final boolean J(qc3 qc3Var, u69 u69Var) {
        jlb jlbVar;
        if (e21.a) {
            fc4.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(u69Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = u69Var.a;
        if (this.K.contains(view) && (jlbVar = (jlb) this.U.run()) != null) {
            jlbVar.a(view);
        }
        if (qc3Var.b == u69Var) {
            qc3Var.b = null;
        } else if (qc3Var.a == u69Var) {
            qc3Var.a = null;
        } else {
            return false;
        }
        W(view);
        d(u69Var);
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

    public final void S(final defpackage.u69 r21, defpackage.rc3 r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.S(u69, rc3, boolean):void");
    }

    public final void T() {
        jlb jlbVar;
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
        if (!this.K.isEmpty() && (jlbVar = (jlb) this.U.run()) != null) {
            ArrayList arrayList2 = jlbVar.c;
            if (!jlbVar.e) {
                jlbVar.e = true;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    ilb ilbVar = (ilb) obj2;
                    Runnable runnable = ilbVar.d;
                    if (runnable != null) {
                        jlb.b(runnable);
                        ilbVar.d = null;
                    }
                }
                arrayList2.clear();
                hlb hlbVar = jlbVar.a;
                if (hlbVar != null) {
                    hlbVar.g();
                }
                Runnable runnable2 = jlbVar.d;
                if (runnable2 != null) {
                    jlbVar.d = null;
                    jlb.b(runnable2);
                }
            }
        }
    }

    public final void U(f47 f47Var) {
        if (f47Var == null) {
            return;
        }
        ArrayList arrayList = f47Var.d;
        e47 e47Var = f47Var.m;
        if (arrayList.size() == 0) {
            e47Var.i = true;
            return;
        }
        if (e47Var.b == 0 && e47Var.d == 0 && e47Var.a == 0 && e47Var.c == 0) {
            r59 r59Var = this.G;
            int childCount = r59Var.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = r59Var.getChildAt(i);
                if (childAt instanceof rc2) {
                    rc2 rc2Var = (rc2) childAt;
                    k47 messageObject = rc2Var.getMessageObject();
                    if (rc2Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        e47Var.b = rc2Var.getBackgroundDrawableTop() + rc2Var.getPaddingTop() + rc2Var.getTop();
                        e47Var.d = rc2Var.getBackgroundDrawableBottom() + rc2Var.getPaddingTop() + rc2Var.getTop();
                        e47Var.a = rc2Var.getBackgroundDrawableLeft() + rc2Var.getLeft();
                        e47Var.c = rc2Var.getBackgroundDrawableRight() + rc2Var.getLeft();
                        e47Var.o = rc2Var.f2();
                        e47Var.k = rc2Var.L2();
                        e47Var.l = rc2Var.K2();
                        e47Var.p = true;
                        break;
                    }
                }
                i++;
            }
        }
        this.I.add(f47Var);
    }

    public abstract void V();

    public final void W(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z = view instanceof er0;
        r59 r59Var = this.G;
        if (z) {
            int measuredHeight = (r59Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((er0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof h9c) {
            int measuredHeight2 = (r59Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((h9c) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            rc2Var.getTransitionParams().e();
            rc2Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof cm1) {
            bm1 transitionParams = ((cm1) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void X(tp1 tp1Var, um1 um1Var) {
        this.T = tp1Var;
        this.U = um1Var;
    }

    public final boolean Y(View view) {
        u69 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.q.contains(T) || this.y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Z(View view) {
        u69 T = this.G.T(view);
        if (T != null) {
            if (this.p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(u69 u69Var, az8 az8Var, az8 az8Var2) {
        ArrayList arrayList;
        int i;
        boolean a = super.a(u69Var, az8Var, az8Var2);
        if (a && this.N) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                arrayList = this.q;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((u69) arrayList.get(i2)).c() == 0) {
                    z = true;
                }
                i2++;
            }
            if (z) {
                i = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    i += ((u69) arrayList.get(i3)).a.getHeight();
                }
            } else {
                i = 0;
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((u69) arrayList.get(i4)).a.setTranslationY(i);
            }
        }
        return a;
    }

    @Override
    public final void f(u69 u69Var) {
        jlb jlbVar;
        Animator animator = (Animator) this.J.remove(u69Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = u69Var.a;
        if (this.K.contains(view) && (jlbVar = (jlb) this.U.run()) != null) {
            jlbVar.a(view);
        }
        super.f(u69Var);
        W(view);
    }

    @Override
    public void g() {
        if (e21.a) {
            fc4.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f47) obj).m.p = false;
        }
        arrayList.clear();
        T();
        ua2 ua2Var = this.P;
        if (ua2Var != null) {
            ua2Var.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            rc3 rc3Var = (rc3) arrayList2.get(size2);
            W(rc3Var.a.a);
            v(rc3Var.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            u69 u69Var = (u69) arrayList3.get(size3);
            W(u69Var.a);
            d(u69Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            u69 u69Var2 = (u69) arrayList4.get(size4);
            W(u69Var2.a);
            u(u69Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((qc3) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                rc3 rc3Var2 = (rc3) arrayList7.get(size7);
                W(rc3Var2.a.a);
                v(rc3Var2.a);
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
                u69 u69Var3 = (u69) arrayList9.get(size9);
                W(u69Var3.a);
                u(u69Var3);
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
                I((qc3) arrayList11.get(size11));
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
    public final az8 l(r69 r69Var, u69 u69Var, int i, List list) {
        az8 l = super.l(r69Var, u69Var, i, list);
        View view = u69Var.a;
        if (view instanceof rc2) {
            ?? az8Var = new az8((byte) 4);
            az8Var.b = l.b;
            az8Var.c = l.c;
            yc2 transitionParams = ((rc2) view).getTransitionParams();
            az8Var.e = transitionParams.b;
            az8Var.f = transitionParams.c;
            az8Var.g = transitionParams.d;
            az8Var.h = transitionParams.e;
            return az8Var;
        }
        return l;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.m():void");
    }

    @Override
    public final void p(u69 u69Var) {
        R(u69Var);
        View view = u69Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof rc2) {
            ((rc2) view).getTransitionParams().i = true;
        }
        this.q.add(u69Var);
    }

    @Override
    public final boolean q(u69 u69Var, u69 u69Var2, az8 az8Var, int i, int i2, int i3, int i4) {
        float translationX;
        if (u69Var == u69Var2) {
            return r(u69Var, az8Var, i, i2, i3, i4);
        }
        View view = u69Var.a;
        if (view instanceof rc2) {
            translationX = ((rc2) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(u69Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        if (view instanceof rc2) {
            ((rc2) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = u69Var2.a;
        R(u69Var2);
        if (view2 instanceof rc2) {
            ((rc2) view2).setAnimationOffsetX(-i5);
        } else {
            view2.setTranslationX(-i5);
        }
        view2.setTranslationY(-i6);
        view2.setAlpha(0.0f);
        this.s.add(new qc3(u69Var, u69Var2, i, i2, i3, i4));
        F();
        return true;
    }

    @Override
    public final boolean r(defpackage.u69 r23, defpackage.az8 r24, int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb2.r(u69, az8, int, int, int, int):boolean");
    }

    @Override
    public final void s(u69 u69Var, az8 az8Var) {
        if (e21.a) {
            fc4.b("animate remove");
        }
        super.s(u69Var, az8Var);
        View view = u69Var.a;
        if (az8Var != null) {
            int i = az8Var.c;
            int top = view.getTop();
            int left = view.getLeft() - az8Var.b;
            int i2 = top - i;
            if (i2 != 0) {
                view.setTranslationY(-i2);
            }
            if (view instanceof rc2) {
                rc2 rc2Var = (rc2) view;
                if (left != 0) {
                    rc2Var.setAnimationOffsetX(-left);
                }
                if (az8Var instanceof ub2) {
                    ub2 ub2Var = (ub2) az8Var;
                    rc2Var.x3(ub2Var.e, ub2Var.f, ub2Var.g, ub2Var.h);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
