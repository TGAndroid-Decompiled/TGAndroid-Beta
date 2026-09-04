package f0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
public final class h {
    public final String f9164a;
    public final LocusId f9165b;

    public h(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f9164a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f9165b = g.a(str);
                return;
            } else {
                this.f9165b = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        String str = ((h) obj).f9164a;
        String str2 = this.f9164a;
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
        String str = this.f9164a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        int length = this.f9164a.length();
        sb2.append(length + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
