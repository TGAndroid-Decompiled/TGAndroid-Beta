package ca;
public final class o0 extends b2 {
    public final String f4483a;
    public final String f4484b;
    public final String f4485c;
    public final String d;
    public final String f4486e;
    public final String f4487f;

    public o0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f4483a = str;
        this.f4484b = str2;
        this.f4485c = str3;
        this.d = str4;
        this.f4486e = str5;
        this.f4487f = str6;
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
            String str5 = o0Var.f4487f;
            String str6 = o0Var.f4486e;
            String str7 = o0Var.d;
            String str8 = o0Var.f4485c;
            if (this.f4483a.equals(o0Var.f4483a) && this.f4484b.equals(o0Var.f4484b) && ((str = this.f4485c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f4486e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f4487f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f4483a.hashCode() ^ 1000003) * 1000003) ^ this.f4484b.hashCode()) * 1000003;
        int i3 = 0;
        String str = this.f4485c;
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
        String str3 = this.f4486e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str4 = this.f4487f;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return i12 ^ i3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f4483a);
        sb2.append(", version=");
        sb2.append(this.f4484b);
        sb2.append(", displayVersion=");
        sb2.append(this.f4485c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f4486e);
        sb2.append(", developmentPlatformVersion=");
        return a1.g.s(sb2, this.f4487f, "}");
    }
}
