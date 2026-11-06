package g9;
public final class b extends g {
    public static final b f13579c = new b("CharMatcher.any()", 0);
    public static final b d = new b("CharMatcher.ascii()", 1);
    public static final b f13580e = new b("CharMatcher.javaIsoControl()", 2);
    public static final b f13581f = new b("CharMatcher.none()", 3);
    public final int f13582b;

    public b(String str, int i7) {
        super(str);
        this.f13582b = i7;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f13582b) {
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
        switch (this.f13582b) {
            case 0:
                return f13581f;
            case 3:
                return f13579c;
            default:
                return super.d();
        }
    }
}
