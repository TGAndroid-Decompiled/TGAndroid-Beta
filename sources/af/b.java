package af;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.t;
import fh.b2;
import fh.i5;
import fh.k5;
import fh.l5;
import fh.n5;
import fh.w3;
import gh.t4;
import gh.v4;
import ih.r1;
import java.util.ArrayList;
import l.c0;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.mn0;
public final class b implements View.OnAttachStateChangeListener {
    public final int f151a;
    public final Object f152b;

    public b(Object obj, int i9) {
        this.f151a = i9;
        this.f152b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f151a) {
            case 0:
                t tVar = (t) this.f152b;
                if (view == ((View) tVar.f4178c)) {
                    tVar.P(view.getViewTreeObserver());
                    return;
                }
                return;
            case 1:
                ((b2) this.f152b).f6369l.a();
                return;
            case 2:
                k5 k5Var = (k5) this.f152b;
                i5 i5Var = k5Var.J;
                if (i5Var != null) {
                    i5Var.a(k5Var.f23405c);
                    return;
                }
                return;
            case 3:
                n5 n5Var = (n5) this.f152b;
                l5 l5Var = n5Var.J;
                if (l5Var != null) {
                    l5Var.a(n5Var.f23405c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((v4) this.f152b).f9019e;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    t4 t4Var = (t4) obj;
                    if (t4Var.f8913c) {
                        t4Var.d.onAttachedToWindow();
                    }
                }
                return;
            case 5:
                ((r1) this.f152b).f12060f.onAttachedToWindow();
                return;
            case 6:
            case 7:
                return;
            case 8:
                ((w3) this.f152b).a(view);
                return;
            case 9:
                ba baVar = (ba) this.f152b;
                ArrayList arrayList2 = baVar.f27122c;
                arrayList2.clear();
                for (View view2 = baVar.f27121b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 10:
                return;
            case 11:
                ((hq) this.f152b).a();
                return;
            case 12:
                dl0 dl0Var = (dl0) this.f152b;
                org.telegram.ui.Components.i5 i5Var2 = dl0Var.f27771t;
                if (i5Var2 != null) {
                    i5Var2.a();
                }
                org.telegram.ui.Components.i5 i5Var3 = dl0Var.f27772u;
                if (i5Var3 != null) {
                    i5Var3.a();
                    return;
                }
                return;
            case 13:
                return;
            default:
                ((org.telegram.ui.Components.i5) this.f152b).a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f151a) {
            case 0:
                t tVar = (t) this.f152b;
                if (view == ((View) tVar.f4178c)) {
                    tVar.P(null);
                    return;
                }
                return;
            case 1:
                ((b2) this.f152b).f6369l.b();
                return;
            case 2:
                k5 k5Var = (k5) this.f152b;
                i5 i5Var = k5Var.J;
                if (i5Var != null) {
                    i5Var.o(k5Var.f23405c);
                    return;
                }
                return;
            case 3:
                n5 n5Var = (n5) this.f152b;
                l5 l5Var = n5Var.J;
                if (l5Var != null) {
                    l5Var.o(n5Var.f23405c);
                    return;
                }
                return;
            case 4:
                ArrayList arrayList = ((v4) this.f152b).f9019e;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((t4) obj).a();
                }
                return;
            case 5:
                ((r1) this.f152b).f12060f.onDetachedFromWindow();
                return;
            case 6:
                l.e eVar = (l.e) this.f152b;
                ViewTreeObserver viewTreeObserver = eVar.J;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.J = view.getViewTreeObserver();
                    }
                    eVar.J.removeGlobalOnLayoutListener(eVar.f16536r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 7:
                c0 c0Var = (c0) this.f152b;
                ViewTreeObserver viewTreeObserver2 = c0Var.A;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.A = view.getViewTreeObserver();
                    }
                    c0Var.A.removeGlobalOnLayoutListener(c0Var.f16522r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 8:
                ((w3) this.f152b).o(view);
                return;
            case 9:
                ((ba) this.f152b).f27122c.clear();
                return;
            case 10:
                gc gcVar = (gc) this.f152b;
                gcVar.f28733e.removeOnAttachStateChangeListener(this);
                gcVar.c(0L, false);
                return;
            case 11:
                ((hq) this.f152b).b();
                return;
            case 12:
                dl0 dl0Var = (dl0) this.f152b;
                org.telegram.ui.Components.i5 i5Var2 = dl0Var.f27771t;
                if (i5Var2 != null) {
                    i5Var2.b();
                }
                org.telegram.ui.Components.i5 i5Var3 = dl0Var.f27772u;
                if (i5Var3 != null) {
                    i5Var3.a();
                    return;
                }
                return;
            case 13:
                view.removeCallbacks((Runnable) ((mn0) this.f152b).f30897a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ((org.telegram.ui.Components.i5) this.f152b).b();
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
