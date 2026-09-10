package l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xq;
import wh.e1;
import wh.k2;
import wh.m3;
import wh.o3;
import wh.p3;
import wh.r3;
import xh.h3;
import xh.j3;
import zh.d1;
public final class d implements View.OnAttachStateChangeListener {
    public final int f12593a;
    public final Object f12594b;

    public d(Object obj, int i10) {
        this.f12593a = i10;
        this.f12594b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f12593a) {
            case 0:
            case 1:
                return;
            case 2:
                ((k2) this.f12594b).a(view);
                return;
            case 3:
                ia iaVar = (ia) this.f12594b;
                ArrayList arrayList = iaVar.f23965c;
                arrayList.clear();
                for (View view2 = iaVar.f23964b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 4:
                return;
            case 5:
                ((xq) this.f12594b).a();
                return;
            case 6:
                cm0 cm0Var = (cm0) this.f12594b;
                n5 n5Var = cm0Var.f22196t;
                if (n5Var != null) {
                    n5Var.a();
                }
                n5 n5Var2 = cm0Var.f22197u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    return;
                }
                return;
            case 7:
                return;
            case 8:
                ((n5) this.f12594b).a();
                return;
            case 9:
                ki.f fVar = (ki.f) this.f12594b;
                if (view == ((View) fVar.f12539b)) {
                    fVar.O(view.getViewTreeObserver());
                    return;
                }
                return;
            case 10:
                ((e1) this.f12594b).f44066l.a();
                return;
            case 11:
                o3 o3Var = (o3) this.f12594b;
                m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.a(o3Var.f17725c);
                    return;
                }
                return;
            case 12:
                r3 r3Var = (r3) this.f12594b;
                p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.a(r3Var.f17725c);
                    return;
                }
                return;
            case 13:
                ArrayList arrayList2 = ((j3) this.f12594b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    h3 h3Var = (h3) obj;
                    if (h3Var.f45504c) {
                        h3Var.d.onAttachedToWindow();
                    }
                }
                return;
            default:
                ((d1) this.f12594b).f48341f.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f12593a) {
            case 0:
                f fVar = (f) this.f12594b;
                ViewTreeObserver viewTreeObserver = fVar.N;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.N = view.getViewTreeObserver();
                    }
                    fVar.N.removeGlobalOnLayoutListener(fVar.f12612r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                d0 d0Var = (d0) this.f12594b;
                ViewTreeObserver viewTreeObserver2 = d0Var.E;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.E = view.getViewTreeObserver();
                    }
                    d0Var.E.removeGlobalOnLayoutListener(d0Var.f12599r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                ((k2) this.f12594b).o(view);
                return;
            case 3:
                ((ia) this.f12594b).f23965c.clear();
                return;
            case 4:
                pc pcVar = (pc) this.f12594b;
                pcVar.e.removeOnAttachStateChangeListener(this);
                pcVar.c(0L, false);
                return;
            case 5:
                ((xq) this.f12594b).b();
                return;
            case 6:
                cm0 cm0Var = (cm0) this.f12594b;
                n5 n5Var = cm0Var.f22196t;
                if (n5Var != null) {
                    n5Var.b();
                }
                n5 n5Var2 = cm0Var.f22197u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    return;
                }
                return;
            case 7:
                view.removeCallbacks((Runnable) ((lo0) this.f12594b).f25066a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                ((n5) this.f12594b).b();
                return;
            case 9:
                ki.f fVar2 = (ki.f) this.f12594b;
                if (view == ((View) fVar2.f12539b)) {
                    fVar2.O(null);
                    return;
                }
                return;
            case 10:
                ((e1) this.f12594b).f44066l.b();
                return;
            case 11:
                o3 o3Var = (o3) this.f12594b;
                m3 m3Var = o3Var.N;
                if (m3Var != null) {
                    m3Var.o(o3Var.f17725c);
                    return;
                }
                return;
            case 12:
                r3 r3Var = (r3) this.f12594b;
                p3 p3Var = r3Var.N;
                if (p3Var != null) {
                    p3Var.o(r3Var.f17725c);
                    return;
                }
                return;
            case 13:
                ArrayList arrayList = ((j3) this.f12594b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((h3) obj).a();
                }
                return;
            default:
                ((d1) this.f12594b).f48341f.onDetachedFromWindow();
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
