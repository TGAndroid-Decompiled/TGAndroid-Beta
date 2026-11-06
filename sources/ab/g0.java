package ab;

import android.util.Log;
import j$.util.Objects;
import java.util.regex.Pattern;
public final class g0 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String f930a;
    public final String f931b;
    public final String f932c;

    public g0(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && d.matcher(str3).matches()) {
            this.f930a = str3;
            this.f931b = str;
            this.f932c = a8.p0.D(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(a8.p0.p("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (!this.f930a.equals(g0Var.f930a) || !this.f931b.equals(g0Var.f931b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f931b, this.f930a);
    }
}
