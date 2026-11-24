package defpackage;

import android.os.Build;
import java.util.Locale;
public abstract class t01 {
    public static final int a = 0;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            tga.f(30);
            tga.f(31);
            tga.f(33);
            tga.f(1000000);
        }
    }

    public static final boolean a() {
        Integer num;
        Integer num2 = 0;
        int i = Build.VERSION.SDK_INT;
        if (i < 33) {
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                str.getClass();
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    upperCase.getClass();
                    if (upperCase.equals("BAKLAVA")) {
                        num = num2;
                    } else {
                        num = null;
                    }
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    upperCase2.getClass();
                    if (!upperCase2.equals("BAKLAVA")) {
                        num2 = null;
                    }
                    if (num != null) {
                        if (num2 == null || num.intValue() >= num2.intValue()) {
                            return true;
                        }
                    } else if (num2 == null) {
                        String upperCase3 = str.toUpperCase(locale);
                        upperCase3.getClass();
                        String upperCase4 = "Tiramisu".toUpperCase(locale);
                        upperCase4.getClass();
                        if (upperCase3.compareTo(upperCase4) >= 0) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
}
