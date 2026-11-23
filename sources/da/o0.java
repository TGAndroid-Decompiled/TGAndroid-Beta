package da;
public final class o0 extends b2 {
    public final String f8158a;
    public final String f8159b;
    public final String f8160c;
    public final String d;
    public final String f8161e;
    public final String f8162f;

    public o0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f8158a = str;
        this.f8159b = str2;
        this.f8160c = str3;
        this.d = str4;
        this.f8161e = str5;
        this.f8162f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b2) {
            o0 o0Var = (o0) ((b2) obj);
            String str5 = o0Var.f8162f;
            String str6 = o0Var.f8161e;
            String str7 = o0Var.d;
            String str8 = o0Var.f8160c;
            if (this.f8158a.equals(o0Var.f8158a) && this.f8159b.equals(o0Var.f8159b) && ((str = this.f8160c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f8161e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f8162f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f8158a.hashCode() ^ 1000003) * 1000003) ^ this.f8159b.hashCode()) * 1000003;
        int i7 = 0;
        String str = this.f8160c;
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
        String str3 = this.f8161e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str4 = this.f8162f;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i12 ^ i7;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f8158a);
        sb2.append(", version=");
        sb2.append(this.f8159b);
        sb2.append(", displayVersion=");
        sb2.append(this.f8160c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f8161e);
        sb2.append(", developmentPlatformVersion=");
        return a8.p0.s(sb2, this.f8162f, "}");
    }
}
