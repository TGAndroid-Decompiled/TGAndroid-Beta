package defpackage;

import java.util.regex.Pattern;
public final class yk6 extends tp5 {
    public static final Pattern e = Pattern.compile("\\$([^\\s\\$][^\\$]*?)(?<!\\s)\\$(?![0-9])");

    @Override
    public final ui6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        ?? ui6Var = new ui6();
        ui6Var.g = ts2.m(1, 1, a);
        return ui6Var;
    }

    @Override
    public final char c() {
        return '$';
    }
}
