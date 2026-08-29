package i9;
public final class l implements s9.d {
    public static final l f8716a = new Object();
    public static final s9.c f8717b = s9.c.c("baseAddress");
    public static final s9.c f8718c = s9.c.c("size");
    public static final s9.c d = s9.c.c("name");
    public static final s9.c f8719e = s9.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        s9.e eVar = (s9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.c(f8717b, o0Var.f8748a);
        eVar.c(f8718c, o0Var.f8749b);
        eVar.e(d, o0Var.f8750c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f8646a);
        } else {
            bArr = null;
        }
        eVar.e(f8719e, bArr);
    }
}
