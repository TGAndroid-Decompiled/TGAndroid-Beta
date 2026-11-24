package defpackage;

import java.util.Locale;
import org.telegram.messenger.Utilities;
public final class mh0 implements Runnable {
    public final byte a;
    public final rc6 b;
    public final String c;

    public mh0(rc6 rc6Var, String str, byte b) {
        this.a = b;
        this.b = rc6Var;
        this.c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.a) {
            case 0:
                rc6 rc6Var = this.b;
                String str = this.c;
                rc6Var.getClass();
                gm.c3(new mh0(rc6Var, str, (byte) 1));
                return;
            default:
                rc6 rc6Var2 = this.b;
                String str2 = this.c;
                Locale locale2 = null;
                rc6Var2.r = null;
                int i = rc6Var2.s + 1;
                rc6Var2.s = i;
                Locale locale3 = jb6.D0().y;
                if (rc6Var2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.e.c(new i77(rc6Var2, locale3, str2, locale, i, (byte) 5));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.e.c(new i77(rc6Var2, locale3, str2, locale, i, (byte) 5));
                return;
        }
    }
}
