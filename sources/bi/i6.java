package bi;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.wm0;
public final class i6 implements View.OnAttachStateChangeListener {
    public final int f4827a;
    public final Object f4828b;

    public i6(Object obj, int i10) {
        this.f4827a = i10;
        this.f4828b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f4827a) {
            case 0:
                ArrayList arrayList = ((o6) this.f4828b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    m6 m6Var = (m6) obj;
                    if (m6Var.f5086c) {
                        m6Var.d.onAttachedToWindow();
                    }
                }
                return;
            case 1:
                ((di.v1) this.f4828b).f9246f.onAttachedToWindow();
                return;
            case 2:
                a8.h0 h0Var = (a8.h0) this.f4828b;
                jh.k kVar = (jh.k) h0Var.f512c;
                ViewTreeObserver viewTreeObserver = ((View) h0Var.f511b).getViewTreeObserver();
                ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) h0Var.d;
                if (viewTreeObserver2 != viewTreeObserver) {
                    if (viewTreeObserver2 != null) {
                        if (viewTreeObserver2.isAlive()) {
                            ((ViewTreeObserver) h0Var.d).removeOnPreDrawListener(kVar);
                        }
                        h0Var.d = null;
                    }
                    h0Var.d = viewTreeObserver;
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
                ((zh.k2) this.f4828b).a(view);
                return;
            case 6:
                org.telegram.ui.Components.la laVar = (org.telegram.ui.Components.la) this.f4828b;
                ArrayList arrayList2 = laVar.f30139c;
                arrayList2.clear();
                for (View view2 = laVar.f30138b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 7:
            case 8:
                return;
            case 9:
                ((cr) this.f4828b).a();
                return;
            case 10:
                wm0 wm0Var = (wm0) this.f4828b;
                org.telegram.ui.Components.r5 r5Var = wm0Var.f34499t;
                if (r5Var != null) {
                    r5Var.a();
                }
                org.telegram.ui.Components.r5 r5Var2 = wm0Var.f34500u;
                if (r5Var2 != null) {
                    r5Var2.a();
                    return;
                }
                return;
            case 11:
                return;
            case 12:
                ((org.telegram.ui.Components.r5) this.f4828b).a();
                return;
            case 13:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.f4828b;
                if (view == ((View) qVar.f7758b)) {
                    qVar.E(view.getViewTreeObserver());
                    return;
                }
                return;
            case 14:
                ((zh.d1) this.f4828b).f52941l.a();
                return;
            case 15:
                zh.p3 p3Var = (zh.p3) this.f4828b;
                zh.n3 n3Var = p3Var.f53213a0;
                if (n3Var != null) {
                    n3Var.a(p3Var.f22638c);
                    return;
                }
                return;
            default:
                zh.s3 s3Var = (zh.s3) this.f4828b;
                zh.q3 q3Var = s3Var.f53248a0;
                if (q3Var != null) {
                    q3Var.a(s3Var.f22638c);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4827a) {
            case 0:
                ArrayList arrayList = ((o6) this.f4828b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((m6) obj).a();
                }
                return;
            case 1:
                ((di.v1) this.f4828b).f9246f.onDetachedFromWindow();
                return;
            case 2:
                a8.h0 h0Var = (a8.h0) this.f4828b;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) h0Var.d;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        ((ViewTreeObserver) h0Var.d).removeOnPreDrawListener((jh.k) h0Var.f512c);
                    }
                    h0Var.d = null;
                    return;
                }
                return;
            case 3:
                l.e eVar = (l.e) this.f4828b;
                ViewTreeObserver viewTreeObserver2 = eVar.N;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        eVar.N = view.getViewTreeObserver();
                    }
                    eVar.N.removeGlobalOnLayoutListener(eVar.f16703r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 4:
                l.c0 c0Var = (l.c0) this.f4828b;
                ViewTreeObserver viewTreeObserver3 = c0Var.E;
                if (viewTreeObserver3 != null) {
                    if (!viewTreeObserver3.isAlive()) {
                        c0Var.E = view.getViewTreeObserver();
                    }
                    c0Var.E.removeGlobalOnLayoutListener(c0Var.f16690r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 5:
                ((zh.k2) this.f4828b).o(view);
                return;
            case 6:
                ((org.telegram.ui.Components.la) this.f4828b).f30139c.clear();
                return;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.f4828b;
                qcVar.e.removeOnAttachStateChangeListener(this);
                qcVar.c(0L, false);
                return;
            case 8:
                ((org.telegram.ui.Components.md) this.f4828b).d();
                return;
            case 9:
                ((cr) this.f4828b).b();
                return;
            case 10:
                wm0 wm0Var = (wm0) this.f4828b;
                org.telegram.ui.Components.r5 r5Var = wm0Var.f34499t;
                if (r5Var != null) {
                    r5Var.b();
                }
                org.telegram.ui.Components.r5 r5Var2 = wm0Var.f34500u;
                if (r5Var2 != null) {
                    r5Var2.a();
                    return;
                }
                return;
            case 11:
                view.removeCallbacks((Runnable) ((jp0) this.f4828b).f29690a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            case 12:
                ((org.telegram.ui.Components.r5) this.f4828b).b();
                return;
            case 13:
                com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.f4828b;
                if (view == ((View) qVar.f7758b)) {
                    qVar.E(null);
                    return;
                }
                return;
            case 14:
                ((zh.d1) this.f4828b).f52941l.b();
                return;
            case 15:
                zh.p3 p3Var = (zh.p3) this.f4828b;
                zh.n3 n3Var = p3Var.f53213a0;
                if (n3Var != null) {
                    n3Var.o(p3Var.f22638c);
                    return;
                }
                return;
            default:
                zh.s3 s3Var = (zh.s3) this.f4828b;
                zh.q3 q3Var = s3Var.f53248a0;
                if (q3Var != null) {
                    q3Var.o(s3Var.f22638c);
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
