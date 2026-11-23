package ed;

import com.google.android.gms.internal.vision.e2;
import java.util.regex.Pattern;
import kf.p;
import kf.s;
public final class a extends h {
    public static final Pattern f10879e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f10880f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final p b() {
        String a10 = a(f10879e);
        if (a10 != null) {
            String k10 = e2.k(a10, 1, 1);
            kf.k kVar = new kf.k(1, p5.c.k("mailto:", k10), null);
            kVar.b(new s(k10));
            return kVar;
        }
        String a11 = a(f10880f);
        if (a11 == null) {
            return null;
        }
        String k11 = e2.k(a11, 1, 1);
        kf.k kVar2 = new kf.k(1, k11, null);
        kVar2.b(new s(k11));
        return kVar2;
    }

    @Override
    public final char d() {
        return '<';
    }
}
