package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class v {
    public final String f18699a;
    public final int f18700b;
    public final int f18701c;

    public v(String str, int i10, int i11) {
        this.f18699a = str;
        this.f18700b = i10;
        this.f18701c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        int i10 = vVar.f18701c;
        String str = vVar.f18699a;
        int i11 = vVar.f18700b;
        int i12 = this.f18701c;
        String str2 = this.f18699a;
        int i13 = this.f18700b;
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
        return Objects.hash(this.f18699a, Integer.valueOf(this.f18701c));
    }
}
