package defpackage;

import java.util.ArrayList;
public final class rqb {
    public final String b;
    public int a = 0;
    public final ArrayList d = new ArrayList();
    public final long c = System.currentTimeMillis();

    public rqb(String str) {
        this.b = str;
    }

    public static void a(qqb qqbVar) {
        if (qqbVar != null) {
            if (qqbVar.b < 0) {
                rqb rqbVar = qqbVar.e;
                int i = rqbVar.a;
                rqbVar.a = i - 1;
                qqbVar.d = i;
            }
            qqbVar.b = System.currentTimeMillis();
        }
    }

    public static void b(rqb rqbVar) {
        if (rqbVar != null) {
            ArrayList arrayList = rqbVar.d;
            long currentTimeMillis = System.currentTimeMillis() - rqbVar.c;
            StringBuilder sb = new StringBuilder(rqbVar.b);
            sb.append(" total=");
            sb.append(currentTimeMillis);
            sb.append("ms\n");
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != null) {
                    sb.append("#");
                    sb.append(i);
                    int i2 = ((qqb) arrayList.get(i)).d;
                    for (int i3 = 0; i3 < i2; i3++) {
                        sb.append(" ");
                    }
                    sb.append(" ");
                    sb.append(arrayList.get(i));
                    sb.append("\n");
                }
            }
            fc4.b(sb.toString());
        }
    }

    public static void c(rqb rqbVar, String str) {
        if (rqbVar != null) {
            rqbVar.d.add(new qqb(rqbVar, str));
        }
    }

    public static qqb d(rqb rqbVar, String str) {
        if (rqbVar != null) {
            qqb qqbVar = new qqb(rqbVar, str);
            rqbVar.d.add(qqbVar);
            return qqbVar;
        }
        return null;
    }
}
