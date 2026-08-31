package lc;

import java.util.regex.Pattern;
import ne.p;
import qc.h;
public final class c extends h {
    public static final Pattern f12277e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String a2 = a(f12277e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new p();
        pVar.f12278g = e2.c.j(a2, 2, 2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
