package ee;
public final class v implements fb.n {
    public final int f8185a;
    public String f8186b;

    @Override
    public Object p2() {
        throw new RuntimeException(this.f8186b);
    }

    public String toString() {
        switch (this.f8185a) {
            case 0:
                return "<" + this.f8186b + '>';
            default:
                return super.toString();
        }
    }

    public v(String str, int i10) {
        this.f8185a = i10;
        this.f8186b = str;
    }
}
