package ee;
public final class v implements fb.n {
    public final int f8196a;
    public final String f8197b;

    public v(String str, int i10) {
        this.f8196a = i10;
        this.f8197b = str;
    }

    @Override
    public Object p2() {
        throw new RuntimeException(this.f8197b);
    }

    public String toString() {
        switch (this.f8196a) {
            case 0:
                return "<" + this.f8197b + '>';
            default:
                return super.toString();
        }
    }
}
