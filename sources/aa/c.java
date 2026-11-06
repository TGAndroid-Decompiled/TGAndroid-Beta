package aa;

import a8.p0;
public final class c {
    public final String f784a;
    public final String f785b;
    public final String f786c;

    public c(String str, String str2, String str3) {
        if (str != null) {
            this.f784a = str;
            this.f785b = str2;
            this.f786c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str3 = cVar.f786c;
            String str4 = cVar.f785b;
            if (this.f784a.equals(cVar.f784a) && ((str = this.f785b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f786c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f784a.hashCode() ^ 1000003) * 1000003;
        int i7 = 0;
        String str = this.f785b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f786c;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i10 ^ i7;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f784a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f785b);
        sb2.append(", firebaseAuthenticationToken=");
        return p0.s(sb2, this.f786c, "}");
    }
}
