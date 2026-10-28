package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class v {
    public final String f18698a;
    public final int f18699b;
    public final int f18700c;

    public v(String str, int i10, int i11) {
        this.f18698a = str;
        this.f18699b = i10;
        this.f18700c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        int i10 = vVar.f18700c;
        String str = vVar.f18698a;
        int i11 = vVar.f18699b;
        int i12 = this.f18700c;
        String str2 = this.f18698a;
        int i13 = this.f18699b;
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
        return Objects.hash(this.f18698a, Integer.valueOf(this.f18700c));
    }
}
