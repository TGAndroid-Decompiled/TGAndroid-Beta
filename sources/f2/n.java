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
public class n extends t1 {
    public static TimeInterpolator E;
    public Interpolator f5449o;
    public final ArrayList f5450p = new ArrayList();
    public final ArrayList f5451q = new ArrayList();
    public final ArrayList f5452r = new ArrayList();
    public final ArrayList f5453s = new ArrayList();
    public final ArrayList f5454t = new ArrayList();
    public final ArrayList f5455u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList f5456w = new ArrayList();
    public final ArrayList f5457x = new ArrayList();
    public final ArrayList f5458y = new ArrayList();
    public final ArrayList f5459z = new ArrayList();
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

    public void B(final l lVar) {
        View view;
        n nVar;
        final l lVar2;
        q1 q1Var = lVar.f5414a;
        View view2 = null;
        if (q1Var == null) {
            view = null;
        } else {
            view = q1Var.f5501a;
        }
        q1 q1Var2 = lVar.f5415b;
        if (q1Var2 != null) {
            view2 = q1Var2.f5501a;
        }
        View view3 = view2;
        ArrayList arrayList = this.B;
        if (view != null) {
            ViewPropertyAnimator startDelay = view.animate().setDuration(this.f5551g).setStartDelay(0L);
            arrayList.add(lVar.f5414a);
            startDelay.translationX(lVar.f5417e - lVar.f5416c);
            startDelay.translationY(lVar.f5418f - lVar.d);
            startDelay.alpha(0.0f);
            if (A(view) > 0.0f) {
                startDelay.scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
            }
            startDelay.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n f5350b;

                {
                    this.f5350b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            q1 q1Var3 = lVar.f5414a;
                            this.f5350b.O();
                            return;
                        default:
                            q1 q1Var4 = lVar.f5415b;
                            this.f5350b.O();
                            return;
                    }
                }
            });
            nVar = this;
            lVar2 = lVar;
            startDelay.setStartDelay(0L).setInterpolator(this.f5554k).setListener(new k(nVar, lVar2, startDelay, view, 0)).start();
        } else {
            nVar = this;
            lVar2 = lVar;
        }
        if (view3 != null) {
            ViewPropertyAnimator animate = view3.animate();
            arrayList.add(lVar2.f5415b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(nVar.f5550f).setStartDelay(i() - nVar.f5550f).setInterpolator(nVar.f5554k).alpha(1.0f);
            if (A(view3) > 0.0f) {
                animate.scaleX(1.0f).scaleY(1.0f);
            }
            animate.setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n f5350b;

                {
                    this.f5350b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r3) {
                        case 0:
                            q1 q1Var3 = lVar2.f5414a;
                            this.f5350b.O();
                            return;
                        default:
                            q1 q1Var4 = lVar2.f5415b;
                            this.f5350b.O();
                            return;
                    }
                }
            });
            animate.setListener(new k(nVar, lVar2, animate, view3, 1)).start();
        }
    }

    public void C(q1 q1Var, m mVar) {
        int i9 = mVar.f5429b;
        int i10 = mVar.f5430c;
        int i11 = mVar.d;
        int i12 = mVar.f5431e;
        View view = q1Var.f5501a;
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        if (i13 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i14 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f5459z.add(q1Var);
        animate.setUpdateListener(new g(0, this, q1Var));
        Interpolator interpolator = this.f5449o;
        if (interpolator != null) {
            animate.setInterpolator(interpolator);
        } else {
            animate.setInterpolator(this.f5552i);
        }
        animate.setDuration(j()).setStartDelay(0L).setListener(new j(this, q1Var, i13, view, i14, animate, 0)).start();
    }

    public void D(q1 q1Var) {
        View view = q1Var.f5501a;
        ViewPropertyAnimator animate = view.animate();
        this.A.add(q1Var);
        if (this.f5555l > 0) {
            view.bringToFront();
        }
        animate.setDuration(this.d).setStartDelay(this.f5555l).setInterpolator(this.f5553j).alpha(0.0f).scaleX(1.0f - A(view)).scaleY(1.0f - A(view));
        animate.setUpdateListener(new e(this, q1Var, 0));
        animate.setListener(new i(this, q1Var, animate, view)).start();
    }

    public final void E(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((q1) arrayList.get(size)).f5501a.animate().cancel();
        }
    }

    public final void G() {
        if (!k()) {
            e();
            N();
            this.f5456w.clear();
            this.f5457x.clear();
        }
    }

    public final void H(ArrayList arrayList, q1 q1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l lVar = (l) arrayList.get(size);
            if (J(lVar, q1Var) && lVar.f5414a == null && lVar.f5415b == null) {
                arrayList.remove(lVar);
            }
        }
    }

    public final void I(l lVar) {
        q1 q1Var = lVar.f5414a;
        if (q1Var != null) {
            J(lVar, q1Var);
        }
        q1 q1Var2 = lVar.f5415b;
        if (q1Var2 != null) {
            J(lVar, q1Var2);
        }
    }

    public boolean J(l lVar, q1 q1Var) {
        if (lVar.f5415b == q1Var) {
            lVar.f5415b = null;
        } else if (lVar.f5414a == q1Var) {
            lVar.f5414a = null;
        } else {
            return false;
        }
        View view = q1Var.f5501a;
        view.setAlpha(1.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(q1Var);
        return true;
    }

    public long K(long j10, long j11, long j12) {
        return Math.max(j11, j12) + j10;
    }

    public long L() {
        return this.d;
    }

    public final void R(q1 q1Var) {
        if (E == null) {
            E = new ValueAnimator().getInterpolator();
        }
        q1Var.f5501a.animate().setInterpolator(E);
        f(q1Var);
    }

    public final void S() {
        this.C = false;
    }

    @Override
    public final boolean c(q1 q1Var, List list) {
        if (list.isEmpty() && !t(q1Var)) {
            return false;
        }
        return true;
    }

    @Override
    public void f(q1 q1Var) {
        View view = q1Var.f5501a;
        view.animate().cancel();
        ArrayList arrayList = this.f5452r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((m) arrayList.get(size)).f5428a == q1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(q1Var);
                arrayList.remove(size);
            }
        }
        H(this.f5453s, q1Var);
        if (this.f5450p.remove(q1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            d(q1Var);
        }
        if (this.f5451q.remove(q1Var)) {
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            u(q1Var);
        }
        ArrayList arrayList2 = this.v;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            H(arrayList3, q1Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f5455u;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((m) arrayList5.get(size4)).f5428a == q1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(q1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f5454t;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(q1Var)) {
                view.setAlpha(1.0f);
                if (A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                u(q1Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        if (this.A.remove(q1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mRemoveAnimations list");
        }
        if (this.f5458y.remove(q1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mAddAnimations list");
        }
        if (this.B.remove(q1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mChangeAnimations list");
        }
        if (this.f5459z.remove(q1Var) && BuildVars.DEBUG_VERSION) {
            throw new IllegalStateException("after animation is cancelled, item should not be in mMoveAnimations list");
        }
        G();
    }

    @Override
    public void g() {
        ArrayList arrayList = this.f5452r;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            m mVar = (m) arrayList.get(size);
            View view = mVar.f5428a.f5501a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(mVar.f5428a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f5450p;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            d((q1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5451q;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            q1 q1Var = (q1) arrayList3.get(size3);
            View view2 = q1Var.f5501a;
            view2.setAlpha(1.0f);
            if (A(view2) > 0.0f) {
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            u(q1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5453s;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            I((l) arrayList4.get(size4));
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.f5455u;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                m mVar2 = (m) arrayList6.get(size6);
                View view3 = mVar2.f5428a.f5501a;
                view3.setTranslationY(0.0f);
                view3.setTranslationX(0.0f);
                v(mVar2.f5428a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.f5454t;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                q1 q1Var2 = (q1) arrayList8.get(size8);
                View view4 = q1Var2.f5501a;
                view4.setAlpha(1.0f);
                if (A(view4) > 0.0f) {
                    view4.setScaleX(1.0f);
                    view4.setScaleY(1.0f);
                }
                u(q1Var2);
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
                I((l) arrayList10.get(size10));
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        E(this.A);
        E(this.f5459z);
        E(this.f5458y);
        E(this.B);
        e();
    }

    @Override
    public final boolean k() {
        if (this.f5451q.isEmpty() && this.f5453s.isEmpty() && this.f5452r.isEmpty() && this.f5450p.isEmpty() && this.f5459z.isEmpty() && this.A.isEmpty() && this.f5458y.isEmpty() && this.B.isEmpty() && this.f5455u.isEmpty() && this.f5454t.isEmpty() && this.v.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public void m() {
        long j10;
        long j11;
        ArrayList arrayList = this.f5450p;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f5452r;
        boolean isEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f5453s;
        boolean isEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f5451q;
        boolean isEmpty4 = arrayList4.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                D((q1) obj);
            }
            arrayList.clear();
            if (!isEmpty2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.f5455u.add(arrayList5);
                arrayList2.clear();
                h hVar = new h(this, arrayList5, 0);
                if (this.C && !isEmpty) {
                    View view = ((m) arrayList5.get(0)).f5428a.f5501a;
                    long L = L();
                    WeakHashMap weakHashMap = r0.j0.f46915a;
                    view.postOnAnimationDelayed(hVar, L);
                } else {
                    hVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.v.add(arrayList6);
                arrayList3.clear();
                h hVar2 = new h(this, arrayList6, 1);
                if (this.C && !isEmpty) {
                    View view2 = ((l) arrayList6.get(0)).f5414a.f5501a;
                    long j12 = this.d;
                    WeakHashMap weakHashMap2 = r0.j0.f46915a;
                    view2.postOnAnimationDelayed(hVar2, j12);
                } else {
                    hVar2.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.f5454t.add(arrayList7);
                arrayList4.clear();
                h hVar3 = new h(this, arrayList7, 2);
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
                    View view3 = ((q1) arrayList7.get(0)).f5501a;
                    WeakHashMap weakHashMap3 = r0.j0.f46915a;
                    view3.postOnAnimationDelayed(hVar3, K);
                    return;
                }
                hVar3.run();
            }
        }
    }

    @Override
    public void p(q1 q1Var) {
        R(q1Var);
        View view = q1Var.f5501a;
        view.setAlpha(0.0f);
        if (A(view) > 0.0f) {
            view.setScaleX(1.0f - A(view));
            view.setScaleY(1.0f - A(view));
        }
        this.f5451q.add(q1Var);
        F();
    }

    @Override
    public boolean q(q1 q1Var, q1 q1Var2, d5.p pVar, int i9, int i10, int i11, int i12) {
        if (q1Var == q1Var2) {
            return r(q1Var, pVar, i9, i10, i11, i12);
        }
        View view = q1Var.f5501a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        R(q1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = q1Var2.f5501a;
        R(q1Var2);
        view2.setTranslationX(-((int) ((i11 - i9) - translationX)));
        view2.setTranslationY(-((int) ((i12 - i10) - translationY)));
        view2.setAlpha(0.0f);
        if (A(view2) > 0.0f) {
            view2.setScaleX(1.0f - A(view2));
            view2.setScaleY(1.0f - A(view2));
        }
        this.f5453s.add(new l(q1Var, q1Var2, i9, i10, i11, i12));
        F();
        return true;
    }

    @Override
    public boolean r(q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12) {
        View view = q1Var.f5501a;
        int translationX = i9 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) q1Var.f5501a.getTranslationY());
        R(q1Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            v(q1Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f5452r.add(new m(q1Var, translationX, translationY, i11, i12));
        F();
        return true;
    }

    @Override
    public void s(q1 q1Var, d5.p pVar) {
        R(q1Var);
        this.f5450p.add(q1Var);
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

    public void P(q1 q1Var) {
    }

    public void z(q1 q1Var) {
    }
}
