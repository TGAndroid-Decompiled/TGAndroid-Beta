package gd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import java.util.regex.Pattern;
import v7.f5;
public final class c extends h {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f10086f = Pattern.compile("^`+");

    @Override
    public final p b() {
        String a2;
        String a10 = a(f10086f);
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
        df.d dVar = new df.d(0);
        String replace = this.f10089c.substring(i10, this.d - a10.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (f5.b(' ', replace, 0, length) != length) {
                replace = k3.j(1, 1, replace);
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
