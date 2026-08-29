package oc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import le.p;
import le.s;
public final class k extends h {
    public static final Pattern f19497e = Pattern.compile(" *$");

    @Override
    public final p b() {
        int i10;
        this.d++;
        p pVar = (p) this.f19480b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f15210g.endsWith(" ")) {
                String str = sVar.f15210g;
                Matcher matcher = f19497e.matcher(str);
                if (matcher.find()) {
                    i10 = matcher.end() - matcher.start();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    sVar.f15210g = com.google.android.recaptcha.internal.a.m(str, i10, 0);
                }
                if (i10 >= 2) {
                    return new le.g(1);
                }
                return new le.g(2);
            }
        }
        return new le.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
