package m2;

import j$.util.Objects;
public final class i {
    public final String f15787a;
    public final String f15788b;
    public final String f15789c;
    public final String d;
    public final String f15790e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f15787a = str;
        this.f15788b = str2;
        this.f15789c = str3;
        this.d = str4;
        this.f15790e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f15787a, iVar.f15787a) && Objects.equals(this.f15788b, iVar.f15788b) && Objects.equals(this.f15789c, iVar.f15789c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.f15790e, iVar.f15790e)) {
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
        String str = this.f15787a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (527 + i10) * 31;
        String str2 = this.f15788b;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f15789c;
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
        String str5 = this.f15790e;
        if (str5 != null) {
            i14 = str5.hashCode();
        }
        return i18 + i14;
    }
}
