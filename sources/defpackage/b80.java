package defpackage;

import java.io.File;
public final class b80 {
    public final a80 a;
    public final String b;
    public final File c;

    public b80(a80 a80Var, String str, File file) {
        this.a = a80Var;
        if (str != null) {
            this.b = str;
            this.c = file;
            return;
        }
        fvc.f("Null sessionId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b80) {
                b80 b80Var = (b80) obj;
                if (this.a.equals(b80Var.a) && this.b.equals(b80Var.b) && this.c.equals(b80Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
