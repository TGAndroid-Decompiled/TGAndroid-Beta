package defpackage;
public final class r60 implements zq7 {
    public static final r60 a = new Object();
    public static final sa4 b = sa4.c("platform");
    public static final sa4 c = sa4.c("version");
    public static final sa4 d = sa4.c("buildVersion");
    public static final sa4 e = sa4.c("jailbroken");

    @Override
    public final void a(Object obj, Object obj2) {
        zz2 zz2Var = (zz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.e(b, ((m90) zz2Var).a);
        m90 m90Var = (m90) zz2Var;
        ar7Var.a(c, m90Var.b);
        ar7Var.a(d, m90Var.c);
        ar7Var.d(e, m90Var.d);
    }
}
