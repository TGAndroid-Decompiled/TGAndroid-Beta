package mc;

import ie.p;
import java.util.regex.Pattern;
public final class g extends h {
    public static final Pattern f17618e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override
    public final p b() {
        String a2 = a(f17618e);
        if (a2 != null) {
            ie.d dVar = new ie.d(1);
            dVar.h = a2;
            return dVar;
        }
        return null;
    }

    @Override
    public final char d() {
        return '<';
    }
}
