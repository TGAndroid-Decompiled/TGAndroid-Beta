package n0;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.i;
public abstract class a {
    public static final int f16338a = 0;

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
        Integer num;
        Integer num2 = 0;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                i.d(CODENAME, "CODENAME");
                if (!"REL".equals(CODENAME)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = CODENAME.toUpperCase(locale);
                    i.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.equals("BAKLAVA")) {
                        num = num2;
                    } else {
                        num = null;
                    }
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    i.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (!upperCase2.equals("BAKLAVA")) {
                        num2 = null;
                    }
                    if (num != null && num2 != null) {
                        if (num.intValue() >= num2.intValue()) {
                            return true;
                        }
                    } else if (num == null && num2 == null) {
                        String upperCase3 = CODENAME.toUpperCase(locale);
                        i.d(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        String upperCase4 = "Tiramisu".toUpperCase(locale);
                        i.d(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    } else if (num != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
