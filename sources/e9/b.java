package e9;

import g9.a0;
import java.io.File;
public final class b {
    public final a0 f4992a;
    public final String f4993b;
    public final File f4994c;

    public b(a0 a0Var, String str, File file) {
        this.f4992a = a0Var;
        if (str != null) {
            this.f4993b = str;
            this.f4994c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f4992a.equals(bVar.f4992a) && this.f4993b.equals(bVar.f4993b) && this.f4994c.equals(bVar.f4994c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f4992a.hashCode() ^ 1000003) * 1000003) ^ this.f4993b.hashCode()) * 1000003) ^ this.f4994c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f4992a + ", sessionId=" + this.f4993b + ", reportFile=" + this.f4994c + "}";
    }
}
