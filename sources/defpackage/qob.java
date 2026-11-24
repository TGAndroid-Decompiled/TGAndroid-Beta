package defpackage;

import java.util.ArrayList;
public final class qob {
    public final String b;
    public int a = 0;
    public final ArrayList d = new ArrayList();
    public final long c = System.currentTimeMillis();

    public qob(String str) {
        this.b = str;
    }

    public static void a(pob pobVar) {
        if (pobVar != null) {
            if (pobVar.b < 0) {
                qob qobVar = pobVar.e;
                int i = qobVar.a;
                qobVar.a = i - 1;
                pobVar.d = i;
            }
            pobVar.b = System.currentTimeMillis();
        }
    }

    public static void b(qob qobVar) {
        if (qobVar != null) {
            ArrayList arrayList = qobVar.d;
            long currentTimeMillis = System.currentTimeMillis() - qobVar.c;
            StringBuilder sb = new StringBuilder(qobVar.b);
            sb.append(" total=");
            sb.append(currentTimeMillis);
            sb.append("ms\n");
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != null) {
                    sb.append("#");
                    sb.append(i);
                    int i2 = ((pob) arrayList.get(i)).d;
                    for (int i3 = 0; i3 < i2; i3++) {
                        sb.append(" ");
                    }
                    sb.append(" ");
                    sb.append(arrayList.get(i));
                    sb.append("\n");
                }
            }
            fa4.b(sb.toString());
        }
    }

    public static void c(qob qobVar, String str) {
        if (qobVar != null) {
            qobVar.d.add(new pob(qobVar, str));
        }
    }

    public static pob d(qob qobVar, String str) {
        if (qobVar != null) {
            pob pobVar = new pob(qobVar, str);
            qobVar.d.add(pobVar);
            return pobVar;
        }
        return null;
    }
}
