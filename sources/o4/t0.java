package o4;
public final class t0 implements j3.g {
    public static final t0 d = new t0(new s0[0]);
    public static final String e;
    public final int f16403a;
    public final s8.i0 f16404b;
    public int f16405c;

    static {
        int i10 = h5.d0.f6924a;
        e = Integer.toString(0, 36);
    }

    public t0(s0... s0VarArr) {
        s8.i0 u10 = s8.v.u(s0VarArr);
        this.f16404b = u10;
        this.f16403a = s0VarArr.length;
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
        return (s0) this.f16404b.get(i10);
    }

    public final int b(s0 s0Var) {
        int indexOf = this.f16404b.indexOf(s0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t0.class == obj.getClass()) {
                t0 t0Var = (t0) obj;
                if (this.f16403a == t0Var.f16403a && this.f16404b.equals(t0Var.f16404b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f16405c == 0) {
            this.f16405c = this.f16404b.hashCode();
        }
        return this.f16405c;
    }
}
