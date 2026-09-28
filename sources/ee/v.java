package ee;
public final class v implements fb.n {
    public final int f8183a;
    public String f8184b;

    @Override
    public Object p2() {
        throw new RuntimeException(this.f8184b);
    }

    public String toString() {
        switch (this.f8183a) {
            case 0:
                return "<" + this.f8184b + '>';
            default:
                return super.toString();
        }
    }

    public v(String str, int i10) {
        this.f8183a = i10;
        this.f8184b = str;
    }
}
