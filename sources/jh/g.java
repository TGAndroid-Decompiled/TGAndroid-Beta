package jh;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import v4.e1;
import v4.p0;
import v4.w0;
public final class g {
    public final RecyclerView f17401a;

    public g(RecyclerView recyclerView) {
        this.f17401a = recyclerView;
    }

    public void a(v4.a aVar) {
        int i7 = aVar.f58474a;
        RecyclerView recyclerView = this.f17401a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 4) {
                    if (i7 != 8) {
                        return;
                    }
                    recyclerView.f2827y.X(recyclerView, aVar.f58475b, aVar.d);
                    return;
                }
                recyclerView.f2827y.a0(recyclerView, aVar.f58475b, aVar.d, aVar.f58476c);
                return;
            }
            recyclerView.f2827y.Y(recyclerView, aVar.f58475b, aVar.d);
            return;
        }
        recyclerView.f2827y.V(recyclerView, aVar.f58475b, aVar.d);
    }

    public void b(int i7, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f17401a;
        int z10 = recyclerView.f2801e.z();
        int i13 = i10 + i7;
        for (int i14 = 0; i14 < z10; i14++) {
            View y10 = recyclerView.f2801e.y(i14);
            e1 U = RecyclerView.U(y10);
            if (U != null && !U.r() && (i12 = U.f58537c) >= i7 && i12 < i13) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f58544l) == 0) {
                    if (U.f58545m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f58545m = arrayList;
                        U.f58546n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f58545m.add(obj);
                }
                ((p0) y10.getLayoutParams()).f58639c = true;
            }
        }
        w0 w0Var = recyclerView.f2796b;
        ArrayList arrayList2 = (ArrayList) w0Var.f58671e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            e1 e1Var = (e1) arrayList2.get(size);
            if (e1Var != null && (i11 = e1Var.f58537c) >= i7 && i11 < i13) {
                e1Var.a(2);
                w0Var.f(size);
            }
        }
        recyclerView.f2829z0 = true;
    }

    public void c(int i7, int i10) {
        RecyclerView recyclerView = this.f17401a;
        int z10 = recyclerView.f2801e.z();
        for (int i11 = 0; i11 < z10; i11++) {
            e1 U = RecyclerView.U(recyclerView.f2801e.y(i11));
            if (U != null && !U.r() && U.f58537c >= i7) {
                U.n(i10, false);
                recyclerView.f2822v0.f58504f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2796b.f58671e;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            e1 e1Var = (e1) arrayList.get(i12);
            if (e1Var != null && e1Var.f58537c >= i7) {
                e1Var.n(i10, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2828y0 = true;
    }

    public void d(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.f17401a;
        int z10 = recyclerView.f2801e.z();
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
        for (int i19 = 0; i19 < z10; i19++) {
            e1 U = RecyclerView.U(recyclerView.f2801e.y(i19));
            if (U != null && (i17 = U.f58537c) >= i12 && i17 <= i11) {
                if (i17 == i7) {
                    U.n(i10 - i7, false);
                } else {
                    U.n(i13, false);
                }
                recyclerView.f2822v0.f58504f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f2796b.f58671e;
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
            e1 e1Var = (e1) arrayList.get(i20);
            if (e1Var != null && (i16 = e1Var.f58537c) >= i15 && i16 <= i14) {
                if (i16 == i7) {
                    e1Var.n(i10 - i7, false);
                } else {
                    e1Var.n(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f2828y0 = true;
    }
}
