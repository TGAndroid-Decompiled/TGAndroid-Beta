package ee;
public final class v implements fb.n {
    public final int f8184a;
    public final String f8185b;

    public v(String str, int i10) {
        this.f8184a = i10;
        this.f8185b = str;
    }

    @Override
    public Object p2() {
        throw new RuntimeException(this.f8185b);
    }

    public String toString() {
        switch (this.f8184a) {
            case 0:
                return "<" + this.f8185b + '>';
            default:
                return super.toString();
        }
    }
}
