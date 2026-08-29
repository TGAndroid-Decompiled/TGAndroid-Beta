package i9;
public final class i0 extends l1 {
    public final String f8687a;
    public final String f8688b;
    public final String f8689c;
    public final String d;
    public final String f8690e;
    public final String f8691f;

    public i0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f8687a = str;
        this.f8688b = str2;
        this.f8689c = str3;
        this.d = str4;
        this.f8690e = str5;
        this.f8691f = str6;
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
            String str5 = i0Var.f8691f;
            String str6 = i0Var.f8690e;
            String str7 = i0Var.d;
            String str8 = i0Var.f8689c;
            if (this.f8687a.equals(i0Var.f8687a) && this.f8688b.equals(i0Var.f8688b) && ((str = this.f8689c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f8690e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f8691f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f8687a.hashCode() ^ 1000003) * 1000003) ^ this.f8688b.hashCode()) * 1000003;
        int i10 = 0;
        String str = this.f8689c;
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
        String str3 = this.f8690e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str4 = this.f8691f;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i13 ^ i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f8687a);
        sb2.append(", version=");
        sb2.append(this.f8688b);
        sb2.append(", displayVersion=");
        sb2.append(this.f8689c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f8690e);
        sb2.append(", developmentPlatformVersion=");
        return a4.w.q(sb2, this.f8691f, "}");
    }
}
