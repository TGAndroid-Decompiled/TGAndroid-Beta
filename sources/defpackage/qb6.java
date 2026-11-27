package defpackage;

import android.os.Build;
import java.util.Locale;
public final class qb6 {
    public static final qb6 b = a(new Locale[0]);
    public final sb6 a;

    public qb6(sb6 sb6Var) {
        this.a = sb6Var;
    }

    public static qb6 a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new qb6(new tb6(lh0.e(localeArr)));
        }
        return new qb6(new rb6(localeArr));
    }

    public static qb6 b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                String str2 = split[i];
                int i2 = pb6.a;
                localeArr[i] = Locale.forLanguageTag(str2);
            }
            return a(localeArr);
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qb6) {
            if (this.a.equals(((qb6) obj).a)) {
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
