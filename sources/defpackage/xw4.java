package defpackage;
public final class xw4 {
    public static final xw4 b = new xw4(-1);
    public final int a;

    public xw4(int i) {
        if (i != -1 && i <= 0) {
            w26.j("height must be positive or -1");
            throw null;
        } else {
            this.a = i;
        }
    }
}
