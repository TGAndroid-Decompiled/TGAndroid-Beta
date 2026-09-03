package o4;

import java.util.Arrays;
import mh.c3;
import org.telegram.ui.yh;
public final class s0 implements j3.g {
    public static final String f16571f;
    public static final String h;
    public static final c3 f16572n;
    public final int f16573a;
    public final String f16574b;
    public final int f16575c;
    public final j3.n0[] d;
    public int f16576e;

    static {
        int i10 = h5.d0.f7237a;
        f16571f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f16572n = new c3(4);
    }

    public s0(String str, j3.n0... n0VarArr) {
        boolean z4;
        if (n0VarArr.length > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        this.f16574b = str;
        this.d = n0VarArr;
        this.f16573a = n0VarArr.length;
        int g10 = h5.o.g(n0VarArr[0].C);
        this.f16575c = g10 == -1 ? h5.o.g(n0VarArr[0].B) : g10;
        String str2 = n0VarArr[0].f9320c;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = n0VarArr[0].f9321e | 16384;
        for (int i11 = 1; i11 < n0VarArr.length; i11++) {
            String str3 = n0VarArr[i11].f9320c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, n0VarArr[0].f9320c, n0VarArr[i11].f9320c);
                return;
            } else if (i10 != (n0VarArr[i11].f9321e | 16384)) {
                b("role flags", i11, Integer.toBinaryString(n0VarArr[0].f9321e), Integer.toBinaryString(n0VarArr[i11].f9321e));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder m9 = yh.m("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        m9.append(str3);
        m9.append("' (track ");
        m9.append(i10);
        m9.append(")");
        h5.a.p("TrackGroup", "", new IllegalStateException(m9.toString()));
    }

    public final int a(j3.n0 n0Var) {
        int i10 = 0;
        while (true) {
            j3.n0[] n0VarArr = this.d;
            if (i10 < n0VarArr.length) {
                if (n0Var == n0VarArr[i10]) {
                    return i10;
                }
                i10++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0.class == obj.getClass()) {
            s0 s0Var = (s0) obj;
            if (this.f16574b.equals(s0Var.f16574b) && Arrays.equals(this.d, s0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f16576e == 0) {
            this.f16576e = l.d.e(527, 31, this.f16574b) + Arrays.hashCode(this.d);
        }
        return this.f16576e;
    }
}
