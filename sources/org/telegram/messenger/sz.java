package org.telegram.messenger;

import java.util.ArrayList;
public final class sz {
    public final String f27008b;
    public int f27007a = 0;
    public final ArrayList d = new ArrayList();
    public final long f27009c = System.currentTimeMillis();

    public sz(String str) {
        this.f27008b = str;
    }

    public static void a(rz rzVar) {
        if (rzVar != null) {
            if (rzVar.f26816b < 0) {
                sz szVar = rzVar.f26818e;
                int i7 = szVar.f27007a;
                szVar.f27007a = i7 - 1;
                rzVar.d = i7;
            }
            rzVar.f26816b = System.currentTimeMillis();
        }
    }

    public static void b(sz szVar) {
        if (szVar != null) {
            ArrayList arrayList = szVar.d;
            long currentTimeMillis = System.currentTimeMillis() - szVar.f27009c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(szVar.f27008b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) != null) {
                    sb2.append("#");
                    sb2.append(i7);
                    int i10 = ((rz) arrayList.get(i7)).d;
                    for (int i11 = 0; i11 < i10; i11++) {
                        sb2.append(" ");
                    }
                    sb2.append(" ");
                    sb2.append(arrayList.get(i7));
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
