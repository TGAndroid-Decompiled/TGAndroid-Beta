package j3;
public final class m implements g {
    public final int f10622a;
    public final int f10623b;
    public final int f10624c;

    static {
        int i10 = f5.d0.f6579a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public m(int i10, int i11, int i12) {
        this.f10622a = i10;
        this.f10623b = i11;
        this.f10624c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f10622a == mVar.f10622a && this.f10623b == mVar.f10623b && this.f10624c == mVar.f10624c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.f10622a) * 31) + this.f10623b) * 31) + this.f10624c;
    }
}
