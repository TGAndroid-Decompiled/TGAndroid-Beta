package bf;

import android.net.Uri;
import android.view.View;
import androidx.datastore.preferences.protobuf.i;
import androidx.recyclerview.widget.RecyclerView;
import f2.b1;
import f2.c1;
import f2.m1;
import f2.p0;
import f2.u0;
import f2.w0;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import r0.j0;
public final class f {
    public int f1950a;
    public int f1951b;
    public final Serializable f1952c;
    public Serializable d;
    public Serializable f1953e;
    public Object f1954f;
    public Object f1955g;
    public Object h;

    public f(Uri uri, String str, String str2) {
        this.f1952c = str;
        this.f1955g = uri;
        this.d = str2;
    }

    public void a(m1 m1Var, boolean z4) {
        RecyclerView.m(m1Var);
        if (m1Var.e(16384)) {
            m1Var.p(0, 16384);
            j0.k(m1Var.f5875a, null);
        }
        if (z4) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            p0 p0Var = recyclerView.f1347w;
            if (p0Var != null) {
                p0Var.A(m1Var);
            }
            if (recyclerView.f1339q0 != null) {
                recyclerView.f1327f.b0(m1Var);
            }
        }
        m1Var.f5892t = null;
        c1 c3 = c();
        c3.getClass();
        int i10 = m1Var.f5879f;
        ArrayList arrayList = c3.b(i10).f5735a;
        if (((b1) c3.f5743a.get(i10)).f5736b <= arrayList.size()) {
            return;
        }
        m1Var.o();
        arrayList.add(m1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f1339q0.b()) {
            if (!recyclerView.f1339q0.f5832g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder m9 = l.d.m(i10, "invalid position ", ". State item count is ");
        m9.append(recyclerView.f1339q0.b());
        m9.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m9.toString());
    }

    public c1 c() {
        if (((c1) this.f1955g) == null) {
            this.f1955g = new c1();
        }
        return (c1) this.f1955g;
    }

    public void d(p0 p0Var, p0 p0Var2) {
        ((ArrayList) this.f1952c).clear();
        e();
        c1 c3 = c();
        if (p0Var != null) {
            c3.f5744b--;
        }
        if (c3.f5744b == 0) {
            c3.a();
        }
        if (p0Var2 != null) {
            c3.f5744b++;
        } else {
            c3.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f1953e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.P0) {
            i iVar = ((RecyclerView) this.h).f1338p0;
            int[] iArr = (int[]) iVar.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iVar.f735c = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.f1953e;
        a((m1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        m1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f5888p.k(U);
        } else if (U.s()) {
            U.f5884l &= -33;
        }
        h(U);
        if (recyclerView.W != null && !U.i()) {
            recyclerView.W.f(U);
        }
    }

    public void h(f2.m1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: bf.f.h(f2.m1):void");
    }

    public void i(View view) {
        u0 u0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        m1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (u0Var = recyclerView.W) != null && !u0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f5888p = this;
            U.f5889q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f1347w.f5909b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f5888p = this;
            U.f5889q = false;
            ((ArrayList) this.f1952c).add(U);
        }
    }

    public f2.m1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: bf.f.j(int, long):f2.m1");
    }

    public void k(m1 m1Var) {
        if (m1Var.f5889q) {
            ((ArrayList) this.d).remove(m1Var);
        } else {
            ((ArrayList) this.f1952c).remove(m1Var);
        }
        m1Var.f5888p = null;
        m1Var.f5889q = false;
        m1Var.f5884l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.f1953e;
        w0 w0Var = ((RecyclerView) this.h).f1349x;
        if (w0Var != null) {
            i10 = w0Var.f5946i;
        } else {
            i10 = 0;
        }
        this.f1951b = this.f1950a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1951b; size--) {
            f(size);
        }
    }

    public f(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1952c = arrayList;
        this.d = null;
        this.f1953e = new ArrayList();
        this.f1954f = DesugarCollections.unmodifiableList(arrayList);
        this.f1950a = 2;
        this.f1951b = 2;
    }
}
