package jg;

import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
public final class a implements Runnable {
    public final int f17492a;
    public final c f17493b;
    public final String f17494c;

    public a(c cVar, String str, int i7) {
        this.f17492a = i7;
        this.f17493b = cVar;
        this.f17494c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.f17492a) {
            case 0:
                c cVar = this.f17493b;
                String str = this.f17494c;
                cVar.getClass();
                org.telegram.messenger.g0.g3(new a(cVar, str, 1));
                return;
            default:
                c cVar2 = this.f17493b;
                String str2 = this.f17494c;
                Locale locale2 = null;
                cVar2.f17504r = null;
                int i7 = cVar2.f17505s + 1;
                cVar2.f17505s = i7;
                Locale locale3 = gd.E0().f24342y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.f22877e.c(new ai.d1(cVar2, locale3, str2, locale, i7, 3));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.f22877e.c(new ai.d1(cVar2, locale3, str2, locale, i7, 3));
                return;
        }
    }
}
