package defpackage;

import java.util.Locale;
import org.telegram.messenger.Utilities;
public final class lg0 implements Runnable {
    public final byte a;
    public final sa6 b;
    public final String c;

    public lg0(sa6 sa6Var, String str, byte b) {
        this.a = b;
        this.b = sa6Var;
        this.c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.a) {
            case 0:
                sa6 sa6Var = this.b;
                String str = this.c;
                sa6Var.getClass();
                gl.d3(new lg0(sa6Var, str, (byte) 1));
                return;
            default:
                sa6 sa6Var2 = this.b;
                String str2 = this.c;
                Locale locale2 = null;
                sa6Var2.r = null;
                int i = sa6Var2.s + 1;
                sa6Var2.s = i;
                Locale locale3 = k96.D0().y;
                if (sa6Var2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.e.c(new i57(sa6Var2, locale3, str2, locale, i, (byte) 5));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.e.c(new i57(sa6Var2, locale3, str2, locale, i, (byte) 5));
                return;
        }
    }
}
