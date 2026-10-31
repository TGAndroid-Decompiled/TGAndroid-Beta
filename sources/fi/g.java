package fi;
public final class g {
    public static final g f7131b = new g(-1);
    public final int f7132a;

    public g(int i10) {
        if (i10 != -1 && i10 <= 0) {
            throw new IllegalArgumentException("height must be positive or -1");
        }
        this.f7132a = i10;
    }
}
