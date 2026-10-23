package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class v {
    public final String f17191a;
    public final int f17192b;
    public final int f17193c;

    public v(String str, int i10, int i11) {
        this.f17191a = str;
        this.f17192b = i10;
        this.f17193c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        int i10 = vVar.f17193c;
        String str = vVar.f17191a;
        int i11 = vVar.f17192b;
        int i12 = this.f17193c;
        String str2 = this.f17191a;
        int i13 = this.f17192b;
        if (i13 >= 0 && i11 >= 0) {
            if (TextUtils.equals(str2, str) && i13 == i11 && i12 == i10) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str2, str) && i12 == i10) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f17191a, Integer.valueOf(this.f17193c));
    }
}
