package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class t {
    public final String f13529a;
    public final int f13530b;
    public final int f13531c;

    public t(String str, int i10, int i11) {
        this.f13529a = str;
        this.f13530b = i10;
        this.f13531c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        int i10 = tVar.f13531c;
        String str = tVar.f13529a;
        int i11 = tVar.f13530b;
        int i12 = this.f13531c;
        String str2 = this.f13529a;
        int i13 = this.f13530b;
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
        return Objects.hash(this.f13529a, Integer.valueOf(this.f13531c));
    }
}
