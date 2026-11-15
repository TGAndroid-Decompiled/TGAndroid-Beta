package da;
public final class n implements na.d {
    public static final n f7821a = new Object();
    public static final na.c f7822b = na.c.c("baseAddress");
    public static final na.c f7823c = na.c.c("size");
    public static final na.c d = na.c.c("name");
    public static final na.c f7824e = na.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        na.e eVar = (na.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.e(f7822b, x0Var.f7946a);
        eVar.e(f7823c, x0Var.f7947b);
        eVar.a(d, x0Var.f7948c);
        String str = x0Var.d;
        if (str != null) {
            bArr = str.getBytes(u2.f7922a);
        } else {
            bArr = null;
        }
        eVar.a(f7824e, bArr);
    }
}
