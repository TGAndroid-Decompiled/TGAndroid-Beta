package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class ki2 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ki2(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public final void a(u69 u69Var, boolean z) {
        RecyclerView.m(u69Var);
        if (u69Var.e(16384)) {
            u69Var.p(0, 16384);
            kfc.k(u69Var.a, null);
        }
        if (z) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            y59 y59Var = recyclerView.x;
            if (y59Var != null) {
                y59Var.A(u69Var);
            }
            if (recyclerView.v0 != null) {
                recyclerView.f.o(u69Var);
            }
        }
        u69Var.t = null;
        m69 m69Var = (m69) this.g;
        if (m69Var == null) {
            m69Var = new m69();
            this.g = m69Var;
        }
        int i = u69Var.f;
        ArrayList arrayList = m69Var.b(i).a;
        ((l69) m69Var.a.get(i)).getClass();
        if (20 <= arrayList.size()) {
            return;
        }
        u69Var.o();
        arrayList.add(u69Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        r69 r69Var = recyclerView.v0;
        if (i >= 0 && i < r69Var.b()) {
            if (!r69Var.g) {
                return i;
            }
            return recyclerView.d.f(i, 0);
        }
        StringBuilder l = hg9.l(i, "invalid position ", ". State item count is ");
        l.append(r69Var.b());
        l.append(recyclerView.C());
        throw new IndexOutOfBoundsException(l.toString());
    }

    public final ki2 c(r10 r10Var) {
        return new ki2((go4) this.c, (go4) this.d, this.a, this.b, r10Var, (k30) this.f, (bqb) this.g, this.h);
    }

    public final boolean d() {
        return Objects.equals(((go4) this.c).t, "audio/raw");
    }

    public final void e(y59 y59Var, y59 y59Var2) {
        ((ArrayList) this.c).clear();
        f();
        m69 m69Var = (m69) this.g;
        if (m69Var == null) {
            m69Var = new m69();
            this.g = m69Var;
        }
        if (y59Var != null) {
            m69Var.b--;
        }
        if (m69Var.b == 0) {
            m69Var.a();
        }
        if (y59Var2 != null) {
            m69Var.b++;
        }
    }

    public final void f() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        po poVar = ((RecyclerView) this.h).u0;
        int[] iArr2 = poVar.a;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        poVar.d = 0;
    }

    public final void g(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        a((u69) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        u69 U = RecyclerView.U(view);
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

    public final void i(defpackage.u69 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki2.i(u69):void");
    }

    public final void j(View view) {
        d69 d69Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        u69 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (d69Var = recyclerView.d0) != null && !d69Var.c(U, U.d())) {
            ArrayList arrayList = (ArrayList) this.d;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.d = arrayList;
            }
            U.p = this;
            U.q = true;
            arrayList.add(U);
        } else if (U.h() && !U.j() && !recyclerView.x.b) {
            u36.j("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
        } else {
            U.p = this;
            U.q = false;
            ((ArrayList) this.c).add(U);
        }
    }

    public final defpackage.u69 k(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki2.k(int, long):u69");
    }

    public final void l(u69 u69Var) {
        if (u69Var.q) {
            ((ArrayList) this.d).remove(u69Var);
        } else {
            ((ArrayList) this.c).remove(u69Var);
        }
        u69Var.p = null;
        u69Var.q = false;
        u69Var.l &= -33;
    }

    public final void m() {
        int i;
        ArrayList arrayList = (ArrayList) this.e;
        f69 f69Var = ((RecyclerView) this.h).y;
        if (f69Var != null) {
            i = f69Var.i;
        } else {
            i = 0;
        }
        this.b = this.a + i;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            g(size);
        }
    }

    public ki2(go4 go4Var, go4 go4Var2, int i, int i2, r10 r10Var, k30 k30Var, bqb bqbVar, Object obj) {
        this.c = go4Var;
        this.d = go4Var2;
        this.a = i;
        this.b = i2;
        this.e = r10Var;
        this.f = k30Var;
        this.g = bqbVar;
        this.h = obj;
    }

    public ki2(String str, Uri uri, String str2) {
        this.c = str;
        this.g = uri;
        this.d = str2;
    }
}
