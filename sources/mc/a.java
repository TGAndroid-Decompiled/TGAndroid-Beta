package mc;

import ie.p;
import ie.s;
import java.util.regex.Pattern;
public final class a extends h {
    public static final Pattern f17610e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f17611f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final p b() {
        String a2 = a(f17610e);
        if (a2 != null) {
            String m10 = e2.c.m(a2, 1, 1);
            ie.k kVar = new ie.k(1, ta.b.d("mailto:", m10), null);
            kVar.b(new s(m10));
            return kVar;
        }
        String a3 = a(f17611f);
        if (a3 == null) {
            return null;
        }
        String m11 = e2.c.m(a3, 1, 1);
        ie.k kVar2 = new ie.k(1, m11, null);
        kVar2.b(new s(m11));
        return kVar2;
    }

    @Override
    public final char d() {
        return '<';
    }
}
