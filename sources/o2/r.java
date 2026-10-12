package o2;

import android.text.TextUtils;
public final class r {
    public final int f16798a;
    public final int f16799b;
    public final String f16800c;
    public final String d;
    public final String f16801e;
    public final String f16802f;

    public r(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f16798a = i10;
        this.f16799b = i11;
        this.f16800c = str;
        this.d = str2;
        this.f16801e = str3;
        this.f16802f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f16798a == rVar.f16798a && this.f16799b == rVar.f16799b && TextUtils.equals(this.f16800c, rVar.f16800c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f16801e, rVar.f16801e) && TextUtils.equals(this.f16802f, rVar.f16802f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f16798a * 31) + this.f16799b) * 31;
        int i14 = 0;
        String str = this.f16800c;
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
        String str3 = this.f16801e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f16802f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }
}
