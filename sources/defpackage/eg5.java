package defpackage;

import java.util.regex.Pattern;
public final class eg5 extends tn5 {
    public static final Pattern e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override
    public final tg6 b() {
        String a = a(e);
        if (a != null) {
            cj2 cj2Var = new cj2((byte) 1);
            cj2Var.h = a;
            return cj2Var;
        }
        return null;
    }

    @Override
    public final char c() {
        return '<';
    }
}
