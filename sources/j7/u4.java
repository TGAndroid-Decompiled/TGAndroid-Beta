package j7;
public final class u4 implements s9.d {
    public static final u4 f11210a = new Object();
    public static final s9.c f11211b = new s9.c("detectorOptions", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(1))));
    public static final s9.c f11212c = new s9.c("errorCodes", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(2))));
    public static final s9.c d = new s9.c("totalInitializationMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(3))));
    public static final s9.c f11213e = new s9.c("loggingInitializationMs", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(4))));
    public static final s9.c f11214f = new s9.c("otherErrors", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        m8 m8Var = (m8) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(f11211b, m8Var.f11107a);
        eVar.e(f11212c, m8Var.f11108b);
        eVar.e(d, null);
        eVar.e(f11213e, null);
        eVar.e(f11214f, null);
    }
}
