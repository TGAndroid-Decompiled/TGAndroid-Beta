package o2;

import b2.w;
import b2.w0;
import b2.x;
import java.util.ArrayList;
import t7.u;
import v7.b8;
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public u f16483a;
    public boolean f16484b;
    public int f16485c;

    public static void a(int i10, ArrayList arrayList) {
        if (b8.d(i10, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public final x b(x xVar) {
        String str;
        if (this.f16484b && this.f16483a.b0(xVar)) {
            w a2 = xVar.a();
            String str2 = xVar.f2511k;
            a2.f2466r = w0.n("application/x-media3-cues");
            a2.P = this.f16483a.J(xVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xVar.f2519s);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a2.f2458j = sb2.toString();
            a2.f2470w = Long.MAX_VALUE;
            return new x(a2);
        }
        return xVar;
    }
}
