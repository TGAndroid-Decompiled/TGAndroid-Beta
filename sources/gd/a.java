package gd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import df.s;
import java.util.regex.Pattern;
import si.o0;
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f11011f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String i10 = k3.i(1, 1, a2);
            df.k kVar = new df.k(1, o0.h("mailto:", i10), null);
            kVar.b(new s(i10));
            return kVar;
        }
        String a10 = a(f11011f);
        if (a10 == null) {
            return null;
        }
        String i11 = k3.i(1, 1, a10);
        df.k kVar2 = new df.k(1, i11, null);
        kVar2.b(new s(i11));
        return kVar2;
    }

    @Override
    public final char d() {
        return '<';
    }
}
