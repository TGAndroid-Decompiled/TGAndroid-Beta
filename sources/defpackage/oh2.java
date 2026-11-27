package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
public final class oh2 {
    public int a;
    public int b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public oh2(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f = DesugarCollections.unmodifiableList(arrayList);
        this.a = 2;
        this.b = 2;
    }

    public final void a(f89 f89Var, boolean z) {
        RecyclerView.n(f89Var);
        if (f89Var.e(16384)) {
            f89Var.p(0, 16384);
            ihc.l(f89Var.a, null);
        }
        if (z) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            j79 j79Var = recyclerView.x;
            if (j79Var != null) {
                j79Var.A(f89Var);
            }
            if (recyclerView.v0 != null) {
                recyclerView.f.r(f89Var);
            }
        }
        f89Var.t = null;
        x79 x79Var = (x79) this.g;
        if (x79Var == null) {
            x79Var = new x79();
            this.g = x79Var;
        }
        int i = f89Var.f;
        ArrayList arrayList = x79Var.b(i).a;
        ((w79) x79Var.a.get(i)).getClass();
        if (20 <= arrayList.size()) {
            return;
        }
        f89Var.o();
        arrayList.add(f89Var);
    }

    public final int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        c89 c89Var = recyclerView.v0;
        if (i >= 0 && i < c89Var.b()) {
            if (!c89Var.g) {
                return i;
            }
            return recyclerView.d.f(i, 0);
        }
        StringBuilder m = uh9.m(i, "invalid position ", ". State item count is ");
        m.append(c89Var.b());
        m.append(recyclerView.D());
        throw new IndexOutOfBoundsException(m.toString());
    }

    public final oh2 c(s00 s00Var) {
        return new oh2((ko4) this.c, (ko4) this.d, this.a, this.b, s00Var, (l20) this.f, (asb) this.g, this.h);
    }

    public final boolean d() {
        return Objects.equals(((ko4) this.c).t, "audio/raw");
    }

    public final void e(j79 j79Var, j79 j79Var2) {
        ((ArrayList) this.c).clear();
        f();
        x79 x79Var = (x79) this.g;
        if (x79Var == null) {
            x79Var = new x79();
            this.g = x79Var;
        }
        if (j79Var != null) {
            x79Var.b--;
        }
        if (x79Var.b == 0) {
            x79Var.a();
        }
        if (j79Var2 != null) {
            x79Var.b++;
        }
    }

    public final void f() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        pn pnVar = ((RecyclerView) this.h).u0;
        int[] iArr2 = pnVar.a;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        pnVar.d = 0;
    }

    public final void g(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        a((f89) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void h(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        f89 V = RecyclerView.V(view);
        if (V.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (V.k()) {
            V.p.l(V);
        } else if (V.s()) {
            V.l &= -33;
        }
        i(V);
        if (recyclerView.d0 != null && !V.i()) {
            recyclerView.d0.f(V);
        }
    }

    public final void i(defpackage.f89 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh2.i(f89):void");
    }

    public final void j(View view) {
        o79 o79Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        f89 V = RecyclerView.V(view);
        if (!V.e(12) && V.m() && (o79Var = recyclerView.d0) != null && !o79Var.c(V, V.d())) {
            ArrayList arrayList = (ArrayList) this.d;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.d = arrayList;
            }
            V.p = this;
            V.q = true;
            arrayList.add(V);
        } else if (V.h() && !V.j() && !recyclerView.x.b) {
            lq5.j("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.D()));
        } else {
            V.p = this;
            V.q = false;
            ((ArrayList) this.c).add(V);
        }
    }

    public final defpackage.f89 k(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oh2.k(int, long):f89");
    }

    public final void l(f89 f89Var) {
        if (f89Var.q) {
            ((ArrayList) this.d).remove(f89Var);
        } else {
            ((ArrayList) this.c).remove(f89Var);
        }
        f89Var.p = null;
        f89Var.q = false;
        f89Var.l &= -33;
    }

    public final void m() {
        int i;
        ArrayList arrayList = (ArrayList) this.e;
        q79 q79Var = ((RecyclerView) this.h).y;
        if (q79Var != null) {
            i = q79Var.i;
        } else {
            i = 0;
        }
        this.b = this.a + i;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.b; size--) {
            g(size);
        }
    }

    public oh2(ko4 ko4Var, ko4 ko4Var2, int i, int i2, s00 s00Var, l20 l20Var, asb asbVar, Object obj) {
        this.c = ko4Var;
        this.d = ko4Var2;
        this.a = i;
        this.b = i2;
        this.e = s00Var;
        this.f = l20Var;
        this.g = asbVar;
        this.h = obj;
    }

    public oh2(String str, Uri uri, String str2) {
        this.c = str;
        this.g = uri;
        this.d = str2;
    }
}
