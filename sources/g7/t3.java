package g7;

public final class t3 implements r9.d {

    public static final t3 f6605a = new t3();

    public static final r9.c f6606b = new r9.c("inferenceCommonLogEvent", s3.c.h(com.google.android.recaptcha.internal.a.q(i.class, new e(1))));

    public static final r9.c f6607c = new r9.c("options", s3.c.h(com.google.android.recaptcha.internal.a.q(i.class, new e(2))));
    public static final r9.c d = new r9.c("identifyLanguageResult", s3.c.h(com.google.android.recaptcha.internal.a.q(i.class, new e(3))));

    public static final r9.c f6608e = new r9.c("identifyPossibleLanguagesResult", s3.c.h(com.google.android.recaptcha.internal.a.q(i.class, new e(4))));

    @Override
    public final void a(Object obj, Object obj2) {
        h7 h7Var = (h7) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(f6606b, h7Var.f6498a);
        eVar.a(f6607c, h7Var.f6499b);
        eVar.a(d, h7Var.f6500c);
        eVar.a(f6608e, null);
    }
}
