package af;

import android.net.Uri;
import android.view.View;
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
import kf.k0;
import r0.j0;
public final class h {
    public int f173a;
    public int f174b;
    public final Serializable f175c;
    public Serializable d;
    public Serializable e;
    public Object f176f;
    public Object f177g;
    public Object h;

    public h(Uri uri, String str, String str2) {
        this.f175c = str;
        this.f177g = uri;
        this.d = str2;
    }

    public void a(l1 l1Var, boolean z4) {
        RecyclerView.m(l1Var);
        if (l1Var.e(16384)) {
            l1Var.p(0, 16384);
            j0.k(l1Var.f5774a, null);
        }
        if (z4) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            o0 o0Var = recyclerView.f1259w;
            if (o0Var != null) {
                o0Var.A(l1Var);
            }
            if (recyclerView.f1251q0 != null) {
                recyclerView.f1239f.c0(l1Var);
            }
        }
        l1Var.f5790t = null;
        b1 c3 = c();
        c3.getClass();
        int i10 = l1Var.f5777f;
        ArrayList arrayList = c3.b(i10).f5647a;
        if (((a1) c3.f5656a.get(i10)).f5648b <= arrayList.size()) {
            return;
        }
        l1Var.o();
        arrayList.add(l1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f1251q0.b()) {
            if (!recyclerView.f1251q0.f5735g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder m9 = k0.m(i10, "invalid position ", ". State item count is ");
        m9.append(recyclerView.f1251q0.b());
        m9.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m9.toString());
    }

    public b1 c() {
        if (((b1) this.f177g) == null) {
            this.f177g = new b1();
        }
        return (b1) this.f177g;
    }

    public void d(o0 o0Var, o0 o0Var2) {
        ((ArrayList) this.f175c).clear();
        e();
        b1 c3 = c();
        if (o0Var != null) {
            c3.f5657b--;
        }
        if (c3.f5657b == 0) {
            c3.a();
        }
        if (o0Var2 != null) {
            c3.f5657b++;
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
            androidx.datastore.preferences.protobuf.i iVar = ((RecyclerView) this.h).f1250p0;
            int[] iArr = (int[]) iVar.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iVar.f685c = 0;
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
            U.f5786p.k(U);
        } else if (U.s()) {
            U.f5782l &= -33;
        }
        h(U);
        if (recyclerView.W != null && !U.i()) {
            recyclerView.W.f(U);
        }
    }

    public void h(f2.l1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: af.h.h(f2.l1):void");
    }

    public void i(View view) {
        t0 t0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        l1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (t0Var = recyclerView.W) != null && !t0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f5786p = this;
            U.f5787q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f1259w.f5806b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f5786p = this;
            U.f5787q = false;
            ((ArrayList) this.f175c).add(U);
        }
    }

    public f2.l1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: af.h.j(int, long):f2.l1");
    }

    public void k(l1 l1Var) {
        if (l1Var.f5787q) {
            ((ArrayList) this.d).remove(l1Var);
        } else {
            ((ArrayList) this.f175c).remove(l1Var);
        }
        l1Var.f5786p = null;
        l1Var.f5787q = false;
        l1Var.f5782l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.e;
        v0 v0Var = ((RecyclerView) this.h).f1261x;
        if (v0Var != null) {
            i10 = v0Var.f5841i;
        } else {
            i10 = 0;
        }
        this.f174b = this.f173a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f174b; size--) {
            f(size);
        }
    }

    public h(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f175c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f176f = DesugarCollections.unmodifiableList(arrayList);
        this.f173a = 2;
        this.f174b = 2;
    }
}
