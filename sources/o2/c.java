package o2;

import b2.r0;
import java.util.ArrayList;
import v7.y7;
public final class c {
    public static final int[] f14149c = {8, 13, 11, 2, 0, 1, 7};
    public rb.a f14150a;
    public boolean f14151b;

    public static void a(int i10, ArrayList arrayList) {
        if (y7.d(i10, 0, 7, f14149c) != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public final b2.s b(b2.s sVar) {
        String str;
        if (this.f14151b && this.f14150a.C(sVar)) {
            b2.r a2 = sVar.a();
            String str2 = sVar.f1995k;
            a2.f1946q = r0.n("application/x-media3-cues");
            a2.O = this.f14150a.k(sVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sVar.f2002r);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a2.f1939j = sb2.toString();
            a2.v = Long.MAX_VALUE;
            return new b2.s(a2);
        }
        return sVar;
    }
}
