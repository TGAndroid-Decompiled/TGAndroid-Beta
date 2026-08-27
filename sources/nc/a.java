package nc;

import java.util.regex.Pattern;
import je.p;
import je.s;

public final class a extends h {

    public static final Pattern f18446e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");

    public static final Pattern f18447f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final p b() {
        String strA = a(f18446e);
        if (strA != null) {
            String strN = com.google.android.recaptcha.internal.a.n(strA, 1, 1);
            je.k kVar = new je.k(1, s3.c.e("mailto:", strN), null);
            kVar.b(new s(strN));
            return kVar;
        }
        String strA2 = a(f18447f);
        if (strA2 == null) {
            return null;
        }
        String strN2 = com.google.android.recaptcha.internal.a.n(strA2, 1, 1);
        je.k kVar2 = new je.k(1, strN2, null);
        kVar2.b(new s(strN2));
        return kVar2;
    }

    @Override
    public final char d() {
        return '<';
    }
}
