package f2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
public class l extends o1 {
    public static TimeInterpolator E;
    public Interpolator f5762o;
    public final ArrayList f5763p = new ArrayList();
    public final ArrayList f5764q = new ArrayList();
    public final ArrayList f5765r = new ArrayList();
    public final ArrayList f5766s = new ArrayList();
    public final ArrayList f5767t = new ArrayList();
    public final ArrayList f5768u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f5769w = new ArrayList();
    public final ArrayList f5770x = new ArrayList();
    public final ArrayList f5771y = new ArrayList();
    public final ArrayList f5772z = new ArrayList();
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public boolean C = true;
    public long D = 0;

    static {
        boolean z4 = BuildVars.DEBUG_VERSION;
    }

    public float A(View view) {
        return 0.0f;
    }

    public void B(final j jVar) {
        View view;
        l lVar;
        final j jVar2;
        l1 l1Var = jVar.f5742a;
        View view2 = null;
        if (l1Var == null) {
            view = null;
        } else {
            view = l1Var.f5774a;
        }
        l1 l1Var2 = jVar.f5743b;
        if (l1Var2 != null) {
            view2 = l1Var2.f5774a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f5828g).setStartDelay(0L);
            arrayList.add(jVar.f5742a);
            startDelay.translationX(jVar.e - jVar.f5744c);
            startDelay.translationY(jVar.f5745f - jVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l f5668b;

                {
                    this.f5668b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            l1 l1Var3 = jVar.f5742a;
                            this.f5668b.O();
                            return;
                        default:
                            l1 l1Var4 = jVar.f5743b;
                            this.f5668b.O();
                            return;
                    }
                }
            });
            lVar = this;
            jVar2 = jVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f5831k).setListener(new i(lVar, jVar2, startDelay, view, 0)).start();
        } else {
            lVar = this;
            jVar2 = jVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(jVar2.f5743b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f5827f).setStartDelay(i() - lVar.f5827f).setInterpolator(lVar.f5831k).alpha(1.0f);
            if (A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l f5668b;

                {
                    this.f5668b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            l1 l1Var3 = jVar2.f5742a;
                            this.f5668b.O();
                            return;
                        default:
                            l1 l1Var4 = jVar2.f5743b;
                            this.f5668b.O();
                            return;
                    }
                }
            });
            animate.setListener(new i(lVar, jVar2, animate, view3, 1)).start();
        }
    }

    public void C(l1 l1Var, k kVar) {
        int i10 = kVar.f5756b;
        int i11 = kVar.f5757c;
        int i12 = kVar.d;
        int i13 = kVar.e;
        View view = l1Var.f5774a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f5772z.add(l1Var);
        animate.setUpdateListener(new ag.a(3, this, l1Var));
        Interpolator interpolator = this.f5762o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.f5829i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new h(this, l1Var, i14, view, i15, animate, 0)).start();
    }

    public void D(l1 l1Var) {
        View view = l1Var.f5774a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(l1Var);
        if (this.f5832l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.f5832l).setInterpolator(this.f5830j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new d(this, l1Var, 0));
        animate.setListener(new g(this, l1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((l1) arrayList.get(size)).f5774a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.f5769w.clear();
            this.f5770x.clear();
        }
    }

    public final void H(ArrayList arrayList, l1 l1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j jVar = (j) arrayList.get(size);
            if (J(jVar, l1Var) && jVar.f5742a == null && jVar.f5743b == null) {
                arrayList.remove(jVar);
            }
        }
    }

    public final void I(j jVar) {
        l1 l1Var = jVar.f5742a;
        if (l1Var != null) {
            J(jVar, l1Var);
        }
        l1 l1Var2 = jVar.f5743b;
        if (l1Var2 != null) {
            J(jVar, l1Var2);
        }
    }

    public boolean J(j jVar, l1 l1Var) {
        if (jVar.f5743b == l1Var) {
            jVar.f5743b = null;
        } else if (jVar.f5742a == l1Var) {
            jVar.f5742a = null;
        } else {
            return false;
        }
        View view = l1Var.f5774a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(l1Var);
        return true;
    }

    public long K(long j10, long j11, long j12) {
        return Math.max(j11, j12) + j10;
    }

    public long L() {
        return this.d;
    }

    public final void R(l1 l1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        l1Var.f5774a.animate().setInterpolator(E);
        f(l1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override
    public final boolean c(l1 l1Var, List list) {
        if (list.isEmpty() && !t(l1Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(l1 l1Var) {
        View view = l1Var.f5774a;
        view.animate().cancel();
        ArrayList arrayList = this.f5765r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((k) arrayList.get(size)).f5755a == l1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(l1Var);
                arrayList.remove(size);
            }
        }
        H(this.f5766s, l1Var);
        if (this.f5763p.remove(l1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(l1Var);
        }
        if (this.f5764q.remove(l1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(l1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, l1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f5768u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((k) arrayList5.get(size4)).f5755a == l1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(l1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f5767t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(l1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(l1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(l1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.f5771y.remove(l1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(l1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.f5772z.remove(l1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f5765r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k kVar = (k) arrayList.get(size);
            View view = kVar.f5755a.f5774a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(kVar.f5755a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f5763p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((l1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5764q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            l1 l1Var = (l1) arrayList3.get(size3);
            View view2 = l1Var.f5774a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(l1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5766s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((j) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f5768u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                k kVar2 = (k) arrayList6.get(size6);
                View view3 = kVar2.f5755a.f5774a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(kVar2.f5755a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f5767t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                l1 l1Var2 = (l1) arrayList8.get(size8);
                View view4 = l1Var2.f5774a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(l1Var2);
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
        E(this.f5772z);
        E(this.f5771y);
        E(this.B);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f5764q.isEmpty() && this.f5766s.isEmpty() && this.f5765r.isEmpty() && this.f5763p.isEmpty() && this.f5772z.isEmpty() && this.A.isEmpty() && this.f5771y.isEmpty() && this.B.isEmpty() && this.f5768u.isEmpty() && this.f5767t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j10;
        long j11;
        ArrayList arrayList = this.f5763p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f5765r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f5766s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f5764q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                D((l1) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f5768u.add(arrayList5);
                arrayList2.clear();
                f fVar = new f(this, arrayList5, 0);
                if (this.C && !isEmpty) {
                    View view = ((k) arrayList5.get(0)).f5755a.f5774a;
                    long L = L();
                    WeakHashMap weakHashMap = r0.j0.f43142a;
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
                    View view2 = ((j) arrayList6.get(0)).f5742a.f5774a;
                    long j12 = this.d;
                    WeakHashMap weakHashMap2 = r0.j0.f43142a;
                    view2.postOnAnimationDelayed(fVar2, j12);
                } else {
                    fVar2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f5767t.add(arrayList7);
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
                    View view3 = ((l1) arrayList7.get(0)).f5774a;
                    WeakHashMap weakHashMap3 = r0.j0.f43142a;
                    view3.postOnAnimationDelayed(fVar3, K);
                    return;
                }
                fVar3.run();
            }
        }
    }

    @Override
    public void p(l1 l1Var) {
        R(l1Var);
        View view = l1Var.f5774a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f5764q.add(l1Var);
        F();
    }

    @Override
    public boolean q(l1 l1Var, l1 l1Var2, c5.e eVar, int i10, int i11, int i12, int i13) {
        if (l1Var == l1Var2) {
            return r(l1Var, eVar, i10, i11, i12, i13);
        }
        View view = l1Var.f5774a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(l1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = l1Var2.f5774a;
        R(l1Var2);
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f5766s.add(new j(l1Var, l1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public boolean r(l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13) {
        View view = l1Var.f5774a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) l1Var.f5774a.getTranslationY());
        R(l1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(l1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f5765r.add(new k(l1Var, translationX, translationY, i12, i13));
        F();
        return true;
    }

    @Override
    public void s(l1 l1Var, c5.e eVar) {
        R(l1Var);
        this.f5763p.add(l1Var);
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

    public void P(l1 l1Var) {
    }

    public void z(l1 l1Var) {
    }
}
