package defpackage;
public final class t70 implements zn7 {
    public static final t70 a = new Object();
    public static final w84 b = w84.c("sessionId");
    public static final w84 c = w84.c("firstSessionId");
    public static final w84 d = w84.c("sessionIndex");
    public static final w84 e = w84.c("eventTimestampUs");
    public static final w84 f = w84.c("dataCollectionStatus");
    public static final w84 g = w84.c("firebaseInstallationId");
    public static final w84 h = w84.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        i6a i6aVar = (i6a) obj;
        ao7 ao7Var = (ao7) obj2;
        ao7Var.a(b, i6aVar.a);
        ao7Var.a(c, i6aVar.b);
        ao7Var.e(d, i6aVar.c);
        ao7Var.g(e, i6aVar.d);
        ao7Var.a(f, i6aVar.e);
        ao7Var.a(g, i6aVar.f);
        ao7Var.a(h, i6aVar.g);
    }
}
