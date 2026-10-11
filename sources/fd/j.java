package fd;

import cf.p;
import cf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class j extends h {
    public static final Pattern f9878e = Pattern.compile(" *$");

    @Override
    public final p b() {
        int i10;
        this.d++;
        p pVar = (p) this.f9864b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f4656g.endsWith(" ")) {
                String str = sVar.f4656g;
                Matcher matcher = f9878e.matcher(str);
                if (matcher.find()) {
                    i10 = matcher.end() - matcher.start();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    sVar.f4656g = e2.i(i10, 0, str);
                }
                if (i10 >= 2) {
                    return new cf.g(1);
                }
                return new cf.g(2);
            }
        }
        return new cf.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
