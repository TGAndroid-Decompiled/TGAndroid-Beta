package bd;

import gf.p;
import gf.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class k extends h {
    public static final Pattern f3247e = Pattern.compile(" *$");

    @Override
    public final p b() {
        int i3;
        this.d++;
        p pVar = (p) this.f3230b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f12271g.endsWith(" ")) {
                String str = sVar.f12271g;
                Matcher matcher = f3247e.matcher(str);
                if (matcher.find()) {
                    i3 = matcher.end() - matcher.start();
                } else {
                    i3 = 0;
                }
                if (i3 > 0) {
                    sVar.f12271g = com.google.android.recaptcha.internal.a.j(str, i3, 0);
                }
                if (i3 >= 2) {
                    return new gf.g(1);
                }
                return new gf.g(2);
            }
        }
        return new gf.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
