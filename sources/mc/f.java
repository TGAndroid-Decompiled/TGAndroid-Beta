package mc;

import ie.p;
import java.util.regex.Pattern;
public final class f extends h {
    public static final Pattern f17617e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override
    public final p b() {
        String a2 = a(f17617e);
        if (a2 != null) {
            return f(he.b.a(a2));
        }
        return null;
    }

    @Override
    public final char d() {
        return '&';
    }
}
