package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.util.regex.Pattern;
public final class xtb {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public xtb(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && d.matcher(str3).matches()) {
            this.a = str3;
            this.b = str;
            this.c = tb4.p(str, "!", str2);
            return;
        }
        w26.j(tb4.y("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xtb) {
            xtb xtbVar = (xtb) obj;
            if (this.a.equals(xtbVar.a) && this.b.equals(xtbVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
