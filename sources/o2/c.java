package o2;

import b2.r0;
import java.util.ArrayList;
import v7.y7;
public final class c {
    public static final int[] f15366c = {8, 13, 11, 2, 0, 1, 7};
    public qb.b f15367a;
    public boolean f15368b;

    public static void a(int i10, ArrayList arrayList) {
        if (y7.d(i10, 0, 7, f15366c) != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public final b2.s b(b2.s sVar) {
        String str;
        if (this.f15368b && this.f15367a.W(sVar)) {
            b2.r a2 = sVar.a();
            String str2 = sVar.f3297k;
            a2.f3248q = r0.n("application/x-media3-cues");
            a2.O = this.f15367a.D(sVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sVar.f3304r);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a2.f3241j = sb2.toString();
            a2.v = Long.MAX_VALUE;
            return new b2.s(a2);
        }
        return sVar;
    }
}
