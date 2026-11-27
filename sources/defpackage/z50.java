package defpackage;
public final class z50 implements zq7 {
    public static final z50 a = new Object();
    public static final sa4 b = sa4.c("identifier");
    public static final sa4 c = sa4.c("version");
    public static final sa4 d = sa4.c("displayVersion");
    public static final sa4 e = sa4.c("organization");
    public static final sa4 f = sa4.c("installationUuid");
    public static final sa4 g = sa4.c("developmentPlatform");
    public static final sa4 h = sa4.c("developmentPlatformVersion");

    @Override
    public final void a(Object obj, Object obj2) {
        jz2 jz2Var = (jz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((o80) jz2Var).a);
        o80 o80Var = (o80) jz2Var;
        ar7Var.a(c, o80Var.b);
        ar7Var.a(d, o80Var.c);
        ar7Var.a(e, null);
        ar7Var.a(f, o80Var.d);
        ar7Var.a(g, o80Var.e);
        ar7Var.a(h, o80Var.f);
    }
}
