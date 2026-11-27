package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class ul7 extends wp5 {
    public static final Pattern e = Pattern.compile(" *$");

    @Override
    public final yi6 b() {
        int i;
        this.d++;
        yi6 yi6Var = (yi6) this.b.d;
        if (yi6Var instanceof qkb) {
            qkb qkbVar = (qkb) yi6Var;
            if (qkbVar.g.endsWith(" ")) {
                String str = qkbVar.g;
                Matcher matcher = e.matcher(str);
                if (matcher.find()) {
                    i = matcher.end() - matcher.start();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    qkbVar.g = bs2.n(i, 0, str);
                }
                if (i >= 2) {
                    return new p24((byte) 1);
                }
                return new p24((byte) 2);
            }
        }
        return new p24((byte) 2);
    }

    @Override
    public final char c() {
        return '\n';
    }
}
