package hd;

import a8.tb;
import c3.h0;
import ef.p;
import java.util.regex.Pattern;
public final class c extends h {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f12771f = Pattern.compile("^`+");

    @Override
    public final p b() {
        String a2;
        String a10 = a(f12771f);
        if (a10 == null) {
            return null;
        }
        int i10 = this.d;
        do {
            a2 = a(e);
            if (a2 == null) {
                this.d = i10;
                return f(a10);
            }
        } while (!a2.equals(a10));
        ef.d dVar = new ef.d(0);
        String replace = this.f12774c.substring(i10, this.d - a10.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (tb.b(' ', replace, 0, length) != length) {
                replace = h0.l(1, 1, replace);
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
