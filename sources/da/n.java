package da;
public final class n implements na.d {
    public static final n f8437a = new Object();
    public static final na.c f8438b = na.c.c("baseAddress");
    public static final na.c f8439c = na.c.c("size");
    public static final na.c d = na.c.c("name");
    public static final na.c f8440e = na.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        na.e eVar = (na.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.e(f8438b, x0Var.f8562a);
        eVar.e(f8439c, x0Var.f8563b);
        eVar.a(d, x0Var.f8564c);
        String str = x0Var.d;
        if (str != null) {
            bArr = str.getBytes(u2.f8538a);
        } else {
            bArr = null;
        }
        eVar.a(f8440e, bArr);
    }
}
