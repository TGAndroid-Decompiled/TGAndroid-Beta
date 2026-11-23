package da;
public final class n implements na.d {
    public static final n f8135a = new Object();
    public static final na.c f8136b = na.c.c("baseAddress");
    public static final na.c f8137c = na.c.c("size");
    public static final na.c d = na.c.c("name");
    public static final na.c f8138e = na.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        na.e eVar = (na.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.e(f8136b, x0Var.f8260a);
        eVar.e(f8137c, x0Var.f8261b);
        eVar.a(d, x0Var.f8262c);
        String str = x0Var.d;
        if (str != null) {
            bArr = str.getBytes(u2.f8236a);
        } else {
            bArr = null;
        }
        eVar.a(f8138e, bArr);
    }
}
