package defpackage;

import java.util.regex.Pattern;
public final class ss5 extends tn5 {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final tg6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        ?? tg6Var = new tg6();
        tg6Var.g = ir2.n(2, 2, a);
        return tg6Var;
    }

    @Override
    public final char c() {
        return '$';
    }
}
