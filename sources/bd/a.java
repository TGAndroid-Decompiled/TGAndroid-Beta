package bd;

import gf.p;
import gf.s;
import java.util.regex.Pattern;
public final class a extends h {
    public static final Pattern f3220e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f3221f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final p b() {
        String a10 = a(f3220e);
        if (a10 != null) {
            String j10 = com.google.android.recaptcha.internal.a.j(a10, 1, 1);
            gf.k kVar = new gf.k(1, t4.c.f("mailto:", j10), null);
            kVar.b(new s(j10));
            return kVar;
        }
        String a11 = a(f3221f);
        if (a11 == null) {
            return null;
        }
        String j11 = com.google.android.recaptcha.internal.a.j(a11, 1, 1);
        gf.k kVar2 = new gf.k(1, j11, null);
        kVar2.b(new s(j11));
        return kVar2;
    }

    @Override
    public final char d() {
        return '<';
    }
}
