package defpackage;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
public final class yd6 {
    public final String a;
    public final LocusId b;

    public yd6(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = sr.c(str);
                return;
            } else {
                this.b = null;
                return;
            }
        }
        lq5.j("id cannot be empty");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yd6.class != obj.getClass()) {
            return false;
        }
        String str = ((yd6) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                return true;
            }
            return false;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        int length = this.a.length();
        sb.append(length + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
