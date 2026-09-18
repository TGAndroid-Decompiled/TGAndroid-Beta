package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.tl0;
public final class u2 implements View.OnAttachStateChangeListener {
    public final int f1568a;
    public final Object f1569b;

    public u2(Object obj, int i10) {
        this.f1568a = i10;
        this.f1569b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1568a) {
            case 0:
                ((v2) this.f1569b).f1605f.onAttachedToWindow();
                return;
            case 1:
                aa.a aVar = (aa.a) this.f1569b;
                hh.k kVar = (hh.k) aVar.f360c;
                ViewTreeObserver viewTreeObserver = ((View) aVar.f359b).getViewTreeObserver();
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
                ((xh.l2) this.f1569b).a(view);
                return;
            case 5:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f1569b;
                ArrayList arrayList = haVar.f24611c;
                arrayList.clear();
                for (View view2 = haVar.f24610b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 6:
                return;
            case 7:
                ((rq) this.f1569b).a();
                return;
            case 8:
                tl0 tl0Var = (tl0) this.f1569b;
                org.telegram.ui.Components.m5 m5Var = tl0Var.f28165t;
                if (m5Var != null) {
                    m5Var.a();
                }
                org.telegram.ui.Components.m5 m5Var2 = tl0Var.f28166u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ((org.telegram.ui.Components.m5) this.f1569b).a();
                return;
            case 11:
                ni.f fVar = (ni.f) this.f1569b;
                if (view == ((View) fVar.f15268b)) {
                    fVar.Q(view.getViewTreeObserver());
                    return;
                }
                return;
            case 12:
                ((xh.e1) this.f1569b).f45871l.a();
                return;
            case 13:
                xh.p3 p3Var = (xh.p3) this.f1569b;
                xh.n3 n3Var = p3Var.N;
                if (n3Var != null) {
                    n3Var.a(p3Var.f18655c);
                    return;
                }
                return;
            case 14:
                xh.s3 s3Var = (xh.s3) this.f1569b;
                xh.q3 q3Var = s3Var.N;
                if (q3Var != null) {
                    q3Var.a(s3Var.f18655c);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((yh.m3) this.f1569b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    yh.k3 k3Var = (yh.k3) obj;
                    if (k3Var.f47394c) {
                        k3Var.d.onAttachedToWindow();
                    }
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1568a) {
            case 0:
                ((v2) this.f1569b).f1605f.onDetachedFromWindow();
                return;
            case 1:
                aa.a aVar = (aa.a) this.f1569b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) aVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) aVar.d).removeOnPreDrawListener((hh.k) aVar.f360c);
                    }
                    aVar.d = null;
                    return;
                }
                return;
            case 2:
                l.e eVar = (l.e) this.f1569b;
                ViewTreeObserver viewTreeObserver2 = eVar.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.N = view.getViewTreeObserver();
                    }
                    eVar.N.removeGlobalOnLayoutListener(eVar.f13730r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                l.c0 c0Var = (l.c0) this.f1569b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f13717r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                ((xh.l2) this.f1569b).o(view);
                return;
            case 5:
                ((org.telegram.ui.Components.ha) this.f1569b).f24611c.clear();
                return;
            case 6:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) this.f1569b;
                ocVar.e.removeOnAttachStateChangeListener(this);
                ocVar.c(0L, false);
                return;
            case 7:
                ((rq) this.f1569b).b();
                return;
            case 8:
                tl0 tl0Var = (tl0) this.f1569b;
                org.telegram.ui.Components.m5 m5Var = tl0Var.f28165t;
                if (m5Var != null) {
                    m5Var.b();
                }
                org.telegram.ui.Components.m5 m5Var2 = tl0Var.f28166u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    return;
                }
                return;
            case 9:
                view.removeCallbacks((Runnable) ((do0) this.f1569b).f23373a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 10:
                ((org.telegram.ui.Components.m5) this.f1569b).b();
                return;
            case 11:
                ni.f fVar = (ni.f) this.f1569b;
                if (view == ((View) fVar.f15268b)) {
                    fVar.Q(null);
                    return;
                }
                return;
            case 12:
                ((xh.e1) this.f1569b).f45871l.b();
                return;
            case 13:
                xh.p3 p3Var = (xh.p3) this.f1569b;
                xh.n3 n3Var = p3Var.N;
                if (n3Var != null) {
                    n3Var.o(p3Var.f18655c);
                    return;
                }
                return;
            case 14:
                xh.s3 s3Var = (xh.s3) this.f1569b;
                xh.q3 q3Var = s3Var.N;
                if (q3Var != null) {
                    q3Var.o(s3Var.f18655c);
                    return;
                }
                return;
            default:
                ArrayList arrayList = ((yh.m3) this.f1569b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yh.k3) obj).a();
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
