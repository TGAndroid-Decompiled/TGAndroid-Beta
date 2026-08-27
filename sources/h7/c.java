package h7;

public final class c {

    public static final c f8309a;

    public static final c[] f8310b;

    static {
        c cVar = new c("DEFAULT", 0);
        f8309a = cVar;
        f8310b = new c[]{cVar, new c("SIGNED", 1), new c("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f8310b.clone();
    }
}
