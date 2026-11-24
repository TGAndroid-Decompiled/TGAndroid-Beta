package defpackage;
public final class gxc {
    public static void b() {
        throw new UnsupportedOperationException();
    }

    public static void c(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void d(String str) {
        throw new NullPointerException(str);
    }
}
