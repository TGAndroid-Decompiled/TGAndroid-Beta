package j4;

import java.util.Arrays;
public final class i1 implements h3.g {
    public static final String f13479f;
    public static final String h;
    public static final i3.i f13480n;
    public final int f13481a;
    public final String f13482b;
    public final int f13483c;
    public final h3.t0[] d;
    public int f13484e;

    static {
        int i9 = d5.f0.f4349a;
        f13479f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f13480n = new i3.i(9);
    }

    public i1(String str, h3.t0... t0VarArr) {
        boolean z10;
        if (t0VarArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        this.f13482b = str;
        this.d = t0VarArr;
        this.f13481a = t0VarArr.length;
        int g10 = d5.q.g(t0VarArr[0].B);
        this.f13483c = g10 == -1 ? d5.q.g(t0VarArr[0].A) : g10;
        String str2 = t0VarArr[0].f9762c;
        str2 = (str2 == null || str2.equals("und")) ? "" : "";
        int i9 = t0VarArr[0].f9763e | 16384;
        for (int i10 = 1; i10 < t0VarArr.length; i10++) {
            String str3 = t0VarArr[i10].f9762c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : "")) {
                b("languages", i10, t0VarArr[0].f9762c, t0VarArr[i10].f9762c);
                return;
            } else if (i9 != (t0VarArr[i10].f9763e | 16384)) {
                b("role flags", i10, Integer.toBinaryString(t0VarArr[0].f9763e), Integer.toBinaryString(t0VarArr[i10].f9763e));
                return;
            }
        }
    }

    public static void b(String str, int i9, String str2, String str3) {
        StringBuilder q10 = j3.r0.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        q10.append(str3);
        q10.append("' (track ");
        q10.append(i9);
        q10.append(")");
        d5.a.p("TrackGroup", "", new IllegalStateException(q10.toString()));
    }

    public final int a(h3.t0 t0Var) {
        int i9 = 0;
        while (true) {
            h3.t0[] t0VarArr = this.d;
            if (i9 < t0VarArr.length) {
                if (t0Var == t0VarArr[i9]) {
                    return i9;
                }
                i9++;
            } else {
                return -1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i1.class == obj.getClass()) {
            i1 i1Var = (i1) obj;
            if (this.f13482b.equals(i1Var.f13482b) && Arrays.equals(this.d, i1Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f13484e == 0) {
            this.f13484e = j3.r0.f(527, 31, this.f13482b) + Arrays.hashCode(this.d);
        }
        return this.f13484e;
    }
}
