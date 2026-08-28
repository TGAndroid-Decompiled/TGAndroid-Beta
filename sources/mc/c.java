package mc;

import f7.e8;
import ie.p;
import java.util.regex.Pattern;
public final class c extends h {
    public static final Pattern f17613e = Pattern.compile("`+");
    public static final Pattern f17614f = Pattern.compile("^`+");

    @Override
    public final p b() {
        String a2;
        String a3 = a(f17614f);
        if (a3 == null) {
            return null;
        }
        int i9 = this.d;
        do {
            a2 = a(f17613e);
            if (a2 == null) {
                this.d = i9;
                return f(a3);
            }
        } while (!a2.equals(a3));
        ie.d dVar = new ie.d(0);
        String replace = this.f17621c.substring(i9, this.d - a3.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (e8.b(' ', replace, 0, length) != length) {
                replace = e2.c.m(replace, 1, 1);
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
