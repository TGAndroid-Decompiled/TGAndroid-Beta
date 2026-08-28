package f2;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class g1 {
    public int f5359a;
    public int f5360b;
    public final Serializable f5361c;
    public Object d;
    public final Serializable f5362e;
    public Object f5363f;
    public Object f5364g;
    public Object h;

    public g1(Uri uri, String str, String str2) {
        this.f5361c = str;
        this.d = uri;
        this.f5362e = str2;
    }

    public void a(q1 q1Var, boolean z10) {
        RecyclerView.m(q1Var);
        if (q1Var.e(16384)) {
            q1Var.p(0, 16384);
            r0.j0.k(q1Var.f5501a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            r0 r0Var = recyclerView.f1366w;
            if (r0Var != null) {
                r0Var.A(q1Var);
            }
            if (recyclerView.f1357p0 != null) {
                recyclerView.f1346f.L(q1Var);
            }
        }
        q1Var.f5518t = null;
        f1 c10 = c();
        c10.getClass();
        int i9 = q1Var.f5505f;
        ArrayList arrayList = c10.b(i9).f5346a;
        if (((e1) c10.f5354a.get(i9)).f5347b <= arrayList.size()) {
            return;
        }
        q1Var.o();
        arrayList.add(q1Var);
    }

    public int b(int i9) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i9 >= 0 && i9 < recyclerView.f1357p0.b()) {
            if (!recyclerView.f1357p0.f5474g) {
                return i9;
            }
            return recyclerView.d.g(i9, 0);
        }
        StringBuilder p6 = j3.r0.p(i9, "invalid position ", ". State item count is ");
        p6.append(recyclerView.f1357p0.b());
        p6.append(recyclerView.C());
        throw new IndexOutOfBoundsException(p6.toString());
    }

    public f1 c() {
        if (((f1) this.f5364g) == null) {
            this.f5364g = new f1();
        }
        return (f1) this.f5364g;
    }

    public void d(r0 r0Var, r0 r0Var2) {
        ((ArrayList) this.f5361c).clear();
        e();
        f1 c10 = c();
        if (r0Var != null) {
            c10.f5355b--;
        }
        if (c10.f5355b == 0) {
            c10.a();
        }
        if (r0Var2 != null) {
            c10.f5355b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f5362e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.O0) {
            androidx.datastore.preferences.protobuf.i iVar = ((RecyclerView) this.h).f1356o0;
            int[] iArr = (int[]) iVar.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iVar.f760c = 0;
        }
    }

    public void f(int i9) {
        ArrayList arrayList = (ArrayList) this.f5362e;
        a((q1) arrayList.get(i9), true);
        arrayList.remove(i9);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        q1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f5514p.k(U);
        } else if (U.s()) {
            U.f5510l &= -33;
        }
        h(U);
        if (recyclerView.V != null && !U.i()) {
            recyclerView.V.f(U);
        }
    }

    public void h(f2.q1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: f2.g1.h(f2.q1):void");
    }

    public void i(View view) {
        w0 w0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        q1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (w0Var = recyclerView.V) != null && !w0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f5514p = this;
            U.f5515q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f1366w.f5524b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f5514p = this;
            U.f5515q = false;
            ((ArrayList) this.f5361c).add(U);
        }
    }

    public f2.q1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: f2.g1.j(int, long):f2.q1");
    }

    public void k(q1 q1Var) {
        if (q1Var.f5515q) {
            ((ArrayList) this.d).remove(q1Var);
        } else {
            ((ArrayList) this.f5361c).remove(q1Var);
        }
        q1Var.f5514p = null;
        q1Var.f5515q = false;
        q1Var.f5510l &= -33;
    }

    public void l() {
        int i9;
        ArrayList arrayList = (ArrayList) this.f5362e;
        z0 z0Var = ((RecyclerView) this.h).f1368x;
        if (z0Var != null) {
            i9 = z0Var.f5568i;
        } else {
            i9 = 0;
        }
        this.f5360b = this.f5359a + i9;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f5360b; size--) {
            f(size);
        }
    }

    public g1(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f5361c = arrayList;
        this.d = null;
        this.f5362e = new ArrayList();
        this.f5363f = DesugarCollections.unmodifiableList(arrayList);
        this.f5359a = 2;
        this.f5360b = 2;
    }
}
