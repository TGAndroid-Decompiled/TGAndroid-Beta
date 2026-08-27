package f2;

import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

public final class e1 {

    public int f5647a;

    public int f5648b;

    public final Serializable f5649c;
    public Object d;

    public final Serializable f5650e;

    public Object f5651f;

    public Object f5652g;
    public Object h;

    public e1(Uri uri, String str, String str2) {
        this.f5649c = str;
        this.d = uri;
        this.f5650e = str2;
    }

    public void a(o1 o1Var, boolean z10) {
        RecyclerView.m(o1Var);
        if (o1Var.e(16384)) {
            o1Var.p(0, 16384);
            r0.j0.k(o1Var.f5789a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            q0 q0Var = recyclerView.f1862w;
            if (q0Var != null) {
                q0Var.A(o1Var);
            }
            if (recyclerView.f1853p0 != null) {
                recyclerView.f1842f.O(o1Var);
            }
        }
        o1Var.f5806t = null;
        d1 d1VarC = c();
        d1VarC.getClass();
        int i10 = o1Var.f5793f;
        ArrayList arrayList = d1VarC.b(i10).f5635a;
        if (((c1) d1VarC.f5642a.get(i10)).f5636b <= arrayList.size()) {
            return;
        }
        o1Var.o();
        arrayList.add(o1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f1853p0.b()) {
            return !recyclerView.f1853p0.f5762g ? i10 : recyclerView.d.g(i10, 0);
        }
        StringBuilder sbO = i0.a.o(i10, "invalid position ", ". State item count is ");
        sbO.append(recyclerView.f1853p0.b());
        sbO.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbO.toString());
    }

    public d1 c() {
        if (((d1) this.f5652g) == null) {
            this.f5652g = new d1();
        }
        return (d1) this.f5652g;
    }

    public void d(q0 q0Var, q0 q0Var2) {
        ((ArrayList) this.f5649c).clear();
        e();
        d1 d1VarC = c();
        if (q0Var != null) {
            d1VarC.f5643b--;
        }
        if (d1VarC.f5643b == 0) {
            d1VarC.a();
        }
        if (q0Var2 != null) {
            d1VarC.f5643b++;
        } else {
            d1VarC.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f5650e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.O0) {
            androidx.datastore.preferences.protobuf.i iVar = ((RecyclerView) this.h).f1852o0;
            int[] iArr = (int[]) iVar.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iVar.f1257c = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.f5650e;
        a((o1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        o1 o1VarU = RecyclerView.U(view);
        if (o1VarU.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (o1VarU.k()) {
            o1VarU.f5802p.k(o1VarU);
        } else if (o1VarU.s()) {
            o1VarU.f5798l &= -33;
        }
        h(o1VarU);
        if (recyclerView.V == null || o1VarU.i()) {
            return;
        }
        recyclerView.V.f(o1VarU);
    }

    public void h(o1 o1Var) {
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = (ArrayList) this.f5650e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        androidx.datastore.preferences.protobuf.i iVar = recyclerView.f1852o0;
        boolean zK = o1Var.k();
        View view = o1Var.f5789a;
        boolean z12 = false;
        boolean z13 = true;
        if (zK || view.getParent() != null) {
            StringBuilder sb2 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(o1Var.k());
            sb2.append(" isAttached:");
            sb2.append(view.getParent() != null);
            sb2.append(recyclerView.C());
            throw new IllegalArgumentException(sb2.toString());
        }
        if (o1Var.l()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + o1Var + recyclerView.C());
        }
        if (o1Var.r()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + recyclerView.C());
        }
        if ((o1Var.f5798l & 16) == 0) {
            WeakHashMap weakHashMap = r0.j0.f46605a;
            if (view.hasTransientState()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (o1Var.i()) {
            if (this.f5648b <= 0 || o1Var.e(526)) {
                z11 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f5648b && size > 0) {
                    f(0);
                    size--;
                }
                if (RecyclerView.O0 && size > 0) {
                    int i14 = o1Var.f5791c;
                    if (((int[]) iVar.d) != null) {
                        int i15 = iVar.f1257c * 2;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= i15) {
                                i10 = size - 1;
                                loop1: while (i10 >= 0) {
                                    i11 = ((o1) arrayList.get(i10)).f5791c;
                                    if (((int[]) iVar.d) != null) {
                                        break;
                                    }
                                    i12 = iVar.f1257c * 2;
                                    i13 = 0;
                                    while (true) {
                                        if (i13 < i12) {
                                            break loop1;
                                        } else if (((int[]) iVar.d)[i13] == i11) {
                                            break;
                                        } else {
                                            i13 += 2;
                                        }
                                    }
                                    i10--;
                                }
                                size = i10 + 1;
                            } else if (((int[]) iVar.d)[i16] != i14) {
                                i16 += 2;
                            }
                        }
                    } else {
                        i10 = size - 1;
                        loop1: while (i10 >= 0) {
                            i11 = ((o1) arrayList.get(i10)).f5791c;
                            if (((int[]) iVar.d) != null) {
                                break;
                                break;
                            }
                            i12 = iVar.f1257c * 2;
                            i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    break loop1;
                                    break loop1;
                                } else if (((int[]) iVar.d)[i13] == i11) {
                                    break;
                                } else {
                                    i13 += 2;
                                }
                            }
                            i10--;
                        }
                        size = i10 + 1;
                    }
                }
                arrayList.add(size, o1Var);
                z11 = true;
            }
            if (z11) {
                z12 = z11;
                z13 = false;
            } else {
                a(o1Var, true);
                z12 = z11;
            }
        } else {
            z13 = false;
        }
        recyclerView.f1842f.O(o1Var);
        if (z12 || z13 || !z10) {
            return;
        }
        o1Var.f5806t = null;
    }

    public void i(View view) {
        v0 v0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        o1 o1VarU = RecyclerView.U(view);
        if (!o1VarU.e(12) && o1VarU.m() && (v0Var = recyclerView.V) != null && !v0Var.c(o1VarU, o1VarU.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            o1VarU.f5802p = this;
            o1VarU.f5803q = true;
            ((ArrayList) this.d).add(o1VarU);
            return;
        }
        if (o1VarU.h() && !o1VarU.j() && !recyclerView.f1862w.f5815b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        }
        o1VarU.f5802p = this;
        o1VarU.f5803q = false;
        ((ArrayList) this.f5649c).add(o1VarU);
    }

    public o1 j(int i10, long j10) {
        boolean z10;
        o1 o1VarG;
        r0.b bVar;
        long j11;
        long j12;
        boolean z11;
        r0.b bVar2;
        ViewGroup.LayoutParams layoutParams;
        y0 y0Var;
        boolean z12;
        RecyclerView recyclerViewJ;
        o1 o1Var;
        View view;
        o1 o1Var2;
        boolean z13;
        int size;
        int iG;
        ArrayList arrayList = (ArrayList) this.f5649c;
        ArrayList arrayList2 = (ArrayList) this.f5650e;
        RecyclerView recyclerView = (RecyclerView) this.h;
        l1 l1Var = recyclerView.f1853p0;
        if (i10 < 0 || i10 >= l1Var.b()) {
            StringBuilder sbP = com.google.android.recaptcha.internal.a.p("Invalid item position ", i10, "(", i10, "). Item count:");
            sbP.append(l1Var.b());
            sbP.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (l1Var.f5762g) {
            ArrayList arrayList3 = (ArrayList) this.d;
            if (arrayList3 != null && (size = arrayList3.size()) != 0) {
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        if (recyclerView.f1862w.f5815b && (iG = recyclerView.d.g(i10, 0)) > 0 && iG < recyclerView.f1862w.h()) {
                            long jI = recyclerView.f1862w.i(iG);
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size) {
                                    o1VarG = null;
                                    break;
                                }
                                o1 o1Var3 = (o1) ((ArrayList) this.d).get(i12);
                                if (!o1Var3.s() && o1Var3.f5792e == jI) {
                                    o1Var3.a(32);
                                    o1VarG = o1Var3;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            o1VarG = null;
                            break;
                        }
                    } else {
                        o1VarG = (o1) ((ArrayList) this.d).get(i11);
                        if (!o1VarG.s() && o1VarG.c() == i10) {
                            o1VarG.a(32);
                            break;
                        }
                        i11++;
                    }
                }
            } else {
                o1VarG = null;
                break;
            }
            z10 = o1VarG != null;
        } else {
            z10 = false;
            o1VarG = null;
        }
        if (o1VarG == null) {
            int size2 = arrayList.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size2) {
                    ArrayList arrayList4 = (ArrayList) recyclerView.f1840e.d;
                    int size3 = arrayList4.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size3) {
                            view = null;
                            break;
                        }
                        view = (View) arrayList4.get(i14);
                        o1 o1VarU = RecyclerView.U(view);
                        if (o1VarU.c() == i10 && !o1VarU.h() && !o1VarU.j()) {
                            break;
                        }
                        i14++;
                    }
                    if (view == null) {
                        int size4 = arrayList2.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size4) {
                                o1Var2 = null;
                                break;
                            }
                            o1Var2 = (o1) arrayList2.get(i15);
                            if (!o1Var2.h() && o1Var2.c() == i10 && !o1Var2.f()) {
                                arrayList2.remove(i15);
                                break;
                            }
                            i15++;
                        }
                    } else {
                        o1 o1VarU2 = RecyclerView.U(view);
                        a5.n nVar = recyclerView.f1840e;
                        c cVar = (c) nVar.f101c;
                        int iIndexOfChild = ((RecyclerView) ((a9.i) nVar.f100b).f181b).indexOfChild(view);
                        if (iIndexOfChild < 0) {
                            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                        }
                        if (!cVar.I(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        cVar.x(iIndexOfChild);
                        nVar.z(view);
                        a5.n nVar2 = recyclerView.f1840e;
                        c cVar2 = (c) nVar2.f101c;
                        int iIndexOfChild2 = ((RecyclerView) ((a9.i) nVar2.f100b).f181b).indexOfChild(view);
                        int iZ = (iIndexOfChild2 == -1 || cVar2.I(iIndexOfChild2)) ? -1 : iIndexOfChild2 - cVar2.z(iIndexOfChild2);
                        if (iZ == -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + o1VarU2 + recyclerView.C());
                        }
                        recyclerView.f1840e.k(iZ);
                        i(view);
                        o1VarU2.a(8224);
                        o1Var2 = o1VarU2;
                        break;
                    }
                } else {
                    o1Var2 = (o1) arrayList.get(i13);
                    if (!o1Var2.s() && o1Var2.c() == i10 && !o1Var2.h() && (l1Var.f5762g || !o1Var2.j())) {
                        o1Var2.a(32);
                        break;
                    }
                    i13++;
                }
            }
            if (o1Var2 != null) {
                if (o1Var2.j()) {
                    z13 = l1Var.f5762g;
                } else {
                    int i16 = o1Var2.f5791c;
                    if (i16 < 0 || i16 >= recyclerView.f1862w.h()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + o1Var2 + recyclerView.C());
                    }
                    if (l1Var.f5762g || recyclerView.f1862w.j(o1Var2.f5791c) == o1Var2.f5793f) {
                        q0 q0Var = recyclerView.f1862w;
                        if (!q0Var.f5815b || o1Var2.f5792e == q0Var.i(o1Var2.f5791c)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    o1VarG = o1Var2;
                    z10 = true;
                } else {
                    o1Var2.a(4);
                    if (o1Var2.k()) {
                        recyclerView.removeDetachedView(o1Var2.f5789a, false);
                        o1Var2.f5802p.k(o1Var2);
                    } else if (o1Var2.s()) {
                        o1Var2.f5798l &= -33;
                    }
                    h(o1Var2);
                    o1VarG = null;
                }
            } else {
                o1VarG = o1Var2;
            }
        }
        if (o1VarG == null) {
            j11 = 3;
            int iG2 = recyclerView.d.g(i10, 0);
            if (iG2 < 0 || iG2 >= recyclerView.f1862w.h()) {
                StringBuilder sbP2 = com.google.android.recaptcha.internal.a.p("Inconsistency detected. Invalid item position ", i10, "(offset:", iG2, ").state:");
                sbP2.append(l1Var.b());
                sbP2.append(recyclerView.C());
                throw new IndexOutOfBoundsException(sbP2.toString());
            }
            int iJ = recyclerView.f1862w.j(iG2);
            j12 = 4;
            q0 q0Var2 = recyclerView.f1862w;
            if (q0Var2.f5815b) {
                long jI2 = q0Var2.i(iG2);
                int size5 = arrayList.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        int size6 = arrayList2.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                o1 o1Var4 = (o1) arrayList2.get(size6);
                                if (o1Var4.f5792e != jI2 || o1Var4.f()) {
                                    size6--;
                                } else {
                                    if (iJ == o1Var4.f5793f) {
                                        arrayList2.remove(size6);
                                        o1VarG = o1Var4;
                                        break;
                                    }
                                    f(size6);
                                }
                            }
                            o1VarG = null;
                            break;
                        }
                    }
                    o1 o1Var5 = (o1) arrayList.get(size5);
                    long j13 = o1Var5.f5792e;
                    View view2 = o1Var5.f5789a;
                    if (j13 == jI2 && !o1Var5.s()) {
                        if (iJ == o1Var5.f5793f) {
                            o1Var5.a(32);
                            if (o1Var5.j() && !l1Var.f5762g) {
                                o1Var5.p(2, 14);
                            }
                            o1VarG = o1Var5;
                            break;
                        }
                        arrayList.remove(size5);
                        recyclerView.removeDetachedView(view2, false);
                        o1 o1VarU3 = RecyclerView.U(view2);
                        o1VarU3.f5802p = null;
                        o1VarU3.f5803q = false;
                        o1VarU3.f5798l &= -33;
                        h(o1VarU3);
                    }
                    size5--;
                }
                if (o1VarG != null) {
                    o1VarG.f5791c = iG2;
                    z10 = true;
                }
            }
            if (o1VarG == null) {
                c1 c1Var = (c1) c().f5642a.get(iJ);
                if (c1Var == null) {
                    o1Var = null;
                    break;
                }
                ArrayList arrayList5 = c1Var.f5635a;
                if (!arrayList5.isEmpty()) {
                    int size7 = arrayList5.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            o1Var = null;
                            break;
                        }
                        if (!((o1) arrayList5.get(size7)).f()) {
                            o1Var = (o1) arrayList5.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    o1Var = null;
                    break;
                }
                if (o1Var != null) {
                    o1Var.o();
                    int[] iArr = RecyclerView.L0;
                }
                o1VarG = o1Var;
            }
            if (o1VarG == null) {
                long nanoTime = recyclerView.getNanoTime();
                if (j10 != Long.MAX_VALUE) {
                    long j14 = ((d1) this.f5652g).b(iJ).f5637c;
                    if (!(j14 == 0 || j14 + nanoTime < j10)) {
                        return null;
                    }
                }
                bVar = null;
                o1VarG = recyclerView.f1862w.g(recyclerView, iJ);
                if (RecyclerView.O0 && (recyclerViewJ = RecyclerView.J(o1VarG.f5789a)) != null) {
                    o1VarG.f5790b = new WeakReference(recyclerViewJ);
                }
                long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                c1 c1VarB = ((d1) this.f5652g).b(iJ);
                long j15 = c1VarB.f5637c;
                if (j15 != 0) {
                    nanoTime2 = (nanoTime2 / 4) + ((j15 / 4) * 3);
                }
                c1VarB.f5637c = nanoTime2;
            } else {
                bVar = null;
            }
        } else {
            bVar = null;
            j11 = 3;
            j12 = 4;
        }
        View view3 = o1VarG.f5789a;
        if (z10 && !l1Var.f5762g && o1VarG.e(8192)) {
            o1VarG.p(0, 8192);
            if (l1Var.f5764j) {
                recyclerView.n0(o1VarG, recyclerView.V.l(l1Var, o1VarG, v0.b(o1VarG) | 4096, o1VarG.d()));
            }
        }
        if (!l1Var.f5762g || !o1VarG.g()) {
            if (o1VarG.g()) {
                if (((o1VarG.f5798l & 2) != 0) || o1VarG.h()) {
                }
                layoutParams = view3.getLayoutParams();
                if (layoutParams == null) {
                    y0Var = (y0) recyclerView.generateDefaultLayoutParams();
                    view3.setLayoutParams(y0Var);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    y0Var = (y0) layoutParams;
                } else {
                    y0Var = (y0) recyclerView.generateLayoutParams(layoutParams);
                    view3.setLayoutParams(y0Var);
                }
                y0Var.f5864a = o1VarG;
                if (z10 || !z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                y0Var.d = z12;
                return o1VarG;
            }
            int iG3 = recyclerView.d.g(i10, 0);
            o1VarG.f5806t = recyclerView;
            int i17 = o1VarG.f5793f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j10 != Long.MAX_VALUE) {
                long j16 = ((d1) this.f5652g).b(i17).d;
                if (j16 != 0 && j16 + nanoTime3 >= j10) {
                    z11 = false;
                }
                layoutParams = view3.getLayoutParams();
                if (layoutParams == null) {
                    y0Var = (y0) recyclerView.generateDefaultLayoutParams();
                    view3.setLayoutParams(y0Var);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    y0Var = (y0) recyclerView.generateLayoutParams(layoutParams);
                    view3.setLayoutParams(y0Var);
                } else {
                    y0Var = (y0) layoutParams;
                }
                y0Var.f5864a = o1VarG;
                if (z10) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                y0Var.d = z12;
                return o1VarG;
            }
            q0 q0Var3 = recyclerView.f1862w;
            q0Var3.getClass();
            o1VarG.f5791c = iG3;
            if (q0Var3.f5815b) {
                o1VarG.f5792e = q0Var3.i(iG3);
            }
            o1VarG.p(1, 519);
            int i18 = n0.g.f18080a;
            Trace.beginSection("RV OnBindView");
            q0Var3.w(o1VarG, iG3, o1VarG.d());
            ArrayList arrayList6 = o1VarG.f5799m;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            o1VarG.f5798l &= -1025;
            ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
            if (layoutParams2 instanceof y0) {
                ((y0) layoutParams2).f5866c = true;
            }
            Trace.endSection();
            long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
            c1 c1VarB2 = ((d1) this.f5652g).b(o1VarG.f5793f);
            long j17 = c1VarB2.d;
            if (j17 != 0) {
                nanoTime4 = (nanoTime4 / j12) + ((j17 / j12) * j11);
            }
            c1VarB2.d = nanoTime4;
            AccessibilityManager accessibilityManager = recyclerView.K;
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                WeakHashMap weakHashMap = r0.j0.f46605a;
                if (view3.getImportantForAccessibility() == 0) {
                    view3.setImportantForAccessibility(1);
                }
                View.AccessibilityDelegate accessibilityDelegateD = r0.j0.d(view3);
                if (accessibilityDelegateD == null) {
                    bVar2 = bVar;
                } else {
                    bVar2 = accessibilityDelegateD instanceof r0.a ? ((r0.a) accessibilityDelegateD).f46563a : new r0.b(accessibilityDelegateD);
                }
                if (bVar2 == null || bVar2.getClass().equals(r0.b.class)) {
                    o1VarG.a(16384);
                    r0.j0.k(view3, recyclerView.f1863w0.f5816e);
                }
            }
            if (l1Var.f5762g) {
                o1VarG.f5794g = i10;
            }
            z11 = true;
            layoutParams = view3.getLayoutParams();
            if (layoutParams == null) {
                y0Var = (y0) recyclerView.generateDefaultLayoutParams();
                view3.setLayoutParams(y0Var);
            } else if (recyclerView.checkLayoutParams(layoutParams)) {
                y0Var = (y0) recyclerView.generateLayoutParams(layoutParams);
                view3.setLayoutParams(y0Var);
            } else {
                y0Var = (y0) layoutParams;
            }
            y0Var.f5864a = o1VarG;
            if (z10) {
                z12 = false;
            } else {
                z12 = false;
            }
            y0Var.d = z12;
            return o1VarG;
        }
        o1VarG.f5794g = i10;
        z11 = false;
        layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            y0Var = (y0) recyclerView.generateDefaultLayoutParams();
            view3.setLayoutParams(y0Var);
        } else if (recyclerView.checkLayoutParams(layoutParams)) {
            y0Var = (y0) recyclerView.generateLayoutParams(layoutParams);
            view3.setLayoutParams(y0Var);
        } else {
            y0Var = (y0) layoutParams;
        }
        y0Var.f5864a = o1VarG;
        if (z10) {
            z12 = false;
        } else {
            z12 = false;
        }
        y0Var.d = z12;
        return o1VarG;
    }

    public void k(o1 o1Var) {
        if (o1Var.f5803q) {
            ((ArrayList) this.d).remove(o1Var);
        } else {
            ((ArrayList) this.f5649c).remove(o1Var);
        }
        o1Var.f5802p = null;
        o1Var.f5803q = false;
        o1Var.f5798l &= -33;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f5650e;
        x0 x0Var = ((RecyclerView) this.h).f1864x;
        this.f5648b = this.f5647a + (x0Var != null ? x0Var.f5858i : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f5648b; size--) {
            f(size);
        }
    }

    public e1(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f5649c = arrayList;
        this.d = null;
        this.f5650e = new ArrayList();
        this.f5651f = DesugarCollections.unmodifiableList(arrayList);
        this.f5647a = 2;
        this.f5648b = 2;
    }
}
