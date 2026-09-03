package f0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
public final class i {
    public final String f5635a;
    public final LocusId f5636b;

    public i(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f5635a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f5636b = h.a(str);
                return;
            } else {
                this.f5636b = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        String str = ((i) obj).f5635a;
        String str2 = this.f5635a;
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
        String str = this.f5635a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        int length = this.f5635a.length();
        sb.append(length + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
