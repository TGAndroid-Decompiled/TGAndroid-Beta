package o2;

import android.text.TextUtils;
public final class r {
    public final int f15634a;
    public final int f15635b;
    public final String f15636c;
    public final String d;
    public final String e;
    public final String f15637f;

    public r(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f15634a = i10;
        this.f15635b = i11;
        this.f15636c = str;
        this.d = str2;
        this.e = str3;
        this.f15637f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f15634a == rVar.f15634a && this.f15635b == rVar.f15635b && TextUtils.equals(this.f15636c, rVar.f15636c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.e, rVar.e) && TextUtils.equals(this.f15637f, rVar.f15637f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f15634a * 31) + this.f15635b) * 31;
        int i14 = 0;
        String str = this.f15636c;
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
        String str3 = this.e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f15637f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }
}
