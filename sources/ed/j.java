package ed;

import com.google.android.gms.internal.vision.e2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kf.p;
import kf.s;
public final class j extends h {
    public static final Pattern f10910e = Pattern.compile(" *$");

    @Override
    public final p b() {
        int i7;
        this.d++;
        p pVar = (p) this.f10896b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f18237g.endsWith(" ")) {
                String str = sVar.f18237g;
                Matcher matcher = f10910e.matcher(str);
                if (matcher.find()) {
                    i7 = matcher.end() - matcher.start();
                } else {
                    i7 = 0;
                }
                if (i7 > 0) {
                    sVar.f18237g = e2.k(str, i7, 0);
                }
                if (i7 >= 2) {
                    return new kf.g(1);
                }
                return new kf.g(2);
            }
        }
        return new kf.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
