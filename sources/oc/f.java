package oc;

import java.util.regex.Pattern;
import le.p;
public final class f extends h {
    public static final Pattern f19477e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override
    public final p b() {
        String a2 = a(f19477e);
        if (a2 != null) {
            return f(ke.b.a(a2));
        }
        return null;
    }

    @Override
    public final char d() {
        return '&';
    }
}
