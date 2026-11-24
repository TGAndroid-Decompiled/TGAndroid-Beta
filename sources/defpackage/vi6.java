package defpackage;

import java.util.regex.Pattern;
public final class vi6 extends tn5 {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final tg6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        ?? tg6Var = new tg6();
        tg6Var.g = ir2.n(1, 1, a);
        return tg6Var;
    }

    @Override
    public final char c() {
        return '$';
    }
}
