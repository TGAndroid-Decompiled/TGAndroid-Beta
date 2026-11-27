package defpackage;

import java.io.File;
public final class d80 {
    public final c80 a;
    public final String b;
    public final File c;

    public d80(c80 c80Var, String str, File file) {
        this.a = c80Var;
        if (str != null) {
            this.b = str;
            this.c = file;
            return;
        }
        p3d.h("Null sessionId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d80) {
                d80 d80Var = (d80) obj;
                if (this.a.equals(d80Var.a) && this.b.equals(d80Var.b) && this.c.equals(d80Var.c)) {
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
