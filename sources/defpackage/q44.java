package defpackage;

import java.util.regex.Pattern;
public final class q44 extends tp5 {
    public static final Pattern e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override
    public final ui6 b() {
        String a = a(e);
        if (a != null) {
            return e(ai5.a(a));
        }
        return null;
    }

    @Override
    public final char c() {
        return '&';
    }
}
