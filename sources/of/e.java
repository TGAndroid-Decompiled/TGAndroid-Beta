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
    public int f15662a;
    public int f15663b;
    public final Serializable f15664c;
    public Serializable d;
    public Serializable e;
    public Object f15665f;
    public Object f15666g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f15664c = str;
        this.f15666g = uri;
        this.d = str2;
    }

    public void a(c1 c1Var, boolean z10) {
        RecyclerView.n(c1Var);
        if (c1Var.e(16384)) {
            c1Var.p(0, 16384);
            i0.k(c1Var.f42929a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f2866w;
            if (h0Var != null) {
                h0Var.A(c1Var);
            }
            if (recyclerView.f2863t0 != null) {
                recyclerView.f2846f.M(c1Var);
            }
        }
        c1Var.f42945t = null;
        u0 c10 = c();
        c10.getClass();
        int i10 = c1Var.f42932f;
        ArrayList arrayList = c10.b(i10).f43043a;
        if (((t0) c10.f43056a.get(i10)).f43044b <= arrayList.size()) {
            return;
        }
        c1Var.o();
        arrayList.add(c1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f2863t0.b()) {
            if (!recyclerView.f2863t0.f43091g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder j3 = k0.j(i10, "invalid position ", ". State item count is ");
        j3.append(recyclerView.f2863t0.b());
        j3.append(recyclerView.D());
        throw new IndexOutOfBoundsException(j3.toString());
    }

    public u0 c() {
        if (((u0) this.f15666g) == null) {
            this.f15666g = new u0();
        }
        return (u0) this.f15666g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f15664c).clear();
        e();
        u0 c10 = c();
        if (h0Var != null) {
            c10.f43057b--;
        }
        if (c10.f43057b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f43057b++;
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
            V.f42941p.k(V);
        } else if (V.s()) {
            V.f42937l &= -33;
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
            V.f42941p = this;
            V.f42942q = true;
            ((ArrayList) this.d).add(V);
        } else if (V.h() && !V.j() && !recyclerView.f2866w.f42979b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.D());
        } else {
            V.f42941p = this;
            V.f42942q = false;
            ((ArrayList) this.f15664c).add(V);
        }
    }

    public s4.c1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.j(int, long):s4.c1");
    }

    public void k(c1 c1Var) {
        if (c1Var.f42942q) {
            ((ArrayList) this.d).remove(c1Var);
        } else {
            ((ArrayList) this.f15664c).remove(c1Var);
        }
        c1Var.f42941p = null;
        c1Var.f42942q = false;
        c1Var.f42937l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.e;
        o0 o0Var = ((RecyclerView) this.h).f2868x;
        if (o0Var != null) {
            i10 = o0Var.f43026i;
        } else {
            i10 = 0;
        }
        this.f15663b = this.f15662a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f15663b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f15664c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f15665f = DesugarCollections.unmodifiableList(arrayList);
        this.f15662a = 2;
        this.f15663b = 2;
    }
}
