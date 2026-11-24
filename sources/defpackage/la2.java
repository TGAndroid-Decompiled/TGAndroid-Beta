package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public abstract class la2 extends gb3 {
    public static final s33 V = new s33(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final mu1 F;
    public final o39 G;
    public boolean N;
    public s49 O;
    public i92 P;
    public boolean Q;
    public final wjb R;
    public go1 T;
    public ll1 U;
    public final HashMap H = new HashMap();
    public final ArrayList I = new ArrayList();
    public final HashMap J = new HashMap();
    public final ArrayList K = new ArrayList();
    public final ArrayList L = new ArrayList();
    public final HashMap M = new HashMap();
    public final ArrayList S = new ArrayList();

    public la2(mu1 mu1Var, o39 o39Var, wjb wjbVar) {
        this.R = wjbVar;
        this.F = mu1Var;
        this.G = o39Var;
        this.o = V;
        this.n = true;
        this.m = false;
    }

    @Override
    public final void B(eb3 eb3Var) {
        View view;
        la2 la2Var;
        eb3 eb3Var2;
        s49 s49Var = eb3Var.a;
        View view2 = null;
        if (s49Var == null) {
            view = null;
        } else {
            view = s49Var.a;
        }
        s49 s49Var2 = eb3Var.b;
        if (s49Var2 != null) {
            view2 = s49Var2.a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(eb3Var.a);
            duration.translationX(eb3Var.e - eb3Var.c);
            duration.translationY(eb3Var.f - eb3Var.d);
            la2Var = this;
            eb3Var2 = eb3Var;
            duration.alpha(0.0f).setListener(new ia2(la2Var, eb3Var2, duration, view, (byte) 0)).start();
        } else {
            la2Var = this;
            eb3Var2 = eb3Var;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(eb3Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new ia2(la2Var, eb3Var2, animate, view3, (byte) 1)).start();
        }
    }

    @Override
    public final void C(s49 s49Var, fb3 fb3Var) {
        S(s49Var, fb3Var, false);
    }

    @Override
    public final boolean J(eb3 eb3Var, s49 s49Var) {
        ijb ijbVar;
        if (w01.a) {
            fa4.b("end change if necessary");
        }
        Animator animator = (Animator) this.J.remove(s49Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = s49Var.a;
        if (this.K.contains(view) && (ijbVar = (ijb) this.U.run()) != null) {
            ijbVar.a(view);
        }
        if (eb3Var.b == s49Var) {
            eb3Var.b = null;
        } else if (eb3Var.a == s49Var) {
            eb3Var.a = null;
        } else {
            return false;
        }
        W(view);
        d(s49Var);
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

    public final void S(final defpackage.s49 r21, defpackage.fb3 r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la2.S(s49, fb3, boolean):void");
    }

    public final void T() {
        ijb ijbVar;
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
        if (!this.K.isEmpty() && (ijbVar = (ijb) this.U.run()) != null) {
            ArrayList arrayList2 = ijbVar.c;
            if (!ijbVar.e) {
                ijbVar.e = true;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    hjb hjbVar = (hjb) obj2;
                    Runnable runnable = hjbVar.d;
                    if (runnable != null) {
                        ijb.b(runnable);
                        hjbVar.d = null;
                    }
                }
                arrayList2.clear();
                gjb gjbVar = ijbVar.a;
                if (gjbVar != null) {
                    gjbVar.g();
                }
                Runnable runnable2 = ijbVar.d;
                if (runnable2 != null) {
                    ijbVar.d = null;
                    ijb.b(runnable2);
                }
            }
        }
    }

    public final void U(f27 f27Var) {
        if (f27Var == null) {
            return;
        }
        ArrayList arrayList = f27Var.d;
        e27 e27Var = f27Var.m;
        if (arrayList.size() == 0) {
            e27Var.i = true;
            return;
        }
        if (e27Var.b == 0 && e27Var.d == 0 && e27Var.a == 0 && e27Var.c == 0) {
            o39 o39Var = this.G;
            int childCount = o39Var.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = o39Var.getChildAt(i);
                if (childAt instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt;
                    k27 messageObject = gb2Var.getMessageObject();
                    if (gb2Var.getTransitionParams().w0 && arrayList.contains(messageObject)) {
                        e27Var.b = gb2Var.getBackgroundDrawableTop() + gb2Var.getPaddingTop() + gb2Var.getTop();
                        e27Var.d = gb2Var.getBackgroundDrawableBottom() + gb2Var.getPaddingTop() + gb2Var.getTop();
                        e27Var.a = gb2Var.getBackgroundDrawableLeft() + gb2Var.getLeft();
                        e27Var.c = gb2Var.getBackgroundDrawableRight() + gb2Var.getLeft();
                        e27Var.o = gb2Var.f2();
                        e27Var.k = gb2Var.L2();
                        e27Var.l = gb2Var.K2();
                        e27Var.p = true;
                        break;
                    }
                }
                i++;
            }
        }
        this.I.add(f27Var);
    }

    public abstract void V();

    public final void W(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        boolean z = view instanceof eq0;
        o39 o39Var = this.G;
        if (z) {
            int measuredHeight = (o39Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((eq0) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof g7c) {
            int measuredHeight2 = (o39Var.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((g7c) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
            } else {
                view.setTranslationY(0.0f);
            }
        } else if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            gb2Var.getTransitionParams().e();
            gb2Var.setAnimationOffsetX(0.0f);
        } else if (view instanceof uk1) {
            tk1 transitionParams = ((uk1) view).getTransitionParams();
            transitionParams.b = false;
            transitionParams.c = 1.0f;
        } else {
            view.setTranslationX(0.0f);
        }
    }

    public final void X(go1 go1Var, ll1 ll1Var) {
        this.T = go1Var;
        this.U = ll1Var;
    }

    public final boolean Y(View view) {
        s49 T;
        if (!this.N && (T = this.G.T(view)) != null) {
            if (this.q.contains(T) || this.y.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean Z(View view) {
        s49 T = this.G.T(view);
        if (T != null) {
            if (this.p.contains(T) || this.A.contains(T)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean a(s49 s49Var, zw8 zw8Var, zw8 zw8Var2) {
        ArrayList arrayList;
        int i;
        boolean a = super.a(s49Var, zw8Var, zw8Var2);
        if (a && this.N) {
            int i2 = 0;
            boolean z = false;
            while (true) {
                arrayList = this.q;
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((s49) arrayList.get(i2)).c() == 0) {
                    z = true;
                }
                i2++;
            }
            if (z) {
                i = 0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    i += ((s49) arrayList.get(i3)).a.getHeight();
                }
            } else {
                i = 0;
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((s49) arrayList.get(i4)).a.setTranslationY(i);
            }
        }
        return a;
    }

    @Override
    public final void f(s49 s49Var) {
        ijb ijbVar;
        Animator animator = (Animator) this.J.remove(s49Var);
        if (animator != null) {
            animator.cancel();
        }
        View view = s49Var.a;
        if (this.K.contains(view) && (ijbVar = (ijb) this.U.run()) != null) {
            ijbVar.a(view);
        }
        super.f(s49Var);
        W(view);
    }

    @Override
    public void g() {
        if (w01.a) {
            fa4.b("end animations");
        }
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f27) obj).m.p = false;
        }
        arrayList.clear();
        T();
        i92 i92Var = this.P;
        if (i92Var != null) {
            i92Var.h.setAlpha(1.0f);
        }
        this.O = null;
        this.P = null;
        ArrayList arrayList2 = this.r;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            fb3 fb3Var = (fb3) arrayList2.get(size2);
            W(fb3Var.a.a);
            v(fb3Var.a);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            s49 s49Var = (s49) arrayList3.get(size3);
            W(s49Var.a);
            d(s49Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.q;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            s49 s49Var2 = (s49) arrayList4.get(size4);
            W(s49Var2.a);
            u(s49Var2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.s;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            I((eb3) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList6 = this.u;
        for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                fb3 fb3Var2 = (fb3) arrayList7.get(size7);
                W(fb3Var2.a.a);
                v(fb3Var2.a);
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
                s49 s49Var3 = (s49) arrayList9.get(size9);
                W(s49Var3.a);
                u(s49Var3);
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
                I((eb3) arrayList11.get(size11));
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
    public final zw8 l(p49 p49Var, s49 s49Var, int i, List list) {
        zw8 l = super.l(p49Var, s49Var, i, list);
        View view = s49Var.a;
        if (view instanceof gb2) {
            ?? zw8Var = new zw8((byte) 4);
            zw8Var.b = l.b;
            zw8Var.c = l.c;
            nb2 transitionParams = ((gb2) view).getTransitionParams();
            zw8Var.e = transitionParams.b;
            zw8Var.f = transitionParams.c;
            zw8Var.g = transitionParams.d;
            zw8Var.h = transitionParams.e;
            return zw8Var;
        }
        return l;
    }

    @Override
    public final void m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la2.m():void");
    }

    @Override
    public final void p(s49 s49Var) {
        R(s49Var);
        View view = s49Var.a;
        view.setAlpha(0.0f);
        if (!this.N) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof gb2) {
            ((gb2) view).getTransitionParams().i = true;
        }
        this.q.add(s49Var);
    }

    @Override
    public final boolean q(s49 s49Var, s49 s49Var2, zw8 zw8Var, int i, int i2, int i3, int i4) {
        float translationX;
        if (s49Var == s49Var2) {
            return r(s49Var, zw8Var, i, i2, i3, i4);
        }
        View view = s49Var.a;
        if (view instanceof gb2) {
            translationX = ((gb2) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(s49Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        if (view instanceof gb2) {
            ((gb2) view).setAnimationOffsetX(translationX);
        } else {
            view.setTranslationX(translationX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = s49Var2.a;
        R(s49Var2);
        if (view2 instanceof gb2) {
            ((gb2) view2).setAnimationOffsetX(-i5);
        } else {
            view2.setTranslationX(-i5);
        }
        view2.setTranslationY(-i6);
        view2.setAlpha(0.0f);
        this.s.add(new eb3(s49Var, s49Var2, i, i2, i3, i4));
        F();
        return true;
    }

    @Override
    public final boolean r(defpackage.s49 r23, defpackage.zw8 r24, int r25, int r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la2.r(s49, zw8, int, int, int, int):boolean");
    }

    @Override
    public final void s(s49 s49Var, zw8 zw8Var) {
        if (w01.a) {
            fa4.b("animate remove");
        }
        super.s(s49Var, zw8Var);
        View view = s49Var.a;
        if (zw8Var != null) {
            int i = zw8Var.c;
            int top = view.getTop();
            int left = view.getLeft() - zw8Var.b;
            int i2 = top - i;
            if (i2 != 0) {
                view.setTranslationY(-i2);
            }
            if (view instanceof gb2) {
                gb2 gb2Var = (gb2) view;
                if (left != 0) {
                    gb2Var.setAnimationOffsetX(-left);
                }
                if (zw8Var instanceof ja2) {
                    ja2 ja2Var = (ja2) zw8Var;
                    gb2Var.x3(ja2Var.e, ja2Var.f, ja2Var.g, ja2Var.h);
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
    }
}
