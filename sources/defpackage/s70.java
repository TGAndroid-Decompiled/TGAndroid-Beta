package defpackage;
public final class s70 implements zn7 {
    public static final s70 a = new Object();
    public static final w84 b = w84.c("eventType");
    public static final w84 c = w84.c("sessionData");
    public static final w84 d = w84.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        c6a c6aVar = (c6a) obj;
        ao7 ao7Var = (ao7) obj2;
        c6aVar.getClass();
        ao7Var.a(b, n44.SESSION_START);
        ao7Var.a(c, c6aVar.a);
        ao7Var.a(d, c6aVar.b);
    }
}
