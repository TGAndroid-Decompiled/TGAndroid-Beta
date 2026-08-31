package l3;
public final class d implements j3.g {
    public static final d h = new d(0, 0, 1, 1, 0);
    public final int f11494a;
    public final int f11495b;
    public final int f11496c;
    public final int d;
    public final int f11497e;
    public o5.i f11498f;

    static {
        int i10 = h5.d0.f7237a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public d(int i10, int i11, int i12, int i13, int i14) {
        this.f11494a = i10;
        this.f11495b = i11;
        this.f11496c = i12;
        this.d = i13;
        this.f11497e = i14;
    }

    public final o5.i a() {
        if (this.f11498f == null) {
            this.f11498f = new o5.i(this);
        }
        return this.f11498f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f11494a == dVar.f11494a && this.f11495b == dVar.f11495b && this.f11496c == dVar.f11496c && this.d == dVar.d && this.f11497e == dVar.f11497e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f11494a) * 31) + this.f11495b) * 31) + this.f11496c) * 31) + this.d) * 31) + this.f11497e;
    }
}
