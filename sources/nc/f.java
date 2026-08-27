package nc;

import java.util.regex.Pattern;
import je.p;

public final class f extends h {

    public static final Pattern f18453e = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    @Override
    public final p b() {
        String strA = a(f18453e);
        if (strA != null) {
            return f(ie.b.a(strA));
        }
        return null;
    }

    @Override
    public final char d() {
        return '&';
    }
}
