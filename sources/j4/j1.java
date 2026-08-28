package j4;
public final class j1 implements h3.g {
    public static final j1 d = new j1(new i1[0]);
    public static final String f13490e;
    public final int f13491a;
    public final o8.l0 f13492b;
    public int f13493c;

    static {
        int i9 = d5.f0.f4349a;
        f13490e = Integer.toString(0, 36);
    }

    public j1(i1... i1VarArr) {
        o8.l0 v = o8.z.v(i1VarArr);
        this.f13492b = v;
        this.f13491a = i1VarArr.length;
        int i9 = 0;
        while (i9 < v.d) {
            int i10 = i9 + 1;
            for (int i11 = i10; i11 < v.d; i11++) {
                if (((i1) v.get(i9)).equals(v.get(i11))) {
                    d5.a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i9 = i10;
        }
    }

    public final i1 a(int i9) {
        return (i1) this.f13492b.get(i9);
    }

    public final int b(i1 i1Var) {
        int indexOf = this.f13492b.indexOf(i1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j1.class == obj.getClass()) {
                j1 j1Var = (j1) obj;
                if (this.f13491a == j1Var.f13491a && this.f13492b.equals(j1Var.f13492b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f13493c == 0) {
            this.f13493c = this.f13492b.hashCode();
        }
        return this.f13493c;
    }
}
