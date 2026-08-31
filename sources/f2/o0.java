package f2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
public final class o0 {
    public final RecyclerView f5902a;

    public o0(RecyclerView recyclerView) {
        this.f5902a = recyclerView;
    }

    public void a(a aVar) {
        int i10 = aVar.f5725a;
        RecyclerView recyclerView = this.f5902a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f1349x.X(recyclerView, aVar.f5726b, aVar.d);
                    return;
                }
                recyclerView.f1349x.a0(recyclerView, aVar.f5726b, aVar.d, aVar.f5727c);
                return;
            }
            recyclerView.f1349x.Y(recyclerView, aVar.f5726b, aVar.d);
            return;
        }
        recyclerView.f1349x.V(recyclerView, aVar.f5726b, aVar.d);
    }

    public void b(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f5902a;
        int u10 = recyclerView.f1325e.u();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < u10; i15++) {
            View t6 = recyclerView.f1325e.t(i15);
            m1 U = RecyclerView.U(t6);
            if (U != null && !U.r() && (i13 = U.f5877c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f5884l) == 0) {
                    if (U.f5885m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f5885m = arrayList;
                        U.f5886n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f5885m.add(obj);
                }
                ((x0) t6.getLayoutParams()).f5954c = true;
            }
        }
        bf.f fVar = recyclerView.f1320b;
        ArrayList arrayList2 = (ArrayList) fVar.f1953e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            m1 m1Var = (m1) arrayList2.get(size);
            if (m1Var != null && (i12 = m1Var.f5877c) >= i10 && i12 < i14) {
                m1Var.a(2);
                fVar.f(size);
            }
        }
        recyclerView.f1345u0 = true;
    }

    public void c(int i10, int i11) {
        RecyclerView recyclerView = this.f5902a;
        int u10 = recyclerView.f1325e.u();
        for (int i12 = 0; i12 < u10; i12++) {
            m1 U = RecyclerView.U(recyclerView.f1325e.t(i12));
            if (U != null && !U.r() && U.f5877c >= i10) {
                U.n(i11, false);
                recyclerView.f1339q0.f5831f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1320b.f1953e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            m1 m1Var = (m1) arrayList.get(i13);
            if (m1Var != null && m1Var.f5877c >= i10) {
                m1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1344t0 = true;
    }

    public void d(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f5902a;
        int u10 = recyclerView.f1325e.u();
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
        for (int i20 = 0; i20 < u10; i20++) {
            m1 U = RecyclerView.U(recyclerView.f1325e.t(i20));
            if (U != null && (i18 = U.f5877c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f1339q0.f5831f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1320b.f1953e;
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
            m1 m1Var = (m1) arrayList.get(i21);
            if (m1Var != null && (i17 = m1Var.f5877c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    m1Var.n(i11 - i10, false);
                } else {
                    m1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1344t0 = true;
    }
}
