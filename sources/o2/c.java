package o2;

import b2.r0;
import java.util.ArrayList;
import v7.y7;
public final class c {
    public static final int[] f15364c = {8, 13, 11, 2, 0, 1, 7};
    public qb.b f15365a;
    public boolean f15366b;

    public static void a(int i10, ArrayList arrayList) {
        if (y7.d(i10, 0, 7, f15364c) != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public final b2.s b(b2.s sVar) {
        String str;
        if (this.f15366b && this.f15365a.W(sVar)) {
            b2.r a2 = sVar.a();
            String str2 = sVar.f3299k;
            a2.f3250q = r0.n("application/x-media3-cues");
            a2.O = this.f15365a.D(sVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sVar.f3306r);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a2.f3243j = sb2.toString();
            a2.v = Long.MAX_VALUE;
            return new b2.s(a2);
        }
        return sVar;
    }
}
