package o2;

import android.text.TextUtils;
public final class r {
    public final int f17132a;
    public final int f17133b;
    public final String f17134c;
    public final String d;
    public final String f17135e;
    public final String f17136f;

    public r(int i10, String str, int i11, String str2, String str3, String str4) {
        this.f17132a = i10;
        this.f17133b = i11;
        this.f17134c = str;
        this.d = str2;
        this.f17135e = str3;
        this.f17136f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f17132a == rVar.f17132a && this.f17133b == rVar.f17133b && TextUtils.equals(this.f17134c, rVar.f17134c) && TextUtils.equals(this.d, rVar.d) && TextUtils.equals(this.f17135e, rVar.f17135e) && TextUtils.equals(this.f17136f, rVar.f17136f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f17132a * 31) + this.f17133b) * 31;
        int i14 = 0;
        String str = this.f17134c;
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
        String str3 = this.f17135e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f17136f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }
}
