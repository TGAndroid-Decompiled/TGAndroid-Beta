package jg;

import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
public final class a implements Runnable {
    public final int f17390a;
    public final c f17391b;
    public final String f17392c;

    public a(c cVar, String str, int i7) {
        this.f17390a = i7;
        this.f17391b = cVar;
        this.f17392c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.f17390a) {
            case 0:
                c cVar = this.f17391b;
                String str = this.f17392c;
                cVar.getClass();
                org.telegram.messenger.g0.g3(new a(cVar, str, 1));
                return;
            default:
                c cVar2 = this.f17391b;
                String str2 = this.f17392c;
                Locale locale2 = null;
                cVar2.f17402r = null;
                int i7 = cVar2.f17403s + 1;
                cVar2.f17403s = i7;
                Locale locale3 = hd.E0().f24436y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.f22774e.c(new ai.c1(cVar2, locale3, str2, locale, i7, 3));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.f22774e.c(new ai.c1(cVar2, locale3, str2, locale, i7, 3));
                return;
        }
    }
}
