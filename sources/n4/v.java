package n4;

import android.text.TextUtils;
import j$.util.Objects;
public class v {
    public final String f15748a;
    public final int f15749b;
    public final int f15750c;

    public v(String str, int i10, int i11) {
        this.f15748a = str;
        this.f15749b = i10;
        this.f15750c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        int i10 = vVar.f15750c;
        String str = vVar.f15748a;
        int i11 = vVar.f15749b;
        int i12 = this.f15750c;
        String str2 = this.f15748a;
        int i13 = this.f15749b;
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
        return Objects.hash(this.f15748a, Integer.valueOf(this.f15750c));
    }
}
