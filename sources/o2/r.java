package o2;

import android.text.TextUtils;
public final class r {
    public final int f17658a;
    public final int f17659b;
    public final String f17660c;
    public final String d;
    public final String e;
    public final String f17661f;

    public r(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f17658a = i10;
        this.f17659b = i11;
        this.f17660c = str;
        this.d = str2;
        this.e = str3;
        this.f17661f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f17658a == rVar.f17658a && this.f17659b == rVar.f17659b && TextUtils.equals(this.f17660c, rVar.f17660c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.e, rVar.e) && TextUtils.equals(this.f17661f, rVar.f17661f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f17658a * 31) + this.f17659b) * 31;
        int i14 = 0;
        String str = this.f17660c;
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
        String str4 = this.f17661f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }
}
