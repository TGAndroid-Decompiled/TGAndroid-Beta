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
    public int f15498a;
    public int f15499b;
    public final Serializable f15500c;
    public Serializable d;
    public Serializable e;
    public Object f15501f;
    public Object f15502g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f15500c = str;
        this.f15502g = uri;
        this.d = str2;
    }

    public void a(c1 c1Var, boolean z10) {
        RecyclerView.m(c1Var);
        if (c1Var.e(16384)) {
            c1Var.p(0, 16384);
            i0.k(c1Var.f42627a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f2858w;
            if (h0Var != null) {
                h0Var.A(c1Var);
            }
            if (recyclerView.f2855t0 != null) {
                recyclerView.f2838f.L(c1Var);
            }
        }
        c1Var.f42643t = null;
        u0 c10 = c();
        c10.getClass();
        int i10 = c1Var.f42630f;
        ArrayList arrayList = c10.b(i10).f42741a;
        if (((t0) c10.f42754a.get(i10)).f42742b <= arrayList.size()) {
            return;
        }
        c1Var.o();
        arrayList.add(c1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f2855t0.b()) {
            if (!recyclerView.f2855t0.f42789g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder l4 = hg.c.l(i10, "invalid position ", ". State item count is ");
        l4.append(recyclerView.f2855t0.b());
        l4.append(recyclerView.C());
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public u0 c() {
        if (((u0) this.f15502g) == null) {
            this.f15502g = new u0();
        }
        return (u0) this.f15502g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f15500c).clear();
        e();
        u0 c10 = c();
        if (h0Var != null) {
            c10.f42755b--;
        }
        if (c10.f42755b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f42755b++;
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
            h hVar = ((RecyclerView) this.h).f2854s0;
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
        c1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f42639p.k(U);
        } else if (U.s()) {
            U.f42635l &= -33;
        }
        h(U);
        if (recyclerView.f2835c0 != null && !U.i()) {
            recyclerView.f2835c0.f(U);
        }
    }

    public void h(s4.c1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.h(s4.c1):void");
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.f2835c0) != null && !m0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f42639p = this;
            U.f42640q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f2858w.f42677b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f42639p = this;
            U.f42640q = false;
            ((ArrayList) this.f15500c).add(U);
        }
    }

    public s4.c1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: of.e.j(int, long):s4.c1");
    }

    public void k(c1 c1Var) {
        if (c1Var.f42640q) {
            ((ArrayList) this.d).remove(c1Var);
        } else {
            ((ArrayList) this.f15500c).remove(c1Var);
        }
        c1Var.f42639p = null;
        c1Var.f42640q = false;
        c1Var.f42635l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.e;
        o0 o0Var = ((RecyclerView) this.h).f2860x;
        if (o0Var != null) {
            i10 = o0Var.f42724i;
        } else {
            i10 = 0;
        }
        this.f15499b = this.f15498a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f15499b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f15500c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f15501f = DesugarCollections.unmodifiableList(arrayList);
        this.f15498a = 2;
        this.f15499b = 2;
    }
}
