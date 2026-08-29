package l4;

import java.util.Arrays;
import org.telegram.ui.th;
public final class j1 implements j3.g {
    public static final String f14345f;
    public static final String h;
    public static final k3.d f14346n;
    public final int f14347a;
    public final String f14348b;
    public final int f14349c;
    public final j3.t0[] d;
    public int f14350e;

    static {
        int i10 = f5.d0.f6579a;
        f14345f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f14346n = new k3.d(18);
    }

    public j1(String str, j3.t0... t0VarArr) {
        boolean z10;
        if (t0VarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        this.f14348b = str;
        this.d = t0VarArr;
        this.f14347a = t0VarArr.length;
        int g10 = f5.o.g(t0VarArr[0].B);
        this.f14349c = g10 == -1 ? f5.o.g(t0VarArr[0].A) : g10;
        String str2 = t0VarArr[0].f10799c;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i10 = t0VarArr[0].f10800e | 16384;
        for (int i11 = 1; i11 < t0VarArr.length; i11++) {
            String str3 = t0VarArr[i11].f10799c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i11, t0VarArr[0].f10799c, t0VarArr[i11].f10799c);
                return;
            } else if (i10 != (t0VarArr[i11].f10800e | 16384)) {
                b("role flags", i11, Integer.toBinaryString(t0VarArr[0].f10800e), Integer.toBinaryString(t0VarArr[i11].f10800e));
                return;
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder k9 = th.k("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        k9.append(str3);
        k9.append("' (track ");
        k9.append(i10);
        k9.append(")");
        f5.a.p("TrackGroup", "", new IllegalStateException(k9.toString()));
    }

    public final int a(j3.t0 t0Var) {
        int i10 = 0;
        while (true) {
            j3.t0[] t0VarArr = this.d;
            if (i10 < t0VarArr.length) {
                if (t0Var == t0VarArr[i10]) {
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
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f14348b.equals(j1Var.f14348b) && Arrays.equals(this.d, j1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f14350e == 0) {
            this.f14350e = j7.l1.f(527, 31, this.f14348b) + Arrays.hashCode(this.d);
        }
        return this.f14350e;
    }
}
