package org.telegram.messenger;

import java.util.ArrayList;
public final class tz {
    public final String f27101b;
    public int f27100a = 0;
    public final ArrayList d = new ArrayList();
    public final long f27102c = System.currentTimeMillis();

    public tz(String str) {
        this.f27101b = str;
    }

    public static void a(sz szVar) {
        if (szVar != null) {
            if (szVar.f26909b < 0) {
                tz tzVar = szVar.f26911e;
                int i7 = tzVar.f27100a;
                tzVar.f27100a = i7 - 1;
                szVar.d = i7;
            }
            szVar.f26909b = System.currentTimeMillis();
        }
    }

    public static void b(tz tzVar) {
        if (tzVar != null) {
            ArrayList arrayList = tzVar.d;
            long currentTimeMillis = System.currentTimeMillis() - tzVar.f27102c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tzVar.f27101b);
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
