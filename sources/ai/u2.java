package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.tl0;
public final class u2 implements View.OnAttachStateChangeListener {
    public final int f1571a;
    public final Object f1572b;

    public u2(Object obj, int i10) {
        this.f1571a = i10;
        this.f1572b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1571a) {
            case 0:
                ((v2) this.f1572b).f1600f.onAttachedToWindow();
                return;
            case 1:
                aa.a aVar = (aa.a) this.f1572b;
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
                ((xh.m2) this.f1572b).a(view);
                return;
            case 5:
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.f1572b;
                ArrayList arrayList = jaVar.f25230c;
                arrayList.clear();
                for (View view2 = jaVar.f25229b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 6:
                return;
            case 7:
                ((sq) this.f1572b).a();
                return;
            case 8:
                tl0 tl0Var = (tl0) this.f1572b;
                org.telegram.ui.Components.o5 o5Var = tl0Var.f28261t;
                if (o5Var != null) {
                    o5Var.a();
                }
                org.telegram.ui.Components.o5 o5Var2 = tl0Var.f28262u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ((org.telegram.ui.Components.o5) this.f1572b).a();
                return;
            case 11:
                ni.f fVar = (ni.f) this.f1572b;
                if (view == ((View) fVar.f15233b)) {
                    fVar.Q(view.getViewTreeObserver());
                    return;
                }
                return;
            case 12:
                ((xh.f1) this.f1572b).f45804l.a();
                return;
            case 13:
                xh.q3 q3Var = (xh.q3) this.f1572b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.a(q3Var.f18612c);
                    return;
                }
                return;
            case 14:
                xh.t3 t3Var = (xh.t3) this.f1572b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.a(t3Var.f18612c);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((yh.k3) this.f1572b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    yh.i3 i3Var = (yh.i3) obj;
                    if (i3Var.f47202c) {
                        i3Var.d.onAttachedToWindow();
                    }
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1571a) {
            case 0:
                ((v2) this.f1572b).f1600f.onDetachedFromWindow();
                return;
            case 1:
                aa.a aVar = (aa.a) this.f1572b;
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
                l.e eVar = (l.e) this.f1572b;
                ViewTreeObserver viewTreeObserver2 = eVar.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.N = view.getViewTreeObserver();
                    }
                    eVar.N.removeGlobalOnLayoutListener(eVar.f13706r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                l.c0 c0Var = (l.c0) this.f1572b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f13693r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                ((xh.m2) this.f1572b).o(view);
                return;
            case 5:
                ((org.telegram.ui.Components.ja) this.f1572b).f25230c.clear();
                return;
            case 6:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f1572b;
                qcVar.e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                return;
            case 7:
                ((sq) this.f1572b).b();
                return;
            case 8:
                tl0 tl0Var = (tl0) this.f1572b;
                org.telegram.ui.Components.o5 o5Var = tl0Var.f28261t;
                if (o5Var != null) {
                    o5Var.b();
                }
                org.telegram.ui.Components.o5 o5Var2 = tl0Var.f28262u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    return;
                }
                return;
            case 9:
                view.removeCallbacks((Runnable) ((co0) this.f1572b).f23081a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 10:
                ((org.telegram.ui.Components.o5) this.f1572b).b();
                return;
            case 11:
                ni.f fVar = (ni.f) this.f1572b;
                if (view == ((View) fVar.f15233b)) {
                    fVar.Q(null);
                    return;
                }
                return;
            case 12:
                ((xh.f1) this.f1572b).f45804l.b();
                return;
            case 13:
                xh.q3 q3Var = (xh.q3) this.f1572b;
                xh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.o(q3Var.f18612c);
                    return;
                }
                return;
            case 14:
                xh.t3 t3Var = (xh.t3) this.f1572b;
                xh.r3 r3Var = t3Var.N;
                if (r3Var != null) {
                    r3Var.o(t3Var.f18612c);
                    return;
                }
                return;
            default:
                ArrayList arrayList = ((yh.k3) this.f1572b).e;
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
