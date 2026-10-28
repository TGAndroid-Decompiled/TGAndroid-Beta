package o2;

import a8.ed;
import b2.w;
import b2.w0;
import b2.x;
import java.util.ArrayList;
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public qb.a f18983a;
    public boolean f18984b;
    public int f18985c;

    public static void a(int i10, ArrayList arrayList) {
        if (ed.d(i10, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public final x b(x xVar) {
        String str;
        if (this.f18984b && this.f18983a.i1(xVar)) {
            w a2 = xVar.a();
            String str2 = xVar.f3578k;
            a2.f3533r = w0.n("application/x-media3-cues");
            a2.P = this.f18983a.B0(xVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xVar.f3586s);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a2.f3525j = sb2.toString();
            a2.f3537w = Long.MAX_VALUE;
            return new x(a2);
        }
        return xVar;
    }
}
