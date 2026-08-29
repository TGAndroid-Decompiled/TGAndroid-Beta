package f2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import bg.b3;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
public class l extends q1 {
    public static TimeInterpolator E;
    public Interpolator f6404o;
    public final ArrayList f6405p = new ArrayList();
    public final ArrayList f6406q = new ArrayList();
    public final ArrayList f6407r = new ArrayList();
    public final ArrayList f6408s = new ArrayList();
    public final ArrayList f6409t = new ArrayList();
    public final ArrayList f6410u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f6411w = new ArrayList();
    public final ArrayList f6412x = new ArrayList();
    public final ArrayList f6413y = new ArrayList();
    public final ArrayList f6414z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public boolean C = true;
    public long D = 0;

    static {
        boolean z10 = BuildVars.DEBUG_VERSION;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final j jVar) {
        View view;
        l lVar;
        final j jVar2;
        n1 n1Var = jVar.f6357a;
        View view2 = null;
        if (n1Var == null) {
            view = null;
        } else {
            view = n1Var.f6432a;
        }
        n1 n1Var2 = jVar.f6358b;
        if (n1Var2 != null) {
            view2 = n1Var2.f6432a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f6489g).setStartDelay(0L);
            arrayList.add(jVar.f6357a);
            startDelay.translationX(jVar.f6360e - jVar.f6359c);
            startDelay.translationY(jVar.f6361f - jVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l f6297b;

                {
                    this.f6297b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            n1 n1Var3 = jVar.f6357a;
                            this.f6297b.O();
                            return;
                        default:
                            n1 n1Var4 = jVar.f6358b;
                            this.f6297b.O();
                            return;
                    }
                }
            });
            lVar = this;
            jVar2 = jVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f6492k).setListener(new i(lVar, jVar2, startDelay, view, 0)).start();
        } else {
            lVar = this;
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f6358b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f6488f).setStartDelay(i() - lVar.f6488f).setInterpolator(lVar.f6492k).alpha(1.0f);
            if (A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l f6297b;

                {
                    this.f6297b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            n1 n1Var3 = jVar2.f6357a;
                            this.f6297b.O();
                            return;
                        default:
                            n1 n1Var4 = jVar2.f6358b;
                            this.f6297b.O();
                            return;
                    }
                }
            });
            animate.setListener(new i(lVar, jVar2, animate, view3, 1)).start();
        }
    }

    public void C(n1 n1Var, k kVar) {
        int i10 = kVar.f6380b;
        int i11 = kVar.f6381c;
        int i12 = kVar.d;
        int i13 = kVar.f6382e;
        View view = n1Var.f6432a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f6414z.add(n1Var);
        animate.setUpdateListener(new b3(2, this, n1Var));
        Interpolator interpolator = this.f6404o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.f6490i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new h(this, n1Var, i14, view, i15, animate, 0)).start();
    }

    public void D(n1 n1Var) {
        View view = n1Var.f6432a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(n1Var);
        if (this.f6493l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.f6493l).setInterpolator(this.f6491j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new d(this, n1Var, 0));
        animate.setListener(new g(this, n1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((n1) arrayList.get(size)).f6432a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.f6411w.clear();
            this.f6412x.clear();
        }
    }

    public final void H(ArrayList arrayList, n1 n1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j jVar = (j) arrayList.get(size);
            if (J(jVar, n1Var) && jVar.f6357a == null && jVar.f6358b == null) {
                arrayList.remove(jVar);
            }
        }
    }

    public final void I(j jVar) {
        n1 n1Var = jVar.f6357a;
        if (n1Var != null) {
            J(jVar, n1Var);
        }
        n1 n1Var2 = jVar.f6358b;
        if (n1Var2 != null) {
            J(jVar, n1Var2);
        }
    }

    public boolean J(j jVar, n1 n1Var) {
        if (jVar.f6358b == n1Var) {
            jVar.f6358b = null;
        } else if (jVar.f6357a == n1Var) {
            jVar.f6357a = null;
        } else {
            return false;
        }
        View view = n1Var.f6432a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(n1Var);
        return true;
    }

    public long K(long j10, long j11, long j12) {
        return Math.max(j11, j12) + j10;
    }

    public long L() {
        return this.d;
    }

    public final void R(n1 n1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        n1Var.f6432a.animate().setInterpolator(E);
        f(n1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override
    public final boolean c(n1 n1Var, List list) {
        if (list.isEmpty() && !t(n1Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(n1 n1Var) {
        View view = n1Var.f6432a;
        view.animate().cancel();
        ArrayList arrayList = this.f6407r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((k) arrayList.get(size)).f6379a == n1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(n1Var);
                arrayList.remove(size);
            }
        }
        H(this.f6408s, n1Var);
        if (this.f6405p.remove(n1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(n1Var);
        }
        if (this.f6406q.remove(n1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(n1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, n1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f6410u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((k) arrayList5.get(size4)).f6379a == n1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(n1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f6409t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(n1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(n1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(n1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.f6413y.remove(n1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(n1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.f6414z.remove(n1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f6407r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k kVar = (k) arrayList.get(size);
            View view = kVar.f6379a.f6432a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(kVar.f6379a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f6405p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((n1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f6406q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            n1 n1Var = (n1) arrayList3.get(size3);
            View view2 = n1Var.f6432a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(n1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f6408s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((j) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f6410u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                k kVar2 = (k) arrayList6.get(size6);
                View view3 = kVar2.f6379a.f6432a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(kVar2.f6379a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f6409t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                n1 n1Var2 = (n1) arrayList8.get(size8);
                View view4 = n1Var2.f6432a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(n1Var2);
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
                I((j) arrayList10.get(size10));
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        E(this.A);
        E(this.f6414z);
        E(this.f6413y);
        E(this.B);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f6406q.isEmpty() && this.f6408s.isEmpty() && this.f6407r.isEmpty() && this.f6405p.isEmpty() && this.f6414z.isEmpty() && this.A.isEmpty() && this.f6413y.isEmpty() && this.B.isEmpty() && this.f6410u.isEmpty() && this.f6409t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j10;
        long j11;
        ArrayList arrayList = this.f6405p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f6407r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f6408s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f6406q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                D((n1) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f6410u.add(arrayList5);
                arrayList2.clear();
                f fVar = new f(this, arrayList5, 0);
                if (this.C && !isEmpty) {
                    View view = ((k) arrayList5.get(0)).f6379a.f6432a;
                    long L = L();
                    WeakHashMap weakHashMap = r0.j0.f46829a;
                    view.postOnAnimationDelayed(fVar, L);
                } else {
                    fVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.v.add(arrayList6);
                arrayList3.clear();
                f fVar2 = new f(this, arrayList6, 1);
                if (this.C && !isEmpty) {
                    View view2 = ((j) arrayList6.get(0)).f6357a.f6432a;
                    long j12 = this.d;
                    WeakHashMap weakHashMap2 = r0.j0.f46829a;
                    view2.postOnAnimationDelayed(fVar2, j12);
                } else {
                    fVar2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f6409t.add(arrayList7);
                arrayList4.clear();
                f fVar3 = new f(this, arrayList7, 2);
                if (this.C && (!isEmpty || !isEmpty2 || !isEmpty3)) {
                    long j13 = 0;
                    if (!isEmpty) {
                        j10 = this.d;
                    } else {
                        j10 = 0;
                    }
                    if (!isEmpty2) {
                        j11 = j();
                    } else {
                        j11 = 0;
                    }
                    if (!isEmpty3) {
                        j13 = i();
                    }
                    long K = K(j10, j11, j13);
                    View view3 = ((n1) arrayList7.get(0)).f6432a;
                    WeakHashMap weakHashMap3 = r0.j0.f46829a;
                    view3.postOnAnimationDelayed(fVar3, K);
                    return;
                }
                fVar3.run();
            }
        }
    }

    @Override
    public void p(n1 n1Var) {
        R(n1Var);
        View view = n1Var.f6432a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f6406q.add(n1Var);
        F();
    }

    @Override
    public boolean q(n1 n1Var, n1 n1Var2, a5.e eVar, int i10, int i11, int i12, int i13) {
        if (n1Var == n1Var2) {
            return r(n1Var, eVar, i10, i11, i12, i13);
        }
        View view = n1Var.f6432a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(n1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = n1Var2.f6432a;
        R(n1Var2);
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f6408s.add(new j(n1Var, n1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public boolean r(n1 n1Var, a5.e eVar, int i10, int i11, int i12, int i13) {
        View view = n1Var.f6432a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) n1Var.f6432a.getTranslationY());
        R(n1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(n1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f6407r.add(new k(n1Var, translationX, translationY, i12, i13));
        F();
        return true;
    }

    @Override
    public void s(n1 n1Var, a5.e eVar) {
        R(n1Var);
        this.f6405p.add(n1Var);
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

    public void P(n1 n1Var) {
    }

    public void z(n1 n1Var) {
    }
}
