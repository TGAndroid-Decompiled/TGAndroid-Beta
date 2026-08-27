package nc;

import java.util.regex.Pattern;
import je.p;

public final class g extends h {

    public static final Pattern f18454e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override
    public final p b() {
        String strA = a(f18454e);
        if (strA == null) {
            return null;
        }
        je.d dVar = new je.d(1);
        dVar.h = strA;
        return dVar;
    }

    @Override
    public final char d() {
        return '<';
    }
}
