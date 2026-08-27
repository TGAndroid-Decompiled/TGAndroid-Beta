package f9;

import java.io.File;

public final class b {

    public final h9.a0 f5923a;

    public final String f5924b;

    public final File f5925c;

    public b(h9.a0 a0Var, String str, File file) {
        this.f5923a = a0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f5924b = str;
        this.f5925c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5923a.equals(bVar.f5923a) && this.f5924b.equals(bVar.f5924b) && this.f5925c.equals(bVar.f5925c);
    }

    public final int hashCode() {
        return ((((this.f5923a.hashCode() ^ 1000003) * 1000003) ^ this.f5924b.hashCode()) * 1000003) ^ this.f5925c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f5923a + ", sessionId=" + this.f5924b + ", reportFile=" + this.f5925c + "}";
    }
}
