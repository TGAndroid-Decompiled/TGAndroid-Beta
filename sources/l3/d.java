package l3;
public final class d implements j3.g {
    public static final d h = new d(0, 0, 1, 1, 0);
    public final int f11243a;
    public final int f11244b;
    public final int f11245c;
    public final int d;
    public final int e;
    public ja.c f11246f;

    static {
        int i10 = h5.d0.f6924a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public d(int i10, int i11, int i12, int i13, int i14) {
        this.f11243a = i10;
        this.f11244b = i11;
        this.f11245c = i12;
        this.d = i13;
        this.e = i14;
    }

    public final ja.c a() {
        if (this.f11246f == null) {
            this.f11246f = new ja.c(this);
        }
        return this.f11246f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f11243a == dVar.f11243a && this.f11244b == dVar.f11244b && this.f11245c == dVar.f11245c && this.d == dVar.d && this.e == dVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f11243a) * 31) + this.f11244b) * 31) + this.f11245c) * 31) + this.d) * 31) + this.e;
    }
}
