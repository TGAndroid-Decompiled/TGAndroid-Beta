package defpackage;
public final class va0 {
    public final String a;
    public final String b;
    public final String c;

    public va0(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        gxc.d("Null crashlyticsInstallId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof va0) {
            va0 va0Var = (va0) obj;
            if (this.a.equals(va0Var.a)) {
                String str = va0Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = va0Var.c;
                    String str4 = this.c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.a);
        sb.append(", firebaseInstallationId=");
        sb.append(this.b);
        sb.append(", firebaseAuthenticationToken=");
        return b10.j(sb, this.c, "}");
    }
}
