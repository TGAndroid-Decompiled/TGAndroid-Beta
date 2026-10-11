package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.zm0;
public final class v2 implements View.OnAttachStateChangeListener {
    public final int f1819a;
    public final Object f1820b;

    public v2(Object obj, int i10) {
        this.f1819a = i10;
        this.f1820b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1819a) {
            case 0:
                ((w2) this.f1820b).f1847f.onAttachedToWindow();
                return;
            case 1:
                aa.a aVar = (aa.a) this.f1820b;
                hh.j jVar = (hh.j) aVar.f385c;
                ViewTreeObserver viewTreeObserver = ((View) aVar.f384b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) aVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) aVar.d).removeOnPreDrawListener(jVar);
                        }
                        aVar.d = null;
                    }
                    aVar.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(jVar);
                        return;
                    }
                    return;
                }
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((xh.m2) this.f1820b).a(view);
                return;
            case 5:
                org.telegram.ui.Components.la laVar = (org.telegram.ui.Components.la) this.f1820b;
                ArrayList arrayList = laVar.f28266c;
                arrayList.clear();
                for (View view2 = laVar.f28265b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 6:
                return;
            case 7:
                ((hr) this.f1820b).a();
                return;
            case 8:
                zm0 zm0Var = (zm0) this.f1820b;
                org.telegram.ui.Components.q5 q5Var = zm0Var.f33611t;
                if (q5Var != null) {
                    q5Var.a();
                }
                org.telegram.ui.Components.q5 q5Var2 = zm0Var.f33612u;
                if (q5Var2 != null) {
                    q5Var2.a();
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ((org.telegram.ui.Components.q5) this.f1820b).a();
                return;
            case 11:
                pi.f fVar = (pi.f) this.f1820b;
                if (view == ((View) fVar.f45939b)) {
                    fVar.Q(view.getViewTreeObserver());
                    return;
                }
                return;
            case 12:
                ((xh.g1) this.f1820b).f51324l.a();
                return;
            case 13:
                xh.q3 q3Var = (xh.q3) this.f1820b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.a(q3Var.f20550c);
                    return;
                }
                return;
            case 14:
                xh.t3 t3Var = (xh.t3) this.f1820b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.a(t3Var.f20550c);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((yh.f3) this.f1820b).f52577e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    yh.d3 d3Var = (yh.d3) obj;
                    if (d3Var.f52468c) {
                        d3Var.d.onAttachedToWindow();
                    }
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1819a) {
            case 0:
                ((w2) this.f1820b).f1847f.onDetachedFromWindow();
                return;
            case 1:
                aa.a aVar = (aa.a) this.f1820b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) aVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) aVar.d).removeOnPreDrawListener((hh.j) aVar.f385c);
                    }
                    aVar.d = null;
                    return;
                }
                return;
            case 2:
                l.e eVar = (l.e) this.f1820b;
                ViewTreeObserver viewTreeObserver2 = eVar.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.N = view.getViewTreeObserver();
                    }
                    eVar.N.removeGlobalOnLayoutListener(eVar.f15220r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                l.c0 c0Var = (l.c0) this.f1820b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f15206r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                ((xh.m2) this.f1820b).o(view);
                return;
            case 5:
                ((org.telegram.ui.Components.la) this.f1820b).f28266c.clear();
                return;
            case 6:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.f1820b;
                scVar.f30707e.removeOnAttachStateChangeListener(this);
                scVar.c(0L, false);
                return;
            case 7:
                ((hr) this.f1820b).b();
                return;
            case 8:
                zm0 zm0Var = (zm0) this.f1820b;
                org.telegram.ui.Components.q5 q5Var = zm0Var.f33611t;
                if (q5Var != null) {
                    q5Var.b();
                }
                org.telegram.ui.Components.q5 q5Var2 = zm0Var.f33612u;
                if (q5Var2 != null) {
                    q5Var2.a();
                    return;
                }
                return;
            case 9:
                view.removeCallbacks((Runnable) ((jp0) this.f1820b).f27721a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 10:
                ((org.telegram.ui.Components.q5) this.f1820b).b();
                return;
            case 11:
                pi.f fVar = (pi.f) this.f1820b;
                if (view == ((View) fVar.f45939b)) {
                    fVar.Q(null);
                    return;
                }
                return;
            case 12:
                ((xh.g1) this.f1820b).f51324l.b();
                return;
            case 13:
                xh.q3 q3Var = (xh.q3) this.f1820b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.o(q3Var.f20550c);
                    return;
                }
                return;
            case 14:
                xh.t3 t3Var = (xh.t3) this.f1820b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.o(t3Var.f20550c);
                    return;
                }
                return;
            default:
                ArrayList arrayList = ((yh.f3) this.f1820b).f52577e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yh.d3) obj).a();
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
}
