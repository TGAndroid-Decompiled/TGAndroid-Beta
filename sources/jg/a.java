package jg;

import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
public final class a implements Runnable {
    public final int f17421a;
    public final c f17422b;
    public final String f17423c;

    public a(c cVar, String str, int i7) {
        this.f17421a = i7;
        this.f17422b = cVar;
        this.f17423c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.f17421a) {
            case 0:
                c cVar = this.f17422b;
                String str = this.f17423c;
                cVar.getClass();
                org.telegram.messenger.g0.g3(new a(cVar, str, 1));
                return;
            default:
                c cVar2 = this.f17422b;
                String str2 = this.f17423c;
                Locale locale2 = null;
                cVar2.f17433r = null;
                int i7 = cVar2.f17434s + 1;
                cVar2.f17434s = i7;
                Locale locale3 = gd.E0().f24269y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.f22807e.c(new ai.i1(cVar2, locale3, str2, locale, i7, 3));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.f22807e.c(new ai.i1(cVar2, locale3, str2, locale, i7, 3));
                return;
        }
    }
}
