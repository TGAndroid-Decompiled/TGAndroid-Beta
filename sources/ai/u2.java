package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.rq;
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
                ((xh.m2) this.f1569b).a(view);
                return;
            case 5:
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.f1569b;
                ArrayList arrayList = jaVar.f25273c;
                arrayList.clear();
                for (View view2 = jaVar.f25272b; view2 != null; view2 = (View) view2.getParent()) {
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
                dm0 dm0Var = (dm0) this.f1569b;
                org.telegram.ui.Components.o5 o5Var = dm0Var.f23646t;
                if (o5Var != null) {
                    o5Var.a();
                }
                org.telegram.ui.Components.o5 o5Var2 = dm0Var.f23647u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ((org.telegram.ui.Components.o5) this.f1569b).a();
                return;
            case 11:
                oi.f fVar = (oi.f) this.f1569b;
                if (view == ((View) fVar.f15717b)) {
                    fVar.Q(view.getViewTreeObserver());
                    return;
                }
                return;
            case 12:
                ((xh.f1) this.f1569b).f46105l.a();
                return;
            case 13:
                xh.q3 q3Var = (xh.q3) this.f1569b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.a(q3Var.f18810c);
                    return;
                }
                return;
            case 14:
                xh.t3 t3Var = (xh.t3) this.f1569b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.a(t3Var.f18810c);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((yh.k3) this.f1569b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    yh.i3 i3Var = (yh.i3) obj;
                    if (i3Var.f47510c) {
                        i3Var.d.onAttachedToWindow();
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
                l.f fVar = (l.f) this.f1569b;
                ViewTreeObserver viewTreeObserver2 = fVar.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        fVar.N = view.getViewTreeObserver();
                    }
                    fVar.N.removeGlobalOnLayoutListener(fVar.f13877r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                l.d0 d0Var = (l.d0) this.f1569b;
                ViewTreeObserver viewTreeObserver3 = d0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        d0Var.E = view.getViewTreeObserver();
                    }
                    d0Var.E.removeGlobalOnLayoutListener(d0Var.f13864r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                ((xh.m2) this.f1569b).o(view);
                return;
            case 5:
                ((org.telegram.ui.Components.ja) this.f1569b).f25273c.clear();
                return;
            case 6:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f1569b;
                qcVar.e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                return;
            case 7:
                ((rq) this.f1569b).b();
                return;
            case 8:
                dm0 dm0Var = (dm0) this.f1569b;
                org.telegram.ui.Components.o5 o5Var = dm0Var.f23646t;
                if (o5Var != null) {
                    o5Var.b();
                }
                org.telegram.ui.Components.o5 o5Var2 = dm0Var.f23647u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    return;
                }
                return;
            case 9:
                view.removeCallbacks((Runnable) ((qo0) this.f1569b).f27703a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 10:
                ((org.telegram.ui.Components.o5) this.f1569b).b();
                return;
            case 11:
                oi.f fVar2 = (oi.f) this.f1569b;
                if (view == ((View) fVar2.f15717b)) {
                    fVar2.Q(null);
                    return;
                }
                return;
            case 12:
                ((xh.f1) this.f1569b).f46105l.b();
                return;
            case 13:
                xh.q3 q3Var = (xh.q3) this.f1569b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.o(q3Var.f18810c);
                    return;
                }
                return;
            case 14:
                xh.t3 t3Var = (xh.t3) this.f1569b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.o(t3Var.f18810c);
                    return;
                }
                return;
            default:
                ArrayList arrayList = ((yh.k3) this.f1569b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((yh.i3) obj).a();
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
