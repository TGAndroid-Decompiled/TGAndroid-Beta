package n0;

import android.os.Build;
import androidx.emoji2.text.v;
import java.util.Locale;

public final class c {

    public static final c f18074b = a(new Locale[0]);

    public final e f18075a;

    public c(e eVar) {
        this.f18075a = eVar;
    }

    public static c a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new c(new f(v.d(localeArr))) : new c(new d(localeArr));
    }

    public static c b(String str) {
        if (str == null || str.isEmpty()) {
            return f18074b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArrSplit[i10];
            int i11 = b.f18073a;
            localeArr[i10] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f18075a.equals(((c) obj).f18075a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18075a.hashCode();
    }

    public final String toString() {
        return this.f18075a.toString();
    }
}
