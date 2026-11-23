package hi;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
public final class x0 implements y10 {
    public final int f15732a;
    public final b1 f15733b;

    public x0(b1 b1Var, int i7) {
        this.f15732a = i7;
        this.f15733b = b1Var;
    }

    @Override
    public final void a(Object obj) {
        File file;
        File file2;
        ArrayList arrayList = (ArrayList) obj;
        switch (this.f15732a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    c7 a10 = ((a1) arrayList.get(i7)).a();
                    if ((!a10.v() && ((file = a10.L) == null || !file.exists())) || currentTimeMillis - a10.d > 604800000) {
                        arrayList3.add(a10);
                    } else {
                        arrayList4.add(a10);
                        arrayList2.add(Long.valueOf(a10.f14341b));
                    }
                }
                b1 b1Var = this.f15733b;
                b1Var.c(arrayList3);
                b1Var.f14286f = false;
                b1Var.f14285e = true;
                fi.p6 R1 = np.u1(b1Var.f14282a).R1();
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList4.get(i10);
                    i10++;
                    fi.o6 o6Var = new fi.o6(R1, (c7) obj2);
                    R1.d(o6Var.K, o6Var, R1.f12426b, false);
                }
                ls.f(R1.f12425a).k(327, new Object[0]);
                return;
            default:
                b1 b1Var2 = this.f15733b;
                b1Var2.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    c7 a11 = ((a1) arrayList.get(i11)).a();
                    if ((!a11.v() && ((file2 = a11.L) == null || !file2.exists())) || (!a11.f14354g ? currentTimeMillis2 - a11.d > 604800000 : currentTimeMillis2 > a11.J)) {
                        arrayList6.add(a11);
                    } else {
                        b1Var2.f14283b.add(a11);
                        arrayList5.add(Long.valueOf(a11.f14341b));
                    }
                }
                b1Var2.c(arrayList6);
                b1Var2.d = false;
                b1Var2.f14284c = true;
                ls.f(b1Var2.f14282a).k(330, new Object[0]);
                return;
        }
    }
}
