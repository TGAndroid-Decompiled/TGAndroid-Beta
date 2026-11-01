package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.wb;
import ph.a3;
import ph.c3;
import ph.d2;
import ph.d3;
import ph.f3;
import ph.z0;
import rh.l3;
import rh.n3;
import th.c1;
import z7.fe;
public final class d implements View.OnAttachStateChangeListener {
    public final int f11463a;
    public final Object f11464b;

    public d(Object obj, int i10) {
        this.f11463a = i10;
        this.f11464b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f11463a) {
            case 0:
            case 1:
                return;
            case 2:
                ji.f fVar = (ji.f) this.f11464b;
                if (view == ((View) fVar.f10443c)) {
                    fVar.w(view.getViewTreeObserver());
                    return;
                }
                return;
            case 3:
                ((n6) this.f11464b).c(null);
                return;
            case 4:
                ((d2) this.f11464b).a(view);
                return;
            case 5:
                s9 s9Var = (s9) this.f11464b;
                ArrayList arrayList = s9Var.f30241c;
                arrayList.clear();
                for (View view2 = s9Var.f30240b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 6:
                return;
            case 7:
                ((gq) this.f11464b).a();
                return;
            case 8:
                el0 el0Var = (el0) this.f11464b;
                d5 d5Var = el0Var.f25876t;
                if (d5Var != null) {
                    d5Var.a();
                }
                d5 d5Var2 = el0Var.f25877u;
                if (d5Var2 != null) {
                    d5Var2.a();
                    return;
                }
                return;
            case 9:
                return;
            case 10:
                ((org.telegram.messenger.voip.g) this.f11464b).run();
                return;
            case 11:
                ((z0) this.f11464b).f45382l.a();
                return;
            case 12:
                c3 c3Var = (c3) this.f11464b;
                a3 a3Var = c3Var.f45025a0;
                if (a3Var != null) {
                    a3Var.a(c3Var.f20167c);
                    return;
                }
                return;
            case 13:
                f3 f3Var = (f3) this.f11464b;
                d3 d3Var = f3Var.f45063a0;
                if (d3Var != null) {
                    d3Var.a(f3Var.f20167c);
                    return;
                }
                return;
            case 14:
                ArrayList arrayList2 = ((n3) this.f11464b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    l3 l3Var = (l3) obj;
                    if (l3Var.f47187c) {
                        l3Var.d.P();
                    }
                }
                return;
            case 15:
                ((c1) this.f11464b).f48839f.P();
                return;
            default:
                fe feVar = (fe) this.f11464b;
                zg.h hVar = (zg.h) feVar.f54740b;
                ViewTreeObserver viewTreeObserver = ((View) feVar.f54739a).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) feVar.f54741c;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) feVar.f54741c).removeOnPreDrawListener(hVar);
                        }
                        feVar.f54741c = null;
                    }
                    feVar.f54741c = viewTreeObserver;
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnPreDrawListener(hVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f11463a) {
            case 0:
                f fVar = (f) this.f11464b;
                ViewTreeObserver viewTreeObserver = fVar.N;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.N = view.getViewTreeObserver();
                    }
                    fVar.N.removeGlobalOnLayoutListener(fVar.f11482r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                d0 d0Var = (d0) this.f11464b;
                ViewTreeObserver viewTreeObserver2 = d0Var.E;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.E = view.getViewTreeObserver();
                    }
                    d0Var.E.removeGlobalOnLayoutListener(d0Var.f11469r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                ji.f fVar2 = (ji.f) this.f11464b;
                if (view == ((View) fVar2.f10443c)) {
                    fVar2.w(null);
                    return;
                }
                return;
            case 3:
                ((n6) this.f11464b).b(null);
                return;
            case 4:
                ((d2) this.f11464b).n(view);
                return;
            case 5:
                ((s9) this.f11464b).f30241c.clear();
                return;
            case 6:
                wb wbVar = (wb) this.f11464b;
                wbVar.e.removeOnAttachStateChangeListener(this);
                wbVar.c(0L, false);
                return;
            case 7:
                ((gq) this.f11464b).b();
                return;
            case 8:
                el0 el0Var = (el0) this.f11464b;
                d5 d5Var = el0Var.f25876t;
                if (d5Var != null) {
                    d5Var.b();
                }
                d5 d5Var2 = el0Var.f25877u;
                if (d5Var2 != null) {
                    d5Var2.a();
                    return;
                }
                return;
            case 9:
                view.removeCallbacks((Runnable) ((mn0) this.f11464b).f28520a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 10:
                return;
            case 11:
                ((z0) this.f11464b).f45382l.b();
                return;
            case 12:
                c3 c3Var = (c3) this.f11464b;
                a3 a3Var = c3Var.f45025a0;
                if (a3Var != null) {
                    a3Var.n(c3Var.f20167c);
                    return;
                }
                return;
            case 13:
                f3 f3Var = (f3) this.f11464b;
                d3 d3Var = f3Var.f45063a0;
                if (d3Var != null) {
                    d3Var.n(f3Var.f20167c);
                    return;
                }
                return;
            case 14:
                ArrayList arrayList = ((n3) this.f11464b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((l3) obj).a();
                }
                return;
            case 15:
                ((c1) this.f11464b).f48839f.R();
                return;
            default:
                fe feVar = (fe) this.f11464b;
                ViewTreeObserver viewTreeObserver3 = (ViewTreeObserver) feVar.f54741c;
                if (viewTreeObserver3 != null) {
                    if (viewTreeObserver3.isAlive()) {
                        ((ViewTreeObserver) feVar.f54741c).removeOnPreDrawListener((zg.h) feVar.f54740b);
                    }
                    feVar.f54741c = null;
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
