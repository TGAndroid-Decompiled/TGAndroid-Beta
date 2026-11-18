package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.wm0;
public final class r2 implements View.OnAttachStateChangeListener {
    public final int f4022a;
    public final Object f4023b;

    public r2(Object obj, int i7) {
        this.f4022a = i7;
        this.f4023b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4022a) {
            case 0:
                ((k2) this.f4023b).run();
                return;
            case 1:
                ((y2) this.f4023b).f4261l.a();
                return;
            case 2:
                q7 q7Var = (q7) this.f4023b;
                o7 o7Var = q7Var.f4015b0;
                if (o7Var != null) {
                    o7Var.a(q7Var.f30305c);
                    return;
                }
                return;
            case 3:
                t7 t7Var = (t7) this.f4023b;
                r7 r7Var = t7Var.f4097b0;
                if (r7Var != null) {
                    r7Var.a(t7Var.f30305c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f4023b).f9435e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    di.m5 m5Var = (di.m5) obj;
                    if (m5Var.f9310c) {
                        m5Var.d.P();
                    }
                }
                return;
            case 5:
                ((fi.l1) this.f4023b).f12210f.P();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f4023b;
                jh.k kVar = (jh.k) mVar.f13940c;
                ViewTreeObserver viewTreeObserver = ((View) mVar.f13939b).getViewTreeObserver();
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
                ((org.telegram.ui.Components.v6) this.f4023b).c(null);
                return;
            case 10:
                ((i6) this.f4023b).a(view);
                return;
            case 11:
                ca caVar = (ca) this.f4023b;
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
                ((a5.h) this.f4023b).a();
                return;
            case 14:
                mk0 mk0Var = (mk0) this.f4023b;
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
        switch (this.f4022a) {
            case 0:
                return;
            case 1:
                ((y2) this.f4023b).f4261l.b();
                return;
            case 2:
                q7 q7Var = (q7) this.f4023b;
                o7 o7Var = q7Var.f4015b0;
                if (o7Var != null) {
                    o7Var.n(q7Var.f30305c);
                    return;
                }
                return;
            case 3:
                t7 t7Var = (t7) this.f4023b;
                r7 r7Var = t7Var.f4097b0;
                if (r7Var != null) {
                    r7Var.n(t7Var.f30305c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.o5) this.f4023b).f9435e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((di.m5) obj).a();
                }
                return;
            case 5:
                ((fi.l1) this.f4023b).f12210f.R();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f4023b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) mVar.d).removeOnPreDrawListener((jh.k) mVar.f13940c);
                    }
                    mVar.d = null;
                    return;
                }
                return;
            case 7:
                l.e eVar = (l.e) this.f4023b;
                ViewTreeObserver viewTreeObserver2 = eVar.O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.O = view.getViewTreeObserver();
                    }
                    eVar.O.removeGlobalOnLayoutListener(eVar.f19162r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                l.c0 c0Var = (l.c0) this.f4023b;
                ViewTreeObserver viewTreeObserver3 = c0Var.F;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.F = view.getViewTreeObserver();
                    }
                    c0Var.F.removeGlobalOnLayoutListener(c0Var.f19148r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((org.telegram.ui.Components.v6) this.f4023b).b(null);
                return;
            case 10:
                ((i6) this.f4023b).n(view);
                return;
            case 11:
                ((ca) this.f4023b).f33943c.clear();
                return;
            case 12:
                gc gcVar = (gc) this.f4023b;
                gcVar.f35457e.removeOnAttachStateChangeListener(this);
                gcVar.c(0L, false);
                return;
            case 13:
                ((a5.h) this.f4023b).b();
                return;
            case 14:
                mk0 mk0Var = (mk0) this.f4023b;
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
                view.removeCallbacks((Runnable) ((wm0) this.f4023b).f41739a.remove(view));
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
