package l4;
public final class k1 implements j3.g {
    public static final k1 d = new k1(new j1[0]);
    public static final String f14356e;
    public final int f14357a;
    public final q8.l0 f14358b;
    public int f14359c;

    static {
        int i10 = f5.d0.f6579a;
        f14356e = Integer.toString(0, 36);
    }

    public k1(j1... j1VarArr) {
        q8.l0 v = q8.z.v(j1VarArr);
        this.f14358b = v;
        this.f14357a = j1VarArr.length;
        int i10 = 0;
        while (i10 < v.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < v.d; i12++) {
                if (((j1) v.get(i10)).equals(v.get(i12))) {
                    f5.a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final j1 a(int i10) {
        return (j1) this.f14358b.get(i10);
    }

    public final int b(j1 j1Var) {
        int indexOf = this.f14358b.indexOf(j1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k1.class == obj.getClass()) {
                k1 k1Var = (k1) obj;
                if (this.f14357a == k1Var.f14357a && this.f14358b.equals(k1Var.f14358b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f14359c == 0) {
            this.f14359c = this.f14358b.hashCode();
        }
        return this.f14359c;
    }
}
