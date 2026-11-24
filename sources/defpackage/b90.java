package defpackage;

import java.io.File;
public final class b90 {
    public final a90 a;
    public final String b;
    public final File c;

    public b90(a90 a90Var, String str, File file) {
        this.a = a90Var;
        if (str != null) {
            this.b = str;
            this.c = file;
            return;
        }
        gxc.d("Null sessionId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b90) {
                b90 b90Var = (b90) obj;
                if (this.a.equals(b90Var.a) && this.b.equals(b90Var.b) && this.c.equals(b90Var.c)) {
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
