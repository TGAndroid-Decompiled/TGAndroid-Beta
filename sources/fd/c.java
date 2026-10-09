package fd;

import cf.p;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Pattern;
import v7.i0;
public final class c extends h {
    public static final Pattern f9858e = Pattern.compile("`+");
    public static final Pattern f9859f = Pattern.compile("^`+");

    @Override
    public final p b() {
        String a2;
        String a10 = a(f9859f);
        if (a10 == null) {
            return null;
        }
        int i10 = this.d;
        do {
            a2 = a(f9858e);
            if (a2 == null) {
                this.d = i10;
                return f(a10);
            }
        } while (!a2.equals(a10));
        cf.d dVar = new cf.d(0);
        String replace = this.f9866c.substring(i10, this.d - a10.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (i0.b(' ', replace, 0, length) != length) {
                replace = e2.i(1, 1, replace);
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
