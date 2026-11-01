package fi;
public final class h {
    public static final h f7132b = new h(-1);
    public final int f7133a;

    public h(int i10) {
        if (i10 != -1 && i10 <= 0) {
            throw new IllegalArgumentException("height must be positive or -1");
        }
        this.f7133a = i10;
    }
}
