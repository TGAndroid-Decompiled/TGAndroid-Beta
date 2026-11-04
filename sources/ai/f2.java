package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yp;
public final class f2 implements View.OnAttachStateChangeListener {
    public final int f642a;
    public final Object f643b;

    public f2(Object obj, int i3) {
        this.f642a = i3;
        this.f643b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f642a) {
            case 0:
                ((z1) this.f643b).run();
                return;
            case 1:
                ((m2) this.f643b).f807l.a();
                return;
            case 2:
                r5 r5Var = (r5) this.f643b;
                p5 p5Var = r5Var.f950b0;
                if (p5Var != null) {
                    p5Var.a(r5Var.f28814c);
                    return;
                }
                return;
            case 3:
                u5 u5Var = (u5) this.f643b;
                s5 s5Var = u5Var.f1022b0;
                if (s5Var != null) {
                    s5Var.a(u5Var.f28814c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((ci.u5) this.f643b).f6090e;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ci.s5 s5Var2 = (ci.s5) obj;
                    if (s5Var2.f5953c) {
                        s5Var2.d.P();
                    }
                }
                return;
            case 5:
                ((ei.u1) this.f643b).f11079f.P();
                return;
            case 6:
                k4.j jVar = (k4.j) this.f643b;
                kh.k kVar = (kh.k) jVar.f16870b;
                ViewTreeObserver viewTreeObserver = ((View) jVar.f16869a).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) jVar.f16871c;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) jVar.f16871c).removeOnPreDrawListener(kVar);
                        }
                        jVar.f16871c = null;
                    }
                    jVar.f16871c = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(kVar);
                        return;
                    }
                    return;
                }
                return;
            case 7:
            case 8:
                return;
            case 9:
                ((org.telegram.ui.Components.p6) this.f643b).c(null);
                return;
            case 10:
                ((m4) this.f643b).a(view);
                return;
            case 11:
                x9 x9Var = (x9) this.f643b;
                ArrayList arrayList2 = x9Var.f40273c;
                arrayList2.clear();
                for (View view2 = x9Var.f40272b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 12:
                return;
            case 13:
                ((yp) this.f643b).a();
                return;
            case 14:
                dk0 dk0Var = (dk0) this.f643b;
                org.telegram.ui.Components.e5 e5Var = dk0Var.f33147t;
                if (e5Var != null) {
                    e5Var.a();
                }
                org.telegram.ui.Components.e5 e5Var2 = dk0Var.f33148u;
                if (e5Var2 != null) {
                    e5Var2.a();
                    return;
                }
                return;
            case 15:
                return;
            default:
                ui.f fVar = (ui.f) this.f643b;
                if (view == ((View) fVar.f56391c)) {
                    fVar.M(view.getViewTreeObserver());
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f642a) {
            case 0:
                return;
            case 1:
                ((m2) this.f643b).f807l.b();
                return;
            case 2:
                r5 r5Var = (r5) this.f643b;
                p5 p5Var = r5Var.f950b0;
                if (p5Var != null) {
                    p5Var.n(r5Var.f28814c);
                    return;
                }
                return;
            case 3:
                u5 u5Var = (u5) this.f643b;
                s5 s5Var = u5Var.f1022b0;
                if (s5Var != null) {
                    s5Var.n(u5Var.f28814c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((ci.u5) this.f643b).f6090e;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ci.s5) obj).a();
                }
                return;
            case 5:
                ((ei.u1) this.f643b).f11079f.R();
                return;
            case 6:
                k4.j jVar = (k4.j) this.f643b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) jVar.f16871c;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) jVar.f16871c).removeOnPreDrawListener((kh.k) jVar.f16870b);
                    }
                    jVar.f16871c = null;
                    return;
                }
                return;
            case 7:
                l.e eVar = (l.e) this.f643b;
                ViewTreeObserver viewTreeObserver2 = eVar.O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.O = view.getViewTreeObserver();
                    }
                    eVar.O.removeGlobalOnLayoutListener(eVar.f17399r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                l.c0 c0Var = (l.c0) this.f643b;
                ViewTreeObserver viewTreeObserver3 = c0Var.F;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.F = view.getViewTreeObserver();
                    }
                    c0Var.F.removeGlobalOnLayoutListener(c0Var.f17385r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((org.telegram.ui.Components.p6) this.f643b).b(null);
                return;
            case 10:
                ((m4) this.f643b).n(view);
                return;
            case 11:
                ((x9) this.f643b).f40273c.clear();
                return;
            case 12:
                ac acVar = (ac) this.f643b;
                acVar.f31788e.removeOnAttachStateChangeListener(this);
                acVar.c(0L, false);
                return;
            case 13:
                ((yp) this.f643b).b();
                return;
            case 14:
                dk0 dk0Var = (dk0) this.f643b;
                org.telegram.ui.Components.e5 e5Var = dk0Var.f33147t;
                if (e5Var != null) {
                    e5Var.b();
                }
                org.telegram.ui.Components.e5 e5Var2 = dk0Var.f33148u;
                if (e5Var2 != null) {
                    e5Var2.a();
                    return;
                }
                return;
            case 15:
                view.removeCallbacks((Runnable) ((nm0) this.f643b).f36589a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ui.f fVar = (ui.f) this.f643b;
                if (view == ((View) fVar.f56391c)) {
                    fVar.M(null);
                    return;
                }
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
