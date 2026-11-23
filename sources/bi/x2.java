package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.ym0;
public final class x2 implements View.OnAttachStateChangeListener {
    public final int f4198a;
    public final Object f4199b;

    public x2(Object obj, int i7) {
        this.f4198a = i7;
        this.f4199b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4198a) {
            case 0:
                ((q2) this.f4199b).run();
                return;
            case 1:
                ((e3) this.f4199b).f3490l.a();
                return;
            case 2:
                v7 v7Var = (v7) this.f4199b;
                t7 t7Var = v7Var.f4160b0;
                if (t7Var != null) {
                    t7Var.a(v7Var.f30346c);
                    return;
                }
                return;
            case 3:
                y7 y7Var = (y7) this.f4199b;
                w7 w7Var = y7Var.f4271b0;
                if (w7Var != null) {
                    w7Var.a(y7Var.f30346c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f4199b).f9425e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    di.m5 m5Var = (di.m5) obj;
                    if (m5Var.f9301c) {
                        m5Var.d.Q();
                    }
                }
                return;
            case 5:
                ((fi.l1) this.f4199b).f12214f.Q();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f4199b;
                jh.k kVar = (jh.k) mVar.f13932c;
                ViewTreeObserver viewTreeObserver = ((View) mVar.f13931b).getViewTreeObserver();
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
                ((org.telegram.ui.Components.v6) this.f4199b).c(null);
                return;
            case 10:
                ((n6) this.f4199b).a(view);
                return;
            case 11:
                ba baVar = (ba) this.f4199b;
                ArrayList arrayList2 = baVar.f33709c;
                arrayList2.clear();
                for (View view2 = baVar.f33708b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 12:
                return;
            case 13:
                ((a5.h) this.f4199b).a();
                return;
            case 14:
                ok0 ok0Var = (ok0) this.f4199b;
                org.telegram.ui.Components.m5 m5Var2 = ok0Var.f38190t;
                if (m5Var2 != null) {
                    m5Var2.a();
                }
                org.telegram.ui.Components.m5 m5Var3 = ok0Var.f38191u;
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
        switch (this.f4198a) {
            case 0:
                return;
            case 1:
                ((e3) this.f4199b).f3490l.b();
                return;
            case 2:
                v7 v7Var = (v7) this.f4199b;
                t7 t7Var = v7Var.f4160b0;
                if (t7Var != null) {
                    t7Var.n(v7Var.f30346c);
                    return;
                }
                return;
            case 3:
                y7 y7Var = (y7) this.f4199b;
                w7 w7Var = y7Var.f4271b0;
                if (w7Var != null) {
                    w7Var.n(y7Var.f30346c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f4199b).f9425e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((di.m5) obj).a();
                }
                return;
            case 5:
                ((fi.l1) this.f4199b).f12214f.S();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f4199b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) mVar.d).removeOnPreDrawListener((jh.k) mVar.f13932c);
                    }
                    mVar.d = null;
                    return;
                }
                return;
            case 7:
                l.e eVar = (l.e) this.f4199b;
                ViewTreeObserver viewTreeObserver2 = eVar.O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.O = view.getViewTreeObserver();
                    }
                    eVar.O.removeGlobalOnLayoutListener(eVar.f19255r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                l.c0 c0Var = (l.c0) this.f4199b;
                ViewTreeObserver viewTreeObserver3 = c0Var.F;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.F = view.getViewTreeObserver();
                    }
                    c0Var.F.removeGlobalOnLayoutListener(c0Var.f19241r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((org.telegram.ui.Components.v6) this.f4199b).b(null);
                return;
            case 10:
                ((n6) this.f4199b).n(view);
                return;
            case 11:
                ((ba) this.f4199b).f33709c.clear();
                return;
            case 12:
                fc fcVar = (fc) this.f4199b;
                fcVar.f35087e.removeOnAttachStateChangeListener(this);
                fcVar.c(0L, false);
                return;
            case 13:
                ((a5.h) this.f4199b).b();
                return;
            case 14:
                ok0 ok0Var = (ok0) this.f4199b;
                org.telegram.ui.Components.m5 m5Var = ok0Var.f38190t;
                if (m5Var != null) {
                    m5Var.b();
                }
                org.telegram.ui.Components.m5 m5Var2 = ok0Var.f38191u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    return;
                }
                return;
            default:
                view.removeCallbacks((Runnable) ((ym0) this.f4199b).f42520a.remove(view));
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
