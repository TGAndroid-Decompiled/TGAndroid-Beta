package m2;

import j$.util.Objects;
public final class i {
    public final String f16003a;
    public final String f16004b;
    public final String f16005c;
    public final String d;
    public final String f16006e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f16003a = str;
        this.f16004b = str2;
        this.f16005c = str3;
        this.d = str4;
        this.f16006e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f16003a, iVar.f16003a) && Objects.equals(this.f16004b, iVar.f16004b) && Objects.equals(this.f16005c, iVar.f16005c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.f16006e, iVar.f16006e)) {
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
        String str = this.f16003a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f16004b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f16005c;
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
        String str5 = this.f16006e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
