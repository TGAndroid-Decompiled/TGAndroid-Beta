package ai;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sl0;
public final class u2 implements View.OnAttachStateChangeListener {
    public final int f1563a;
    public final Object f1564b;

    public u2(Object obj, int i10) {
        this.f1563a = i10;
        this.f1564b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1563a) {
            case 0:
                ((v2) this.f1564b).f1600f.onAttachedToWindow();
                return;
            case 1:
            case 2:
                return;
            case 3:
                ((xh.l2) this.f1564b).a(view);
                return;
            case 4:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.f1564b;
                ArrayList arrayList = haVar.f24644c;
                arrayList.clear();
                for (View view2 = haVar.f24643b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 5:
                return;
            case 6:
                ((rq) this.f1564b).a();
                return;
            case 7:
                sl0 sl0Var = (sl0) this.f1564b;
                org.telegram.ui.Components.m5 m5Var = sl0Var.f27926t;
                if (m5Var != null) {
                    m5Var.a();
                }
                org.telegram.ui.Components.m5 m5Var2 = sl0Var.f27927u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    return;
                }
                return;
            case 8:
                return;
            case 9:
                ((org.telegram.ui.Components.m5) this.f1564b).a();
                return;
            case 10:
                ni.f fVar = (ni.f) this.f1564b;
                if (view == ((View) fVar.f15258b)) {
                    fVar.Q(view.getViewTreeObserver());
                    return;
                }
                return;
            case 11:
                ((xh.e1) this.f1564b).f45843l.a();
                return;
            case 12:
                xh.p3 p3Var = (xh.p3) this.f1564b;
                xh.n3 n3Var = p3Var.N;
                if (n3Var != null) {
                    n3Var.a(p3Var.f18625c);
                    return;
                }
                return;
            case 13:
                xh.s3 s3Var = (xh.s3) this.f1564b;
                xh.q3 q3Var = s3Var.N;
                if (q3Var != null) {
                    q3Var.a(s3Var.f18625c);
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((yh.m3) this.f1564b).e;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    yh.k3 k3Var = (yh.k3) obj;
                    if (k3Var.f47366c) {
                        k3Var.d.onAttachedToWindow();
                    }
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1563a) {
            case 0:
                ((v2) this.f1564b).f1600f.onDetachedFromWindow();
                return;
            case 1:
                l.e eVar = (l.e) this.f1564b;
                ViewTreeObserver viewTreeObserver = eVar.N;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.N = view.getViewTreeObserver();
                    }
                    eVar.N.removeGlobalOnLayoutListener(eVar.f13720r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                l.c0 c0Var = (l.c0) this.f1564b;
                ViewTreeObserver viewTreeObserver2 = c0Var.E;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f13707r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                ((xh.l2) this.f1564b).o(view);
                return;
            case 4:
                ((org.telegram.ui.Components.ha) this.f1564b).f24644c.clear();
                return;
            case 5:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) this.f1564b;
                ocVar.e.removeOnAttachStateChangeListener(this);
                ocVar.c(0L, false);
                return;
            case 6:
                ((rq) this.f1564b).b();
                return;
            case 7:
                sl0 sl0Var = (sl0) this.f1564b;
                org.telegram.ui.Components.m5 m5Var = sl0Var.f27926t;
                if (m5Var != null) {
                    m5Var.b();
                }
                org.telegram.ui.Components.m5 m5Var2 = sl0Var.f27927u;
                if (m5Var2 != null) {
                    m5Var2.a();
                    return;
                }
                return;
            case 8:
                view.removeCallbacks((Runnable) ((co0) this.f1564b).f23114a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 9:
                ((org.telegram.ui.Components.m5) this.f1564b).b();
                return;
            case 10:
                ni.f fVar = (ni.f) this.f1564b;
                if (view == ((View) fVar.f15258b)) {
                    fVar.Q(null);
                    return;
                }
                return;
            case 11:
                ((xh.e1) this.f1564b).f45843l.b();
                return;
            case 12:
                xh.p3 p3Var = (xh.p3) this.f1564b;
                xh.n3 n3Var = p3Var.N;
                if (n3Var != null) {
                    n3Var.o(p3Var.f18625c);
                    return;
                }
                return;
            case 13:
                xh.s3 s3Var = (xh.s3) this.f1564b;
                xh.q3 q3Var = s3Var.N;
                if (q3Var != null) {
                    q3Var.o(s3Var.f18625c);
                    return;
                }
                return;
            default:
                ArrayList arrayList = ((yh.m3) this.f1564b).e;
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
