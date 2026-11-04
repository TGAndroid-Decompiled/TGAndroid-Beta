package n0;

import android.os.Build;
import androidx.emoji2.text.x;
import java.util.Locale;
public final class c {
    public static final c f20108b = a(new Locale[0]);
    public final e f20109a;

    public c(e eVar) {
        this.f20109a = eVar;
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
            for (int i3 = 0; i3 < length; i3++) {
                String str2 = split[i3];
                int i10 = b.f20107a;
                localeArr[i3] = Locale.forLanguageTag(str2);
            }
            return a(localeArr);
        }
        return f20108b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (this.f20109a.equals(((c) obj).f20109a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f20109a.hashCode();
    }

    public final String toString() {
        return this.f20109a.toString();
    }
}
