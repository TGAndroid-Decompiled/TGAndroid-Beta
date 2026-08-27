package j4;

public final class j1 implements h3.g {
    public static final j1 d = new j1(new i1[0]);

    public static final String f12592e;

    public final int f12593a;

    public final p8.l0 f12594b;

    public int f12595c;

    static {
        int i10 = d5.g0.f4795a;
        f12592e = Integer.toString(0, 36);
    }

    public j1(i1... i1VarArr) {
        p8.l0 l0VarV = p8.z.v(i1VarArr);
        this.f12594b = l0VarV;
        this.f12593a = i1VarArr.length;
        int i10 = 0;
        while (i10 < l0VarV.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < l0VarV.d; i12++) {
                if (((i1) l0VarV.get(i10)).equals(l0VarV.get(i12))) {
                    d5.a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final i1 a(int i10) {
        return (i1) this.f12594b.get(i10);
    }

    public final int b(i1 i1Var) {
        int iIndexOf = this.f12594b.indexOf(i1Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j1.class != obj.getClass()) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return this.f12593a == j1Var.f12593a && this.f12594b.equals(j1Var.f12594b);
    }

    public final int hashCode() {
        if (this.f12595c == 0) {
            this.f12595c = this.f12594b.hashCode();
        }
        return this.f12595c;
    }
}
