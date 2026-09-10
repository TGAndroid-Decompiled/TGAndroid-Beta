package m2;

import j$.util.Objects;
public final class i {
    public final String f13259a;
    public final String f13260b;
    public final String f13261c;
    public final String d;
    public final String e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f13259a = str;
        this.f13260b = str2;
        this.f13261c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f13259a, iVar.f13259a) && Objects.equals(this.f13260b, iVar.f13260b) && Objects.equals(this.f13261c, iVar.f13261c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.e, iVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        String str = this.f13259a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f13260b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f13261c;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i13 = str4.hashCode();
        } else {
            i13 = 0;
        }
        int i18 = (i17 + i13) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
