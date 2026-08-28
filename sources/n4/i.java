package n4;

import d5.f0;
public final class i {
    public final String f18420a;
    public final String f18421b;
    public final String f18422c;
    public final String d;
    public final String f18423e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f18420a = str;
        this.f18421b = str2;
        this.f18422c = str3;
        this.d = str4;
        this.f18423e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (f0.a(this.f18420a, iVar.f18420a) && f0.a(this.f18421b, iVar.f18421b) && f0.a(this.f18422c, iVar.f18422c) && f0.a(this.d, iVar.d) && f0.a(this.f18423e, iVar.f18423e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f18420a;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (527 + i9) * 31;
        String str2 = this.f18421b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f18422c;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i12 = str4.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str5 = this.f18423e;
        if (str5 != null) {
            i13 = str5.hashCode();
        }
        return i17 + i13;
    }
}
