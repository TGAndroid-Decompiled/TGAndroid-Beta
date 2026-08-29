package f2;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class d1 {
    public int f6290a;
    public int f6291b;
    public final Serializable f6292c;
    public Object d;
    public final Serializable f6293e;
    public Object f6294f;
    public Object f6295g;
    public Object h;

    public d1(Uri uri, String str, String str2) {
        this.f6292c = str;
        this.d = uri;
        this.f6293e = str2;
    }

    public void a(n1 n1Var, boolean z10) {
        RecyclerView.m(n1Var);
        if (n1Var.e(16384)) {
            n1Var.p(0, 16384);
            r0.j0.k(n1Var.f6432a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            p0 p0Var = recyclerView.f1856w;
            if (p0Var != null) {
                p0Var.A(n1Var);
            }
            if (recyclerView.f1847p0 != null) {
                recyclerView.f1836f.U(n1Var);
            }
        }
        n1Var.f6449t = null;
        c1 c3 = c();
        c3.getClass();
        int i10 = n1Var.f6436f;
        ArrayList arrayList = c3.b(i10).f6278a;
        if (((b1) c3.f6286a.get(i10)).f6279b <= arrayList.size()) {
            return;
        }
        n1Var.o();
        arrayList.add(n1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f1847p0.b()) {
            if (!recyclerView.f1847p0.f6397g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder o10 = j7.l1.o(i10, "invalid position ", ". State item count is ");
        o10.append(recyclerView.f1847p0.b());
        o10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(o10.toString());
    }

    public c1 c() {
        if (((c1) this.f6295g) == null) {
            this.f6295g = new c1();
        }
        return (c1) this.f6295g;
    }

    public void d(p0 p0Var, p0 p0Var2) {
        ((ArrayList) this.f6292c).clear();
        e();
        c1 c3 = c();
        if (p0Var != null) {
            c3.f6287b--;
        }
        if (c3.f6287b == 0) {
            c3.a();
        }
        if (p0Var2 != null) {
            c3.f6287b++;
        } else {
            c3.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f6293e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.O0) {
            androidx.datastore.preferences.protobuf.i iVar = ((RecyclerView) this.h).f1846o0;
            int[] iArr = (int[]) iVar.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iVar.f1254c = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.f6293e;
        a((n1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        n1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f6445p.k(U);
        } else if (U.s()) {
            U.f6441l &= -33;
        }
        h(U);
        if (recyclerView.V != null && !U.i()) {
            recyclerView.V.f(U);
        }
    }

    public void h(f2.n1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: f2.d1.h(f2.n1):void");
    }

    public void i(View view) {
        u0 u0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        n1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (u0Var = recyclerView.V) != null && !u0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f6445p = this;
            U.f6446q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f1856w.f6460b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f6445p = this;
            U.f6446q = false;
            ((ArrayList) this.f6292c).add(U);
        }
    }

    public f2.n1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: f2.d1.j(int, long):f2.n1");
    }

    public void k(n1 n1Var) {
        if (n1Var.f6446q) {
            ((ArrayList) this.d).remove(n1Var);
        } else {
            ((ArrayList) this.f6292c).remove(n1Var);
        }
        n1Var.f6445p = null;
        n1Var.f6446q = false;
        n1Var.f6441l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.f6293e;
        w0 w0Var = ((RecyclerView) this.h).f1858x;
        if (w0Var != null) {
            i10 = w0Var.f6502i;
        } else {
            i10 = 0;
        }
        this.f6291b = this.f6290a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f6291b; size--) {
            f(size);
        }
    }

    public d1(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f6292c = arrayList;
        this.d = null;
        this.f6293e = new ArrayList();
        this.f6294f = DesugarCollections.unmodifiableList(arrayList);
        this.f6290a = 2;
        this.f6291b = 2;
    }
}
