package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.tk0;
public abstract class t0 {
    public o5.i f5824a;
    public ArrayList f5825b;
    public long f5826c;
    public long d;
    public long e;
    public long f5827f;
    public long f5828g;
    public TimeInterpolator h;
    public TimeInterpolator f5829i;
    public TimeInterpolator f5830j;
    public TimeInterpolator f5831k;
    public long f5832l;

    public static int b(l1 l1Var) {
        int i10 = l1Var.f5782l;
        int i11 = i10 & 14;
        if (l1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = l1Var.d;
            int b10 = l1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(l1 l1Var, c5.e eVar, c5.e eVar2);

    public abstract boolean c(l1 l1Var, List list);

    public final void d(l1 l1Var) {
        o5.i iVar = this.f5824a;
        if (iVar != null) {
            RecyclerView recyclerView = (RecyclerView) iVar.f16439b;
            boolean z4 = true;
            l1Var.q(true);
            View view = l1Var.f5774a;
            if (l1Var.f5780j != null && l1Var.f5781k == null) {
                l1Var.f5780j = null;
            }
            l1Var.f5781k = null;
            if ((l1Var.f5782l & 16) == 0) {
                af.h hVar = recyclerView.f1233b;
                recyclerView.y0();
                af.d dVar = recyclerView.e;
                c cVar = (c) dVar.f160c;
                bb.b bVar = (bb.b) dVar.f159b;
                int indexOfChild = ((RecyclerView) bVar.f1772b).indexOfChild(view);
                if (indexOfChild == -1) {
                    dVar.C(view);
                } else if (cVar.x(indexOfChild)) {
                    cVar.z(indexOfChild);
                    dVar.C(view);
                    bVar.Q(indexOfChild);
                } else {
                    z4 = false;
                }
                if (z4) {
                    l1 U = RecyclerView.U(view);
                    hVar.k(U);
                    hVar.h(U);
                }
                recyclerView.z0(!z4);
                if (!z4 && l1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f5825b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            tk0 tk0Var = (tk0) arrayList.get(i10);
            tk0Var.f28992a.c(tk0Var.f28993b, tk0Var.f28994c, tk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(l1 l1Var);

    public abstract void g();

    public long h() {
        return this.f5826c;
    }

    public long i() {
        return Math.max(this.f5827f, this.f5828g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public c5.e l(i1 i1Var, l1 l1Var, int i10, List list) {
        ?? obj = new Object();
        View view = l1Var.f5774a;
        obj.f2108a = view.getLeft();
        obj.f2109b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f5826c = j10;
        this.e = j10;
        this.d = j10;
        this.f5827f = j10;
        this.f5828g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f5829i = timeInterpolator;
        this.f5830j = timeInterpolator;
        this.f5831k = timeInterpolator;
    }
}
