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
    public int f17175a;
    public int f17176b;
    public final Serializable f17177c;
    public Serializable d;
    public Serializable f17178e;
    public Object f17179f;
    public Object f17180g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f17177c = str;
        this.f17180g = uri;
        this.d = str2;
    }

    public void a(c1 c1Var, boolean z10) {
        RecyclerView.m(c1Var);
        if (c1Var.e(16384)) {
            c1Var.p(0, 16384);
            i0.k(c1Var.f46531a, null);
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
        c1Var.f46548t = null;
        u0 c10 = c();
        c10.getClass();
        int i10 = c1Var.f46535f;
        ArrayList arrayList = c10.b(i10).f46660a;
        if (((t0) c10.f46674a.get(i10)).f46661b <= arrayList.size()) {
            return;
        }
        c1Var.o();
        arrayList.add(c1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f3085t0.b()) {
            if (!recyclerView.f3085t0.f46713g) {
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
        if (((u0) this.f17180g) == null) {
            this.f17180g = new u0();
        }
        return (u0) this.f17180g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f17177c).clear();
        e();
        u0 c10 = c();
        if (h0Var != null) {
            c10.f46675b--;
        }
        if (c10.f46675b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f46675b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f17178e;
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
        ArrayList arrayList = (ArrayList) this.f17178e;
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
            U.f46544p.k(U);
        } else if (U.s()) {
            U.f46540l &= -33;
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
            U.f46544p = this;
            U.f46545q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f3088w.f46588b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f46544p = this;
            U.f46545q = false;
            ((ArrayList) this.f17177c).add(U);
        }
    }

    public s4.c1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.j(int, long):s4.c1");
    }

    public void k(c1 c1Var) {
        if (c1Var.f46545q) {
            ((ArrayList) this.d).remove(c1Var);
        } else {
            ((ArrayList) this.f17177c).remove(c1Var);
        }
        c1Var.f46544p = null;
        c1Var.f46545q = false;
        c1Var.f46540l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.f17178e;
        o0 o0Var = ((RecyclerView) this.h).f3090x;
        if (o0Var != null) {
            i10 = o0Var.f46640i;
        } else {
            i10 = 0;
        }
        this.f17176b = this.f17175a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f17176b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f17177c = arrayList;
        this.d = null;
        this.f17178e = new ArrayList();
        this.f17179f = DesugarCollections.unmodifiableList(arrayList);
        this.f17175a = 2;
        this.f17176b = 2;
    }
}
