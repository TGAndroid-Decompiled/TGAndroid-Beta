package ic;

import java.util.regex.Pattern;
import je.p;
import nc.h;

public final class c extends h {

    public static final Pattern f11115e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String strA = a(f11115e);
        if (strA == null) {
            return null;
        }
        d dVar = new d();
        dVar.f11116g = com.google.android.recaptcha.internal.a.n(strA, 2, 2);
        return dVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
