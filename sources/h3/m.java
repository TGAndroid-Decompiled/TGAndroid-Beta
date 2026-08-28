package h3;
public final class m implements g {
    public final int f9585a;
    public final int f9586b;
    public final int f9587c;

    static {
        int i9 = d5.f0.f4349a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public m(int i9, int i10, int i11) {
        this.f9585a = i9;
        this.f9586b = i10;
        this.f9587c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f9585a == mVar.f9585a && this.f9586b == mVar.f9586b && this.f9587c == mVar.f9587c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.f9585a) * 31) + this.f9586b) * 31) + this.f9587c;
    }
}
