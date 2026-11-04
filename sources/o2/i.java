package o2;

import j$.util.Objects;
public final class i {
    public final String f20543a;
    public final String f20544b;
    public final String f20545c;
    public final String d;
    public final String f20546e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f20543a = str;
        this.f20544b = str2;
        this.f20545c = str3;
        this.d = str4;
        this.f20546e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Objects.equals(this.f20543a, iVar.f20543a) && Objects.equals(this.f20544b, iVar.f20544b) && Objects.equals(this.f20545c, iVar.f20545c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.f20546e, iVar.f20546e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        String str = this.f20543a;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (527 + i3) * 31;
        String str2 = this.f20544b;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i14 + i10) * 31;
        String str3 = this.f20545c;
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
        String str5 = this.f20546e;
        if (str5 != null) {
            i13 = str5.hashCode();
        }
        return i17 + i13;
    }
}
