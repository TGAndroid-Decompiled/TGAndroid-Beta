package f0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
public final class f {
    public final String f10050a;
    public final LocusId f10051b;

    public f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f10050a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f10051b = e.a(str);
                return;
            } else {
                this.f10051b = null;
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
        String str = ((f) obj).f10050a;
        String str2 = this.f10050a;
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
        String str = this.f10050a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        int length = this.f10050a.length();
        sb2.append(length + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
