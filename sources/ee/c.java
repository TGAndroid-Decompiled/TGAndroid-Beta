package ee;

public final class c {

    public static final c f5376a;

    public static final c f5377b;

    public static final c f5378c;
    public static final c[] d;

    static {
        c cVar = new c("LEFT", 0);
        f5376a = cVar;
        c cVar2 = new c("CENTER", 1);
        f5377b = cVar2;
        c cVar3 = new c("RIGHT", 2);
        f5378c = cVar3;
        d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
