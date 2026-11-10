package ed;

import java.util.regex.Pattern;
import kf.p;
import kf.s;
public final class a extends h {
    public static final Pattern f10740e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f10741f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final p b() {
        String a10 = a(f10740e);
        if (a10 != null) {
            String k10 = com.google.android.recaptcha.internal.a.k(a10, 1, 1);
            kf.k kVar = new kf.k(1, rf.b.i("mailto:", k10), null);
            kVar.b(new s(k10));
            return kVar;
        }
        String a11 = a(f10741f);
        if (a11 == null) {
            return null;
        }
        String k11 = com.google.android.recaptcha.internal.a.k(a11, 1, 1);
        kf.k kVar2 = new kf.k(1, k11, null);
        kVar2.b(new s(k11));
        return kVar2;
    }

    @Override
    public final char d() {
        return '<';
    }
}
