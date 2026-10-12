package m2;

import j$.util.Objects;
public final class i {
    public final String f15691a;
    public final String f15692b;
    public final String f15693c;
    public final String d;
    public final String f15694e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f15691a = str;
        this.f15692b = str2;
        this.f15693c = str3;
        this.d = str4;
        this.f15694e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f15691a, iVar.f15691a) && Objects.equals(this.f15692b, iVar.f15692b) && Objects.equals(this.f15693c, iVar.f15693c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.f15694e, iVar.f15694e)) {
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
        String str = this.f15691a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f15692b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f15693c;
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
        String str5 = this.f15694e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
