package h3;

public final class m implements g {

    public final int f8015a;

    public final int f8016b;

    public final int f8017c;

    static {
        int i10 = d5.g0.f4795a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public m(int i10, int i11, int i12) {
        this.f8015a = i10;
        this.f8016b = i11;
        this.f8017c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f8015a == mVar.f8015a && this.f8016b == mVar.f8016b && this.f8017c == mVar.f8017c;
    }

    public final int hashCode() {
        return ((((527 + this.f8015a) * 31) + this.f8016b) * 31) + this.f8017c;
    }
}
