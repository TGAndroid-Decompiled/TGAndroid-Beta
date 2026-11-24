package defpackage;

import java.io.File;
import java.util.ArrayList;
public final class pr3 implements qac {
    public final byte a;
    public final tr3 b;

    public pr3(tr3 tr3Var, byte b) {
        this.a = b;
        this.b = tr3Var;
    }

    @Override
    public final void a(Object obj) {
        File file;
        File file2;
        byte b = this.a;
        tr3 tr3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    g6b a = ((sr3) arrayList.get(i)).a();
                    if ((!a.v() && ((file = a.L) == null || !file.exists())) || currentTimeMillis - a.d > 604800000) {
                        arrayList3.add(a);
                    } else {
                        arrayList4.add(a);
                        arrayList2.add(Long.valueOf(a.b));
                    }
                }
                tr3Var.c(arrayList3);
                tr3Var.f = false;
                tr3Var.e = true;
                h4b N1 = oc7.r1(tr3Var.a).N1();
                int size = arrayList4.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    g4b g4bVar = new g4b(N1, (g6b) obj2);
                    N1.c(g4bVar.K, g4bVar, N1.b, false);
                }
                nm7.f(N1.a).k(329, new Object[0]);
                return;
            default:
                ArrayList arrayList5 = (ArrayList) obj;
                tr3Var.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                    g6b a2 = ((sr3) arrayList5.get(i3)).a();
                    if ((!a2.v() && ((file2 = a2.L) == null || !file2.exists())) || (!a2.g ? currentTimeMillis2 - a2.d > 604800000 : currentTimeMillis2 > a2.J)) {
                        arrayList7.add(a2);
                    } else {
                        tr3Var.b.add(a2);
                        arrayList6.add(Long.valueOf(a2.b));
                    }
                }
                tr3Var.c(arrayList7);
                tr3Var.d = false;
                tr3Var.c = true;
                nm7.f(tr3Var.a).k(332, new Object[0]);
                return;
        }
    }
}
