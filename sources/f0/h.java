package f0;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

public final class h {

    public final String f5601a;

    public final LocusId f5602b;

    public h(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.f5601a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f5602b = g.a(str);
        } else {
            this.f5602b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        String str = ((h) obj).f5601a;
        String str2 = this.f5601a;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f5601a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocusIdCompat[");
        sb2.append(this.f5601a.length() + "_chars");
        sb2.append("]");
        return sb2.toString();
    }
}
