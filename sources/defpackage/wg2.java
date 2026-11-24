package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class wg2 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public wg2(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public final void a(s49 s49Var, boolean z) {
        RecyclerView.m(s49Var);
        if (s49Var.e(16384)) {
            s49Var.p(0, 16384);
            jdc.k(s49Var.a, null);
        }
        if (z) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            w39 w39Var = recyclerView.x;
            if (w39Var != null) {
                w39Var.A(s49Var);
            }
            if (recyclerView.v0 != null) {
                recyclerView.f.o(s49Var);
            }
        }
        s49Var.t = null;
        k49 k49Var = (k49) this.g;
        if (k49Var == null) {
            k49Var = new k49();
            this.g = k49Var;
        }
        int i = s49Var.f;
        ArrayList arrayList = k49Var.b(i).a;
        ((j49) k49Var.a.get(i)).getClass();
        if (20 <= arrayList.size()) {
            return;
        }
        s49Var.o();
        arrayList.add(s49Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        p49 p49Var = recyclerView.v0;
        if (i >= 0 && i < p49Var.b()) {
            if (!p49Var.g) {
                return i;
            }
            return recyclerView.d.f(i, 0);
        }
        StringBuilder m = de9.m(i, "invalid position ", ". State item count is ");
        m.append(p49Var.b());
        m.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m.toString());
    }

    public final wg2 c(r00 r00Var) {
        return new wg2((fm4) this.c, (fm4) this.d, this.a, this.b, r00Var, (k20) this.f, (aob) this.g, this.h);
    }

    public final boolean d() {
        return Objects.equals(((fm4) this.c).t, "audio/raw");
    }

    public final void e(w39 w39Var, w39 w39Var2) {
        ((ArrayList) this.c).clear();
        f();
        k49 k49Var = (k49) this.g;
        if (k49Var == null) {
            k49Var = new k49();
            this.g = k49Var;
        }
        if (w39Var != null) {
            k49Var.b--;
        }
        if (k49Var.b == 0) {
            k49Var.a();
        }
        if (w39Var2 != null) {
            k49Var.b++;
        }
    }

    public final void f() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        on onVar = ((RecyclerView) this.h).u0;
        int[] iArr2 = onVar.a;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        onVar.d = 0;
    }

    public final void g(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        a((s49) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        s49 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.p.l(U);
        } else if (U.s()) {
            U.l &= -33;
        }
        i(U);
        if (recyclerView.d0 != null && !U.i()) {
            recyclerView.d0.f(U);
        }
    }

    public final void i(defpackage.s49 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.i(s49):void");
    }

    public final void j(View view) {
        b49 b49Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        s49 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (b49Var = recyclerView.d0) != null && !b49Var.c(U, U.d())) {
            ArrayList arrayList = (ArrayList) this.d;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.d = arrayList;
            }
            U.p = this;
            U.q = true;
            arrayList.add(U);
        } else if (U.h() && !U.j() && !recyclerView.x.b) {
            w26.j("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
        } else {
            U.p = this;
            U.q = false;
            ((ArrayList) this.c).add(U);
        }
    }

    public final defpackage.s49 k(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg2.k(int, long):s49");
    }

    public final void l(s49 s49Var) {
        if (s49Var.q) {
            ((ArrayList) this.d).remove(s49Var);
        } else {
            ((ArrayList) this.c).remove(s49Var);
        }
        s49Var.p = null;
        s49Var.q = false;
        s49Var.l &= -33;
    }

    public final void m() {
        int i;
        ArrayList arrayList = (ArrayList) this.e;
        d49 d49Var = ((RecyclerView) this.h).y;
        if (d49Var != null) {
            i = d49Var.i;
        } else {
            i = 0;
        }
        this.b = this.a + i;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            g(size);
        }
    }

    public wg2(fm4 fm4Var, fm4 fm4Var2, int i, int i2, r00 r00Var, k20 k20Var, aob aobVar, Object obj) {
        this.c = fm4Var;
        this.d = fm4Var2;
        this.a = i;
        this.b = i2;
        this.e = r00Var;
        this.f = k20Var;
        this.g = aobVar;
        this.h = obj;
    }

    public wg2(String str, Uri uri, String str2) {
        this.c = str;
        this.g = uri;
        this.d = str2;
    }
}
