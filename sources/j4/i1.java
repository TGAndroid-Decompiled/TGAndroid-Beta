package j4;

import java.util.Arrays;

public final class i1 implements h3.g {

    public static final String f12581f;
    public static final String h;

    public static final ia.l f12582n;

    public final int f12583a;

    public final String f12584b;

    public final int f12585c;
    public final h3.t0[] d;

    public int f12586e;

    static {
        int i10 = d5.g0.f4795a;
        f12581f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f12582n = new ia.l(8);
    }

    public i1(String str, h3.t0... t0VarArr) {
        d5.a.f(t0VarArr.length > 0);
        this.f12584b = str;
        this.d = t0VarArr;
        this.f12583a = t0VarArr.length;
        int iG = d5.q.g(t0VarArr[0].B);
        this.f12585c = iG == -1 ? d5.q.g(t0VarArr[0].A) : iG;
        String str2 = t0VarArr[0].f8186c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = t0VarArr[0].f8187e | 16384;
        for (int i11 = 1; i11 < t0VarArr.length; i11++) {
            String str3 = t0VarArr[i11].f8186c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", i11, t0VarArr[0].f8186c, t0VarArr[i11].f8186c);
                return;
            } else {
                if (i10 != (t0VarArr[i11].f8187e | 16384)) {
                    b("role flags", i11, Integer.toBinaryString(t0VarArr[0].f8187e), Integer.toBinaryString(t0VarArr[i11].f8187e));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i10, String str2, String str3) {
        StringBuilder sbP = i0.a.p("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbP.append(str3);
        sbP.append("' (track ");
        sbP.append(i10);
        sbP.append(")");
        d5.a.p("TrackGroup", "", new IllegalStateException(sbP.toString()));
    }

    public final int a(h3.t0 t0Var) {
        int i10 = 0;
        while (true) {
            h3.t0[] t0VarArr = this.d;
            if (i10 >= t0VarArr.length) {
                return -1;
            }
            if (t0Var == t0VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i1.class == obj.getClass()) {
            i1 i1Var = (i1) obj;
            if (this.f12584b.equals(i1Var.f12584b) && Arrays.equals(this.d, i1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12586e == 0) {
            this.f12586e = i0.a.g(527, 31, this.f12584b) + Arrays.hashCode(this.d);
        }
        return this.f12586e;
    }
}
