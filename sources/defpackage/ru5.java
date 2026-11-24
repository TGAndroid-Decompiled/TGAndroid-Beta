package defpackage;

import java.util.regex.Pattern;
public final class ru5 extends tp5 {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final ui6 b() {
        String a = a(e);
        if (a == null) {
            return null;
        }
        ?? ui6Var = new ui6();
        ui6Var.g = ts2.m(2, 2, a);
        return ui6Var;
    }

    @Override
    public final char c() {
        return '$';
    }
}
