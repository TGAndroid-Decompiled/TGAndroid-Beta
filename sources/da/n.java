package da;
public final class n implements na.d {
    public static final n f7824a = new Object();
    public static final na.c f7825b = na.c.c("baseAddress");
    public static final na.c f7826c = na.c.c("size");
    public static final na.c d = na.c.c("name");
    public static final na.c f7827e = na.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        na.e eVar = (na.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.e(f7825b, x0Var.f7949a);
        eVar.e(f7826c, x0Var.f7950b);
        eVar.a(d, x0Var.f7951c);
        String str = x0Var.d;
        if (str != null) {
            bArr = str.getBytes(u2.f7925a);
        } else {
            bArr = null;
        }
        eVar.a(f7827e, bArr);
    }
}
