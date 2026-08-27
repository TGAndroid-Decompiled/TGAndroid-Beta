package nc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import je.p;
import je.s;

public final class j extends h {

    public static final Pattern f18470e = Pattern.compile(" *$");

    @Override
    public final p b() {
        this.d++;
        p pVar = (p) this.f18456b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f12929g.endsWith(" ")) {
                String str = sVar.f12929g;
                Matcher matcher = f18470e.matcher(str);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    sVar.f12929g = com.google.android.recaptcha.internal.a.n(str, iEnd, 0);
                }
                return iEnd >= 2 ? new je.g(1) : new je.g(2);
            }
        }
        return new je.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
