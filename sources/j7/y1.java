package j7;
public final class y1 implements s9.d {
    public static final y1 f11262a = new Object();
    public static final s9.c f11263b = new s9.c("logEventKey", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(1))));
    public static final s9.c f11264c = new s9.c("eventCount", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(2))));
    public static final s9.c d = new s9.c("inferenceDurationStats", u3.c.h(com.google.android.recaptcha.internal.a.r(h0.class, new e0(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        x0 x0Var = (x0) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(f11263b, x0Var.f11248a);
        eVar.e(f11264c, x0Var.f11249b);
        eVar.e(d, x0Var.f11250c);
    }
}
