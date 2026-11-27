package defpackage;
public final class k60 implements zq7 {
    public static final k60 a = new Object();
    public static final sa4 b = sa4.c("processName");
    public static final sa4 c = sa4.c("pid");
    public static final sa4 d = sa4.c("importance");
    public static final sa4 e = sa4.c("defaultProcess");

    @Override
    public final void a(Object obj, Object obj2) {
        rz2 rz2Var = (rz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((d90) rz2Var).a);
        d90 d90Var = (d90) rz2Var;
        ar7Var.e(c, d90Var.b);
        ar7Var.e(d, d90Var.c);
        ar7Var.d(e, d90Var.d);
    }
}
