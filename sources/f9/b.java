package f9;
public final class b extends g {
    public static final b f11501c = new b("CharMatcher.any()", 0);
    public static final b d = new b("CharMatcher.ascii()", 1);
    public static final b f11502e = new b("CharMatcher.javaIsoControl()", 2);
    public static final b f11503f = new b("CharMatcher.none()", 3);
    public final int f11504b;

    public b(String str, int i3) {
        super(str);
        this.f11504b = i3;
    }

    @Override
    public final boolean c(char c2) {
        switch (this.f11504b) {
            case 0:
                return true;
            case 1:
                if (c2 <= 127) {
                    return true;
                }
                return false;
            case 2:
                if (c2 > 31 && (c2 < 127 || c2 > 159)) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @Override
    public i d() {
        switch (this.f11504b) {
            case 0:
                return f11503f;
            case 3:
                return f11501c;
            default:
                return super.d();
        }
    }
}
