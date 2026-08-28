package e9;
public final class c {
    public final String f4995a;
    public final String f4996b;

    public c(String str, String str2) {
        if (str != null) {
            this.f4995a = str;
            this.f4996b = str2;
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
            String str2 = cVar.f4996b;
            if (this.f4995a.equals(cVar.f4995a) && ((str = this.f4996b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4995a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4996b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f4995a);
        sb2.append(", firebaseInstallationId=");
        return aa.d.r(sb2, this.f4996b, "}");
    }
}
