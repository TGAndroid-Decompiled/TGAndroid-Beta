package defpackage;
public final class u70 implements zq7 {
    public static final u70 a = new Object();
    public static final sa4 b = sa4.c("eventType");
    public static final sa4 c = sa4.c("sessionData");
    public static final sa4 d = sa4.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        u9a u9aVar = (u9a) obj;
        ar7 ar7Var = (ar7) obj2;
        u9aVar.getClass();
        ar7Var.a(b, j54.SESSION_START);
        ar7Var.a(c, u9aVar.a);
        ar7Var.a(d, u9aVar.b);
    }
}
