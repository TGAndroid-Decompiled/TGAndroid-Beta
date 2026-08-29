package j7;
public final class z1 implements s9.d {
    public static final z1 f11270a = new Object();
    public static final s9.c f11271b = new s9.c("errorCode", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(1))));
    public static final s9.c f11272c = new s9.c("isColdCall", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(2))));
    public static final s9.c d = new s9.c("imageInfo", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(3))));
    public static final s9.c f11273e = new s9.c("detectorOptions", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(f11271b, w0Var.f11238a);
        eVar.e(f11272c, w0Var.f11239b);
        eVar.e(d, null);
        eVar.e(f11273e, w0Var.f11240c);
    }
}
