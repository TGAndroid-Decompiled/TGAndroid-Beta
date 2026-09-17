package of;

import a0.h;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hg.k0;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import r0.i0;
import s4.c1;
import s4.h0;
import s4.m0;
import s4.o0;
import s4.t0;
import s4.u0;
public final class e {
    public int f15533a;
    public int f15534b;
    public final Serializable f15535c;
    public Serializable d;
    public Serializable e;
    public Object f15536f;
    public Object f15537g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f15535c = str;
        this.f15537g = uri;
        this.d = str2;
    }

    public void a(c1 c1Var, boolean z10) {
        RecyclerView.n(c1Var);
        if (c1Var.e(16384)) {
            c1Var.p(0, 16384);
            i0.k(c1Var.f42697a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f2866w;
            if (h0Var != null) {
                h0Var.A(c1Var);
            }
            if (recyclerView.f2863t0 != null) {
                recyclerView.f2846f.L(c1Var);
            }
        }
        c1Var.f42713t = null;
        u0 c10 = c();
        c10.getClass();
        int i10 = c1Var.f42700f;
        ArrayList arrayList = c10.b(i10).f42811a;
        if (((t0) c10.f42824a.get(i10)).f42812b <= arrayList.size()) {
            return;
        }
        c1Var.o();
        arrayList.add(c1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f2863t0.b()) {
            if (!recyclerView.f2863t0.f42859g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder l4 = k0.l(i10, "invalid position ", ". State item count is ");
        l4.append(recyclerView.f2863t0.b());
        l4.append(recyclerView.D());
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public u0 c() {
        if (((u0) this.f15537g) == null) {
            this.f15537g = new u0();
        }
        return (u0) this.f15537g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f15535c).clear();
        e();
        u0 c10 = c();
        if (h0Var != null) {
            c10.f42825b--;
        }
        if (c10.f42825b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f42825b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.S0) {
            h hVar = ((RecyclerView) this.h).f2862s0;
            int[] iArr = (int[]) hVar.f16c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            hVar.d = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        a((c1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 V = RecyclerView.V(view);
        if (V.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (V.k()) {
            V.f42709p.k(V);
        } else if (V.s()) {
            V.f42705l &= -33;
        }
        h(V);
        if (recyclerView.f2843c0 != null && !V.i()) {
            recyclerView.f2843c0.f(V);
        }
    }

    public void h(s4.c1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.h(s4.c1):void");
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 V = RecyclerView.V(view);
        if (!V.e(12) && V.m() && (m0Var = recyclerView.f2843c0) != null && !m0Var.c(V, V.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            V.f42709p = this;
            V.f42710q = true;
            ((ArrayList) this.d).add(V);
        } else if (V.h() && !V.j() && !recyclerView.f2866w.f42747b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.D());
        } else {
            V.f42709p = this;
            V.f42710q = false;
            ((ArrayList) this.f15535c).add(V);
        }
    }

    public s4.c1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.j(int, long):s4.c1");
    }

    public void k(c1 c1Var) {
        if (c1Var.f42710q) {
            ((ArrayList) this.d).remove(c1Var);
        } else {
            ((ArrayList) this.f15535c).remove(c1Var);
        }
        c1Var.f42709p = null;
        c1Var.f42710q = false;
        c1Var.f42705l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.e;
        o0 o0Var = ((RecyclerView) this.h).f2868x;
        if (o0Var != null) {
            i10 = o0Var.f42794i;
        } else {
            i10 = 0;
        }
        this.f15534b = this.f15533a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f15534b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f15535c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f15536f = DesugarCollections.unmodifiableList(arrayList);
        this.f15533a = 2;
        this.f15534b = 2;
    }
}
