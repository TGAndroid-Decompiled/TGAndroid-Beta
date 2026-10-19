package gd;

import com.google.android.gms.internal.play_billing.k3;
import df.p;
import df.s;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override
    public final p b() {
        int i10;
        this.d++;
        p pVar = (p) this.f10997b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f7990g.endsWith(" ")) {
                String str = sVar.f7990g;
                Matcher matcher = e.matcher(str);
                if (matcher.find()) {
                    i10 = matcher.end() - matcher.start();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    sVar.f7990g = k3.j(i10, 0, str);
                }
                if (i10 >= 2) {
                    return new df.g(1);
                }
                return new df.g(2);
            }
        }
        return new df.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
