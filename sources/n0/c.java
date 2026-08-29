package n0;

import android.os.Build;
import androidx.emoji2.text.v;
import java.util.Locale;
public final class c {
    public static final c f17075b = a(new Locale[0]);
    public final e f17076a;

    public c(e eVar) {
        this.f17076a = eVar;
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
            for (int i10 = 0; i10 < length; i10++) {
                String str2 = split[i10];
                int i11 = b.f17074a;
                localeArr[i10] = Locale.forLanguageTag(str2);
            }
            return a(localeArr);
        }
        return f17075b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (this.f17076a.equals(((c) obj).f17076a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17076a.hashCode();
    }

    public final String toString() {
        return this.f17076a.toString();
    }
}
