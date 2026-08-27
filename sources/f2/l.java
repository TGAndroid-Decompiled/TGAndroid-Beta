package f2;

import ag.t2;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;

public class l extends r1 {
    public static TimeInterpolator E;

    public Interpolator f5737o;

    public final ArrayList f5738p = new ArrayList();

    public final ArrayList f5739q = new ArrayList();

    public final ArrayList f5740r = new ArrayList();

    public final ArrayList f5741s = new ArrayList();

    public final ArrayList f5742t = new ArrayList();

    public final ArrayList f5743u = new ArrayList();
    public final ArrayList v = new ArrayList();

    public final ArrayList f5744w = new ArrayList();

    public final ArrayList f5745x = new ArrayList();

    public final ArrayList f5746y = new ArrayList();

    public final ArrayList f5747z = new ArrayList();
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
        l lVar;
        final j jVar2;
        o1 o1Var = jVar.f5702a;
        View view = o1Var == null ? null : o1Var.f5789a;
        o1 o1Var2 = jVar.f5703b;
        View view2 = o1Var2 != null ? o1Var2.f5789a : null;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f5845g).setStartDelay(0L);
            arrayList.add(jVar.f5702a);
            startDelay.translationX(jVar.f5705e - jVar.f5704c);
            startDelay.translationY(jVar.f5706f - jVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            final int i10 = 0;
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final l f5645b;

                {
                    this.f5645b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            o1 o1Var3 = jVar.f5702a;
                            this.f5645b.O();
                            break;
                        default:
                            o1 o1Var4 = jVar.f5703b;
                            this.f5645b.O();
                            break;
                    }
                }
            });
            lVar = this;
            jVar2 = jVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f5848k).setListener(new i(lVar, jVar2, startDelay, view, 0)).start();
        } else {
            lVar = this;
            jVar2 = jVar;
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            arrayList.add(jVar2.f5703b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f5844f).setStartDelay(i() - lVar.f5844f).setInterpolator(lVar.f5848k).alpha(1.0f);
            if (A(view2) > 0.0f) {
                viewPropertyAnimatorAnimate.scaleX(1.0f).scaleY(1.0f);
            }
            final int i11 = 1;
            viewPropertyAnimatorAnimate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final l f5645b;

                {
                    this.f5645b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            o1 o1Var3 = jVar2.f5702a;
                            this.f5645b.O();
                            break;
                        default:
                            o1 o1Var4 = jVar2.f5703b;
                            this.f5645b.O();
                            break;
                    }
                }
            });
            viewPropertyAnimatorAnimate.setListener(new i(lVar, jVar2, viewPropertyAnimatorAnimate, view2, 1)).start();
        }
    }

    public void C(o1 o1Var, k kVar) {
        int i10 = kVar.f5717b;
        int i11 = kVar.f5718c;
        int i12 = kVar.d;
        int i13 = kVar.f5719e;
        View view = o1Var.f5789a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f5747z.add(o1Var);
        viewPropertyAnimatorAnimate.setUpdateListener(new t2(1, this, o1Var));
        Interpolator interpolator = this.f5737o;
        if (interpolator != null) {
            viewPropertyAnimatorAnimate.setInterpolator(interpolator);
        } else {
            viewPropertyAnimatorAnimate.setInterpolator(this.f5846i);
        }
        viewPropertyAnimatorAnimate.setDuration(j()).setStartDelay(0L).setListener(new h(this, o1Var, i14, view, i15, viewPropertyAnimatorAnimate, 0)).start();
    }

    public void D(o1 o1Var) {
        View view = o1Var.f5789a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.A.add(o1Var);
        if (this.f5849l > 0) {
            view.bringToFront();
        }
        viewPropertyAnimatorAnimate.setDuration(this.d).setStartDelay(this.f5849l).setInterpolator(this.f5847j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        viewPropertyAnimatorAnimate.setUpdateListener(new d(this, o1Var, 0));
        viewPropertyAnimatorAnimate.setListener(new g(this, o1Var, viewPropertyAnimatorAnimate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((o1) arrayList.get(size)).f5789a.animate().cancel();
        }
    }

    public final void G() {
        if (k()) {
            return;
        }
        e();
        N();
        this.f5744w.clear();
        this.f5745x.clear();
    }

    public final void H(ArrayList arrayList, o1 o1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j jVar = (j) arrayList.get(size);
            if (J(jVar, o1Var) && jVar.f5702a == null && jVar.f5703b == null) {
                arrayList.remove(jVar);
            }
        }
    }

    public final void I(j jVar) {
        o1 o1Var = jVar.f5702a;
        if (o1Var != null) {
            J(jVar, o1Var);
        }
        o1 o1Var2 = jVar.f5703b;
        if (o1Var2 != null) {
            J(jVar, o1Var2);
        }
    }

    public boolean J(j jVar, o1 o1Var) {
        if (jVar.f5703b == o1Var) {
            jVar.f5703b = null;
        } else {
            if (jVar.f5702a != o1Var) {
                return false;
            }
            jVar.f5702a = null;
        }
        View view = o1Var.f5789a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(o1Var);
        return true;
    }

    public long K(long j10, long j11, long j12) {
        return Math.max(j11, j12) + j10;
    }

    public long L() {
        return this.d;
    }

    public final void R(o1 o1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        o1Var.f5789a.animate().setInterpolator(E);
        f(o1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override
    public final boolean c(o1 o1Var, List list) {
        return !list.isEmpty() || t(o1Var);
    }

    @Override
    public void f(o1 o1Var) {
        View view = o1Var.f5789a;
        view.animate().cancel();
        ArrayList arrayList = this.f5740r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((k) arrayList.get(size)).f5716a == o1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(o1Var);
                arrayList.remove(size);
            }
        }
        H(this.f5741s, o1Var);
        if (this.f5738p.remove(o1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(o1Var);
        }
        if (this.f5739q.remove(o1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(o1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, o1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f5743u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((k) arrayList5.get(size4)).f5716a == o1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(o1Var);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f5742t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(o1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(o1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(o1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.f5746y.remove(o1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(o1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.f5747z.remove(o1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f5740r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k kVar = (k) arrayList.get(size);
            View view = kVar.f5716a.f5789a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(kVar.f5716a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f5738p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((o1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5739q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            o1 o1Var = (o1) arrayList3.get(size3);
            View view2 = o1Var.f5789a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(o1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5741s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((j) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.f5743u;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    k kVar2 = (k) arrayList6.get(size6);
                    View view3 = kVar2.f5716a.f5789a;
                    view3.setTranslationY(0.0f);
                    view3.setTranslationX(0.0f);
                    v(kVar2.f5716a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f5742t;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    o1 o1Var2 = (o1) arrayList8.get(size8);
                    View view4 = o1Var2.f5789a;
                    view4.setAlpha(1.0f);
                    if (A(view4) > 0.0f) {
                        view4.setScaleX(1.0f);
                        view4.setScaleY(1.0f);
                    }
                    u(o1Var2);
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
            E(this.f5747z);
            E(this.f5746y);
            E(this.B);
            e();
        }
    }

    @Override
    public final boolean k() {
        return (this.f5739q.isEmpty() && this.f5741s.isEmpty() && this.f5740r.isEmpty() && this.f5738p.isEmpty() && this.f5747z.isEmpty() && this.A.isEmpty() && this.f5746y.isEmpty() && this.B.isEmpty() && this.f5743u.isEmpty() && this.f5742t.isEmpty() && this.v.isEmpty()) ? false : true;
    }

    @Override
    public void m() {
        ArrayList arrayList = this.f5738p;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f5740r;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f5741s;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f5739q;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            D((o1) obj);
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.f5743u.add(arrayList5);
            arrayList2.clear();
            f fVar = new f(this, arrayList5, i10);
            if (!this.C || zIsEmpty) {
                fVar.run();
            } else {
                View view = ((k) arrayList5.get(0)).f5716a.f5789a;
                long jL = L();
                WeakHashMap weakHashMap = r0.j0.f46605a;
                view.postOnAnimationDelayed(fVar, jL);
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.v.add(arrayList6);
            arrayList3.clear();
            f fVar2 = new f(this, arrayList6, 1);
            if (!this.C || zIsEmpty) {
                fVar2.run();
            } else {
                View view2 = ((j) arrayList6.get(0)).f5702a.f5789a;
                long j10 = this.d;
                WeakHashMap weakHashMap2 = r0.j0.f46605a;
                view2.postOnAnimationDelayed(fVar2, j10);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.f5742t.add(arrayList7);
        arrayList4.clear();
        f fVar3 = new f(this, arrayList7, 2);
        if (!this.C || (zIsEmpty && zIsEmpty2 && zIsEmpty3)) {
            fVar3.run();
            return;
        }
        long jK = K(!zIsEmpty ? this.d : 0L, !zIsEmpty2 ? j() : 0L, zIsEmpty3 ? 0L : i());
        View view3 = ((o1) arrayList7.get(0)).f5789a;
        WeakHashMap weakHashMap3 = r0.j0.f46605a;
        view3.postOnAnimationDelayed(fVar3, jK);
    }

    @Override
    public void p(o1 o1Var) {
        R(o1Var);
        View view = o1Var.f5789a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f5739q.add(o1Var);
        F();
    }

    @Override
    public boolean q(o1 o1Var, o1 o1Var2, d5.p pVar, int i10, int i11, int i12, int i13) {
        if (o1Var == o1Var2) {
            return r(o1Var, pVar, i10, i11, i12, i13);
        }
        View view = o1Var.f5789a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(o1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = o1Var2.f5789a;
        R(o1Var2);
        view2.setTranslationX(-((int) ((i12 - i10) - translationX)));
        view2.setTranslationY(-((int) ((i13 - i11) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f5741s.add(new j(o1Var, o1Var2, i10, i11, i12, i13));
        F();
        return true;
    }

    @Override
    public boolean r(o1 o1Var, d5.p pVar, int i10, int i11, int i12, int i13) {
        View view = o1Var.f5789a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) o1Var.f5789a.getTranslationY());
        R(o1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            v(o1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f5740r.add(new k(o1Var, translationX, translationY, i12, i13));
        F();
        return true;
    }

    @Override
    public void s(o1 o1Var, d5.p pVar) {
        R(o1Var);
        this.f5738p.add(o1Var);
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

    public void P(o1 o1Var) {
    }

    public void z(o1 o1Var) {
    }
}
