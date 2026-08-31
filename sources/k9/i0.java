package k9;
public final class i0 extends l1 {
    public final String f10907a;
    public final String f10908b;
    public final String f10909c;
    public final String d;
    public final String f10910e;
    public final String f10911f;

    public i0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f10907a = str;
        this.f10908b = str2;
        this.f10909c = str3;
        this.d = str4;
        this.f10910e = str5;
        this.f10911f = str6;
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
            String str5 = i0Var.f10911f;
            String str6 = i0Var.f10910e;
            String str7 = i0Var.d;
            String str8 = i0Var.f10909c;
            if (this.f10907a.equals(i0Var.f10907a) && this.f10908b.equals(i0Var.f10908b) && ((str = this.f10909c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f10910e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f10911f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f10907a.hashCode() ^ 1000003) * 1000003) ^ this.f10908b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f10909c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str3 = this.f10910e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str4 = this.f10911f;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f10907a);
        sb.append(", version=");
        sb.append(this.f10908b);
        sb.append(", displayVersion=");
        sb.append(this.f10909c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.f10910e);
        sb.append(", developmentPlatformVersion=");
        return android.support.v4.media.a.r(sb, this.f10911f, "}");
    }
}
