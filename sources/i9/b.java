package i9;

import java.io.File;
import k9.a0;
public final class b {
    public final a0 f7356a;
    public final String f7357b;
    public final File f7358c;

    public b(a0 a0Var, String str, File file) {
        this.f7356a = a0Var;
        if (str != null) {
            this.f7357b = str;
            this.f7358c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f7356a.equals(bVar.f7356a) && this.f7357b.equals(bVar.f7357b) && this.f7358c.equals(bVar.f7358c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f7356a.hashCode() ^ 1000003) * 1000003) ^ this.f7357b.hashCode()) * 1000003) ^ this.f7358c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f7356a + ", sessionId=" + this.f7357b + ", reportFile=" + this.f7358c + "}";
    }
}
