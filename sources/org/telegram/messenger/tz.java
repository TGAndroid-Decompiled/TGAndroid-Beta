package org.telegram.messenger;

import java.util.ArrayList;
public final class tz {
    public final String f27099b;
    public int f27098a = 0;
    public final ArrayList d = new ArrayList();
    public final long f27100c = System.currentTimeMillis();

    public tz(String str) {
        this.f27099b = str;
    }

    public static void a(sz szVar) {
        if (szVar != null) {
            if (szVar.f26907b < 0) {
                tz tzVar = szVar.f26909e;
                int i7 = tzVar.f27098a;
                tzVar.f27098a = i7 - 1;
                szVar.d = i7;
            }
            szVar.f26907b = System.currentTimeMillis();
        }
    }

    public static void b(tz tzVar) {
        if (tzVar != null) {
            ArrayList arrayList = tzVar.d;
            long currentTimeMillis = System.currentTimeMillis() - tzVar.f27100c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tzVar.f27099b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) != null) {
                    sb2.append("#");
                    sb2.append(i7);
                    int i10 = ((sz) arrayList.get(i7)).d;
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

    public static void c(tz tzVar, String str) {
        if (tzVar != null) {
            tzVar.d.add(new sz(tzVar, str));
        }
    }

    public static sz d(tz tzVar, String str) {
        if (tzVar != null) {
            sz szVar = new sz(tzVar, str);
            tzVar.d.add(szVar);
            return szVar;
        }
        return null;
    }
}
