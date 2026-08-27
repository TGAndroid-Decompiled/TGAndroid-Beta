package h9;

public final class i0 extends l1 {

    public final String f8723a;

    public final String f8724b;

    public final String f8725c;
    public final String d;

    public final String f8726e;

    public final String f8727f;

    public i0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f8723a = str;
        this.f8724b = str2;
        this.f8725c = str3;
        this.d = str4;
        this.f8726e = str5;
        this.f8727f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            i0 i0Var = (i0) ((l1) obj);
            String str5 = i0Var.f8727f;
            String str6 = i0Var.f8726e;
            String str7 = i0Var.d;
            String str8 = i0Var.f8725c;
            if (this.f8723a.equals(i0Var.f8723a) && this.f8724b.equals(i0Var.f8724b) && ((str = this.f8725c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f8726e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f8727f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f8723a.hashCode() ^ 1000003) * 1000003) ^ this.f8724b.hashCode()) * 1000003;
        String str = this.f8725c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8726e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f8727f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f8723a);
        sb2.append(", version=");
        sb2.append(this.f8724b);
        sb2.append(", displayVersion=");
        sb2.append(this.f8725c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f8726e);
        sb2.append(", developmentPlatformVersion=");
        return a9.p.p(sb2, this.f8727f, "}");
    }
}
