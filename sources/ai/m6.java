package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.zo0;
public final class m6 implements View.OnAttachStateChangeListener {
    public final int f1812a;
    public final Object f1813b;

    public m6(Object obj, int i10) {
        this.f1812a = i10;
        this.f1813b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1812a) {
            case 0:
                ArrayList arrayList = ((s6) this.f1813b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    q6 q6Var = (q6) obj;
                    if (q6Var.f2063c) {
                        q6Var.d.onAttachedToWindow();
                    }
                }
                return;
            case 1:
                ((ci.w1) this.f1813b).f6106f.onAttachedToWindow();
                return;
            case 2:
                androidx.biometric.e eVar = (androidx.biometric.e) this.f1813b;
                ih.j jVar = (ih.j) eVar.f2818c;
                ViewTreeObserver viewTreeObserver = ((View) eVar.f2817b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) eVar.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) eVar.d).removeOnPreDrawListener(jVar);
                        }
                        eVar.d = null;
                    }
                    eVar.d = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(jVar);
                        return;
                    }
                    return;
                }
                return;
            case 3:
            case 4:
                return;
            case 5:
                ((yh.j2) this.f1813b).a(view);
                return;
            case 6:
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.f1813b;
                ArrayList arrayList2 = jaVar.f27481c;
                arrayList2.clear();
                for (View view2 = jaVar.f27480b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 7:
                return;
            case 8:
                ((br) this.f1813b).a();
                return;
            case 9:
                pm0 pm0Var = (pm0) this.f1813b;
                org.telegram.ui.Components.p5 p5Var = pm0Var.f29350t;
                if (p5Var != null) {
                    p5Var.a();
                }
                org.telegram.ui.Components.p5 p5Var2 = pm0Var.f29351u;
                if (p5Var2 != null) {
                    p5Var2.a();
                    return;
                }
                return;
            case 10:
                return;
            case 11:
                ((org.telegram.ui.Components.p5) this.f1813b).a();
                return;
            case 12:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f1813b;
                if (view == ((View) rVar.f7663c)) {
                    rVar.u(view.getViewTreeObserver());
                    return;
                }
                return;
            case 13:
                ((yh.d1) this.f1813b).f50198l.a();
                return;
            case 14:
                yh.n3 n3Var = (yh.n3) this.f1813b;
                yh.l3 l3Var = n3Var.N;
                if (l3Var != null) {
                    l3Var.a(n3Var.f20762c);
                    return;
                }
                return;
            default:
                yh.q3 q3Var = (yh.q3) this.f1813b;
                yh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.a(q3Var.f20762c);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1812a) {
            case 0:
                ArrayList arrayList = ((s6) this.f1813b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((q6) obj).a();
                }
                return;
            case 1:
                ((ci.w1) this.f1813b).f6106f.onDetachedFromWindow();
                return;
            case 2:
                androidx.biometric.e eVar = (androidx.biometric.e) this.f1813b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) eVar.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) eVar.d).removeOnPreDrawListener((ih.j) eVar.f2818c);
                    }
                    eVar.d = null;
                    return;
                }
                return;
            case 3:
                l.e eVar2 = (l.e) this.f1813b;
                ViewTreeObserver viewTreeObserver2 = eVar2.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar2.N = view.getViewTreeObserver();
                    }
                    eVar2.N.removeGlobalOnLayoutListener(eVar2.f15739r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                l.c0 c0Var = (l.c0) this.f1813b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f15726r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 5:
                ((yh.j2) this.f1813b).o(view);
                return;
            case 6:
                ((org.telegram.ui.Components.ja) this.f1813b).f27481c.clear();
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f1813b;
                qcVar.e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                return;
            case 8:
                ((br) this.f1813b).b();
                return;
            case 9:
                pm0 pm0Var = (pm0) this.f1813b;
                org.telegram.ui.Components.p5 p5Var = pm0Var.f29350t;
                if (p5Var != null) {
                    p5Var.b();
                }
                org.telegram.ui.Components.p5 p5Var2 = pm0Var.f29351u;
                if (p5Var2 != null) {
                    p5Var2.a();
                    return;
                }
                return;
            case 10:
                view.removeCallbacks((Runnable) ((zo0) this.f1813b).f33010a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 11:
                ((org.telegram.ui.Components.p5) this.f1813b).b();
                return;
            case 12:
                com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f1813b;
                if (view == ((View) rVar.f7663c)) {
                    rVar.u(null);
                    return;
                }
                return;
            case 13:
                ((yh.d1) this.f1813b).f50198l.b();
                return;
            case 14:
                yh.n3 n3Var = (yh.n3) this.f1813b;
                yh.l3 l3Var = n3Var.N;
                if (l3Var != null) {
                    l3Var.o(n3Var.f20762c);
                    return;
                }
                return;
            default:
                yh.q3 q3Var = (yh.q3) this.f1813b;
                yh.o3 o3Var = q3Var.N;
                if (o3Var != null) {
                    o3Var.o(q3Var.f20762c);
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
