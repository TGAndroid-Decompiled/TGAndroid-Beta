package ee;
public final class v implements fb.n {
    public final int f8200a;
    public String f8201b;

    @Override
    public Object p2() {
        throw new RuntimeException(this.f8201b);
    }

    public String toString() {
        switch (this.f8200a) {
            case 0:
                return "<" + this.f8201b + '>';
            default:
                return super.toString();
        }
    }

    public v(String str, int i10) {
        this.f8200a = i10;
        this.f8201b = str;
    }
}
