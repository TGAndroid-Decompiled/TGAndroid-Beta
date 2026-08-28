package g9;
public final class i0 extends l1 {
    public final String f7552a;
    public final String f7553b;
    public final String f7554c;
    public final String d;
    public final String f7555e;
    public final String f7556f;

    public i0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f7552a = str;
        this.f7553b = str2;
        this.f7554c = str3;
        this.d = str4;
        this.f7555e = str5;
        this.f7556f = str6;
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
            String str5 = i0Var.f7556f;
            String str6 = i0Var.f7555e;
            String str7 = i0Var.d;
            String str8 = i0Var.f7554c;
            if (this.f7552a.equals(i0Var.f7552a) && this.f7553b.equals(i0Var.f7553b) && ((str = this.f7554c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f7555e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f7556f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f7552a.hashCode() ^ 1000003) * 1000003) ^ this.f7553b.hashCode()) * 1000003;
        int i9 = 0;
        String str = this.f7554c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f7555e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str4 = this.f7556f;
        if (str4 != null) {
            i9 = str4.hashCode();
        }
        return i12 ^ i9;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f7552a);
        sb2.append(", version=");
        sb2.append(this.f7553b);
        sb2.append(", displayVersion=");
        sb2.append(this.f7554c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f7555e);
        sb2.append(", developmentPlatformVersion=");
        return aa.d.r(sb2, this.f7556f, "}");
    }
}
