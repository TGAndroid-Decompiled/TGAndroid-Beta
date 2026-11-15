package hi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
public final class w0 implements z10 {
    public final int f15270a;
    public final a1 f15271b;

    public w0(a1 a1Var, int i7) {
        this.f15270a = i7;
        this.f15271b = a1Var;
    }

    @Override
    public final void a(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f15270a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    d7 a10 = ((z0) arrayList.get(i7)).a();
                    if ((!a10.v() && ((file = a10.L) == null || !file.exists())) || currentTimeMillis - a10.d > 604800000) {
                        arrayList3.add(a10);
                    } else {
                        arrayList4.add(a10);
                        arrayList2.add(Long.valueOf(a10.f14126b));
                    }
                }
                a1 a1Var = this.f15271b;
                a1Var.c(arrayList3);
                a1Var.f13865f = false;
                a1Var.f13864e = true;
                fi.s6 P1 = np.s1(a1Var.f13861a).P1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    fi.r6 r6Var = new fi.r6(P1, (d7) obj2);
                    P1.d(r6Var.K, r6Var, P1.f12320b, false);
                }
                ns.f(P1.f12319a).k(324, new Object[0]);
                return;
            default:
                a1 a1Var2 = this.f15271b;
                a1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    d7 a11 = ((z0) arrayList.get(i11)).a();
                    if ((!a11.v() && ((file2 = a11.L) == null || !file2.exists())) || (!a11.f14139g ? currentTimeMillis2 - a11.d > 604800000 : currentTimeMillis2 > a11.J)) {
                        arrayList6.add(a11);
                    } else {
                        a1Var2.f13862b.add(a11);
                        arrayList5.add(Long.valueOf(a11.f14126b));
                    }
                }
                a1Var2.c(arrayList6);
                a1Var2.d = false;
                a1Var2.f13863c = true;
                ns.f(a1Var2.f13861a).k(327, new Object[0]);
                return;
        }
    }
}
