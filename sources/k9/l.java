package k9;
public final class l implements u9.d {
    public static final l f10166a = new Object();
    public static final u9.c f10167b = u9.c.c("baseAddress");
    public static final u9.c f10168c = u9.c.c("size");
    public static final u9.c d = u9.c.c("name");
    public static final u9.c e = u9.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        u9.e eVar = (u9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.b(f10167b, o0Var.f10192a);
        eVar.b(f10168c, o0Var.f10193b);
        eVar.e(d, o0Var.f10194c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f10104a);
        } else {
            bArr = null;
        }
        eVar.e(e, bArr);
    }
}
