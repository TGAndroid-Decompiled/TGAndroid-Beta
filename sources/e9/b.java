package e9;
public final class b extends g {
    public static final b f9834c = new b("CharMatcher.any()", 0);
    public static final b d = new b("CharMatcher.ascii()", 1);
    public static final b e = new b("CharMatcher.javaIsoControl()", 2);
    public static final b f9835f = new b("CharMatcher.none()", 3);
    public final int f9836b;

    public b(String str, int i10) {
        super(str);
        this.f9836b = i10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f9836b) {
            case 0:
                return true;
            case 1:
                if (c10 <= 127) {
                    return true;
                }
                return false;
            case 2:
                if (c10 > 31 && (c10 < 127 || c10 > 159)) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    @Override
    public i d() {
        switch (this.f9836b) {
            case 0:
                return f9835f;
            case 3:
                return f9834c;
            default:
                return super.d();
        }
    }
}
