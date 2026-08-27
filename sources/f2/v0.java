package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ak0;

public abstract class v0 {

    public ga.c f5840a;

    public ArrayList f5841b;

    public long f5842c;
    public long d;

    public long f5843e;

    public long f5844f;

    public long f5845g;
    public TimeInterpolator h;

    public TimeInterpolator f5846i;

    public TimeInterpolator f5847j;

    public TimeInterpolator f5848k;

    public long f5849l;

    public static int b(o1 o1Var) {
        int i10 = o1Var.f5798l;
        int i11 = i10 & 14;
        if (o1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = o1Var.d;
            int iB = o1Var.b();
            if (i12 != -1 && iB != -1 && i12 != iB) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(o1 o1Var, d5.p pVar, d5.p pVar2);

    public abstract boolean c(o1 o1Var, List list);

    public final void d(o1 o1Var) {
        ga.c cVar = this.f5840a;
        if (cVar != null) {
            RecyclerView recyclerView = (RecyclerView) cVar.f6834b;
            boolean z10 = true;
            o1Var.q(true);
            View view = o1Var.f5789a;
            if (o1Var.f5796j != null && o1Var.f5797k == null) {
                o1Var.f5796j = null;
            }
            o1Var.f5797k = null;
            if ((o1Var.f5798l & 16) != 0) {
                return;
            }
            e1 e1Var = recyclerView.f1835b;
            recyclerView.y0();
            a5.n nVar = recyclerView.f1840e;
            c cVar2 = (c) nVar.f101c;
            a9.i iVar = (a9.i) nVar.f100b;
            int iIndexOfChild = ((RecyclerView) iVar.f181b).indexOfChild(view);
            if (iIndexOfChild == -1) {
                nVar.z(view);
            } else if (cVar2.I(iIndexOfChild)) {
                cVar2.K(iIndexOfChild);
                nVar.z(view);
                iVar.P(iIndexOfChild);
            } else {
                z10 = false;
            }
            if (z10) {
                o1 o1VarU = RecyclerView.U(view);
                e1Var.k(o1VarU);
                e1Var.h(o1VarU);
            }
            recyclerView.z0(!z10);
            if (z10 || !o1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public final void e() {
        ArrayList arrayList = this.f5841b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ak0 ak0Var = (ak0) arrayList.get(i10);
            ak0Var.f26759a.d(ak0Var.f26760b, ak0Var.f26761c, ak0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(o1 o1Var);

    public abstract void g();

    public long h() {
        return this.f5842c;
    }

    public long i() {
        return Math.max(this.f5844f, this.f5845g);
    }

    public long j() {
        return this.f5843e;
    }

    public abstract boolean k();

    public d5.p l(l1 l1Var, o1 o1Var, int i10, List list) {
        d5.p pVar = new d5.p();
        View view = o1Var.f5789a;
        pVar.f4821a = view.getLeft();
        pVar.f4822b = view.getTop();
        view.getRight();
        view.getBottom();
        return pVar;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f5842c = j10;
        this.f5843e = j10;
        this.d = j10;
        this.f5844f = j10;
        this.f5845g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f5846i = timeInterpolator;
        this.f5847j = timeInterpolator;
        this.f5848k = timeInterpolator;
    }
}
