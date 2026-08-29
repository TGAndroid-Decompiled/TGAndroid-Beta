package j7;
public final class l3 implements s9.d {
    public static final l3 f11075a = new Object();
    public static final s9.c f11076b = new s9.c("maxMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(1))));
    public static final s9.c f11077c = new s9.c("minMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(2))));
    public static final s9.c d = new s9.c("avgMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(3))));
    public static final s9.c f11078e = new s9.c("firstQuartileMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(4))));
    public static final s9.c f11079f = new s9.c("medianMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(5))));
    public static final s9.c f11080g = new s9.c("thirdQuartileMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        g7 g7Var = (g7) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(f11076b, g7Var.f11019a);
        eVar.e(f11077c, g7Var.f11020b);
        eVar.e(d, g7Var.f11021c);
        eVar.e(f11078e, g7Var.d);
        eVar.e(f11079f, g7Var.f11022e);
        eVar.e(f11080g, g7Var.f11023f);
    }
}
