package da;
public final class n implements na.d {
    public static final n f8132a = new Object();
    public static final na.c f8133b = na.c.c("baseAddress");
    public static final na.c f8134c = na.c.c("size");
    public static final na.c d = na.c.c("name");
    public static final na.c f8135e = na.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        na.e eVar = (na.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.e(f8133b, x0Var.f8257a);
        eVar.e(f8134c, x0Var.f8258b);
        eVar.a(d, x0Var.f8259c);
        String str = x0Var.d;
        if (str != null) {
            bArr = str.getBytes(u2.f8233a);
        } else {
            bArr = null;
        }
        eVar.a(f8135e, bArr);
    }
}
