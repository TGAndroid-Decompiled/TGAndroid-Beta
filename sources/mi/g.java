package mi;
public final class g {
    public static final g f16471b = new g(-1);
    public final int f16472a;

    public g(int i10) {
        if (i10 != -1 && i10 <= 0) {
            throw new IllegalArgumentException("height must be positive or -1");
        }
        this.f16472a = i10;
    }
}
