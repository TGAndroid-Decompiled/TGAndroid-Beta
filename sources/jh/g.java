package jh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import s4.e1;
import s4.q0;
public final class g {
    public final RecyclerView f15953a;

    public g(RecyclerView recyclerView) {
        this.f15953a = recyclerView;
    }

    public void a(s4.a aVar) {
        int i10 = aVar.f47668a;
        RecyclerView recyclerView = this.f15953a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f3084x.X(recyclerView, aVar.f47669b, aVar.d);
                    return;
                }
                recyclerView.f3084x.a0(recyclerView, aVar.f47669b, aVar.d, aVar.f47670c);
                return;
            }
            recyclerView.f3084x.Y(recyclerView, aVar.f47669b, aVar.d);
            return;
        }
        recyclerView.f3084x.V(recyclerView, aVar.f47669b, aVar.d);
    }

    public void b(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f15953a;
        int o10 = recyclerView.e.o();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < o10; i15++) {
            View n10 = recyclerView.e.n(i15);
            e1 U = RecyclerView.U(n10);
            if (U != null && !U.r() && (i13 = U.f47740c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f47746l) == 0) {
                    if (U.f47747m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f47747m = arrayList;
                        U.f47748n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f47747m.add(obj);
                }
                ((q0) n10.getLayoutParams()).f47834c = true;
            }
        }
        rf.e eVar = recyclerView.f3056b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            e1 e1Var = (e1) arrayList2.get(size);
            if (e1Var != null && (i12 = e1Var.f47740c) >= i10 && i12 < i14) {
                e1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f3087y0 = true;
    }

    public void c(int i10, int i11) {
        RecyclerView recyclerView = this.f15953a;
        int o10 = recyclerView.e.o();
        for (int i12 = 0; i12 < o10; i12++) {
            e1 U = RecyclerView.U(recyclerView.e.n(i12));
            if (U != null && !U.r() && U.f47740c >= i10) {
                U.n(i11, false);
                recyclerView.f3080u0.f47697f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3056b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            e1 e1Var = (e1) arrayList.get(i13);
            if (e1Var != null && e1Var.f47740c >= i10) {
                e1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3085x0 = true;
    }

    public void d(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f15953a;
        int o10 = recyclerView.e.o();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < o10; i20++) {
            e1 U = RecyclerView.U(recyclerView.e.n(i20));
            if (U != null && (i18 = U.f47740c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f3080u0.f47697f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3056b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            e1 e1Var = (e1) arrayList.get(i21);
            if (e1Var != null && (i17 = e1Var.f47740c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    e1Var.n(i11 - i10, false);
                } else {
                    e1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3085x0 = true;
    }
}
