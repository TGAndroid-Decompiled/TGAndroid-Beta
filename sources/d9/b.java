package d9;
public final class b extends g {
    public static final b f6428c = new b("CharMatcher.any()", 0);
    public static final b d = new b("CharMatcher.ascii()", 1);
    public static final b e = new b("CharMatcher.javaIsoControl()", 2);
    public static final b f6429f = new b("CharMatcher.none()", 3);
    public final int f6430b;

    public b(String str, int i10) {
        super(str);
        this.f6430b = i10;
    }

    @Override
    public final boolean c(char c10) {
        switch (this.f6430b) {
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
        switch (this.f6430b) {
            case 0:
                return f6429f;
            case 3:
                return f6428c;
            default:
                return super.d();
        }
    }
}
