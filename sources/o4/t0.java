package o4;
public final class t0 implements j3.g {
    public static final t0 d = new t0(new s0[0]);
    public static final String e;
    public final int f16421a;
    public final s8.i0 f16422b;
    public int f16423c;

    static {
        int i10 = h5.d0.f6937a;
        e = Integer.toString(0, 36);
    }

    public t0(s0... s0VarArr) {
        s8.i0 u10 = s8.v.u(s0VarArr);
        this.f16422b = u10;
        this.f16421a = s0VarArr.length;
        int i10 = 0;
        while (i10 < u10.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < u10.d; i12++) {
                if (((s0) u10.get(i10)).equals(u10.get(i12))) {
                    h5.a.p("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final s0 a(int i10) {
        return (s0) this.f16422b.get(i10);
    }

    public final int b(s0 s0Var) {
        int indexOf = this.f16422b.indexOf(s0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f16421a == t0Var.f16421a && this.f16422b.equals(t0Var.f16422b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f16423c == 0) {
            this.f16423c = this.f16422b.hashCode();
        }
        return this.f16423c;
    }
}
