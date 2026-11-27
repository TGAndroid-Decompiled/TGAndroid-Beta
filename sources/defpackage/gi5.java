package defpackage;

import java.util.regex.Pattern;
public final class gi5 extends wp5 {
    public static final Pattern e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override
    public final yi6 b() {
        String a = a(e);
        if (a != null) {
            yj2 yj2Var = new yj2((byte) 1);
            yj2Var.h = a;
            return yj2Var;
        }
        return null;
    }

    @Override
    public final char c() {
        return '<';
    }
}
