package ed;

import java.util.regex.Pattern;
import kf.p;
public final class g extends h {
    public static final Pattern f10748e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override
    public final p b() {
        String a10 = a(f10748e);
        if (a10 != null) {
            kf.d dVar = new kf.d(1);
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
