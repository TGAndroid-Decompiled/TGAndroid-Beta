package defpackage;
public final class s80 implements cq7 {
    public static final s80 a = new Object();
    public static final wa4 b = wa4.c("eventType");
    public static final wa4 c = wa4.c("sessionData");
    public static final wa4 d = wa4.c("applicationInfo");

    @Override
    public final void a(Object obj, Object obj2) {
        e8a e8aVar = (e8a) obj;
        dq7 dq7Var = (dq7) obj2;
        e8aVar.getClass();
        dq7Var.a(b, y54.SESSION_START);
        dq7Var.a(c, e8aVar.a);
        dq7Var.a(d, e8aVar.b);
    }
}
