package bd;

import gf.p;
import java.util.regex.Pattern;
public final class g extends h {
    public static final Pattern f3228e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override
    public final p b() {
        String a10 = a(f3228e);
        if (a10 != null) {
            gf.d dVar = new gf.d(1);
            dVar.h = a10;
            return dVar;
        }
        return null;
    }

    @Override
    public final char d() {
        return '<';
    }
}
