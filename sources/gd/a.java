package gd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import df.s;
import java.util.regex.Pattern;
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f10992f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String j10 = k3.j(1, 1, a2);
            df.k kVar = new df.k(1, r4.c.h("mailto:", j10), null);
            kVar.b(new s(j10));
            return kVar;
        }
        String a10 = a(f10992f);
        if (a10 == null) {
            return null;
        }
        String j11 = k3.j(1, 1, a10);
        df.k kVar2 = new df.k(1, j11, null);
        kVar2.b(new s(j11));
        return kVar2;
    }

    @Override
    public final char d() {
        return '<';
    }
}
