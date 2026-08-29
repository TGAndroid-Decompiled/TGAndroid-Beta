package df;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.s;
import ih.l3;
import ih.u4;
import ih.v1;
import ih.w4;
import ih.x4;
import ih.z4;
import java.util.ArrayList;
import jh.q4;
import jh.s4;
import l.c0;
import l.e;
import lh.p1;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.xn0;
public final class b implements View.OnAttachStateChangeListener {
    public final int f5544a;
    public final Object f5545b;

    public b(Object obj, int i10) {
        this.f5544a = i10;
        this.f5545b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f5544a) {
            case 0:
                s sVar = (s) this.f5545b;
                if (view == ((View) sVar.f5186c)) {
                    sVar.P(view.getViewTreeObserver());
                    return;
                }
                return;
            case 1:
                ((v1) this.f5545b).f9443l.a();
                return;
            case 2:
                w4 w4Var = (w4) this.f5545b;
                u4 u4Var = w4Var.J;
                if (u4Var != null) {
                    u4Var.a(w4Var.f22965c);
                    return;
                }
                return;
            case 3:
                z4 z4Var = (z4) this.f5545b;
                x4 x4Var = z4Var.J;
                if (x4Var != null) {
                    x4Var.a(z4Var.f22965c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((s4) this.f5545b).f12761e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    q4 q4Var = (q4) obj;
                    if (q4Var.f12659c) {
                        q4Var.d.onAttachedToWindow();
                    }
                }
                return;
            case 5:
            case 6:
                return;
            case 7:
                ((p1) this.f5545b).f16084f.onAttachedToWindow();
                return;
            case 8:
                ((l3) this.f5545b).a(view);
                return;
            case 9:
                ga gaVar = (ga) this.f5545b;
                ArrayList arrayList2 = gaVar.f28850c;
                arrayList2.clear();
                for (View view2 = gaVar.f28849b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 10:
                return;
            case 11:
                ((lq) this.f5545b).a();
                return;
            case 12:
                ql0 ql0Var = (ql0) this.f5545b;
                n5 n5Var = ql0Var.f32001t;
                if (n5Var != null) {
                    n5Var.a();
                }
                n5 n5Var2 = ql0Var.f32002u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    return;
                }
                return;
            case 13:
                return;
            default:
                ((n5) this.f5545b).a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f5544a) {
            case 0:
                s sVar = (s) this.f5545b;
                if (view == ((View) sVar.f5186c)) {
                    sVar.P(null);
                    return;
                }
                return;
            case 1:
                ((v1) this.f5545b).f9443l.b();
                return;
            case 2:
                w4 w4Var = (w4) this.f5545b;
                u4 u4Var = w4Var.J;
                if (u4Var != null) {
                    u4Var.o(w4Var.f22965c);
                    return;
                }
                return;
            case 3:
                z4 z4Var = (z4) this.f5545b;
                x4 x4Var = z4Var.J;
                if (x4Var != null) {
                    x4Var.o(z4Var.f22965c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((s4) this.f5545b).f12761e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((q4) obj).a();
                }
                return;
            case 5:
                e eVar = (e) this.f5545b;
                ViewTreeObserver viewTreeObserver = eVar.J;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.J = view.getViewTreeObserver();
                    }
                    eVar.J.removeGlobalOnLayoutListener(eVar.f13964r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 6:
                c0 c0Var = (c0) this.f5545b;
                ViewTreeObserver viewTreeObserver2 = c0Var.A;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.A = view.getViewTreeObserver();
                    }
                    c0Var.A.removeGlobalOnLayoutListener(c0Var.f13950r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 7:
                ((p1) this.f5545b).f16084f.onDetachedFromWindow();
                return;
            case 8:
                ((l3) this.f5545b).o(view);
                return;
            case 9:
                ((ga) this.f5545b).f28850c.clear();
                return;
            case 10:
                mc mcVar = (mc) this.f5545b;
                mcVar.f30648e.removeOnAttachStateChangeListener(this);
                mcVar.c(0L, false);
                return;
            case 11:
                ((lq) this.f5545b).b();
                return;
            case 12:
                ql0 ql0Var = (ql0) this.f5545b;
                n5 n5Var = ql0Var.f32001t;
                if (n5Var != null) {
                    n5Var.b();
                }
                n5 n5Var2 = ql0Var.f32002u;
                if (n5Var2 != null) {
                    n5Var2.a();
                    return;
                }
                return;
            case 13:
                view.removeCallbacks((Runnable) ((xn0) this.f5545b).f34811a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ((n5) this.f5545b).b();
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
