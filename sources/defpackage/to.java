package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
public abstract class to {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static m96 b(Configuration configuration) {
        return m96.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(m96 m96Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(m96Var.a.a()));
    }

    public static void d(Configuration configuration, m96 m96Var) {
        configuration.setLocales(LocaleList.forLanguageTags(m96Var.a.a()));
    }
}
