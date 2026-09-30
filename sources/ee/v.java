package ee;
public final class v implements fb.n {
    public final int f8195a;
    public String f8196b;

    @Override
    public Object p2() {
        throw new RuntimeException(this.f8196b);
    }

    public String toString() {
        switch (this.f8195a) {
            case 0:
                return "<" + this.f8196b + '>';
            default:
                return super.toString();
        }
    }

    public v(String str, int i10) {
        this.f8195a = i10;
        this.f8196b = str;
    }
}
