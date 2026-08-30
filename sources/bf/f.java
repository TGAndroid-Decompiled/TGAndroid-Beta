package bf;

import android.net.Uri;
import android.view.View;
import androidx.datastore.preferences.protobuf.i;
import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
import f2.b1;
import f2.l1;
import f2.o0;
import f2.t0;
import f2.v0;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import kh.a2;
import r0.j0;
public final class f {
    public int f1796a;
    public int f1797b;
    public final Serializable f1798c;
    public Serializable d;
    public Serializable e;
    public Object f1799f;
    public Object f1800g;
    public Object h;

    public f(Uri uri, String str, String str2) {
        this.f1798c = str;
        this.f1800g = uri;
        this.d = str2;
    }

    public void a(l1 l1Var, boolean z4) {
        RecyclerView.m(l1Var);
        if (l1Var.e(16384)) {
            l1Var.p(0, 16384);
            j0.k(l1Var.f5785a, null);
        }
        if (z4) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            o0 o0Var = recyclerView.f1248w;
            if (o0Var != null) {
                o0Var.A(l1Var);
            }
            if (recyclerView.f1240q0 != null) {
                recyclerView.f1228f.b0(l1Var);
            }
        }
        l1Var.f5801t = null;
        b1 c3 = c();
        c3.getClass();
        int i10 = l1Var.f5788f;
        ArrayList arrayList = c3.b(i10).f5658a;
        if (((a1) c3.f5667a.get(i10)).f5659b <= arrayList.size()) {
            return;
        }
        l1Var.o();
        arrayList.add(l1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f1240q0.b()) {
            if (!recyclerView.f1240q0.f5746g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder m9 = a2.m(i10, "invalid position ", ". State item count is ");
        m9.append(recyclerView.f1240q0.b());
        m9.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m9.toString());
    }

    public b1 c() {
        if (((b1) this.f1800g) == null) {
            this.f1800g = new b1();
        }
        return (b1) this.f1800g;
    }

    public void d(o0 o0Var, o0 o0Var2) {
        ((ArrayList) this.f1798c).clear();
        e();
        b1 c3 = c();
        if (o0Var != null) {
            c3.f5668b--;
        }
        if (c3.f5668b == 0) {
            c3.a();
        }
        if (o0Var2 != null) {
            c3.f5668b++;
        } else {
            c3.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.P0) {
            i iVar = ((RecyclerView) this.h).f1239p0;
            int[] iArr = (int[]) iVar.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iVar.f673c = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        a((l1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        l1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f5797p.k(U);
        } else if (U.s()) {
            U.f5793l &= -33;
        }
        h(U);
        if (recyclerView.W != null && !U.i()) {
            recyclerView.W.f(U);
        }
    }

    public void h(f2.l1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: bf.f.h(f2.l1):void");
    }

    public void i(View view) {
        t0 t0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        l1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (t0Var = recyclerView.W) != null && !t0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f5797p = this;
            U.f5798q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f1248w.f5817b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f5797p = this;
            U.f5798q = false;
            ((ArrayList) this.f1798c).add(U);
        }
    }

    public f2.l1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: bf.f.j(int, long):f2.l1");
    }

    public void k(l1 l1Var) {
        if (l1Var.f5798q) {
            ((ArrayList) this.d).remove(l1Var);
        } else {
            ((ArrayList) this.f1798c).remove(l1Var);
        }
        l1Var.f5797p = null;
        l1Var.f5798q = false;
        l1Var.f5793l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.e;
        v0 v0Var = ((RecyclerView) this.h).f1250x;
        if (v0Var != null) {
            i10 = v0Var.f5852i;
        } else {
            i10 = 0;
        }
        this.f1797b = this.f1796a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1797b; size--) {
            f(size);
        }
    }

    public f(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1798c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f1799f = DesugarCollections.unmodifiableList(arrayList);
        this.f1796a = 2;
        this.f1797b = 2;
    }
}
