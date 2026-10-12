package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class v {
    public final String f16034a;
    public final int f16035b;
    public final int f16036c;

    public v(String str, int i10, int i11) {
        this.f16034a = str;
        this.f16035b = i10;
        this.f16036c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        int i10 = vVar.f16036c;
        String str = vVar.f16034a;
        int i11 = vVar.f16035b;
        int i12 = this.f16036c;
        String str2 = this.f16034a;
        int i13 = this.f16035b;
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
        return Objects.hash(this.f16034a, Integer.valueOf(this.f16036c));
    }
}
