package n4;

import d5.g0;

public final class i {

    public final String f18247a;

    public final String f18248b;

    public final String f18249c;
    public final String d;

    public final String f18250e;

    public i(String str, String str2, String str3, String str4, String str5) {
        this.f18247a = str;
        this.f18248b = str2;
        this.f18249c = str3;
        this.d = str4;
        this.f18250e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return g0.a(this.f18247a, iVar.f18247a) && g0.a(this.f18248b, iVar.f18248b) && g0.a(this.f18249c, iVar.f18249c) && g0.a(this.d, iVar.d) && g0.a(this.f18250e, iVar.f18250e);
    }

    public final int hashCode() {
        String str = this.f18247a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18248b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18249c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f18250e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
