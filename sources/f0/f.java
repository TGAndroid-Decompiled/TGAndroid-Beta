package f0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
public final class f {
    public final String f8827a;
    public final LocusId f8828b;

    public f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8827a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f8828b = e.a(str);
                return;
            } else {
                this.f8828b = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        String str = ((f) obj).f8827a;
        String str2 = this.f8827a;
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
        String str = this.f8827a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        int length = this.f8827a.length();
        sb2.append(length + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
