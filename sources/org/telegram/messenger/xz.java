package org.telegram.messenger;

import java.util.ArrayList;
public final class xz {
    public final String f27629b;
    public int f27628a = 0;
    public final ArrayList d = new ArrayList();
    public final long f27630c = System.currentTimeMillis();

    public xz(String str) {
        this.f27629b = str;
    }

    public static void a(wz wzVar) {
        if (wzVar != null) {
            if (wzVar.f27437b < 0) {
                xz xzVar = wzVar.f27439e;
                int i7 = xzVar.f27628a;
                xzVar.f27628a = i7 - 1;
                wzVar.d = i7;
            }
            wzVar.f27437b = System.currentTimeMillis();
        }
    }

    public static void b(xz xzVar) {
        if (xzVar != null) {
            ArrayList arrayList = xzVar.d;
            long currentTimeMillis = System.currentTimeMillis() - xzVar.f27630c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xzVar.f27629b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) != null) {
                    sb2.append("#");
                    sb2.append(i7);
                    int i10 = ((wz) arrayList.get(i7)).d;
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

    public static void c(xz xzVar, String str) {
        if (xzVar != null) {
            xzVar.d.add(new wz(xzVar, str));
        }
    }

    public static wz d(xz xzVar, String str) {
        if (xzVar != null) {
            wz wzVar = new wz(xzVar, str);
            xzVar.d.add(wzVar);
            return wzVar;
        }
        return null;
    }
}
