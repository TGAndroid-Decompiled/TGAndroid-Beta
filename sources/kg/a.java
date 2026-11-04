package kg;

import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
public final class a implements Runnable {
    public final int f16914a;
    public final c f16915b;
    public final String f16916c;

    public a(c cVar, String str, int i3) {
        this.f16914a = i3;
        this.f16915b = cVar;
        this.f16916c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.f16914a) {
            case 0:
                c cVar = this.f16915b;
                String str = this.f16916c;
                cVar.getClass();
                org.telegram.messenger.g0.h3(new a(cVar, str, 1));
                return;
            default:
                c cVar2 = this.f16915b;
                String str2 = this.f16916c;
                Locale locale2 = null;
                cVar2.f16935r = null;
                int i3 = cVar2.f16936s + 1;
                cVar2.f16936s = i3;
                Locale locale3 = bd.E0().f21812y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.f21387e.c(new ai.p1(cVar2, locale3, str2, locale, i3, 5));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.f21387e.c(new ai.p1(cVar2, locale3, str2, locale, i3, 5));
                return;
        }
    }
}
