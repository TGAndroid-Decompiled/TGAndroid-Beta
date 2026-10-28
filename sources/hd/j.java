package hd;

import c3.h0;
import ef.p;
import ef.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override
    public final p b() {
        int i10;
        this.d++;
        p pVar = (p) this.f12773b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f9940g.endsWith(" ")) {
                String str = sVar.f9940g;
                Matcher matcher = e.matcher(str);
                if (matcher.find()) {
                    i10 = matcher.end() - matcher.start();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    sVar.f9940g = h0.l(i10, 0, str);
                }
                if (i10 >= 2) {
                    return new ef.g(1);
                }
                return new ef.g(2);
            }
        }
        return new ef.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
