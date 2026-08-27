package f9;

public final class c {

    public final String f5927a;

    public final String f5928b;

    public c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f5927a = str;
        this.f5928b = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str2 = cVar.f5928b;
            if (this.f5927a.equals(cVar.f5927a) && ((str = this.f5928b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f5927a.hashCode() ^ 1000003) * 1000003;
        String str = this.f5928b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f5927a);
        sb2.append(", firebaseInstallationId=");
        return a9.p.p(sb2, this.f5928b, "}");
    }
}
