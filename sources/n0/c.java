package n0;

import android.os.Build;
import androidx.emoji2.text.x;
import java.util.Locale;
public final class c {
    public static final c f21140b = a(new Locale[0]);
    public final e f21141a;

    public c(e eVar) {
        this.f21141a = eVar;
    }

    public static c a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new c(new f(x.d(localeArr)));
        }
        return new c(new d(localeArr));
    }

    public static c b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i7 = 0; i7 < length; i7++) {
                String str2 = split[i7];
                int i10 = b.f21139a;
                localeArr[i7] = Locale.forLanguageTag(str2);
            }
            return a(localeArr);
        }
        return f21140b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (this.f21141a.equals(((c) obj).f21141a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21141a.hashCode();
    }

    public final String toString() {
        return this.f21141a.toString();
    }
}
