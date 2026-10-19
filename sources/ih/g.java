package ih;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import s4.b1;
import s4.o0;
public final class g {
    public final RecyclerView f13141a;

    public g(RecyclerView recyclerView) {
        this.f13141a = recyclerView;
    }

    public void a(s4.a aVar) {
        int i10 = aVar.f45882a;
        RecyclerView recyclerView = this.f13141a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f3633x.X(recyclerView, aVar.f45883b, aVar.d);
                    return;
                }
                recyclerView.f3633x.a0(recyclerView, aVar.f45883b, aVar.d, aVar.f45884c);
                return;
            }
            recyclerView.f3633x.Y(recyclerView, aVar.f45883b, aVar.d);
            return;
        }
        recyclerView.f3633x.V(recyclerView, aVar.f45883b, aVar.d);
    }

    public void b(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f13141a;
        int L = recyclerView.e.L();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < L; i15++) {
            View K = recyclerView.e.K(i15);
            b1 U = RecyclerView.U(K);
            if (U != null && !U.r() && (i13 = U.f45912c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f45918l) == 0) {
                    if (U.f45919m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f45919m = arrayList;
                        U.f45920n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f45919m.add(obj);
                }
                ((o0) K.getLayoutParams()).f46016c = true;
            }
        }
        qf.e eVar = recyclerView.f3605b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            b1 b1Var = (b1) arrayList2.get(size);
            if (b1Var != null && (i12 = b1Var.f45912c) >= i10 && i12 < i14) {
                b1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f3636y0 = true;
    }

    public void c(int i10, int i11) {
        RecyclerView recyclerView = this.f13141a;
        int L = recyclerView.e.L();
        for (int i12 = 0; i12 < L; i12++) {
            b1 U = RecyclerView.U(recyclerView.e.K(i12));
            if (U != null && !U.r() && U.f45912c >= i10) {
                U.n(i11, false);
                recyclerView.f3629u0.f46069f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3605b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            b1 b1Var = (b1) arrayList.get(i13);
            if (b1Var != null && b1Var.f45912c >= i10) {
                b1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3634x0 = true;
    }

    public void d(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f13141a;
        int L = recyclerView.e.L();
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
        for (int i20 = 0; i20 < L; i20++) {
            b1 U = RecyclerView.U(recyclerView.e.K(i20));
            if (U != null && (i18 = U.f45912c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f3629u0.f46069f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3605b.e;
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
            b1 b1Var = (b1) arrayList.get(i21);
            if (b1Var != null && (i17 = b1Var.f45912c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    b1Var.n(i11 - i10, false);
                } else {
                    b1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3634x0 = true;
    }
}
