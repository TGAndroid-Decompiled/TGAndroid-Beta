package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.zm0;
public final class v2 implements View.OnAttachStateChangeListener {
    public final int f4171a;
    public final Object f4172b;

    public v2(Object obj, int i7) {
        this.f4171a = i7;
        this.f4172b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4171a) {
            case 0:
                ((o2) this.f4172b).run();
                return;
            case 1:
                ((c3) this.f4172b).f3464l.a();
                return;
            case 2:
                t7 t7Var = (t7) this.f4172b;
                r7 r7Var = t7Var.f4126b0;
                if (r7Var != null) {
                    r7Var.a(t7Var.f30286c);
                    return;
                }
                return;
            case 3:
                w7 w7Var = (w7) this.f4172b;
                u7 u7Var = w7Var.f4224b0;
                if (u7Var != null) {
                    u7Var.a(w7Var.f30286c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f4172b).f9461e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    di.m5 m5Var = (di.m5) obj;
                    if (m5Var.f9337c) {
                        m5Var.d.P();
                    }
                }
                return;
            case 5:
                ((fi.l1) this.f4172b).f12249f.P();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f4172b;
                jh.k kVar = (jh.k) mVar.f13966c;
                ViewTreeObserver viewTreeObserver = ((View) mVar.f13965b).getViewTreeObserver();
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
                ((org.telegram.ui.Components.w6) this.f4172b).c(null);
                return;
            case 10:
                ((l6) this.f4172b).a(view);
                return;
            case 11:
                ca caVar = (ca) this.f4172b;
                ArrayList arrayList2 = caVar.f34133c;
                arrayList2.clear();
                for (View view2 = caVar.f34132b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 12:
                return;
            case 13:
                ((a5.h) this.f4172b).a();
                return;
            case 14:
                ok0 ok0Var = (ok0) this.f4172b;
                org.telegram.ui.Components.n5 n5Var = ok0Var.f38276t;
                if (n5Var != null) {
                    n5Var.a();
                }
                org.telegram.ui.Components.n5 n5Var2 = ok0Var.f38277u;
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
        switch (this.f4171a) {
            case 0:
                return;
            case 1:
                ((c3) this.f4172b).f3464l.b();
                return;
            case 2:
                t7 t7Var = (t7) this.f4172b;
                r7 r7Var = t7Var.f4126b0;
                if (r7Var != null) {
                    r7Var.n(t7Var.f30286c);
                    return;
                }
                return;
            case 3:
                w7 w7Var = (w7) this.f4172b;
                u7 u7Var = w7Var.f4224b0;
                if (u7Var != null) {
                    u7Var.n(w7Var.f30286c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f4172b).f9461e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((di.m5) obj).a();
                }
                return;
            case 5:
                ((fi.l1) this.f4172b).f12249f.R();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f4172b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) mVar.d).removeOnPreDrawListener((jh.k) mVar.f13966c);
                    }
                    mVar.d = null;
                    return;
                }
                return;
            case 7:
                l.e eVar = (l.e) this.f4172b;
                ViewTreeObserver viewTreeObserver2 = eVar.O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.O = view.getViewTreeObserver();
                    }
                    eVar.O.removeGlobalOnLayoutListener(eVar.f19187r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                l.c0 c0Var = (l.c0) this.f4172b;
                ViewTreeObserver viewTreeObserver3 = c0Var.F;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.F = view.getViewTreeObserver();
                    }
                    c0Var.F.removeGlobalOnLayoutListener(c0Var.f19173r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((org.telegram.ui.Components.w6) this.f4172b).b(null);
                return;
            case 10:
                ((l6) this.f4172b).n(view);
                return;
            case 11:
                ((ca) this.f4172b).f34133c.clear();
                return;
            case 12:
                gc gcVar = (gc) this.f4172b;
                gcVar.f35504e.removeOnAttachStateChangeListener(this);
                gcVar.c(0L, false);
                return;
            case 13:
                ((a5.h) this.f4172b).b();
                return;
            case 14:
                ok0 ok0Var = (ok0) this.f4172b;
                org.telegram.ui.Components.n5 n5Var = ok0Var.f38276t;
                if (n5Var != null) {
                    n5Var.b();
                }
                org.telegram.ui.Components.n5 n5Var2 = ok0Var.f38277u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    return;
                }
                return;
            default:
                view.removeCallbacks((Runnable) ((zm0) this.f4172b).f42941a.remove(view));
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
