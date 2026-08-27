package k7;

public final class v {

    public static final v f14973a;

    public static final v[] f14974b;

    static {
        v vVar = new v("DEFAULT", 0);
        f14973a = vVar;
        f14974b = new v[]{vVar, new v("SIGNED", 1), new v("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f14974b.clone();
    }
}
