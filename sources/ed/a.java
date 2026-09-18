package ed;

import bf.p;
import bf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Pattern;
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f8151f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String i10 = e2.i(1, 1, a2);
            bf.k kVar = new bf.k(1, t8.b.i("mailto:", i10), null);
            kVar.b(new s(i10));
            return kVar;
        }
        String a10 = a(f8151f);
        if (a10 == null) {
            return null;
        }
        String i11 = e2.i(1, 1, a10);
        bf.k kVar2 = new bf.k(1, i11, null);
        kVar2.b(new s(i11));
        return kVar2;
    }

    @Override
    public final char d() {
        return '<';
    }
}
