package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
public abstract class tp {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static lb6 b(Configuration configuration) {
        return lb6.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(lb6 lb6Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(lb6Var.a.a()));
    }

    public static void d(Configuration configuration, lb6 lb6Var) {
        configuration.setLocales(LocaleList.forLanguageTags(lb6Var.a.a()));
    }
}
