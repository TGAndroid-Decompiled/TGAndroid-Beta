package defpackage;
public final class e60 implements zq7 {
    public static final e60 a = new Object();
    public static final sa4 b = sa4.c("baseAddress");
    public static final sa4 c = sa4.c("size");
    public static final sa4 d = sa4.c("name");
    public static final sa4 e = sa4.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        lz2 lz2Var = (lz2) obj;
        ar7 ar7Var = (ar7) obj2;
        ar7Var.g(b, ((x80) lz2Var).a);
        x80 x80Var = (x80) lz2Var;
        ar7Var.g(c, x80Var.b);
        ar7Var.a(d, x80Var.c);
        String str = x80Var.d;
        if (str != null) {
            bArr = str.getBytes(c03.a);
        } else {
            bArr = null;
        }
        ar7Var.a(e, bArr);
    }
}
