package oc;

import java.util.regex.Pattern;
import le.p;
public final class g extends h {
    public static final Pattern f19478e = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);

    @Override
    public final p b() {
        String a2 = a(f19478e);
        if (a2 != null) {
            le.d dVar = new le.d(1);
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
