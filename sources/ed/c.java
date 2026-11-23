package ed;

import c8.a1;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Pattern;
import kf.p;
public final class c extends h {
    public static final Pattern f10921e = Pattern.compile("`+");
    public static final Pattern f10922f = Pattern.compile("^`+");

    @Override
    public final p b() {
        String a10;
        String a11 = a(f10922f);
        if (a11 == null) {
            return null;
        }
        int i7 = this.d;
        do {
            a10 = a(f10921e);
            if (a10 == null) {
                this.d = i7;
                return f(a11);
            }
        } while (!a10.equals(a11));
        kf.d dVar = new kf.d(0);
        String replace = this.f10929c.substring(i7, this.d - a11.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (a1.b(' ', 0, length, replace) != length) {
                replace = e2.k(replace, 1, 1);
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
