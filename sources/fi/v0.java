package fi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
public final class v0 implements c20 {
    public final int f12912a;
    public final z0 f12913b;

    public v0(z0 z0Var, int i7) {
        this.f12912a = i7;
        this.f12913b = z0Var;
    }

    @Override
    public final void a(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f12912a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    e7 a10 = ((y0) arrayList.get(i7)).a();
                    if ((!a10.v() && ((file = a10.L) == null || !file.exists())) || currentTimeMillis - a10.d > 604800000) {
                        arrayList3.add(a10);
                    } else {
                        arrayList4.add(a10);
                        arrayList2.add(Long.valueOf(a10.f11879b));
                    }
                }
                z0 z0Var = this.f12913b;
                z0Var.c(arrayList3);
                z0Var.f13233f = false;
                z0Var.f13232e = true;
                di.z6 P1 = qp.s1(z0Var.f13229a).P1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    di.y6 y6Var = new di.y6(P1, (e7) obj2);
                    P1.d(y6Var.J, y6Var, P1.f9993b, false);
                }
                qs.f(P1.f9992a).k(324, new Object[0]);
                return;
            default:
                z0 z0Var2 = this.f12913b;
                z0Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    e7 a11 = ((y0) arrayList.get(i11)).a();
                    if ((!a11.v() && ((file2 = a11.L) == null || !file2.exists())) || (!a11.f11892g ? currentTimeMillis2 - a11.d > 604800000 : currentTimeMillis2 > a11.J)) {
                        arrayList6.add(a11);
                    } else {
                        z0Var2.f13230b.add(a11);
                        arrayList5.add(Long.valueOf(a11.f11879b));
                    }
                }
                z0Var2.c(arrayList6);
                z0Var2.d = false;
                z0Var2.f13231c = true;
                qs.f(z0Var2.f13229a).k(327, new Object[0]);
                return;
        }
    }
}
