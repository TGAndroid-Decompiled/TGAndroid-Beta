package o4;
public final class t0 implements j3.g {
    public static final t0 d = new t0(new s0[0]);
    public static final String f16577e;
    public final int f16578a;
    public final s8.i0 f16579b;
    public int f16580c;

    static {
        int i10 = h5.d0.f7237a;
        f16577e = Integer.toString(0, 36);
    }

    public t0(s0... s0VarArr) {
        s8.i0 u10 = s8.v.u(s0VarArr);
        this.f16579b = u10;
        this.f16578a = s0VarArr.length;
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
        return (s0) this.f16579b.get(i10);
    }

    public final int b(s0 s0Var) {
        int indexOf = this.f16579b.indexOf(s0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f16578a == t0Var.f16578a && this.f16579b.equals(t0Var.f16579b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f16580c == 0) {
            this.f16580c = this.f16579b.hashCode();
        }
        return this.f16580c;
    }
}
