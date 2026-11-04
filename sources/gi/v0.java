package gi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
public final class v0 implements u10 {
    public final int f13678a;
    public final z0 f13679b;

    public v0(z0 z0Var, int i3) {
        this.f13678a = i3;
        this.f13679b = z0Var;
    }

    @Override
    public final void a(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f13678a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    f7 a10 = ((y0) arrayList.get(i3)).a();
                    if ((!a10.v() && ((file = a10.L) == null || !file.exists())) || currentTimeMillis - a10.d > 604800000) {
                        arrayList3.add(a10);
                    } else {
                        arrayList4.add(a10);
                        arrayList2.add(Long.valueOf(a10.f12705b));
                    }
                }
                z0 z0Var = this.f13679b;
                z0Var.c(arrayList3);
                z0Var.f14000f = false;
                z0Var.f13999e = true;
                ei.z6 P1 = hp.s1(z0Var.f13996a).P1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    ei.y6 y6Var = new ei.y6(P1, (f7) obj2);
                    P1.d(y6Var.K, y6Var, P1.f11275b, false);
                }
                hs.f(P1.f11274a).k(324, new Object[0]);
                return;
            default:
                z0 z0Var2 = this.f13679b;
                z0Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    f7 a11 = ((y0) arrayList.get(i11)).a();
                    if ((!a11.v() && ((file2 = a11.L) == null || !file2.exists())) || (!a11.f12718g ? currentTimeMillis2 - a11.d > 604800000 : currentTimeMillis2 > a11.J)) {
                        arrayList6.add(a11);
                    } else {
                        z0Var2.f13997b.add(a11);
                        arrayList5.add(Long.valueOf(a11.f12705b));
                    }
                }
                z0Var2.c(arrayList6);
                z0Var2.d = false;
                z0Var2.f13998c = true;
                hs.f(z0Var2.f13996a).k(327, new Object[0]);
                return;
        }
    }
}
