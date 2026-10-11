package o2;

import b2.r0;
import java.util.ArrayList;
import v7.v7;
public final class c {
    public static final int[] f17005c = {8, 13, 11, 2, 0, 1, 7};
    public ob.a f17006a;
    public boolean f17007b;

    public static void a(int i10, ArrayList arrayList) {
        if (v7.d(i10, 0, 7, f17005c) != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public final b2.s b(b2.s sVar) {
        String str;
        if (this.f17007b && this.f17006a.D1(sVar)) {
            b2.r a2 = sVar.a();
            String str2 = sVar.f3636k;
            a2.f3585q = r0.n("application/x-media3-cues");
            a2.O = this.f17006a.U0(sVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sVar.f3643r);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a2.f3578j = sb2.toString();
            a2.v = Long.MAX_VALUE;
            return new b2.s(a2);
        }
        return sVar;
    }
}
