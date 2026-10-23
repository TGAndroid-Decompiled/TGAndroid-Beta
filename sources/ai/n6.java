package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.tm0;
public final class n6 implements View.OnAttachStateChangeListener {
    public final int f1866a;
    public final Object f1867b;

    public n6(Object obj, int i10) {
        this.f1866a = i10;
        this.f1867b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1866a) {
            case 0:
                ArrayList arrayList = ((t6) this.f1867b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    r6 r6Var = (r6) obj;
                    if (r6Var.f2118c) {
                        r6Var.d.onAttachedToWindow();
                    }
                }
                return;
            case 1:
                ((ci.v1) this.f1867b).f6009f.onAttachedToWindow();
                return;
            case 2:
                androidx.biometric.e eVar = (androidx.biometric.e) this.f1867b;
                ih.k kVar = (ih.k) eVar.f2823c;
                ViewTreeObserver viewTreeObserver = ((View) eVar.f2822b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) eVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) eVar.d).removeOnPreDrawListener(kVar);
                        }
                        eVar.d = null;
                    }
                    eVar.d = viewTreeObserver;
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
                ((yh.j2) this.f1867b).a(view);
                return;
            case 6:
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.f1867b;
                ArrayList arrayList2 = jaVar.f27636c;
                arrayList2.clear();
                for (View view2 = jaVar.f27635b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 7:
                return;
            case 8:
                ((ar) this.f1867b).a();
                return;
            case 9:
                tm0 tm0Var = (tm0) this.f1867b;
                org.telegram.ui.Components.p5 p5Var = tm0Var.f30866t;
                if (p5Var != null) {
                    p5Var.a();
                }
                org.telegram.ui.Components.p5 p5Var2 = tm0Var.f30867u;
                if (p5Var2 != null) {
                    p5Var2.a();
                    return;
                }
                return;
            case 10:
                return;
            case 11:
                ((org.telegram.ui.Components.p5) this.f1867b).a();
                return;
            case 12:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f1867b;
                if (view == ((View) rVar.f7673c)) {
                    rVar.u(view.getViewTreeObserver());
                    return;
                }
                return;
            case 13:
                ((yh.d1) this.f1867b).f50652l.a();
                return;
            case 14:
                yh.n3 n3Var = (yh.n3) this.f1867b;
                yh.l3 l3Var = n3Var.f50880a0;
                if (l3Var != null) {
                    l3Var.a(n3Var.f20837c);
                    return;
                }
                return;
            default:
                yh.q3 q3Var = (yh.q3) this.f1867b;
                yh.o3 o3Var = q3Var.f50947a0;
                if (o3Var != null) {
                    o3Var.a(q3Var.f20837c);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1866a) {
            case 0:
                ArrayList arrayList = ((t6) this.f1867b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((r6) obj).a();
                }
                return;
            case 1:
                ((ci.v1) this.f1867b).f6009f.onDetachedFromWindow();
                return;
            case 2:
                androidx.biometric.e eVar = (androidx.biometric.e) this.f1867b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) eVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) eVar.d).removeOnPreDrawListener((ih.k) eVar.f2823c);
                    }
                    eVar.d = null;
                    return;
                }
                return;
            case 3:
                l.e eVar2 = (l.e) this.f1867b;
                ViewTreeObserver viewTreeObserver2 = eVar2.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar2.N = view.getViewTreeObserver();
                    }
                    eVar2.N.removeGlobalOnLayoutListener(eVar2.f15800r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                l.c0 c0Var = (l.c0) this.f1867b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f15787r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 5:
                ((yh.j2) this.f1867b).o(view);
                return;
            case 6:
                ((org.telegram.ui.Components.ja) this.f1867b).f27636c.clear();
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f1867b;
                qcVar.e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                return;
            case 8:
                ((ar) this.f1867b).b();
                return;
            case 9:
                tm0 tm0Var = (tm0) this.f1867b;
                org.telegram.ui.Components.p5 p5Var = tm0Var.f30866t;
                if (p5Var != null) {
                    p5Var.b();
                }
                org.telegram.ui.Components.p5 p5Var2 = tm0Var.f30867u;
                if (p5Var2 != null) {
                    p5Var2.a();
                    return;
                }
                return;
            case 10:
                view.removeCallbacks((Runnable) ((ep0) this.f1867b).f26022a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 11:
                ((org.telegram.ui.Components.p5) this.f1867b).b();
                return;
            case 12:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f1867b;
                if (view == ((View) rVar.f7673c)) {
                    rVar.u(null);
                    return;
                }
                return;
            case 13:
                ((yh.d1) this.f1867b).f50652l.b();
                return;
            case 14:
                yh.n3 n3Var = (yh.n3) this.f1867b;
                yh.l3 l3Var = n3Var.f50880a0;
                if (l3Var != null) {
                    l3Var.o(n3Var.f20837c);
                    return;
                }
                return;
            default:
                yh.q3 q3Var = (yh.q3) this.f1867b;
                yh.o3 o3Var = q3Var.f50947a0;
                if (o3Var != null) {
                    o3Var.o(q3Var.f20837c);
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
}
