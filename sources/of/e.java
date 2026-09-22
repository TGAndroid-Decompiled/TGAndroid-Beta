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
    public int f15709a;
    public int f15710b;
    public final Serializable f15711c;
    public Serializable d;
    public Serializable e;
    public Object f15712f;
    public Object f15713g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f15711c = str;
        this.f15713g = uri;
        this.d = str2;
    }

    public void a(c1 c1Var, boolean z10) {
        RecyclerView.n(c1Var);
        if (c1Var.e(16384)) {
            c1Var.p(0, 16384);
            i0.k(c1Var.f42995a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f2865w;
            if (h0Var != null) {
                h0Var.A(c1Var);
            }
            if (recyclerView.f2862t0 != null) {
                recyclerView.f2845f.E(c1Var);
            }
        }
        c1Var.f43011t = null;
        u0 c10 = c();
        c10.getClass();
        int i10 = c1Var.f42998f;
        ArrayList arrayList = c10.b(i10).f43109a;
        if (((t0) c10.f43122a.get(i10)).f43110b <= arrayList.size()) {
            return;
        }
        c1Var.o();
        arrayList.add(c1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f2862t0.b()) {
            if (!recyclerView.f2862t0.f43157g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder k10 = k0.k(i10, "invalid position ", ". State item count is ");
        k10.append(recyclerView.f2862t0.b());
        k10.append(recyclerView.D());
        throw new IndexOutOfBoundsException(k10.toString());
    }

    public u0 c() {
        if (((u0) this.f15713g) == null) {
            this.f15713g = new u0();
        }
        return (u0) this.f15713g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f15711c).clear();
        e();
        u0 c10 = c();
        if (h0Var != null) {
            c10.f43123b--;
        }
        if (c10.f43123b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f43123b++;
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
            h hVar = ((RecyclerView) this.h).f2861s0;
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
            V.f43007p.k(V);
        } else if (V.s()) {
            V.f43003l &= -33;
        }
        h(V);
        if (recyclerView.f2842c0 != null && !V.i()) {
            recyclerView.f2842c0.f(V);
        }
    }

    public void h(s4.c1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.h(s4.c1):void");
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 V = RecyclerView.V(view);
        if (!V.e(12) && V.m() && (m0Var = recyclerView.f2842c0) != null && !m0Var.c(V, V.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            V.f43007p = this;
            V.f43008q = true;
            ((ArrayList) this.d).add(V);
        } else if (V.h() && !V.j() && !recyclerView.f2865w.f43045b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.D());
        } else {
            V.f43007p = this;
            V.f43008q = false;
            ((ArrayList) this.f15711c).add(V);
        }
    }

    public s4.c1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.j(int, long):s4.c1");
    }

    public void k(c1 c1Var) {
        if (c1Var.f43008q) {
            ((ArrayList) this.d).remove(c1Var);
        } else {
            ((ArrayList) this.f15711c).remove(c1Var);
        }
        c1Var.f43007p = null;
        c1Var.f43008q = false;
        c1Var.f43003l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.e;
        o0 o0Var = ((RecyclerView) this.h).f2867x;
        if (o0Var != null) {
            i10 = o0Var.f43092i;
        } else {
            i10 = 0;
        }
        this.f15710b = this.f15709a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f15710b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f15711c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f15712f = DesugarCollections.unmodifiableList(arrayList);
        this.f15709a = 2;
        this.f15710b = 2;
    }
}
