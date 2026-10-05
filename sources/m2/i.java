package m2;

import j$.util.Objects;
public final class i {
    public final String f16012a;
    public final String f16013b;
    public final String f16014c;
    public final String d;
    public final String f16015e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f16012a = str;
        this.f16013b = str2;
        this.f16014c = str3;
        this.d = str4;
        this.f16015e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f16012a, iVar.f16012a) && Objects.equals(this.f16013b, iVar.f16013b) && Objects.equals(this.f16014c, iVar.f16014c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.f16015e, iVar.f16015e)) {
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
        String str = this.f16012a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f16013b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f16014c;
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
        String str5 = this.f16015e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
