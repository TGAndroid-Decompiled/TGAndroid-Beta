package i9;

import java.io.File;
import k9.a0;
public final class b {
    public final a0 f7937a;
    public final String f7938b;
    public final File f7939c;

    public b(a0 a0Var, String str, File file) {
        this.f7937a = a0Var;
        if (str != null) {
            this.f7938b = str;
            this.f7939c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f7937a.equals(bVar.f7937a) && this.f7938b.equals(bVar.f7938b) && this.f7939c.equals(bVar.f7939c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f7937a.hashCode() ^ 1000003) * 1000003) ^ this.f7938b.hashCode()) * 1000003) ^ this.f7939c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f7937a + ", sessionId=" + this.f7938b + ", reportFile=" + this.f7939c + "}";
    }
}
