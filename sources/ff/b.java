package ff;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.r;
import java.util.ArrayList;
import kh.l3;
import kh.u1;
import kh.u4;
import kh.w4;
import kh.x4;
import kh.z4;
import l.c0;
import l.e;
import lh.p4;
import lh.r4;
import nh.q1;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.pq;
public final class b implements View.OnAttachStateChangeListener {
    public final int f6112a;
    public final Object f6113b;

    public b(Object obj, int i10) {
        this.f6112a = i10;
        this.f6113b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f6112a) {
            case 0:
                r rVar = (r) this.f6113b;
                if (view == ((View) rVar.f4029c)) {
                    rVar.U(view.getViewTreeObserver());
                    return;
                }
                return;
            case 1:
                ((u1) this.f6113b).f10853l.a();
                return;
            case 2:
                w4 w4Var = (w4) this.f6113b;
                u4 u4Var = w4Var.K;
                if (u4Var != null) {
                    u4Var.a(w4Var.f19704c);
                    return;
                }
                return;
            case 3:
                z4 z4Var = (z4) this.f6113b;
                x4 x4Var = z4Var.K;
                if (x4Var != null) {
                    x4Var.a(z4Var.f19704c);
                    return;
                }
                return;
            case 4:
            case 5:
                return;
            case 6:
                ArrayList arrayList = ((r4) this.f6113b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    p4 p4Var = (p4) obj;
                    if (p4Var.f12917c) {
                        p4Var.d.onAttachedToWindow();
                    }
                }
                return;
            case 7:
                ((q1) this.f6113b).f15795f.onAttachedToWindow();
                return;
            case 8:
                ((l3) this.f6113b).a(view);
                return;
            case 9:
                ba baVar = (ba) this.f6113b;
                ArrayList arrayList2 = baVar.f23609c;
                arrayList2.clear();
                for (View view2 = baVar.f23608b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 10:
                return;
            case 11:
                ((pq) this.f6113b).a();
                return;
            case 12:
                am0 am0Var = (am0) this.f6113b;
                j5 j5Var = am0Var.f23471t;
                if (j5Var != null) {
                    j5Var.a();
                }
                j5 j5Var2 = am0Var.f23472u;
                if (j5Var2 != null) {
                    j5Var2.a();
                    return;
                }
                return;
            case 13:
                return;
            default:
                ((j5) this.f6113b).a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f6112a) {
            case 0:
                r rVar = (r) this.f6113b;
                if (view == ((View) rVar.f4029c)) {
                    rVar.U(null);
                    return;
                }
                return;
            case 1:
                ((u1) this.f6113b).f10853l.b();
                return;
            case 2:
                w4 w4Var = (w4) this.f6113b;
                u4 u4Var = w4Var.K;
                if (u4Var != null) {
                    u4Var.o(w4Var.f19704c);
                    return;
                }
                return;
            case 3:
                z4 z4Var = (z4) this.f6113b;
                x4 x4Var = z4Var.K;
                if (x4Var != null) {
                    x4Var.o(z4Var.f19704c);
                    return;
                }
                return;
            case 4:
                e eVar = (e) this.f6113b;
                ViewTreeObserver viewTreeObserver = eVar.K;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.K = view.getViewTreeObserver();
                    }
                    eVar.K.removeGlobalOnLayoutListener(eVar.f11024r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 5:
                c0 c0Var = (c0) this.f6113b;
                ViewTreeObserver viewTreeObserver2 = c0Var.B;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.B = view.getViewTreeObserver();
                    }
                    c0Var.B.removeGlobalOnLayoutListener(c0Var.f11011r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 6:
                ArrayList arrayList = ((r4) this.f6113b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((p4) obj).a();
                }
                return;
            case 7:
                ((q1) this.f6113b).f15795f.onDetachedFromWindow();
                return;
            case 8:
                ((l3) this.f6113b).o(view);
                return;
            case 9:
                ((ba) this.f6113b).f23609c.clear();
                return;
            case 10:
                ic icVar = (ic) this.f6113b;
                icVar.e.removeOnAttachStateChangeListener(this);
                icVar.c(0L, false);
                return;
            case 11:
                ((pq) this.f6113b).b();
                return;
            case 12:
                am0 am0Var = (am0) this.f6113b;
                j5 j5Var = am0Var.f23471t;
                if (j5Var != null) {
                    j5Var.b();
                }
                j5 j5Var2 = am0Var.f23472u;
                if (j5Var2 != null) {
                    j5Var2.a();
                    return;
                }
                return;
            case 13:
                view.removeCallbacks((Runnable) ((ho0) this.f6113b).f25459a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ((j5) this.f6113b).b();
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
