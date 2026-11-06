package jg;

import bi.ub;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
public final class a implements Runnable {
    public final int f16658a;
    public final c f16659b;
    public final String f16660c;

    public a(c cVar, String str, int i7) {
        this.f16658a = i7;
        this.f16659b = cVar;
        this.f16660c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.f16658a) {
            case 0:
                c cVar = this.f16659b;
                String str = this.f16660c;
                cVar.getClass();
                org.telegram.messenger.g0.h3(new a(cVar, str, 1));
                return;
            default:
                c cVar2 = this.f16659b;
                String str2 = this.f16660c;
                Locale locale2 = null;
                cVar2.f16673r = null;
                int i7 = cVar2.f16674s + 1;
                cVar2.f16674s = i7;
                Locale locale3 = hd.E0().f22906y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.f21333e.c(new ub(cVar2, locale3, str2, locale, i7));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.f21333e.c(new ub(cVar2, locale3, str2, locale, i7));
                return;
        }
    }
}
