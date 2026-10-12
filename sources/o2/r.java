package o2;

import android.text.TextUtils;
public final class r {
    public final int f16799a;
    public final int f16800b;
    public final String f16801c;
    public final String d;
    public final String f16802e;
    public final String f16803f;

    public r(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f16799a = i10;
        this.f16800b = i11;
        this.f16801c = str;
        this.d = str2;
        this.f16802e = str3;
        this.f16803f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f16799a == rVar.f16799a && this.f16800b == rVar.f16800b && TextUtils.equals(this.f16801c, rVar.f16801c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f16802e, rVar.f16802e) && TextUtils.equals(this.f16803f, rVar.f16803f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f16799a * 31) + this.f16800b) * 31;
        int i14 = 0;
        String str = this.f16801c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i13 + i10) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f16802e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f16803f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }
}
