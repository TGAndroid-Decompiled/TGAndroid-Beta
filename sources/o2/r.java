package o2;

import android.text.TextUtils;
public final class r {
    public final int f17091a;
    public final int f17092b;
    public final String f17093c;
    public final String d;
    public final String f17094e;
    public final String f17095f;

    public r(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f17091a = i10;
        this.f17092b = i11;
        this.f17093c = str;
        this.d = str2;
        this.f17094e = str3;
        this.f17095f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f17091a == rVar.f17091a && this.f17092b == rVar.f17092b && TextUtils.equals(this.f17093c, rVar.f17093c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f17094e, rVar.f17094e) && TextUtils.equals(this.f17095f, rVar.f17095f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f17091a * 31) + this.f17092b) * 31;
        int i14 = 0;
        String str = this.f17093c;
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
        String str3 = this.f17094e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f17095f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }
}
