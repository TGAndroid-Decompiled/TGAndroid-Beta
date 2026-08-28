package g9;
public final class l implements q9.d {
    public static final l f7581a = new Object();
    public static final q9.c f7582b = q9.c.c("baseAddress");
    public static final q9.c f7583c = q9.c.c("size");
    public static final q9.c d = q9.c.c("name");
    public static final q9.c f7584e = q9.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        q9.e eVar = (q9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.d(f7582b, o0Var.f7613a);
        eVar.d(f7583c, o0Var.f7614b);
        eVar.g(d, o0Var.f7615c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f7511a);
        } else {
            bArr = null;
        }
        eVar.g(f7584e, bArr);
    }
}
