package hf;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import r0.h0;
import s4.c1;
import s4.g0;
import s4.l0;
import s4.n0;
import s4.t0;
import s4.u0;
public final class e {
    public int f7669a;
    public int f7670b;
    public final Serializable f7671c;
    public Serializable d;
    public Serializable e;
    public Object f7672f;
    public Object f7673g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f7671c = str;
        this.f7673g = uri;
        this.d = str2;
    }

    public void a(c1 c1Var, boolean z10) {
        RecyclerView.m(c1Var);
        if (c1Var.e(16384)) {
            c1Var.p(0, 16384);
            h0.j(c1Var.f47898a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            g0 g0Var = recyclerView.f1922x;
            if (g0Var != null) {
                g0Var.A(c1Var);
            }
            if (recyclerView.f1918u0 != null) {
                recyclerView.f1900f.E0(c1Var);
            }
        }
        c1Var.f47914t = null;
        u0 c10 = c();
        c10.getClass();
        int i10 = c1Var.f47901f;
        ArrayList arrayList = c10.b(i10).f48010a;
        if (((t0) c10.f48016a.get(i10)).f48011b <= arrayList.size()) {
            return;
        }
        c1Var.o();
        arrayList.add(c1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f1918u0.b()) {
            if (!recyclerView.f1918u0.f48057g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder l4 = i0.a.l(i10, "invalid position ", ". State item count is ");
        l4.append(recyclerView.f1918u0.b());
        l4.append(recyclerView.C());
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public u0 c() {
        if (((u0) this.f7673g) == null) {
            this.f7673g = new u0();
        }
        return (u0) this.f7673g;
    }

    public void d(g0 g0Var, g0 g0Var2) {
        ((ArrayList) this.f7671c).clear();
        e();
        u0 c10 = c();
        if (g0Var != null) {
            c10.f48017b--;
        }
        if (c10.f48017b == 0) {
            c10.a();
        }
        if (g0Var2 != null) {
            c10.f48017b++;
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
        int[] iArr = RecyclerView.Q0;
        e2.f fVar = ((RecyclerView) this.h).f1917t0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.f6137c = 0;
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
            U.f47910p.k(U);
        } else if (U.s()) {
            U.f47906l &= -33;
        }
        h(U);
        if (recyclerView.f1897c0 != null && !U.i()) {
            recyclerView.f1897c0.f(U);
        }
    }

    public void h(s4.c1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: hf.e.h(s4.c1):void");
    }

    public void i(View view) {
        l0 l0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (l0Var = recyclerView.f1897c0) != null && !l0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f47910p = this;
            U.f47911q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f1922x.f47933b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f47910p = this;
            U.f47911q = false;
            ((ArrayList) this.f7671c).add(U);
        }
    }

    public s4.c1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: hf.e.j(int, long):s4.c1");
    }

    public void k(c1 c1Var) {
        if (c1Var.f47911q) {
            ((ArrayList) this.d).remove(c1Var);
        } else {
            ((ArrayList) this.f7671c).remove(c1Var);
        }
        c1Var.f47910p = null;
        c1Var.f47911q = false;
        c1Var.f47906l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.e;
        n0 n0Var = ((RecyclerView) this.h).f1924y;
        if (n0Var != null) {
            i10 = n0Var.f47983i;
        } else {
            i10 = 0;
        }
        this.f7670b = this.f7669a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f7670b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f7671c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f7672f = DesugarCollections.unmodifiableList(arrayList);
        this.f7669a = 2;
        this.f7670b = 2;
    }
}
