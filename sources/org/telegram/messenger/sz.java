package org.telegram.messenger;

import java.util.ArrayList;
public final class sz {
    public final String f25452b;
    public int f25451a = 0;
    public final ArrayList d = new ArrayList();
    public final long f25453c = System.currentTimeMillis();

    public sz(String str) {
        this.f25452b = str;
    }

    public static void a(rz rzVar) {
        if (rzVar != null) {
            if (rzVar.f25256b < 0) {
                sz szVar = rzVar.f25258e;
                int i3 = szVar.f25451a;
                szVar.f25451a = i3 - 1;
                rzVar.d = i3;
            }
            rzVar.f25256b = System.currentTimeMillis();
        }
    }

    public static void b(sz szVar) {
        if (szVar != null) {
            ArrayList arrayList = szVar.d;
            long currentTimeMillis = System.currentTimeMillis() - szVar.f25453c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(szVar.f25452b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3) != null) {
                    sb2.append("#");
                    sb2.append(i3);
                    int i10 = ((rz) arrayList.get(i3)).d;
                    for (int i11 = 0; i11 < i10; i11++) {
                        sb2.append(" ");
                    }
                    sb2.append(" ");
                    sb2.append(arrayList.get(i3));
                    sb2.append("\n");
                }
            }
            a8.b(sb2.toString());
        }
    }

    public static void c(sz szVar, String str) {
        if (szVar != null) {
            szVar.d.add(new rz(szVar, str));
        }
    }

    public static rz d(sz szVar, String str) {
        if (szVar != null) {
            rz rzVar = new rz(szVar, str);
            szVar.d.add(rzVar);
            return rzVar;
        }
        return null;
    }
}
