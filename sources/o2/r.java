package o2;

import android.text.TextUtils;
public final class r {
    public final int f16960a;
    public final int f16961b;
    public final String f16962c;
    public final String d;
    public final String f16963e;
    public final String f16964f;

    public r(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f16960a = i10;
        this.f16961b = i11;
        this.f16962c = str;
        this.d = str2;
        this.f16963e = str3;
        this.f16964f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f16960a == rVar.f16960a && this.f16961b == rVar.f16961b && TextUtils.equals(this.f16962c, rVar.f16962c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f16963e, rVar.f16963e) && TextUtils.equals(this.f16964f, rVar.f16964f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f16960a * 31) + this.f16961b) * 31;
        int i14 = 0;
        String str = this.f16962c;
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
        String str3 = this.f16963e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f16964f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }
}
