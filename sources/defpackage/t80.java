package defpackage;
public final class t80 implements cq7 {
    public static final t80 a = new Object();
    public static final wa4 b = wa4.c("sessionId");
    public static final wa4 c = wa4.c("firstSessionId");
    public static final wa4 d = wa4.c("sessionIndex");
    public static final wa4 e = wa4.c("eventTimestampUs");
    public static final wa4 f = wa4.c("dataCollectionStatus");
    public static final wa4 g = wa4.c("firebaseInstallationId");
    public static final wa4 h = wa4.c("firebaseAuthenticationToken");

    @Override
    public final void a(Object obj, Object obj2) {
        k8a k8aVar = (k8a) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.a(b, k8aVar.a);
        dq7Var.a(c, k8aVar.b);
        dq7Var.e(d, k8aVar.c);
        dq7Var.g(e, k8aVar.d);
        dq7Var.a(f, k8aVar.e);
        dq7Var.a(g, k8aVar.f);
        dq7Var.a(h, k8aVar.g);
    }
}
