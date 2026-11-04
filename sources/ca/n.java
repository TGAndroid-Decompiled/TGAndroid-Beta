package ca;
public final class n implements ma.d {
    public static final n f4460a = new Object();
    public static final ma.c f4461b = ma.c.c("baseAddress");
    public static final ma.c f4462c = ma.c.c("size");
    public static final ma.c d = ma.c.c("name");
    public static final ma.c f4463e = ma.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        ma.e eVar = (ma.e) obj2;
        x0 x0Var = (x0) ((d2) obj);
        eVar.f(f4461b, x0Var.f4585a);
        eVar.f(f4462c, x0Var.f4586b);
        eVar.a(d, x0Var.f4587c);
        String str = x0Var.d;
        if (str != null) {
            bArr = str.getBytes(u2.f4561a);
        } else {
            bArr = null;
        }
        eVar.a(f4463e, bArr);
    }
}
