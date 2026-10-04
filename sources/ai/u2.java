package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vo0;
public final class u2 implements View.OnAttachStateChangeListener {
    public final int f1711a;
    public final Object f1712b;

    public u2(Object obj, int i10) {
        this.f1711a = i10;
        this.f1712b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1711a) {
            case 0:
                ((v2) this.f1712b).f1743f.onAttachedToWindow();
                return;
            case 1:
                aa.a aVar = (aa.a) this.f1712b;
                hh.k kVar = (hh.k) aVar.f387c;
                ViewTreeObserver viewTreeObserver = ((View) aVar.f386b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) aVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) aVar.d).removeOnPreDrawListener(kVar);
                        }
                        aVar.d = null;
                    }
                    aVar.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(kVar);
                        return;
                    }
                    return;
                }
                return;
            case 2:
            case 3:
                return;
            case 4:
                ((xh.m2) this.f1712b).a(view);
                return;
            case 5:
                org.telegram.ui.Components.ka kaVar = (org.telegram.ui.Components.ka) this.f1712b;
                ArrayList arrayList = kaVar.f28052c;
                arrayList.clear();
                for (View view2 = kaVar.f28051b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 6:
                return;
            case 7:
                ((uq) this.f1712b).a();
                return;
            case 8:
                jm0 jm0Var = (jm0) this.f1712b;
                org.telegram.ui.Components.o5 o5Var = jm0Var.f27857t;
                if (o5Var != null) {
                    o5Var.a();
                }
                org.telegram.ui.Components.o5 o5Var2 = jm0Var.f27858u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ((org.telegram.ui.Components.o5) this.f1712b).a();
                return;
            case 11:
                qi.f fVar = (qi.f) this.f1712b;
                if (view == ((View) fVar.f45535b)) {
                    fVar.Q(view.getViewTreeObserver());
                    return;
                }
                return;
            case 12:
                ((xh.f1) this.f1712b).f49946l.a();
                return;
            case 13:
                xh.q3 q3Var = (xh.q3) this.f1712b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.a(q3Var.f20589c);
                    return;
                }
                return;
            case 14:
                xh.t3 t3Var = (xh.t3) this.f1712b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.a(t3Var.f20589c);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((yh.j3) this.f1712b).f51462e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    yh.h3 h3Var = (yh.h3) obj;
                    if (h3Var.f51385c) {
                        h3Var.d.onAttachedToWindow();
                    }
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1711a) {
            case 0:
                ((v2) this.f1712b).f1743f.onDetachedFromWindow();
                return;
            case 1:
                aa.a aVar = (aa.a) this.f1712b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) aVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) aVar.d).removeOnPreDrawListener((hh.k) aVar.f387c);
                    }
                    aVar.d = null;
                    return;
                }
                return;
            case 2:
                l.e eVar = (l.e) this.f1712b;
                ViewTreeObserver viewTreeObserver2 = eVar.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.N = view.getViewTreeObserver();
                    }
                    eVar.N.removeGlobalOnLayoutListener(eVar.f15153r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                l.c0 c0Var = (l.c0) this.f1712b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f15139r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                ((xh.m2) this.f1712b).o(view);
                return;
            case 5:
                ((org.telegram.ui.Components.ka) this.f1712b).f28052c.clear();
                return;
            case 6:
                org.telegram.ui.Components.rc rcVar = (org.telegram.ui.Components.rc) this.f1712b;
                rcVar.f30341e.removeOnAttachStateChangeListener(this);
                rcVar.c(0L, false);
                return;
            case 7:
                ((uq) this.f1712b).b();
                return;
            case 8:
                jm0 jm0Var = (jm0) this.f1712b;
                org.telegram.ui.Components.o5 o5Var = jm0Var.f27857t;
                if (o5Var != null) {
                    o5Var.b();
                }
                org.telegram.ui.Components.o5 o5Var2 = jm0Var.f27858u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    return;
                }
                return;
            case 9:
                view.removeCallbacks((Runnable) ((vo0) this.f1712b).f31756a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 10:
                ((org.telegram.ui.Components.o5) this.f1712b).b();
                return;
            case 11:
                qi.f fVar = (qi.f) this.f1712b;
                if (view == ((View) fVar.f45535b)) {
                    fVar.Q(null);
                    return;
                }
                return;
            case 12:
                ((xh.f1) this.f1712b).f49946l.b();
                return;
            case 13:
                xh.q3 q3Var = (xh.q3) this.f1712b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.o(q3Var.f20589c);
                    return;
                }
                return;
            case 14:
                xh.t3 t3Var = (xh.t3) this.f1712b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.o(t3Var.f20589c);
                    return;
                }
                return;
            default:
                ArrayList arrayList = ((yh.j3) this.f1712b).f51462e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yh.h3) obj).a();
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
