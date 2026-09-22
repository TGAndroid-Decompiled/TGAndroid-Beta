package ee;
public final class v implements fb.o {
    public final int f8200a;
    public final String f8201b;

    public v(String str, int i10) {
        this.f8200a = i10;
        this.f8201b = str;
    }

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
}
