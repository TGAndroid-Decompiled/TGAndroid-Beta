package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
public class sc3 extends jka {
    public static TimeInterpolator E;
    public d53 o;
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
        boolean z = e21.a;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final qc3 qc3Var) {
        View view;
        final sc3 sc3Var;
        final qc3 qc3Var2;
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
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.g).setStartDelay(0L);
            arrayList.add(qc3Var.a);
            startDelay.translationX(qc3Var.e - qc3Var.c);
            startDelay.translationY(qc3Var.f - qc3Var.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final sc3 b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    qc3 qc3Var3 = qc3Var;
                    sc3 sc3Var2 = this.b;
                    switch (b) {
                        case 0:
                            u69 u69Var3 = qc3Var3.a;
                            sc3Var2.O();
                            return;
                        default:
                            u69 u69Var4 = qc3Var3.b;
                            sc3Var2.O();
                            return;
                    }
                }
            });
            sc3Var = this;
            qc3Var2 = qc3Var;
            startDelay.setStartDelay(0L).setInterpolator(this.k).setListener(new pc3(sc3Var, qc3Var2, startDelay, view, (byte) 0)).start();
        } else {
            sc3Var = this;
            qc3Var2 = qc3Var;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(qc3Var2.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(sc3Var.f).setStartDelay(sc3Var.i() - sc3Var.f).setInterpolator(sc3Var.k).alpha(1.0f);
            if (sc3Var.A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(sc3Var) {
                public final sc3 b;

                {
                    this.b = sc3Var;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    byte b = r3;
                    qc3 qc3Var3 = qc3Var2;
                    sc3 sc3Var2 = this.b;
                    switch (b) {
                        case 0:
                            u69 u69Var3 = qc3Var3.a;
                            sc3Var2.O();
                            return;
                        default:
                            u69 u69Var4 = qc3Var3.b;
                            sc3Var2.O();
                            return;
                    }
                }
            });
            animate.setListener(new pc3(sc3Var, qc3Var2, animate, view3, (byte) 1)).start();
        }
    }

    public void C(u69 u69Var, rc3 rc3Var) {
        int i = rc3Var.b;
        int i2 = rc3Var.c;
        int i3 = rc3Var.d;
        int i4 = rc3Var.e;
        View view = u69Var.a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.z.add(u69Var);
        animate.setUpdateListener(new pl(this, u69Var, (byte) 11));
        d53 d53Var = this.o;
        if (d53Var != null) {
            animate.setInterpolator(d53Var);
        } else {
            animate.setInterpolator(this.i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new oc3(this, u69Var, i5, view, i6, animate, (byte) 0)).start();
    }

    public void D(u69 u69Var) {
        View view = u69Var.a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(u69Var);
        if (this.l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.l).setInterpolator(this.j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new kc3(this, u69Var, (byte) 0));
        animate.setListener(new nc3(this, u69Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((u69) arrayList.get(size)).a.animate().cancel();
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

    public final void H(ArrayList arrayList, u69 u69Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            qc3 qc3Var = (qc3) arrayList.get(size);
            if (J(qc3Var, u69Var) && qc3Var.a == null && qc3Var.b == null) {
                arrayList.remove(qc3Var);
            }
        }
    }

    public final void I(qc3 qc3Var) {
        u69 u69Var = qc3Var.a;
        if (u69Var != null) {
            J(qc3Var, u69Var);
        }
        u69 u69Var2 = qc3Var.b;
        if (u69Var2 != null) {
            J(qc3Var, u69Var2);
        }
    }

    public boolean J(qc3 qc3Var, u69 u69Var) {
        if (qc3Var.b == u69Var) {
            qc3Var.b = null;
        } else if (qc3Var.a == u69Var) {
            qc3Var.a = null;
        } else {
            return false;
        }
        View view = u69Var.a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(u69Var);
        return true;
    }

    public long K(long j, long j2, long j3) {
        return Math.max(j2, j3) + j;
    }

    public long L() {
        return this.d;
    }

    public final void R(u69 u69Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        u69Var.a.animate().setInterpolator(E);
        f(u69Var);
    }

    @Override
    public final boolean c(u69 u69Var, List list) {
        if (list.isEmpty() && !t(u69Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(u69 u69Var) {
        View view = u69Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((rc3) arrayList.get(size)).a == u69Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(u69Var);
                arrayList.remove(size);
            }
        }
        H(this.s, u69Var);
        if (this.p.remove(u69Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(u69Var);
        }
        if (this.q.remove(u69Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(u69Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, u69Var);
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
                } else if (((rc3) arrayList5.get(size4)).a == u69Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(u69Var);
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
            if (arrayList7.remove(u69Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(u69Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (!this.A.remove(u69Var)) {
            if (!this.y.remove(u69Var)) {
                if (!this.B.remove(u69Var)) {
                    if (!this.z.remove(u69Var)) {
                        G();
                        return;
                    }
                    boolean z = e21.a;
                    dq9.m("after animation is cancelled, item should not be in mMoveAnimations list");
                    return;
                }
                boolean z2 = e21.a;
                dq9.m("after animation is cancelled, item should not be in mChangeAnimations list");
                return;
            }
            boolean z3 = e21.a;
            dq9.m("after animation is cancelled, item should not be in mAddAnimations list");
            return;
        }
        boolean z4 = e21.a;
        dq9.m("after animation is cancelled, item should not be in mRemoveAnimations list");
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
            rc3 rc3Var = (rc3) arrayList.get(size);
            View view = rc3Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(rc3Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((u69) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            u69 u69Var = (u69) arrayList3.get(size3);
            View view2 = u69Var.a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(u69Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((qc3) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                rc3 rc3Var2 = (rc3) arrayList6.get(size6);
                View view3 = rc3Var2.a.a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(rc3Var2.a);
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
                u69 u69Var2 = (u69) arrayList8.get(size8);
                View view4 = u69Var2.a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(u69Var2);
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
                I((qc3) arrayList10.get(size10));
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
                D((u69) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.u.add(arrayList5);
                arrayList2.clear();
                mc3 mc3Var = new mc3(this, arrayList5, (byte) 0);
                if (this.C && !isEmpty) {
                    View view = ((rc3) arrayList5.get(0)).a.a;
                    long L = L();
                    WeakHashMap weakHashMap = kfc.a;
                    view.postOnAnimationDelayed(mc3Var, L);
                } else {
                    mc3Var.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.v.add(arrayList6);
                arrayList3.clear();
                us4 us4Var = new us4(this, arrayList6, false, (byte) 6);
                if (this.C && !isEmpty) {
                    View view2 = ((qc3) arrayList6.get(0)).a.a;
                    long j3 = this.d;
                    WeakHashMap weakHashMap2 = kfc.a;
                    view2.postOnAnimationDelayed(us4Var, j3);
                } else {
                    us4Var.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.t.add(arrayList7);
                arrayList4.clear();
                mc3 mc3Var2 = new mc3(this, arrayList7, (byte) 1);
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
                    View view3 = ((u69) arrayList7.get(0)).a;
                    WeakHashMap weakHashMap3 = kfc.a;
                    view3.postOnAnimationDelayed(mc3Var2, K);
                    return;
                }
                mc3Var2.run();
            }
        }
    }

    @Override
    public void p(u69 u69Var) {
        R(u69Var);
        View view = u69Var.a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.q.add(u69Var);
        F();
    }

    @Override
    public boolean q(u69 u69Var, u69 u69Var2, az8 az8Var, int i, int i2, int i3, int i4) {
        if (u69Var == u69Var2) {
            return r(u69Var, az8Var, i, i2, i3, i4);
        }
        View view = u69Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(u69Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = u69Var2.a;
        R(u69Var2);
        view2.setTranslationX(-((int) ((i3 - i) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i2) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.s.add(new qc3(u69Var, u69Var2, i, i2, i3, i4));
        F();
        return true;
    }

    @Override
    public boolean r(u69 u69Var, az8 az8Var, int i, int i2, int i3, int i4) {
        View view = u69Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) u69Var.a.getTranslationY());
        R(u69Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                v(u69Var);
                return false;
            }
        } else {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.r.add(new rc3(u69Var, translationX, translationY, i3, i4));
        F();
        return true;
    }

    @Override
    public void s(u69 u69Var, az8 az8Var) {
        R(u69Var);
        this.p.add(u69Var);
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

    public void P(u69 u69Var) {
    }

    public void z(u69 u69Var) {
    }
}
