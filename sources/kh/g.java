package kh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import u4.d1;
import u4.p0;
public final class g {
    public final RecyclerView f17291a;

    public g(RecyclerView recyclerView) {
        this.f17291a = recyclerView;
    }

    public void a(u4.a aVar) {
        int i3 = aVar.f55484a;
        RecyclerView recyclerView = this.f17291a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        return;
                    }
                    recyclerView.f2305y.X(recyclerView, aVar.f55485b, aVar.d);
                    return;
                }
                recyclerView.f2305y.a0(recyclerView, aVar.f55485b, aVar.d, aVar.f55486c);
                return;
            }
            recyclerView.f2305y.Y(recyclerView, aVar.f55485b, aVar.d);
            return;
        }
        recyclerView.f2305y.V(recyclerView, aVar.f55485b, aVar.d);
    }

    public void b(int i3, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f17291a;
        int u10 = recyclerView.f2279e.u();
        int i13 = i10 + i3;
        for (int i14 = 0; i14 < u10; i14++) {
            View t10 = recyclerView.f2279e.t(i14);
            d1 U = RecyclerView.U(t10);
            if (U != null && !U.r() && (i12 = U.f55542c) >= i3 && i12 < i13) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f55549l) == 0) {
                    if (U.f55550m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f55550m = arrayList;
                        U.f55551n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f55550m.add(obj);
                }
                ((p0) t10.getLayoutParams()).f55647c = true;
            }
        }
        tf.e eVar = recyclerView.f2274b;
        ArrayList arrayList2 = (ArrayList) eVar.f55110e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            d1 d1Var = (d1) arrayList2.get(size);
            if (d1Var != null && (i11 = d1Var.f55542c) >= i3 && i11 < i13) {
                d1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f2307z0 = true;
    }

    public void c(int i3, int i10) {
        RecyclerView recyclerView = this.f17291a;
        int u10 = recyclerView.f2279e.u();
        for (int i11 = 0; i11 < u10; i11++) {
            d1 U = RecyclerView.U(recyclerView.f2279e.t(i11));
            if (U != null && !U.r() && U.f55542c >= i3) {
                U.n(i10, false);
                recyclerView.f2300v0.f55494f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2274b.f55110e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            d1 d1Var = (d1) arrayList.get(i12);
            if (d1Var != null && d1Var.f55542c >= i3) {
                d1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2306y0 = true;
    }

    public void d(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.f17291a;
        int u10 = recyclerView.f2279e.u();
        int i18 = -1;
        if (i3 < i10) {
            i12 = i3;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i3;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < u10; i19++) {
            d1 U = RecyclerView.U(recyclerView.f2279e.t(i19));
            if (U != null && (i17 = U.f55542c) >= i12 && i17 <= i11) {
                if (i17 == i3) {
                    U.n(i10 - i3, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.f2300v0.f55494f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2274b.f55110e;
        if (i3 < i10) {
            i15 = i3;
            i14 = i10;
        } else {
            i14 = i3;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            d1 d1Var = (d1) arrayList.get(i20);
            if (d1Var != null && (i16 = d1Var.f55542c) >= i15 && i16 <= i14) {
                if (i16 == i3) {
                    d1Var.n(i10 - i3, false);
                } else {
                    d1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2306y0 = true;
    }
}
