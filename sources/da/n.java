package da;
public final class n implements na.d {
    public static final n f8097a = new Object();
    public static final na.c f8098b = na.c.c("baseAddress");
    public static final na.c f8099c = na.c.c("size");
    public static final na.c d = na.c.c("name");
    public static final na.c f8100e = na.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        na.e eVar = (na.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.e(f8098b, x0Var.f8222a);
        eVar.e(f8099c, x0Var.f8223b);
        eVar.a(d, x0Var.f8224c);
        String str = x0Var.d;
        if (str != null) {
            bArr = str.getBytes(u2.f8198a);
        } else {
            bArr = null;
        }
        eVar.a(f8100e, bArr);
    }
}
