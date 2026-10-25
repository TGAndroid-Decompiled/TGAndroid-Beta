package he;
public final class v {
    public final int f12820a;
    public final String f12821b;

    public v(String str, int i10) {
        this.f12820a = i10;
        this.f12821b = str;
    }

    public String toString() {
        switch (this.f12820a) {
            case 0:
                return "<" + this.f12821b + '>';
            default:
                return super.toString();
        }
    }
}
