package jg;

import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
public final class a implements Runnable {
    public final int f17013a;
    public final c f17014b;
    public final String f17015c;

    public a(c cVar, String str, int i7) {
        this.f17013a = i7;
        this.f17014b = cVar;
        this.f17015c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.f17013a) {
            case 0:
                c cVar = this.f17014b;
                String str = this.f17015c;
                cVar.getClass();
                org.telegram.messenger.g0.h3(new a(cVar, str, 1));
                return;
            default:
                c cVar2 = this.f17014b;
                String str2 = this.f17015c;
                Locale locale2 = null;
                cVar2.f17025r = null;
                int i7 = cVar2.f17026s + 1;
                cVar2.f17026s = i7;
                Locale locale3 = hd.E0().f24132y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.f22416e.c(new ai.g1(cVar2, locale3, str2, locale, i7, 3));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.f22416e.c(new ai.g1(cVar2, locale3, str2, locale, i7, 3));
                return;
        }
    }
}
