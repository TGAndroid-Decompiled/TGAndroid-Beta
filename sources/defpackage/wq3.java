package defpackage;

import java.io.File;
import java.util.ArrayList;
public final class wq3 implements pcc {
    public final byte a;
    public final ar3 b;

    public wq3(ar3 ar3Var, byte b) {
        this.a = b;
        this.b = ar3Var;
    }

    @Override
    public final void a(Object obj) {
        File file;
        File file2;
        byte b = this.a;
        ar3 ar3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    c8b a = ((zq3) arrayList.get(i)).a();
                    if ((!a.v() && ((file = a.L) == null || !file.exists())) || currentTimeMillis - a.d > 604800000) {
                        arrayList3.add(a);
                    } else {
                        arrayList4.add(a);
                        arrayList2.add(Long.valueOf(a.b));
                    }
                }
                ar3Var.c(arrayList3);
                ar3Var.f = false;
                ar3Var.e = true;
                c6b O1 = uc7.s1(ar3Var.a).O1();
                int size = arrayList4.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    b6b b6bVar = new b6b(O1, (c8b) obj2);
                    O1.c(b6bVar.K, b6bVar, O1.b, false);
                }
                jn7.f(O1.a).k(328, new Object[0]);
                return;
            default:
                ArrayList arrayList5 = (ArrayList) obj;
                ar3Var.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                    c8b a2 = ((zq3) arrayList5.get(i3)).a();
                    if ((!a2.v() && ((file2 = a2.L) == null || !file2.exists())) || (!a2.g ? currentTimeMillis2 - a2.d > 604800000 : currentTimeMillis2 > a2.J)) {
                        arrayList7.add(a2);
                    } else {
                        ar3Var.b.add(a2);
                        arrayList6.add(Long.valueOf(a2.b));
                    }
                }
                ar3Var.c(arrayList7);
                ar3Var.d = false;
                ar3Var.c = true;
                jn7.f(ar3Var.a).k(331, new Object[0]);
                return;
        }
    }
}
