package jh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import v4.f1;
import v4.q0;
import v4.x0;
public final class g {
    public final RecyclerView f17880a;

    public g(RecyclerView recyclerView) {
        this.f17880a = recyclerView;
    }

    public void a(v4.a aVar) {
        int i7 = aVar.f59166a;
        RecyclerView recyclerView = this.f17880a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 8) {
                        return;
                    }
                    recyclerView.f2793y.X(recyclerView, aVar.f59167b, aVar.d);
                    return;
                }
                recyclerView.f2793y.a0(recyclerView, aVar.f59167b, aVar.d, aVar.f59168c);
                return;
            }
            recyclerView.f2793y.Y(recyclerView, aVar.f59167b, aVar.d);
            return;
        }
        recyclerView.f2793y.V(recyclerView, aVar.f59167b, aVar.d);
    }

    public void b(int i7, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f17880a;
        int F = recyclerView.f2767e.F();
        int i13 = i10 + i7;
        for (int i14 = 0; i14 < F; i14++) {
            View E = recyclerView.f2767e.E(i14);
            f1 U = RecyclerView.U(E);
            if (U != null && !U.r() && (i12 = U.f59247c) >= i7 && i12 < i13) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f59254l) == 0) {
                    if (U.f59255m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f59255m = arrayList;
                        U.f59256n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f59255m.add(obj);
                }
                ((q0) E.getLayoutParams()).f59349c = true;
            }
        }
        x0 x0Var = recyclerView.f2762b;
        ArrayList arrayList2 = (ArrayList) x0Var.f59381e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            f1 f1Var = (f1) arrayList2.get(size);
            if (f1Var != null && (i11 = f1Var.f59247c) >= i7 && i11 < i13) {
                f1Var.a(2);
                x0Var.f(size);
            }
        }
        recyclerView.f2795z0 = true;
    }

    public void c(int i7, int i10) {
        RecyclerView recyclerView = this.f17880a;
        int F = recyclerView.f2767e.F();
        for (int i11 = 0; i11 < F; i11++) {
            f1 U = RecyclerView.U(recyclerView.f2767e.E(i11));
            if (U != null && !U.r() && U.f59247c >= i7) {
                U.n(i10, false);
                recyclerView.f2788v0.f59214f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2762b.f59381e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            f1 f1Var = (f1) arrayList.get(i12);
            if (f1Var != null && f1Var.f59247c >= i7) {
                f1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2794y0 = true;
    }

    public void d(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.f17880a;
        int F = recyclerView.f2767e.F();
        int i18 = -1;
        if (i7 < i10) {
            i12 = i7;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i7;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < F; i19++) {
            f1 U = RecyclerView.U(recyclerView.f2767e.E(i19));
            if (U != null && (i17 = U.f59247c) >= i12 && i17 <= i11) {
                if (i17 == i7) {
                    U.n(i10 - i7, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.f2788v0.f59214f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2762b.f59381e;
        if (i7 < i10) {
            i15 = i7;
            i14 = i10;
        } else {
            i14 = i7;
            i15 = i10;
            i18 = 1;
        }
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            f1 f1Var = (f1) arrayList.get(i20);
            if (f1Var != null && (i16 = f1Var.f59247c) >= i15 && i16 <= i14) {
                if (i16 == i7) {
                    f1Var.n(i10 - i7, false);
                } else {
                    f1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2794y0 = true;
    }
}
