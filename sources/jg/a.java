package jg;

import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
public final class a implements Runnable {
    public final int f17424a;
    public final c f17425b;
    public final String f17426c;

    public a(c cVar, String str, int i7) {
        this.f17424a = i7;
        this.f17425b = cVar;
        this.f17426c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.f17424a) {
            case 0:
                c cVar = this.f17425b;
                String str = this.f17426c;
                cVar.getClass();
                org.telegram.messenger.g0.g3(new a(cVar, str, 1));
                return;
            default:
                c cVar2 = this.f17425b;
                String str2 = this.f17426c;
                Locale locale2 = null;
                cVar2.f17436r = null;
                int i7 = cVar2.f17437s + 1;
                cVar2.f17437s = i7;
                Locale locale3 = hd.E0().f24472y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.f22810e.c(new ai.i1(cVar2, locale3, str2, locale, i7, 3));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.f22810e.c(new ai.i1(cVar2, locale3, str2, locale, i7, 3));
                return;
        }
    }
}
