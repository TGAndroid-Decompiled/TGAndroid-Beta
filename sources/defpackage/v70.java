package defpackage;
public final class v70 implements zq7 {
    public static final v70 a = new Object();
    public static final sa4 b = sa4.c("sessionId");
    public static final sa4 c = sa4.c("firstSessionId");
    public static final sa4 d = sa4.c("sessionIndex");
    public static final sa4 e = sa4.c("eventTimestampUs");
    public static final sa4 f = sa4.c("dataCollectionStatus");
    public static final sa4 g = sa4.c("firebaseInstallationId");
    public static final sa4 h = sa4.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        aaa aaaVar = (aaa) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, aaaVar.a);
        ar7Var.a(c, aaaVar.b);
        ar7Var.e(d, aaaVar.c);
        ar7Var.g(e, aaaVar.d);
        ar7Var.a(f, aaaVar.e);
        ar7Var.a(g, aaaVar.f);
        ar7Var.a(h, aaaVar.g);
    }
}
