package aa;

import java.io.File;
public final class b {
    public final da.d0 f775a;
    public final String f776b;
    public final File f777c;

    public b(da.d0 d0Var, String str, File file) {
        this.f775a = d0Var;
        if (str != null) {
            this.f776b = str;
            this.f777c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f775a.equals(bVar.f775a) && this.f776b.equals(bVar.f776b) && this.f777c.equals(bVar.f777c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f775a.hashCode() ^ 1000003) * 1000003) ^ this.f776b.hashCode()) * 1000003) ^ this.f777c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f775a + ", sessionId=" + this.f776b + ", reportFile=" + this.f777c + "}";
    }
}
