package k9;
public final class l implements u9.d {
    public static final l f10186a = new Object();
    public static final u9.c f10187b = u9.c.c("baseAddress");
    public static final u9.c f10188c = u9.c.c("size");
    public static final u9.c d = u9.c.c("name");
    public static final u9.c e = u9.c.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        u9.e eVar = (u9.e) obj2;
        o0 o0Var = (o0) ((n1) obj);
        eVar.b(f10187b, o0Var.f10212a);
        eVar.b(f10188c, o0Var.f10213b);
        eVar.e(d, o0Var.f10214c);
        String str = o0Var.d;
        if (str != null) {
            bArr = str.getBytes(e2.f10124a);
        } else {
            bArr = null;
        }
        eVar.e(e, bArr);
    }
}
