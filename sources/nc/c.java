package nc;

import g7.j8;
import java.util.regex.Pattern;
import je.p;

public final class c extends h {

    public static final Pattern f18449e = Pattern.compile("`+");

    public static final Pattern f18450f = Pattern.compile("^`+");

    @Override
    public final p b() {
        String strA;
        String strA2 = a(f18450f);
        if (strA2 == null) {
            return null;
        }
        int i10 = this.d;
        do {
            strA = a(f18449e);
            if (strA == null) {
                this.d = i10;
                return f(strA2);
            }
        } while (!strA.equals(strA2));
        je.d dVar = new je.d(0);
        String strReplace = this.f18457c.substring(i10, this.d - strA2.length()).replace('\n', ' ');
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
            int length = strReplace.length();
            if (j8.b(' ', strReplace, 0, length) != length) {
                strReplace = com.google.android.recaptcha.internal.a.n(strReplace, 1, 1);
            }
        }
        dVar.h = strReplace;
        return dVar;
    }

    @Override
    public final char d() {
        return '`';
    }
}
