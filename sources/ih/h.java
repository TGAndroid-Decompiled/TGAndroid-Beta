package ih;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import s4.c1;
import s4.p0;
public final class h {
    public final RecyclerView f12340a;

    public h(RecyclerView recyclerView) {
        this.f12340a = recyclerView;
    }

    public void a(s4.a aVar) {
        int i10 = aVar.f45700a;
        RecyclerView recyclerView = this.f12340a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f1896x.X(recyclerView, aVar.f45701b, aVar.d);
                    return;
                }
                recyclerView.f1896x.a0(recyclerView, aVar.f45701b, aVar.d, aVar.f45702c);
                return;
            }
            recyclerView.f1896x.Y(recyclerView, aVar.f45701b, aVar.d);
            return;
        }
        recyclerView.f1896x.V(recyclerView, aVar.f45701b, aVar.d);
    }

    public void b(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f12340a;
        int E = recyclerView.f1872e.E();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < E; i15++) {
            View D = recyclerView.f1872e.D(i15);
            c1 U = RecyclerView.U(D);
            if (U != null && !U.r() && (i13 = U.f45740c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f45747l) == 0) {
                    if (U.f45748m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f45748m = arrayList;
                        U.f45749n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f45748m.add(obj);
                }
                ((p0) D.getLayoutParams()).f45859c = true;
            }
        }
        pf.e eVar = recyclerView.f1867b;
        ArrayList arrayList2 = (ArrayList) eVar.f44062e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList2.get(size);
            if (c1Var != null && (i12 = c1Var.f45740c) >= i10 && i12 < i14) {
                c1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f1897x0 = true;
    }

    public void c(int i10, int i11) {
        RecyclerView recyclerView = this.f12340a;
        int E = recyclerView.f1872e.E();
        for (int i12 = 0; i12 < E; i12++) {
            c1 U = RecyclerView.U(recyclerView.f1872e.D(i12));
            if (U != null && !U.r() && U.f45740c >= i10) {
                U.n(i11, false);
                recyclerView.f1891t0.f45919f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1867b.f44062e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            c1 c1Var = (c1) arrayList.get(i13);
            if (c1Var != null && c1Var.f45740c >= i10) {
                c1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1895w0 = true;
    }

    public void d(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f12340a;
        int E = recyclerView.f1872e.E();
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
        for (int i20 = 0; i20 < E; i20++) {
            c1 U = RecyclerView.U(recyclerView.f1872e.D(i20));
            if (U != null && (i18 = U.f45740c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f1891t0.f45919f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1867b.f44062e;
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
            c1 c1Var = (c1) arrayList.get(i21);
            if (c1Var != null && (i17 = c1Var.f45740c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c1Var.n(i11 - i10, false);
                } else {
                    c1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1895w0 = true;
    }
}
