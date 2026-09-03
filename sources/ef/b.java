package ef;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.r;
import java.util.ArrayList;
import kh.k3;
import kh.t4;
import kh.u1;
import kh.v4;
import kh.w4;
import kh.y4;
import l.c0;
import l.e;
import lh.p4;
import lh.r4;
import nh.q1;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.zl0;
public final class b implements View.OnAttachStateChangeListener {
    public final int f5197a;
    public final Object f5198b;

    public b(Object obj, int i10) {
        this.f5197a = i10;
        this.f5198b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f5197a) {
            case 0:
                r rVar = (r) this.f5198b;
                if (view == ((View) rVar.f4005b)) {
                    rVar.p(view.getViewTreeObserver());
                    return;
                }
                return;
            case 1:
                ((u1) this.f5198b).f10960l.a();
                return;
            case 2:
                v4 v4Var = (v4) this.f5198b;
                t4 t4Var = v4Var.K;
                if (t4Var != null) {
                    t4Var.a(v4Var.f19679c);
                    return;
                }
                return;
            case 3:
                y4 y4Var = (y4) this.f5198b;
                w4 w4Var = y4Var.K;
                if (w4Var != null) {
                    w4Var.a(y4Var.f19679c);
                    return;
                }
                return;
            case 4:
            case 5:
                return;
            case 6:
                ArrayList arrayList = ((r4) this.f5198b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    p4 p4Var = (p4) obj;
                    if (p4Var.f12901c) {
                        p4Var.d.onAttachedToWindow();
                    }
                }
                return;
            case 7:
                ((q1) this.f5198b).f15775f.onAttachedToWindow();
                return;
            case 8:
                ((k3) this.f5198b).a(view);
                return;
            case 9:
                ba baVar = (ba) this.f5198b;
                ArrayList arrayList2 = baVar.f23595c;
                arrayList2.clear();
                for (View view2 = baVar.f23594b; view2 != null; view2 = (View) view2.getParent()) {
                    arrayList2.add(0, view2);
                    if (!(view2.getParent() instanceof View)) {
                        return;
                    }
                }
                return;
            case 10:
                return;
            case 11:
                ((oq) this.f5198b).a();
                return;
            case 12:
                zl0 zl0Var = (zl0) this.f5198b;
                j5 j5Var = zl0Var.f31426t;
                if (j5Var != null) {
                    j5Var.a();
                }
                j5 j5Var2 = zl0Var.f31427u;
                if (j5Var2 != null) {
                    j5Var2.a();
                    return;
                }
                return;
            case 13:
                return;
            default:
                ((j5) this.f5198b).a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f5197a) {
            case 0:
                r rVar = (r) this.f5198b;
                if (view == ((View) rVar.f4005b)) {
                    rVar.p(null);
                    return;
                }
                return;
            case 1:
                ((u1) this.f5198b).f10960l.b();
                return;
            case 2:
                v4 v4Var = (v4) this.f5198b;
                t4 t4Var = v4Var.K;
                if (t4Var != null) {
                    t4Var.o(v4Var.f19679c);
                    return;
                }
                return;
            case 3:
                y4 y4Var = (y4) this.f5198b;
                w4 w4Var = y4Var.K;
                if (w4Var != null) {
                    w4Var.o(y4Var.f19679c);
                    return;
                }
                return;
            case 4:
                e eVar = (e) this.f5198b;
                ViewTreeObserver viewTreeObserver = eVar.K;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.K = view.getViewTreeObserver();
                    }
                    eVar.K.removeGlobalOnLayoutListener(eVar.f11134r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 5:
                c0 c0Var = (c0) this.f5198b;
                ViewTreeObserver viewTreeObserver2 = c0Var.B;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.B = view.getViewTreeObserver();
                    }
                    c0Var.B.removeGlobalOnLayoutListener(c0Var.f11121r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 6:
                ArrayList arrayList = ((r4) this.f5198b).e;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((p4) obj).a();
                }
                return;
            case 7:
                ((q1) this.f5198b).f15775f.onDetachedFromWindow();
                return;
            case 8:
                ((k3) this.f5198b).o(view);
                return;
            case 9:
                ((ba) this.f5198b).f23595c.clear();
                return;
            case 10:
                ic icVar = (ic) this.f5198b;
                icVar.e.removeOnAttachStateChangeListener(this);
                icVar.c(0L, false);
                return;
            case 11:
                ((oq) this.f5198b).b();
                return;
            case 12:
                zl0 zl0Var = (zl0) this.f5198b;
                j5 j5Var = zl0Var.f31426t;
                if (j5Var != null) {
                    j5Var.b();
                }
                j5 j5Var2 = zl0Var.f31427u;
                if (j5Var2 != null) {
                    j5Var2.a();
                    return;
                }
                return;
            case 13:
                view.removeCallbacks((Runnable) ((go0) this.f5198b).f25213a.remove(view));
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                ((j5) this.f5198b).b();
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
