package ff;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.s;
import java.util.ArrayList;
import l.d0;
import l.f;
import lh.l3;
import lh.u1;
import lh.u4;
import lh.w4;
import lh.x4;
import lh.z4;
import mh.p4;
import mh.r4;
import oh.q1;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.rq;
public final class b implements View.OnAttachStateChangeListener {
    public final int f6231a;
    public final Object f6232b;

    public b(Object obj, int i10) {
        this.f6231a = i10;
        this.f6232b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f6231a) {
            case 0:
                s sVar = (s) this.f6232b;
                if (view == ((View) sVar.f4081b)) {
                    sVar.p(view.getViewTreeObserver());
                    return;
                }
                return;
            case 1:
            case 2:
                return;
            case 3:
                ((u1) this.f6232b).f13003l.a();
                return;
            case 4:
                w4 w4Var = (w4) this.f6232b;
                u4 u4Var = w4Var.K;
                if (u4Var != null) {
                    u4Var.a(w4Var.f21377c);
                    return;
                }
                return;
            case 5:
                z4 z4Var = (z4) this.f6232b;
                x4 x4Var = z4Var.K;
                if (x4Var != null) {
                    x4Var.a(z4Var.f21377c);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList = ((r4) this.f6232b).f14674e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    p4 p4Var = (p4) obj;
                    if (p4Var.f14584c) {
                        p4Var.d.onAttachedToWindow();
                    }
                }
                return;
            case 7:
                ((q1) this.f6232b).f17649f.onAttachedToWindow();
                return;
            case 8:
                ((l3) this.f6232b).a(view);
                return;
            case 9:
                ba baVar = (ba) this.f6232b;
                ArrayList arrayList2 = baVar.f25553c;
                arrayList2.clear();
                for (View view2 = baVar.f25552b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 10:
                return;
            case 11:
                ((rq) this.f6232b).a();
                return;
            case 12:
                am0 am0Var = (am0) this.f6232b;
                j5 j5Var = am0Var.f25296t;
                if (j5Var != null) {
                    j5Var.a();
                }
                j5 j5Var2 = am0Var.f25297u;
                if (j5Var2 != null) {
                    j5Var2.a();
                    return;
                }
                return;
            case 13:
                return;
            default:
                ((j5) this.f6232b).a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f6231a) {
            case 0:
                s sVar = (s) this.f6232b;
                if (view == ((View) sVar.f4081b)) {
                    sVar.p(null);
                    return;
                }
                return;
            case 1:
                f fVar = (f) this.f6232b;
                ViewTreeObserver viewTreeObserver = fVar.K;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.K = view.getViewTreeObserver();
                    }
                    fVar.K.removeGlobalOnLayoutListener(fVar.f11377r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                d0 d0Var = (d0) this.f6232b;
                ViewTreeObserver viewTreeObserver2 = d0Var.B;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        d0Var.B = view.getViewTreeObserver();
                    }
                    d0Var.B.removeGlobalOnLayoutListener(d0Var.f11363r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 3:
                ((u1) this.f6232b).f13003l.b();
                return;
            case 4:
                w4 w4Var = (w4) this.f6232b;
                u4 u4Var = w4Var.K;
                if (u4Var != null) {
                    u4Var.o(w4Var.f21377c);
                    return;
                }
                return;
            case 5:
                z4 z4Var = (z4) this.f6232b;
                x4 x4Var = z4Var.K;
                if (x4Var != null) {
                    x4Var.o(z4Var.f21377c);
                    return;
                }
                return;
            case 6:
                ArrayList arrayList = ((r4) this.f6232b).f14674e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((p4) obj).a();
                }
                return;
            case 7:
                ((q1) this.f6232b).f17649f.onDetachedFromWindow();
                return;
            case 8:
                ((l3) this.f6232b).o(view);
                return;
            case 9:
                ((ba) this.f6232b).f25553c.clear();
                return;
            case 10:
                ic icVar = (ic) this.f6232b;
                icVar.f27774e.removeOnAttachStateChangeListener(this);
                icVar.c(0L, false);
                return;
            case 11:
                ((rq) this.f6232b).b();
                return;
            case 12:
                am0 am0Var = (am0) this.f6232b;
                j5 j5Var = am0Var.f25296t;
                if (j5Var != null) {
                    j5Var.b();
                }
                j5 j5Var2 = am0Var.f25297u;
                if (j5Var2 != null) {
                    j5Var2.a();
                    return;
                }
                return;
            case 13:
                view.removeCallbacks((Runnable) ((ho0) this.f6232b).f27586a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ((j5) this.f6232b).b();
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
