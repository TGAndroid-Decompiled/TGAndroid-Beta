package aa;

import java.io.File;
public final class b {
    public final da.d0 f779a;
    public final String f780b;
    public final File f781c;

    public b(da.d0 d0Var, String str, File file) {
        this.f779a = d0Var;
        if (str != null) {
            this.f780b = str;
            this.f781c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f779a.equals(bVar.f779a) && this.f780b.equals(bVar.f780b) && this.f781c.equals(bVar.f781c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f779a.hashCode() ^ 1000003) * 1000003) ^ this.f780b.hashCode()) * 1000003) ^ this.f781c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f779a + ", sessionId=" + this.f780b + ", reportFile=" + this.f781c + "}";
    }
}
