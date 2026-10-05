package of;

import a0.h;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
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
    public int f17180a;
    public int f17181b;
    public final Serializable f17182c;
    public Serializable d;
    public Serializable f17183e;
    public Object f17184f;
    public Object f17185g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f17182c = str;
        this.f17185g = uri;
        this.d = str2;
    }

    public void a(c1 c1Var, boolean z10) {
        RecyclerView.m(c1Var);
        if (c1Var.e(16384)) {
            c1Var.p(0, 16384);
            i0.k(c1Var.f46538a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f3088w;
            if (h0Var != null) {
                h0Var.A(c1Var);
            }
            if (recyclerView.f3085t0 != null) {
                recyclerView.f3068f.E(c1Var);
            }
        }
        c1Var.f46555t = null;
        u0 c10 = c();
        c10.getClass();
        int i10 = c1Var.f46542f;
        ArrayList arrayList = c10.b(i10).f46667a;
        if (((t0) c10.f46681a.get(i10)).f46668b <= arrayList.size()) {
            return;
        }
        c1Var.o();
        arrayList.add(c1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f3085t0.b()) {
            if (!recyclerView.f3085t0.f46720g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder j3 = hg.c.j(i10, "invalid position ", ". State item count is ");
        j3.append(recyclerView.f3085t0.b());
        j3.append(recyclerView.C());
        throw new IndexOutOfBoundsException(j3.toString());
    }

    public u0 c() {
        if (((u0) this.f17185g) == null) {
            this.f17185g = new u0();
        }
        return (u0) this.f17185g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f17182c).clear();
        e();
        u0 c10 = c();
        if (h0Var != null) {
            c10.f46682b--;
        }
        if (c10.f46682b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f46682b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f17183e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.S0) {
            h hVar = ((RecyclerView) this.h).f3084s0;
            int[] iArr = (int[]) hVar.f18c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            hVar.d = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.f17183e;
        a((c1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f46551p.k(U);
        } else if (U.s()) {
            U.f46547l &= -33;
        }
        h(U);
        if (recyclerView.f3064c0 != null && !U.i()) {
            recyclerView.f3064c0.f(U);
        }
    }

    public void h(s4.c1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.h(s4.c1):void");
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.f3064c0) != null && !m0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f46551p = this;
            U.f46552q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f3088w.f46595b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f46551p = this;
            U.f46552q = false;
            ((ArrayList) this.f17182c).add(U);
        }
    }

    public s4.c1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.j(int, long):s4.c1");
    }

    public void k(c1 c1Var) {
        if (c1Var.f46552q) {
            ((ArrayList) this.d).remove(c1Var);
        } else {
            ((ArrayList) this.f17182c).remove(c1Var);
        }
        c1Var.f46551p = null;
        c1Var.f46552q = false;
        c1Var.f46547l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.f17183e;
        o0 o0Var = ((RecyclerView) this.h).f3090x;
        if (o0Var != null) {
            i10 = o0Var.f46647i;
        } else {
            i10 = 0;
        }
        this.f17181b = this.f17180a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f17181b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f17182c = arrayList;
        this.d = null;
        this.f17183e = new ArrayList();
        this.f17184f = DesugarCollections.unmodifiableList(arrayList);
        this.f17180a = 2;
        this.f17181b = 2;
    }
}
