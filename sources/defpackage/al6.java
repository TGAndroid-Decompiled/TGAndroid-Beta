package defpackage;

import java.util.regex.Pattern;
public final class al6 extends wp5 {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final yi6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        ?? yi6Var = new yi6();
        yi6Var.g = bs2.n(1, 1, a);
        return yi6Var;
    }

    @Override
    public final char c() {
        return '$';
    }
}
