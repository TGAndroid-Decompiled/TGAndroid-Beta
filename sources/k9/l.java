package k9;
public final class l implements u9.d {
    public static final l f10936a = new Object();
    public static final u9.c f10937b = u9.c.c("baseAddress");
    public static final u9.c f10938c = u9.c.c("size");
    public static final u9.c d = u9.c.c("name");
    public static final u9.c f10939e = u9.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        u9.e eVar = (u9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.b(f10937b, o0Var.f10968a);
        eVar.b(f10938c, o0Var.f10969b);
        eVar.e(d, o0Var.f10970c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f10866a);
        } else {
            bArr = null;
        }
        eVar.e(f10939e, bArr);
    }
}
