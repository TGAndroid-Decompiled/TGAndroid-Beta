package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class pl7 extends tp5 {
    public static final Pattern e = Pattern.compile(" *$");

    @Override
    public final ui6 b() {
        int i;
        this.d++;
        ui6 ui6Var = (ui6) this.b.d;
        if (ui6Var instanceof vib) {
            vib vibVar = (vib) ui6Var;
            if (vibVar.g.endsWith(" ")) {
                String str = vibVar.g;
                Matcher matcher = e.matcher(str);
                if (matcher.find()) {
                    i = matcher.end() - matcher.start();
                } else {
                    i = 0;
                }
                if (i > 0) {
                    vibVar.g = ts2.m(i, 0, str);
                }
                if (i >= 2) {
                    return new f34((byte) 1);
                }
                return new f34((byte) 2);
            }
        }
        return new f34((byte) 2);
    }

    @Override
    public final char c() {
        return '\n';
    }
}
