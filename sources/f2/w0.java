package f2;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.yj0;
public abstract class w0 {
    public x0 f5546a;
    public ArrayList f5547b;
    public long f5548c;
    public long d;
    public long f5549e;
    public long f5550f;
    public long f5551g;
    public TimeInterpolator h;
    public TimeInterpolator f5552i;
    public TimeInterpolator f5553j;
    public TimeInterpolator f5554k;
    public long f5555l;

    public static int b(q1 q1Var) {
        int i9 = q1Var.f5510l;
        int i10 = i9 & 14;
        if (q1Var.h()) {
            return 4;
        }
        if ((i9 & 4) == 0) {
            int i11 = q1Var.d;
            int b10 = q1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(q1 q1Var, d5.p pVar, d5.p pVar2);

    public abstract boolean c(q1 q1Var, List list);

    public final void d(q1 q1Var) {
        x0 x0Var = this.f5546a;
        if (x0Var != null) {
            RecyclerView recyclerView = x0Var.f5561a;
            boolean z10 = true;
            q1Var.q(true);
            View view = q1Var.f5501a;
            if (q1Var.f5508j != null && q1Var.f5509k == null) {
                q1Var.f5508j = null;
            }
            q1Var.f5509k = null;
            if ((q1Var.f5510l & 16) == 0) {
                g1 g1Var = recyclerView.f1339b;
                recyclerView.y0();
                a5.m mVar = recyclerView.f1344e;
                d dVar = (d) mVar.f99c;
                k5.i iVar = (k5.i) mVar.f98b;
                int indexOfChild = ((RecyclerView) iVar.f14659b).indexOfChild(view);
                if (indexOfChild == -1) {
                    mVar.B(view);
                } else if (dVar.H(indexOfChild)) {
                    dVar.K(indexOfChild);
                    mVar.B(view);
                    iVar.O(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    q1 U = RecyclerView.U(view);
                    g1Var.k(U);
                    g1Var.h(U);
                }
                recyclerView.z0(!z10);
                if (!z10 && q1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f5547b;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            yj0 yj0Var = (yj0) arrayList.get(i9);
            yj0Var.f34983a.c(yj0Var.f34984b, yj0Var.f34985c, yj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(q1 q1Var);

    public abstract void g();

    public long h() {
        return this.f5548c;
    }

    public long i() {
        return Math.max(this.f5550f, this.f5551g);
    }

    public long j() {
        return this.f5549e;
    }

    public abstract boolean k();

    public d5.p l(n1 n1Var, q1 q1Var, int i9, List list) {
        ?? obj = new Object();
        View view = q1Var.f5501a;
        obj.f4376a = view.getLeft();
        obj.f4377b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f5548c = j10;
        this.f5549e = j10;
        this.d = j10;
        this.f5550f = j10;
        this.f5551g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f5552i = timeInterpolator;
        this.f5553j = timeInterpolator;
        this.f5554k = timeInterpolator;
    }
}
