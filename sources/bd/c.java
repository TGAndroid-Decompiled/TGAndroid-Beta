package bd;

import b8.ec;
import gf.p;
import java.util.regex.Pattern;
public final class c extends h {
    public static final Pattern f3223e = Pattern.compile("`+");
    public static final Pattern f3224f = Pattern.compile("^`+");

    @Override
    public final p b() {
        String a10;
        String a11 = a(f3224f);
        if (a11 == null) {
            return null;
        }
        int i3 = this.d;
        do {
            a10 = a(f3223e);
            if (a10 == null) {
                this.d = i3;
                return f(a11);
            }
        } while (!a10.equals(a11));
        gf.d dVar = new gf.d(0);
        String replace = this.f3231c.substring(i3, this.d - a11.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (ec.b(' ', 0, length, replace) != length) {
                replace = com.google.android.recaptcha.internal.a.j(replace, 1, 1);
            }
        }
        dVar.h = replace;
        return dVar;
    }

    @Override
    public final char d() {
        return '`';
    }
}
