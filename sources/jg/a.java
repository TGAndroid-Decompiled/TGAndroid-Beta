package jg;

import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
public final class a implements Runnable {
    public final int f17396a;
    public final c f17397b;
    public final String f17398c;

    public a(c cVar, String str, int i7) {
        this.f17396a = i7;
        this.f17397b = cVar;
        this.f17398c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.f17396a) {
            case 0:
                c cVar = this.f17397b;
                String str = this.f17398c;
                cVar.getClass();
                org.telegram.messenger.g0.g3(new a(cVar, str, 1));
                return;
            default:
                c cVar2 = this.f17397b;
                String str2 = this.f17398c;
                Locale locale2 = null;
                cVar2.f17408r = null;
                int i7 = cVar2.f17409s + 1;
                cVar2.f17409s = i7;
                Locale locale3 = gd.E0().f24241y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.f22779e.c(new ai.g1(cVar2, locale3, str2, locale, i7, 3));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.f22779e.c(new ai.g1(cVar2, locale3, str2, locale, i7, 3));
                return;
        }
    }
}
