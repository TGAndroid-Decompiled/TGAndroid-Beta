package n0;

import android.os.Build;
import androidx.emoji2.text.v;
import java.util.Locale;
public final class c {
    public static final c f18249b = a(new Locale[0]);
    public final e f18250a;

    public c(e eVar) {
        this.f18250a = eVar;
    }

    public static c a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new c(new f(v.d(localeArr)));
        }
        return new c(new d(localeArr));
    }

    public static c b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i9 = 0; i9 < length; i9++) {
                String str2 = split[i9];
                int i10 = b.f18248a;
                localeArr[i9] = Locale.forLanguageTag(str2);
            }
            return a(localeArr);
        }
        return f18249b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (this.f18250a.equals(((c) obj).f18250a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18250a.hashCode();
    }

    public final String toString() {
        return this.f18250a.toString();
    }
}
