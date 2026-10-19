package o2;

import b2.v;
import b2.v0;
import b2.w;
import java.util.ArrayList;
import t7.u;
import v7.b8;
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public u f17576a;
    public boolean f17577b;
    public int f17578c;

    public static void a(int i10, ArrayList arrayList) {
        if (b8.d(i10, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public final w b(w wVar) {
        String str;
        if (this.f17577b && this.f17576a.a0(wVar)) {
            v a2 = wVar.a();
            String str2 = wVar.f4122k;
            a2.f4077r = v0.n("application/x-media3-cues");
            a2.P = this.f17576a.L(wVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(wVar.f4130s);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a2.f4069j = sb2.toString();
            a2.f4081w = Long.MAX_VALUE;
            return new w(a2);
        }
        return wVar;
    }
}
