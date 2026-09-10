package ed;

import bf.p;
import bf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override
    public final p b() {
        int i10;
        this.d++;
        p pVar = (p) this.f7455b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f2249g.endsWith(" ")) {
                String str = sVar.f2249g;
                Matcher matcher = e.matcher(str);
                if (matcher.find()) {
                    i10 = matcher.end() - matcher.start();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    sVar.f2249g = e2.h(i10, 0, str);
                }
                if (i10 >= 2) {
                    return new bf.g(1);
                }
                return new bf.g(2);
            }
        }
        return new bf.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
