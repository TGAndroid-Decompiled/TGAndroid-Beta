package hi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
public final class f1 implements w10 {
    public final int f14418a;
    public final j1 f14419b;

    public f1(j1 j1Var, int i7) {
        this.f14418a = i7;
        this.f14419b = j1Var;
    }

    @Override
    public final void a(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f14418a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    x7 a10 = ((i1) arrayList.get(i7)).a();
                    if ((!a10.v() && ((file = a10.L) == null || !file.exists())) || currentTimeMillis - a10.d > 604800000) {
                        arrayList3.add(a10);
                    } else {
                        arrayList4.add(a10);
                        arrayList2.add(Long.valueOf(a10.f15736b));
                    }
                }
                j1 j1Var = this.f14419b;
                j1Var.c(arrayList3);
                j1Var.f14722f = false;
                j1Var.f14721e = true;
                fi.p6 R1 = mp.u1(j1Var.f14718a).R1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    fi.o6 o6Var = new fi.o6(R1, (x7) obj2);
                    R1.d(o6Var.K, o6Var, R1.f12388b, false);
                }
                ks.f(R1.f12387a).k(327, new Object[0]);
                return;
            default:
                j1 j1Var2 = this.f14419b;
                j1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    x7 a11 = ((i1) arrayList.get(i11)).a();
                    if ((!a11.v() && ((file2 = a11.L) == null || !file2.exists())) || (!a11.f15749g ? currentTimeMillis2 - a11.d > 604800000 : currentTimeMillis2 > a11.J)) {
                        arrayList6.add(a11);
                    } else {
                        j1Var2.f14719b.add(a11);
                        arrayList5.add(Long.valueOf(a11.f15736b));
                    }
                }
                j1Var2.c(arrayList6);
                j1Var2.d = false;
                j1Var2.f14720c = true;
                ks.f(j1Var2.f14718a).k(330, new Object[0]);
                return;
        }
    }
}
