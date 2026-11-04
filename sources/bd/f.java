package bd;

import gf.p;
import java.util.regex.Pattern;
public final class f extends h {
    public static final Pattern f3227e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override
    public final p b() {
        String a10 = a(f3227e);
        if (a10 != null) {
            return f(ff.b.a(a10));
        }
        return null;
    }

    @Override
    public final char d() {
        return '&';
    }
}
