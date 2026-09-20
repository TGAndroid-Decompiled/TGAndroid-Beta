package ee;
public final class v implements fb.n {
    public final int f8201a;
    public String f8202b;

    @Override
    public Object p2() {
        throw new RuntimeException(this.f8202b);
    }

    public String toString() {
        switch (this.f8201a) {
            case 0:
                return "<" + this.f8202b + '>';
            default:
                return super.toString();
        }
    }

    public v(String str, int i10) {
        this.f8201a = i10;
        this.f8202b = str;
    }
}
