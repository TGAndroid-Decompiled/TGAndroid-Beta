package i9;
public final class c {
    public final String f7359a;
    public final String f7360b;

    public c(String str, String str2) {
        if (str != null) {
            this.f7359a = str;
            this.f7360b = str2;
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
            String str2 = cVar.f7360b;
            if (this.f7359a.equals(cVar.f7359a) && ((str = this.f7360b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f7359a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7360b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f7359a);
        sb.append(", firebaseInstallationId=");
        return android.support.v4.media.a.r(sb, this.f7360b, "}");
    }
}
