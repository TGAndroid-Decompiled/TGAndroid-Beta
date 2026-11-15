package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.xb;
public final class x1 implements View.OnAttachStateChangeListener {
    public final int f3977a;
    public final Object f3978b;

    public x1(Object obj, int i7) {
        this.f3977a = i7;
        this.f3978b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3977a) {
            case 0:
                ((r1) this.f3978b).run();
                return;
            case 1:
                ((e2) this.f3978b).f3462l.a();
                return;
            case 2:
                j5 j5Var = (j5) this.f3978b;
                h5 h5Var = j5Var.f3633b0;
                if (h5Var != null) {
                    h5Var.a(j5Var.f29901c);
                    return;
                }
                return;
            case 3:
                m5 m5Var = (m5) this.f3978b;
                k5 k5Var = m5Var.f3716b0;
                if (k5Var != null) {
                    k5Var.a(m5Var.f29901c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.l5) this.f3978b).f8963e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    di.j5 j5Var2 = (di.j5) obj;
                    if (j5Var2.f8850c) {
                        j5Var2.d.P();
                    }
                }
                return;
            case 5:
                ((fi.n1) this.f3978b).f12065f.P();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f3978b;
                jh.k kVar = (jh.k) mVar.f13625c;
                ViewTreeObserver viewTreeObserver = ((View) mVar.f13624b).getViewTreeObserver();
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
                ((org.telegram.ui.Components.p6) this.f3978b).c(null);
                return;
            case 10:
                ((a4) this.f3978b).a(view);
                return;
            case 11:
                u9 u9Var = (u9) this.f3978b;
                ArrayList arrayList2 = u9Var.f39969c;
                arrayList2.clear();
                for (View view2 = u9Var.f39968b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 12:
                return;
            case 13:
                ((a5.h) this.f3978b).a();
                return;
            case 14:
                ek0 ek0Var = (ek0) this.f3978b;
                org.telegram.ui.Components.e5 e5Var = ek0Var.f34356t;
                if (e5Var != null) {
                    e5Var.a();
                }
                org.telegram.ui.Components.e5 e5Var2 = ek0Var.f34357u;
                if (e5Var2 != null) {
                    e5Var2.a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3977a) {
            case 0:
                return;
            case 1:
                ((e2) this.f3978b).f3462l.b();
                return;
            case 2:
                j5 j5Var = (j5) this.f3978b;
                h5 h5Var = j5Var.f3633b0;
                if (h5Var != null) {
                    h5Var.n(j5Var.f29901c);
                    return;
                }
                return;
            case 3:
                m5 m5Var = (m5) this.f3978b;
                k5 k5Var = m5Var.f3716b0;
                if (k5Var != null) {
                    k5Var.n(m5Var.f29901c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((di.l5) this.f3978b).f8963e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((di.j5) obj).a();
                }
                return;
            case 5:
                ((fi.n1) this.f3978b).f12065f.R();
                return;
            case 6:
                h6.m mVar = (h6.m) this.f3978b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) mVar.d).removeOnPreDrawListener((jh.k) mVar.f13625c);
                    }
                    mVar.d = null;
                    return;
                }
                return;
            case 7:
                l.e eVar = (l.e) this.f3978b;
                ViewTreeObserver viewTreeObserver2 = eVar.O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.O = view.getViewTreeObserver();
                    }
                    eVar.O.removeGlobalOnLayoutListener(eVar.f18795r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                l.c0 c0Var = (l.c0) this.f3978b;
                ViewTreeObserver viewTreeObserver3 = c0Var.F;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.F = view.getViewTreeObserver();
                    }
                    c0Var.F.removeGlobalOnLayoutListener(c0Var.f18781r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((org.telegram.ui.Components.p6) this.f3978b).b(null);
                return;
            case 10:
                ((a4) this.f3978b).n(view);
                return;
            case 11:
                ((u9) this.f3978b).f39969c.clear();
                return;
            case 12:
                xb xbVar = (xb) this.f3978b;
                xbVar.f41639e.removeOnAttachStateChangeListener(this);
                xbVar.c(0L, false);
                return;
            case 13:
                ((a5.h) this.f3978b).b();
                return;
            case 14:
                ek0 ek0Var = (ek0) this.f3978b;
                org.telegram.ui.Components.e5 e5Var = ek0Var.f34356t;
                if (e5Var != null) {
                    e5Var.b();
                }
                org.telegram.ui.Components.e5 e5Var2 = ek0Var.f34357u;
                if (e5Var2 != null) {
                    e5Var2.a();
                    return;
                }
                return;
            default:
                view.removeCallbacks((Runnable) ((om0) this.f3978b).f38027a.remove(view));
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
