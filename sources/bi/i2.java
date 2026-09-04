package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.sl0;
public final class i2 implements View.OnAttachStateChangeListener {
    public final int f3089a;
    public final Object f3090b;

    public i2(Object obj, int i10) {
        this.f3089a = i10;
        this.f3090b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f3089a) {
            case 0:
                ((j2) this.f3090b).f3130f.onAttachedToWindow();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ((yh.k2) this.f3090b).a(view);
                return;
            case 4:
                org.telegram.ui.Components.ja jaVar = (org.telegram.ui.Components.ja) this.f3090b;
                ArrayList arrayList = jaVar.f27409c;
                arrayList.clear();
                for (View view2 = jaVar.f27408b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 5:
                return;
            case 6:
                ((qq) this.f3090b).a();
                return;
            case 7:
                sl0 sl0Var = (sl0) this.f3090b;
                org.telegram.ui.Components.o5 o5Var = sl0Var.f30368t;
                if (o5Var != null) {
                    o5Var.a();
                }
                org.telegram.ui.Components.o5 o5Var2 = sl0Var.f30369u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    return;
                }
                return;
            case 8:
                return;
            case 9:
                ((org.telegram.ui.Components.o5) this.f3090b).a();
                return;
            case 10:
                fg.f fVar = (fg.f) this.f3090b;
                if (view == ((View) fVar.f9493b)) {
                    fVar.T(view.getViewTreeObserver());
                    return;
                }
                return;
            case 11:
                ((yh.e1) this.f3090b).f50246l.a();
                return;
            case 12:
                yh.o3 o3Var = (yh.o3) this.f3090b;
                yh.m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.a(o3Var.f20403c);
                    return;
                }
                return;
            case 13:
                yh.r3 r3Var = (yh.r3) this.f3090b;
                yh.p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.a(r3Var.f20403c);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((zh.j3) this.f3090b).f52072e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    zh.h3 h3Var = (zh.h3) obj;
                    if (h3Var.f51979c) {
                        h3Var.d.onAttachedToWindow();
                    }
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3089a) {
            case 0:
                ((j2) this.f3090b).f3130f.onDetachedFromWindow();
                return;
            case 1:
                l.f fVar = (l.f) this.f3090b;
                ViewTreeObserver viewTreeObserver = fVar.N;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.N = view.getViewTreeObserver();
                    }
                    fVar.N.removeGlobalOnLayoutListener(fVar.f15092r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                l.d0 d0Var = (l.d0) this.f3090b;
                ViewTreeObserver viewTreeObserver2 = d0Var.E;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.E = view.getViewTreeObserver();
                    }
                    d0Var.E.removeGlobalOnLayoutListener(d0Var.f15078r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                ((yh.k2) this.f3090b).o(view);
                return;
            case 4:
                ((org.telegram.ui.Components.ja) this.f3090b).f27409c.clear();
                return;
            case 5:
                qc qcVar = (qc) this.f3090b;
                qcVar.f29675e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                return;
            case 6:
                ((qq) this.f3090b).b();
                return;
            case 7:
                sl0 sl0Var = (sl0) this.f3090b;
                org.telegram.ui.Components.o5 o5Var = sl0Var.f30368t;
                if (o5Var != null) {
                    o5Var.b();
                }
                org.telegram.ui.Components.o5 o5Var2 = sl0Var.f30369u;
                if (o5Var2 != null) {
                    o5Var2.a();
                    return;
                }
                return;
            case 8:
                view.removeCallbacks((Runnable) ((co0) this.f3090b).f25070a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((org.telegram.ui.Components.o5) this.f3090b).b();
                return;
            case 10:
                fg.f fVar2 = (fg.f) this.f3090b;
                if (view == ((View) fVar2.f9493b)) {
                    fVar2.T(null);
                    return;
                }
                return;
            case 11:
                ((yh.e1) this.f3090b).f50246l.b();
                return;
            case 12:
                yh.o3 o3Var = (yh.o3) this.f3090b;
                yh.m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.o(o3Var.f20403c);
                    return;
                }
                return;
            case 13:
                yh.r3 r3Var = (yh.r3) this.f3090b;
                yh.p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.o(r3Var.f20403c);
                    return;
                }
                return;
            default:
                ArrayList arrayList = ((zh.j3) this.f3090b).f52072e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((zh.h3) obj).a();
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
