package defpackage;
public final class h60 implements zq7 {
    public static final h60 a = new Object();
    public static final sa4 b = sa4.c("name");
    public static final sa4 c = sa4.c("code");
    public static final sa4 d = sa4.c("address");

    @Override
    public final void a(Object obj, Object obj2) {
        nz2 nz2Var = (nz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.a(b, ((z80) nz2Var).a);
        z80 z80Var = (z80) nz2Var;
        ar7Var.a(c, z80Var.b);
        ar7Var.g(d, z80Var.c);
    }
}
