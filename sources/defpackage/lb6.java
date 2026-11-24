package defpackage;

import android.os.Build;
import java.util.Locale;
public final class lb6 {
    public static final lb6 b = a(new Locale[0]);
    public final nb6 a;

    public lb6(nb6 nb6Var) {
        this.a = nb6Var;
    }

    public static lb6 a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new lb6(new ob6(ki0.e(localeArr)));
        }
        return new lb6(new mb6(localeArr));
    }

    public static lb6 b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                String str2 = split[i];
                int i2 = kb6.a;
                localeArr[i] = Locale.forLanguageTag(str2);
            }
            return a(localeArr);
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lb6) {
            if (this.a.equals(((lb6) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
