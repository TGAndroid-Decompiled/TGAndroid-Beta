package i9;

import java.io.File;
import k9.a0;
public final class b {
    public final a0 f7374a;
    public final String f7375b;
    public final File f7376c;

    public b(a0 a0Var, String str, File file) {
        this.f7374a = a0Var;
        if (str != null) {
            this.f7375b = str;
            this.f7376c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f7374a.equals(bVar.f7374a) && this.f7375b.equals(bVar.f7375b) && this.f7376c.equals(bVar.f7376c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f7374a.hashCode() ^ 1000003) * 1000003) ^ this.f7375b.hashCode()) * 1000003) ^ this.f7376c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f7374a + ", sessionId=" + this.f7375b + ", reportFile=" + this.f7376c + "}";
    }
}
