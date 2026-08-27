package j3;

public final class e implements h3.g {
    public static final e h = new e(0, 0, 1, 1, 0);

    public final int f12321a;

    public final int f12322b;

    public final int f12323c;
    public final int d;

    public final int f12324e;

    public a9.i f12325f;

    static {
        int i10 = d5.g0.f4795a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14) {
        this.f12321a = i10;
        this.f12322b = i11;
        this.f12323c = i12;
        this.d = i13;
        this.f12324e = i14;
    }

    public final a9.i a() {
        if (this.f12325f == null) {
            this.f12325f = new a9.i(this);
        }
        return this.f12325f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f12321a == eVar.f12321a && this.f12322b == eVar.f12322b && this.f12323c == eVar.f12323c && this.d == eVar.d && this.f12324e == eVar.f12324e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f12321a) * 31) + this.f12322b) * 31) + this.f12323c) * 31) + this.d) * 31) + this.f12324e;
    }
}
