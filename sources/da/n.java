package da;
public final class n implements na.d {
    public static final n f8103a = new Object();
    public static final na.c f8104b = na.c.c("baseAddress");
    public static final na.c f8105c = na.c.c("size");
    public static final na.c d = na.c.c("name");
    public static final na.c f8106e = na.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        na.e eVar = (na.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.e(f8104b, x0Var.f8228a);
        eVar.e(f8105c, x0Var.f8229b);
        eVar.a(d, x0Var.f8230c);
        String str = x0Var.d;
        if (str != null) {
            bArr = str.getBytes(u2.f8204a);
        } else {
            bArr = null;
        }
        eVar.a(f8106e, bArr);
    }
}
