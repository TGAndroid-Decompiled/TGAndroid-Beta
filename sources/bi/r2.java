package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.wm0;
public final class r2 implements View.OnAttachStateChangeListener {
    public final int f3993a;
    public final Object f3994b;

    public r2(Object obj, int i7) {
        this.f3993a = i7;
        this.f3994b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3993a) {
            case 0:
                ((k2) this.f3994b).run();
                return;
            case 1:
                ((y2) this.f3994b).f4229l.a();
                return;
            case 2:
                p7 p7Var = (p7) this.f3994b;
                n7 n7Var = p7Var.f3953b0;
                if (n7Var != null) {
                    n7Var.a(p7Var.f30303c);
                    return;
                }
                return;
            case 3:
                s7 s7Var = (s7) this.f3994b;
                q7 q7Var = s7Var.f4040b0;
                if (q7Var != null) {
                    q7Var.a(s7Var.f30303c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f3994b).f9432e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    di.m5 m5Var = (di.m5) obj;
                    if (m5Var.f9307c) {
                        m5Var.d.P();
                    }
                }
                return;
            case 5:
                ((fi.l1) this.f3994b).f12207f.P();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f3994b;
                jh.k kVar = (jh.k) mVar.f13937c;
                ViewTreeObserver viewTreeObserver = ((View) mVar.f13936b).getViewTreeObserver();
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
                ((org.telegram.ui.Components.v6) this.f3994b).c(null);
                return;
            case 10:
                ((h6) this.f3994b).a(view);
                return;
            case 11:
                ca caVar = (ca) this.f3994b;
                ArrayList arrayList2 = caVar.f33943c;
                arrayList2.clear();
                for (View view2 = caVar.f33942b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 12:
                return;
            case 13:
                ((a5.h) this.f3994b).a();
                return;
            case 14:
                mk0 mk0Var = (mk0) this.f3994b;
                org.telegram.ui.Components.m5 m5Var2 = mk0Var.f37545t;
                if (m5Var2 != null) {
                    m5Var2.a();
                }
                org.telegram.ui.Components.m5 m5Var3 = mk0Var.f37546u;
                if (m5Var3 != null) {
                    m5Var3.a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3993a) {
            case 0:
                return;
            case 1:
                ((y2) this.f3994b).f4229l.b();
                return;
            case 2:
                p7 p7Var = (p7) this.f3994b;
                n7 n7Var = p7Var.f3953b0;
                if (n7Var != null) {
                    n7Var.n(p7Var.f30303c);
                    return;
                }
                return;
            case 3:
                s7 s7Var = (s7) this.f3994b;
                q7 q7Var = s7Var.f4040b0;
                if (q7Var != null) {
                    q7Var.n(s7Var.f30303c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f3994b).f9432e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((di.m5) obj).a();
                }
                return;
            case 5:
                ((fi.l1) this.f3994b).f12207f.R();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f3994b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) mVar.d).removeOnPreDrawListener((jh.k) mVar.f13937c);
                    }
                    mVar.d = null;
                    return;
                }
                return;
            case 7:
                l.e eVar = (l.e) this.f3994b;
                ViewTreeObserver viewTreeObserver2 = eVar.O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.O = view.getViewTreeObserver();
                    }
                    eVar.O.removeGlobalOnLayoutListener(eVar.f19159r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                l.c0 c0Var = (l.c0) this.f3994b;
                ViewTreeObserver viewTreeObserver3 = c0Var.F;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.F = view.getViewTreeObserver();
                    }
                    c0Var.F.removeGlobalOnLayoutListener(c0Var.f19145r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((org.telegram.ui.Components.v6) this.f3994b).b(null);
                return;
            case 10:
                ((h6) this.f3994b).n(view);
                return;
            case 11:
                ((ca) this.f3994b).f33943c.clear();
                return;
            case 12:
                gc gcVar = (gc) this.f3994b;
                gcVar.f35457e.removeOnAttachStateChangeListener(this);
                gcVar.c(0L, false);
                return;
            case 13:
                ((a5.h) this.f3994b).b();
                return;
            case 14:
                mk0 mk0Var = (mk0) this.f3994b;
                org.telegram.ui.Components.m5 m5Var = mk0Var.f37545t;
                if (m5Var != null) {
                    m5Var.b();
                }
                org.telegram.ui.Components.m5 m5Var2 = mk0Var.f37546u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    return;
                }
                return;
            default:
                view.removeCallbacks((Runnable) ((wm0) this.f3994b).f41739a.remove(view));
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
