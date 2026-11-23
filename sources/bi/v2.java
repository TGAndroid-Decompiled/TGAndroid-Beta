package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.zm0;
public final class v2 implements View.OnAttachStateChangeListener {
    public final int f4173a;
    public final Object f4174b;

    public v2(Object obj, int i7) {
        this.f4173a = i7;
        this.f4174b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4173a) {
            case 0:
                ((o2) this.f4174b).run();
                return;
            case 1:
                ((c3) this.f4174b).f3469l.a();
                return;
            case 2:
                s7 s7Var = (s7) this.f4174b;
                q7 q7Var = s7Var.f4103b0;
                if (q7Var != null) {
                    q7Var.a(s7Var.f30289c);
                    return;
                }
                return;
            case 3:
                v7 v7Var = (v7) this.f4174b;
                t7 t7Var = v7Var.f4195b0;
                if (t7Var != null) {
                    t7Var.a(v7Var.f30289c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f4174b).f9464e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    di.m5 m5Var = (di.m5) obj;
                    if (m5Var.f9340c) {
                        m5Var.d.P();
                    }
                }
                return;
            case 5:
                ((fi.l1) this.f4174b).f12252f.P();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f4174b;
                jh.k kVar = (jh.k) mVar.f13969c;
                ViewTreeObserver viewTreeObserver = ((View) mVar.f13968b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) mVar.d).removeOnPreDrawListener(kVar);
                        }
                        mVar.d = null;
                    }
                    mVar.d = viewTreeObserver;
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
                ((org.telegram.ui.Components.w6) this.f4174b).c(null);
                return;
            case 10:
                ((k6) this.f4174b).a(view);
                return;
            case 11:
                ca caVar = (ca) this.f4174b;
                ArrayList arrayList2 = caVar.f34127c;
                arrayList2.clear();
                for (View view2 = caVar.f34126b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 12:
                return;
            case 13:
                ((a5.h) this.f4174b).a();
                return;
            case 14:
                ok0 ok0Var = (ok0) this.f4174b;
                org.telegram.ui.Components.n5 n5Var = ok0Var.f38270t;
                if (n5Var != null) {
                    n5Var.a();
                }
                org.telegram.ui.Components.n5 n5Var2 = ok0Var.f38271u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4173a) {
            case 0:
                return;
            case 1:
                ((c3) this.f4174b).f3469l.b();
                return;
            case 2:
                s7 s7Var = (s7) this.f4174b;
                q7 q7Var = s7Var.f4103b0;
                if (q7Var != null) {
                    q7Var.n(s7Var.f30289c);
                    return;
                }
                return;
            case 3:
                v7 v7Var = (v7) this.f4174b;
                t7 t7Var = v7Var.f4195b0;
                if (t7Var != null) {
                    t7Var.n(v7Var.f30289c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f4174b).f9464e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((di.m5) obj).a();
                }
                return;
            case 5:
                ((fi.l1) this.f4174b).f12252f.R();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f4174b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) mVar.d).removeOnPreDrawListener((jh.k) mVar.f13969c);
                    }
                    mVar.d = null;
                    return;
                }
                return;
            case 7:
                l.e eVar = (l.e) this.f4174b;
                ViewTreeObserver viewTreeObserver2 = eVar.O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.O = view.getViewTreeObserver();
                    }
                    eVar.O.removeGlobalOnLayoutListener(eVar.f19190r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                l.c0 c0Var = (l.c0) this.f4174b;
                ViewTreeObserver viewTreeObserver3 = c0Var.F;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.F = view.getViewTreeObserver();
                    }
                    c0Var.F.removeGlobalOnLayoutListener(c0Var.f19176r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((org.telegram.ui.Components.w6) this.f4174b).b(null);
                return;
            case 10:
                ((k6) this.f4174b).n(view);
                return;
            case 11:
                ((ca) this.f4174b).f34127c.clear();
                return;
            case 12:
                gc gcVar = (gc) this.f4174b;
                gcVar.f35523e.removeOnAttachStateChangeListener(this);
                gcVar.c(0L, false);
                return;
            case 13:
                ((a5.h) this.f4174b).b();
                return;
            case 14:
                ok0 ok0Var = (ok0) this.f4174b;
                org.telegram.ui.Components.n5 n5Var = ok0Var.f38270t;
                if (n5Var != null) {
                    n5Var.b();
                }
                org.telegram.ui.Components.n5 n5Var2 = ok0Var.f38271u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    return;
                }
                return;
            default:
                view.removeCallbacks((Runnable) ((zm0) this.f4174b).f42945a.remove(view));
                view.removeOnAttachStateChangeListener(this);
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
