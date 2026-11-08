package jg;

import bi.ub;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
public final class a implements Runnable {
    public final int f16661a;
    public final c f16662b;
    public final String f16663c;

    public a(c cVar, String str, int i7) {
        this.f16661a = i7;
        this.f16662b = cVar;
        this.f16663c = str;
    }

    @Override
    public final void run() {
        Locale locale;
        switch (this.f16661a) {
            case 0:
                c cVar = this.f16662b;
                String str = this.f16663c;
                cVar.getClass();
                org.telegram.messenger.g0.h3(new a(cVar, str, 1));
                return;
            default:
                c cVar2 = this.f16662b;
                String str2 = this.f16663c;
                Locale locale2 = null;
                cVar2.f16676r = null;
                int i7 = cVar2.f16677s + 1;
                cVar2.f16677s = i7;
                Locale locale3 = id.E0().f23185y;
                if (cVar2.d) {
                    if (locale3.getLanguage().contains("en")) {
                        locale = locale3;
                        Utilities.f21336e.c(new ub(cVar2, locale3, str2, locale, i7));
                        return;
                    }
                    locale2 = Locale.US;
                }
                locale = locale2;
                Utilities.f21336e.c(new ub(cVar2, locale3, str2, locale, i7));
                return;
        }
    }
}
