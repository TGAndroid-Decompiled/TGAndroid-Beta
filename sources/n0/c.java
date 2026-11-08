package n0;

import android.os.Build;
import androidx.emoji2.text.w;
import java.util.Locale;
public final class c {
    public static final c f20119b = a(new Locale[0]);
    public final e f20120a;

    public c(e eVar) {
        this.f20120a = eVar;
    }

    public static c a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new c(new f(w.d(localeArr)));
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
                int i10 = b.f20118a;
                localeArr[i7] = Locale.forLanguageTag(str2);
            }
            return a(localeArr);
        }
        return f20119b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (this.f20120a.equals(((c) obj).f20120a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20120a.hashCode();
    }

    public final String toString() {
        return this.f20120a.toString();
    }
}
