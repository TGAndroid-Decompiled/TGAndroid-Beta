package g9;
public final class c {
    public final String f7149a;
    public final String f7150b;

    public c(String str, String str2) {
        if (str != null) {
            this.f7149a = str;
            this.f7150b = str2;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str2 = cVar.f7150b;
            if (this.f7149a.equals(cVar.f7149a) && ((str = this.f7150b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f7149a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7150b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f7149a);
        sb2.append(", firebaseInstallationId=");
        return a4.w.q(sb2, this.f7150b, "}");
    }
}
