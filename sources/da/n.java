package da;
public final class n implements na.d {
    public static final n f8432a = new Object();
    public static final na.c f8433b = na.c.c("baseAddress");
    public static final na.c f8434c = na.c.c("size");
    public static final na.c d = na.c.c("name");
    public static final na.c f8435e = na.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        na.e eVar = (na.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.e(f8433b, x0Var.f8557a);
        eVar.e(f8434c, x0Var.f8558b);
        eVar.a(d, x0Var.f8559c);
        String str = x0Var.d;
        if (str != null) {
            bArr = str.getBytes(u2.f8533a);
        } else {
            bArr = null;
        }
        eVar.a(f8435e, bArr);
    }
}
