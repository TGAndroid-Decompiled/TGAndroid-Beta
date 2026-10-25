package aa;
public final class l implements ka.d {
    public static final l f1137a = new Object();
    public static final ka.c f1138b = ka.c.c("baseAddress");
    public static final ka.c f1139c = ka.c.c("size");
    public static final ka.c d = ka.c.c("name");
    public static final ka.c e = ka.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ka.e eVar = (ka.e) obj2;
        q0 q0Var = (q0) ((p1) obj);
        eVar.f(f1138b, q0Var.f1180a);
        eVar.f(f1139c, q0Var.f1181b);
        eVar.a(d, q0Var.f1182c);
        String str = q0Var.d;
        if (str != null) {
            bArr = str.getBytes(g2.f1091a);
        } else {
            bArr = null;
        }
        eVar.a(e, bArr);
    }
}
