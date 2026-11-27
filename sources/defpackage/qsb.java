package defpackage;

import java.util.ArrayList;
public final class qsb {
    public final String b;
    public int a = 0;
    public final ArrayList d = new ArrayList();
    public final long c = System.currentTimeMillis();

    public qsb(String str) {
        this.b = str;
    }

    public static void a(psb psbVar) {
        if (psbVar != null) {
            if (psbVar.b < 0) {
                qsb qsbVar = psbVar.e;
                int i = qsbVar.a;
                qsbVar.a = i - 1;
                psbVar.d = i;
            }
            psbVar.b = System.currentTimeMillis();
        }
    }

    public static void b(qsb qsbVar) {
        if (qsbVar != null) {
            ArrayList arrayList = qsbVar.d;
            long currentTimeMillis = System.currentTimeMillis() - qsbVar.c;
            StringBuilder sb = new StringBuilder(qsbVar.b);
            sb.append(" total=");
            sb.append(currentTimeMillis);
            sb.append("ms\n");
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != null) {
                    sb.append("#");
                    sb.append(i);
                    int i2 = ((psb) arrayList.get(i)).d;
                    for (int i3 = 0; i3 < i2; i3++) {
                        sb.append(" ");
                    }
                    sb.append(" ");
                    sb.append(arrayList.get(i));
                    sb.append("\n");
                }
            }
            cc4.b(sb.toString());
        }
    }

    public static void c(qsb qsbVar, String str) {
        if (qsbVar != null) {
            qsbVar.d.add(new psb(qsbVar, str));
        }
    }

    public static psb d(qsb qsbVar, String str) {
        if (qsbVar != null) {
            psb psbVar = new psb(qsbVar, str);
            qsbVar.d.add(psbVar);
            return psbVar;
        }
        return null;
    }
}
