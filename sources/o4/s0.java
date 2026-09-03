package o4;

import java.util.Arrays;
import org.telegram.ui.ai;
public final class s0 implements j3.g {
    public static final String f16398f;
    public static final String h;
    public static final m.j0 f16399n;
    public final int f16400a;
    public final String f16401b;
    public final int f16402c;
    public final j3.n0[] d;
    public int e;

    static {
        int i10 = h5.d0.f6924a;
        f16398f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f16399n = new m.j0(11);
    }

    public s0(String str, j3.n0... n0VarArr) {
        boolean z4;
        if (n0VarArr.length > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        this.f16401b = str;
        this.d = n0VarArr;
        this.f16400a = n0VarArr.length;
        int g10 = h5.o.g(n0VarArr[0].C);
        this.f16402c = g10 == -1 ? h5.o.g(n0VarArr[0].B) : g10;
        String str2 = n0VarArr[0].f8719c;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = n0VarArr[0].e | 16384;
        for (int i11 = 1; i11 < n0VarArr.length; i11++) {
            String str3 = n0VarArr[i11].f8719c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, n0VarArr[0].f8719c, n0VarArr[i11].f8719c);
                return;
            } else if (i10 != (n0VarArr[i11].e | 16384)) {
                b("role flags", i11, Integer.toBinaryString(n0VarArr[0].e), Integer.toBinaryString(n0VarArr[i11].e));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder l10 = ai.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        l10.append(str3);
        l10.append("' (track ");
        l10.append(i10);
        l10.append(")");
        h5.a.p("TrackGroup", "", new IllegalStateException(l10.toString()));
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
            if (this.f16401b.equals(s0Var.f16401b) && Arrays.equals(this.d, s0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = kf.k0.e(527, 31, this.f16401b) + Arrays.hashCode(this.d);
        }
        return this.e;
    }
}
