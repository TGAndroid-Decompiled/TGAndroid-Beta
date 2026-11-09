package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.lm0;
public final class m6 implements View.OnAttachStateChangeListener {
    public final int f4329a;
    public final Object f4330b;

    public m6(Object obj, int i7) {
        this.f4329a = i7;
        this.f4330b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4329a) {
            case 0:
                ArrayList arrayList = ((s6) this.f4330b).f4676e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    q6 q6Var = (q6) obj;
                    if (q6Var.f4574c) {
                        q6Var.d.P();
                    }
                }
                return;
            case 1:
                ((di.p1) this.f4330b).f9490f.P();
                return;
            case 2:
                h6.m mVar = (h6.m) this.f4330b;
                jh.k kVar = (jh.k) mVar.f14265c;
                ViewTreeObserver viewTreeObserver = ((View) mVar.f14264b).getViewTreeObserver();
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
            case 3:
            case 4:
                return;
            case 5:
                ((org.telegram.ui.Components.r6) this.f4330b).c(null);
                return;
            case 6:
                ((zh.x1) this.f4330b).a(view);
                return;
            case 7:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f4330b;
                ArrayList arrayList2 = y9Var.f40673c;
                arrayList2.clear();
                for (View view2 = y9Var.f40672b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 8:
                return;
            case 9:
                ((a5.h) this.f4330b).a();
                return;
            case 10:
                ak0 ak0Var = (ak0) this.f4330b;
                org.telegram.ui.Components.g5 g5Var = ak0Var.f31894t;
                if (g5Var != null) {
                    g5Var.a();
                }
                org.telegram.ui.Components.g5 g5Var2 = ak0Var.f31895u;
                if (g5Var2 != null) {
                    g5Var2.a();
                    return;
                }
                return;
            case 11:
                return;
            case 12:
                ((i0) this.f4330b).run();
                return;
            case 13:
                ((zh.v0) this.f4330b).f60573l.a();
                return;
            case 14:
                zh.x2 x2Var = (zh.x2) this.f4330b;
                zh.v2 v2Var = x2Var.f60595a0;
                if (v2Var != null) {
                    v2Var.a(x2Var.f28819c);
                    return;
                }
                return;
            default:
                zh.a3 a3Var = (zh.a3) this.f4330b;
                zh.y2 y2Var = a3Var.f60214a0;
                if (y2Var != null) {
                    y2Var.a(a3Var.f28819c);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4329a) {
            case 0:
                ArrayList arrayList = ((s6) this.f4330b).f4676e;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((q6) obj).a();
                }
                return;
            case 1:
                ((di.p1) this.f4330b).f9490f.R();
                return;
            case 2:
                h6.m mVar = (h6.m) this.f4330b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) mVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) mVar.d).removeOnPreDrawListener((jh.k) mVar.f14265c);
                    }
                    mVar.d = null;
                    return;
                }
                return;
            case 3:
                l.e eVar = (l.e) this.f4330b;
                ViewTreeObserver viewTreeObserver2 = eVar.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.N = view.getViewTreeObserver();
                    }
                    eVar.N.removeGlobalOnLayoutListener(eVar.f17653r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                l.c0 c0Var = (l.c0) this.f4330b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f17639r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 5:
                ((org.telegram.ui.Components.r6) this.f4330b).b(null);
                return;
            case 6:
                ((zh.x1) this.f4330b).n(view);
                return;
            case 7:
                ((org.telegram.ui.Components.y9) this.f4330b).f40673c.clear();
                return;
            case 8:
                org.telegram.ui.Components.cc ccVar = (org.telegram.ui.Components.cc) this.f4330b;
                ccVar.f32623e.removeOnAttachStateChangeListener(this);
                ccVar.c(0L, false);
                return;
            case 9:
                ((a5.h) this.f4330b).b();
                return;
            case 10:
                ak0 ak0Var = (ak0) this.f4330b;
                org.telegram.ui.Components.g5 g5Var = ak0Var.f31894t;
                if (g5Var != null) {
                    g5Var.b();
                }
                org.telegram.ui.Components.g5 g5Var2 = ak0Var.f31895u;
                if (g5Var2 != null) {
                    g5Var2.a();
                    return;
                }
                return;
            case 11:
                view.removeCallbacks((Runnable) ((lm0) this.f4330b).f35768a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 12:
                return;
            case 13:
                ((zh.v0) this.f4330b).f60573l.b();
                return;
            case 14:
                zh.x2 x2Var = (zh.x2) this.f4330b;
                zh.v2 v2Var = x2Var.f60595a0;
                if (v2Var != null) {
                    v2Var.n(x2Var.f28819c);
                    return;
                }
                return;
            default:
                zh.a3 a3Var = (zh.a3) this.f4330b;
                zh.y2 y2Var = a3Var.f60214a0;
                if (y2Var != null) {
                    y2Var.n(a3Var.f28819c);
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
