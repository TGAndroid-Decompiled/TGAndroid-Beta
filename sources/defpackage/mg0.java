package defpackage;

import java.util.Locale;
import org.telegram.messenger.Utilities;
public final class mg0 implements Runnable {
    public final byte a;
    public final wc6 b;
    public final String c;

    public mg0(wc6 wc6Var, String str, byte b) {
        this.a = b;
        this.b = wc6Var;
        this.c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.a) {
            case 0:
                wc6 wc6Var = this.b;
                String str = this.c;
                wc6Var.getClass();
                hl.c3(new mg0(wc6Var, str, (byte) 1));
                return;
            default:
                wc6 wc6Var2 = this.b;
                String str2 = this.c;
                Locale locale2 = null;
                wc6Var2.r = null;
                int i = wc6Var2.s + 1;
                wc6Var2.s = i;
                Locale locale3 = ob6.D0().y;
                if (wc6Var2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.e.c(new l77(wc6Var2, locale3, str2, locale, i, (byte) 5));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.e.c(new l77(wc6Var2, locale3, str2, locale, i, (byte) 5));
                return;
        }
    }
}
