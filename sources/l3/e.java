package l3;
public final class e implements j3.g {
    public static final e h = new e(0, 0, 1, 1, 0);
    public final int f14077a;
    public final int f14078b;
    public final int f14079c;
    public final int d;
    public final int f14080e;
    public ha.c f14081f;

    static {
        int i10 = f5.d0.f6579a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public e(int i10, int i11, int i12, int i13, int i14) {
        this.f14077a = i10;
        this.f14078b = i11;
        this.f14079c = i12;
        this.d = i13;
        this.f14080e = i14;
    }

    public final ha.c a() {
        if (this.f14081f == null) {
            this.f14081f = new ha.c(this);
        }
        return this.f14081f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f14077a == eVar.f14077a && this.f14078b == eVar.f14078b && this.f14079c == eVar.f14079c && this.d == eVar.d && this.f14080e == eVar.f14080e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f14077a) * 31) + this.f14078b) * 31) + this.f14079c) * 31) + this.d) * 31) + this.f14080e;
    }
}
