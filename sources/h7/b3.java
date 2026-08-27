package h7;

public final class b3 implements r9.d {

    public static final b3 f8301a = new b3();

    public static final r9.c f8302b = new r9.c("durationMs", s3.c.h(com.google.android.recaptcha.internal.a.r(d.class, new a(1))));

    public static final r9.c f8303c = new r9.c("imageSource", s3.c.h(com.google.android.recaptcha.internal.a.r(d.class, new a(2))));
    public static final r9.c d = new r9.c("imageFormat", s3.c.h(com.google.android.recaptcha.internal.a.r(d.class, new a(3))));

    public static final r9.c f8304e = new r9.c("imageByteSize", s3.c.h(com.google.android.recaptcha.internal.a.r(d.class, new a(4))));

    public static final r9.c f8305f = new r9.c("imageWidth", s3.c.h(com.google.android.recaptcha.internal.a.r(d.class, new a(5))));

    public static final r9.c f8306g = new r9.c("imageHeight", s3.c.h(com.google.android.recaptcha.internal.a.r(d.class, new a(6))));
    public static final r9.c h = new r9.c("rotationDegrees", s3.c.h(com.google.android.recaptcha.internal.a.r(d.class, new a(7))));

    @Override
    public final void a(Object obj, Object obj2) {
        d7 d7Var = (d7) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f8302b, d7Var.f8324a);
        eVar.a(f8303c, d7Var.f8325b);
        eVar.a(d, d7Var.f8326c);
        eVar.a(f8304e, d7Var.d);
        eVar.a(f8305f, d7Var.f8327e);
        eVar.a(f8306g, d7Var.f8328f);
        eVar.a(h, d7Var.f8329g);
    }
}
