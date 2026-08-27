package n0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.j;

public abstract class a {

    public static final int f18072a = 0;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            g0.f.f(30);
        }
        if (i10 >= 30) {
            g0.f.f(31);
        }
        if (i10 >= 30) {
            g0.f.f(33);
        }
        if (i10 >= 30) {
            g0.f.f(1000000);
        }
    }

    public static final boolean a() {
        Integer num = 0;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 >= 32) {
            String CODENAME = Build.VERSION.CODENAME;
            j.d(CODENAME, "CODENAME");
            if (!"REL".equals(CODENAME)) {
                Locale locale = Locale.ROOT;
                String upperCase = CODENAME.toUpperCase(locale);
                j.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                Integer num2 = upperCase.equals("BAKLAVA") ? num : null;
                String upperCase2 = "Tiramisu".toUpperCase(locale);
                j.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                num = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num2 == null || num == null) {
                    if (num2 == null && num == null) {
                        String upperCase3 = CODENAME.toUpperCase(locale);
                        j.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        String upperCase4 = "Tiramisu".toUpperCase(locale);
                        j.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num2 != null) {
                        return true;
                    }
                } else if (num2.intValue() >= num.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }
}
