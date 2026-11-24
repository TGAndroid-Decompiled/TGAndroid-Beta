package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
public class gb3 extends hia {
    public static TimeInterpolator E;
    public s33 o;
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final ArrayList u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public final ArrayList z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public boolean C = true;
    public byte D = 0;

    static {
        boolean z = w01.a;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final eb3 eb3Var) {
        View view;
        final gb3 gb3Var;
        final eb3 eb3Var2;
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
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.g).setStartDelay(0L);
            arrayList.add(eb3Var.a);
            startDelay.translationX(eb3Var.e - eb3Var.c);
            startDelay.translationY(eb3Var.f - eb3Var.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final gb3 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    eb3 eb3Var3 = eb3Var;
                    gb3 gb3Var2 = this.b;
                    switch (b) {
                        case 0:
                            s49 s49Var3 = eb3Var3.a;
                            gb3Var2.O();
                            return;
                        default:
                            s49 s49Var4 = eb3Var3.b;
                            gb3Var2.O();
                            return;
                    }
                }
            });
            gb3Var = this;
            eb3Var2 = eb3Var;
            startDelay.setStartDelay(0L).setInterpolator(this.k).setListener(new db3(gb3Var, eb3Var2, startDelay, view, (byte) 0)).start();
        } else {
            gb3Var = this;
            eb3Var2 = eb3Var;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(eb3Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(gb3Var.f).setStartDelay(gb3Var.i() - gb3Var.f).setInterpolator(gb3Var.k).alpha(1.0f);
            if (gb3Var.A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(gb3Var) {
                public final gb3 b;

                {
                    this.b = gb3Var;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    eb3 eb3Var3 = eb3Var2;
                    gb3 gb3Var2 = this.b;
                    switch (b) {
                        case 0:
                            s49 s49Var3 = eb3Var3.a;
                            gb3Var2.O();
                            return;
                        default:
                            s49 s49Var4 = eb3Var3.b;
                            gb3Var2.O();
                            return;
                    }
                }
            });
            animate.setListener(new db3(gb3Var, eb3Var2, animate, view3, (byte) 1)).start();
        }
    }

    public void C(s49 s49Var, fb3 fb3Var) {
        int i = fb3Var.b;
        int i2 = fb3Var.c;
        int i3 = fb3Var.d;
        int i4 = fb3Var.e;
        View view = s49Var.a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.z.add(s49Var);
        animate.setUpdateListener(new pk(this, s49Var, (byte) 11));
        s33 s33Var = this.o;
        if (s33Var != null) {
            animate.setInterpolator(s33Var);
        } else {
            animate.setInterpolator(this.i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new cb3(this, s49Var, i5, view, i6, animate, (byte) 0)).start();
    }

    public void D(s49 s49Var) {
        View view = s49Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(s49Var);
        if (this.l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.l).setInterpolator(this.j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new ya3(this, s49Var, (byte) 0));
        animate.setListener(new bb3(this, s49Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s49) arrayList.get(size)).a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.w.clear();
            this.x.clear();
        }
    }

    public final void H(ArrayList arrayList, s49 s49Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            eb3 eb3Var = (eb3) arrayList.get(size);
            if (J(eb3Var, s49Var) && eb3Var.a == null && eb3Var.b == null) {
                arrayList.remove(eb3Var);
            }
        }
    }

    public final void I(eb3 eb3Var) {
        s49 s49Var = eb3Var.a;
        if (s49Var != null) {
            J(eb3Var, s49Var);
        }
        s49 s49Var2 = eb3Var.b;
        if (s49Var2 != null) {
            J(eb3Var, s49Var2);
        }
    }

    public boolean J(eb3 eb3Var, s49 s49Var) {
        if (eb3Var.b == s49Var) {
            eb3Var.b = null;
        } else if (eb3Var.a == s49Var) {
            eb3Var.a = null;
        } else {
            return false;
        }
        View view = s49Var.a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(s49Var);
        return true;
    }

    public long K(long j, long j2, long j3) {
        return Math.max(j2, j3) + j;
    }

    public long L() {
        return this.d;
    }

    public final void R(s49 s49Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        s49Var.a.animate().setInterpolator(E);
        f(s49Var);
    }

    @Override
    public final boolean c(s49 s49Var, List list) {
        if (list.isEmpty() && !t(s49Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(s49 s49Var) {
        View view = s49Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((fb3) arrayList.get(size)).a == s49Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(s49Var);
                arrayList.remove(size);
            }
        }
        H(this.s, s49Var);
        if (this.p.remove(s49Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(s49Var);
        }
        if (this.q.remove(s49Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(s49Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, s49Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((fb3) arrayList5.get(size4)).a == s49Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(s49Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(s49Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(s49Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (!this.A.remove(s49Var)) {
            if (!this.y.remove(s49Var)) {
                if (!this.B.remove(s49Var)) {
                    if (!this.z.remove(s49Var)) {
                        G();
                        return;
                    }
                    boolean z = w01.a;
                    sc8.j("after animation is cancelled, item should not be in mMoveAnimations list");
                    return;
                }
                boolean z2 = w01.a;
                sc8.j("after animation is cancelled, item should not be in mChangeAnimations list");
                return;
            }
            boolean z3 = w01.a;
            sc8.j("after animation is cancelled, item should not be in mAddAnimations list");
            return;
        }
        boolean z4 = w01.a;
        sc8.j("after animation is cancelled, item should not be in mRemoveAnimations list");
    }

    @Override
    public void g() {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            fb3 fb3Var = (fb3) arrayList.get(size);
            View view = fb3Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(fb3Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((s49) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            s49 s49Var = (s49) arrayList3.get(size3);
            View view2 = s49Var.a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(s49Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((eb3) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                fb3 fb3Var2 = (fb3) arrayList6.get(size6);
                View view3 = fb3Var2.a.a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(fb3Var2.a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                s49 s49Var2 = (s49) arrayList8.get(size8);
                View view4 = s49Var2.a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(s49Var2);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.v;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                I((eb3) arrayList10.get(size10));
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
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
    public final boolean k() {
        if (this.q.isEmpty() && this.s.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.z.isEmpty() && this.A.isEmpty() && this.y.isEmpty() && this.B.isEmpty() && this.u.isEmpty() && this.t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j;
        long j2;
        ArrayList arrayList = this.p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                D((s49) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.u.add(arrayList5);
                arrayList2.clear();
                ab3 ab3Var = new ab3(this, arrayList5, (byte) 0);
                if (this.C && !isEmpty) {
                    View view = ((fb3) arrayList5.get(0)).a.a;
                    long L = L();
                    WeakHashMap weakHashMap = jdc.a;
                    view.postOnAnimationDelayed(ab3Var, L);
                } else {
                    ab3Var.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.v.add(arrayList6);
                arrayList3.clear();
                tq4 tq4Var = new tq4(this, arrayList6, false, (byte) 6);
                if (this.C && !isEmpty) {
                    View view2 = ((eb3) arrayList6.get(0)).a.a;
                    long j3 = this.d;
                    WeakHashMap weakHashMap2 = jdc.a;
                    view2.postOnAnimationDelayed(tq4Var, j3);
                } else {
                    tq4Var.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.t.add(arrayList7);
                arrayList4.clear();
                ab3 ab3Var2 = new ab3(this, arrayList7, (byte) 1);
                if (this.C && (!isEmpty || !isEmpty2 || !isEmpty3)) {
                    long j4 = 0;
                    if (!isEmpty) {
                        j = this.d;
                    } else {
                        j = 0;
                    }
                    if (!isEmpty2) {
                        j2 = j();
                    } else {
                        j2 = 0;
                    }
                    if (!isEmpty3) {
                        j4 = i();
                    }
                    long K = K(j, j2, j4);
                    View view3 = ((s49) arrayList7.get(0)).a;
                    WeakHashMap weakHashMap3 = jdc.a;
                    view3.postOnAnimationDelayed(ab3Var2, K);
                    return;
                }
                ab3Var2.run();
            }
        }
    }

    @Override
    public void p(s49 s49Var) {
        R(s49Var);
        View view = s49Var.a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.q.add(s49Var);
        F();
    }

    @Override
    public boolean q(s49 s49Var, s49 s49Var2, zw8 zw8Var, int i, int i2, int i3, int i4) {
        if (s49Var == s49Var2) {
            return r(s49Var, zw8Var, i, i2, i3, i4);
        }
        View view = s49Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(s49Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = s49Var2.a;
        R(s49Var2);
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.s.add(new eb3(s49Var, s49Var2, i, i2, i3, i4));
        F();
        return true;
    }

    @Override
    public boolean r(s49 s49Var, zw8 zw8Var, int i, int i2, int i3, int i4) {
        View view = s49Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) s49Var.a.getTranslationY());
        R(s49Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                v(s49Var);
                return false;
            }
        } else {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.r.add(new fb3(s49Var, translationX, translationY, i3, i4));
        F();
        return true;
    }

    @Override
    public void s(s49 s49Var, zw8 zw8Var) {
        R(s49Var);
        this.p.add(s49Var);
        F();
    }

    public void F() {
    }

    public void M() {
    }

    public void N() {
    }

    public void O() {
    }

    public void Q() {
    }

    public void P(s49 s49Var) {
    }

    public void z(s49 s49Var) {
    }
}
