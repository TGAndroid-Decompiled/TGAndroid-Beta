package g7;

public final class w2 implements r9.d {

    public static final w2 f6625a = new w2();

    public static final r9.c f6626b = new r9.c("identifyLanguageConfidenceThreshold", s3.c.h(com.google.android.recaptcha.internal.a.q(i.class, new e(1))));

    public static final r9.c f6627c = new r9.c("identifyAllLanguagesConfidenceThreshold", s3.c.h(com.google.android.recaptcha.internal.a.q(i.class, new e(2))));
    public static final r9.c d = new r9.c("confidenceThreshold", s3.c.h(com.google.android.recaptcha.internal.a.q(i.class, new e(3))));

    @Override
    public final void a(Object obj, Object obj2) {
        r9.e eVar = (r9.e) obj2;
        eVar.a(f6626b, null);
        eVar.a(f6627c, null);
        eVar.a(d, ((h6) obj).f6497a);
    }
}
