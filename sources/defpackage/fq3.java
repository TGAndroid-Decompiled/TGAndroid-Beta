package defpackage;

import java.io.File;
import java.util.ArrayList;
public final class fq3 implements p8c {
    public final byte a;
    public final jq3 b;

    public fq3(jq3 jq3Var, byte b) {
        this.a = b;
        this.b = jq3Var;
    }

    @Override
    public final void a(Object obj) {
        File file;
        File file2;
        byte b = this.a;
        jq3 jq3Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    f4b a = ((iq3) arrayList.get(i)).a();
                    if ((!a.v() && ((file = a.L) == null || !file.exists())) || currentTimeMillis - a.d > 604800000) {
                        arrayList3.add(a);
                    } else {
                        arrayList4.add(a);
                        arrayList2.add(Long.valueOf(a.b));
                    }
                }
                jq3Var.c(arrayList3);
                jq3Var.f = false;
                jq3Var.e = true;
                g2b M1 = na7.q1(jq3Var.a).M1();
                int size = arrayList4.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList4.get(i2);
                    i2++;
                    f2b f2bVar = new f2b(M1, (f4b) obj2);
                    M1.c(f2bVar.K, f2bVar, M1.b, false);
                }
                kk7.f(M1.a).k(327, new Object[0]);
                return;
            default:
                ArrayList arrayList5 = (ArrayList) obj;
                jq3Var.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                    f4b a2 = ((iq3) arrayList5.get(i3)).a();
                    if ((!a2.v() && ((file2 = a2.L) == null || !file2.exists())) || (!a2.g ? currentTimeMillis2 - a2.d > 604800000 : currentTimeMillis2 > a2.J)) {
                        arrayList7.add(a2);
                    } else {
                        jq3Var.b.add(a2);
                        arrayList6.add(Long.valueOf(a2.b));
                    }
                }
                jq3Var.c(arrayList7);
                jq3Var.d = false;
                jq3Var.c = true;
                kk7.f(jq3Var.a).k(330, new Object[0]);
                return;
        }
    }
}
