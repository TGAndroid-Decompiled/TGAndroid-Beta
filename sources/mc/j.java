package mc;

import ie.p;
import ie.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class j extends h {
    public static final Pattern f17634e = Pattern.compile(" *$");

    @Override
    public final p b() {
        int i9;
        this.d++;
        p pVar = (p) this.f17620b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f11127g.endsWith(" ")) {
                String str = sVar.f11127g;
                Matcher matcher = f17634e.matcher(str);
                if (matcher.find()) {
                    i9 = matcher.end() - matcher.start();
                } else {
                    i9 = 0;
                }
                if (i9 > 0) {
                    sVar.f11127g = e2.c.m(str, i9, 0);
                }
                if (i9 >= 2) {
                    return new ie.g(1);
                }
                return new ie.g(2);
            }
        }
        return new ie.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
