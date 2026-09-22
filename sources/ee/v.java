package ee;
public final class v implements fb.n {
    public final int f8198a;
    public final String f8199b;

    public v(String str, int i10) {
        this.f8198a = i10;
        this.f8199b = str;
    }

    @Override
    public Object p2() {
        throw new RuntimeException(this.f8199b);
    }

    public String toString() {
        switch (this.f8198a) {
            case 0:
                return "<" + this.f8199b + '>';
            default:
                return super.toString();
        }
    }
}
