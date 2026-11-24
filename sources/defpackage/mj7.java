package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class mj7 extends tn5 {
    public static final Pattern e = Pattern.compile(" *$");

    @Override
    public final tg6 b() {
        int i;
        this.d++;
        tg6 tg6Var = (tg6) this.b.d;
        if (tg6Var instanceof ugb) {
            ugb ugbVar = (ugb) tg6Var;
            if (ugbVar.g.endsWith(" ")) {
                String str = ugbVar.g;
                Matcher matcher = e.matcher(str);
                if (matcher.find()) {
                    i = matcher.end() - matcher.start();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    ugbVar.g = ir2.n(i, 0, str);
                }
                if (i >= 2) {
                    return new u14((byte) 1);
                }
                return new u14((byte) 2);
            }
        }
        return new u14((byte) 2);
    }

    @Override
    public final char c() {
        return '\n';
    }
}
