package g9;

import java.io.File;
public final class b {
    public final i9.a0 f7146a;
    public final String f7147b;
    public final File f7148c;

    public b(i9.a0 a0Var, String str, File file) {
        this.f7146a = a0Var;
        if (str != null) {
            this.f7147b = str;
            this.f7148c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f7146a.equals(bVar.f7146a) && this.f7147b.equals(bVar.f7147b) && this.f7148c.equals(bVar.f7148c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f7146a.hashCode() ^ 1000003) * 1000003) ^ this.f7147b.hashCode()) * 1000003) ^ this.f7148c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f7146a + ", sessionId=" + this.f7147b + ", reportFile=" + this.f7148c + "}";
    }
}
