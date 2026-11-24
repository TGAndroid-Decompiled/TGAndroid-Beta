package defpackage;
public abstract class q4f {
    public static int a(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }
}
