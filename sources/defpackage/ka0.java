package defpackage;
public final class ka0 extends ym9 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public ka0(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.d = str3;
                if (str4 != null) {
                    this.e = str4;
                    this.f = j;
                    return;
                }
                p3d.h("Null variantId");
                throw null;
            }
            p3d.h("Null parameterKey");
            throw null;
        }
        p3d.h("Null rolloutId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ym9) {
                ka0 ka0Var = (ka0) ((ym9) obj);
                if (this.b.equals(ka0Var.b) && this.c.equals(ka0Var.c) && this.d.equals(ka0Var.d) && this.e.equals(ka0Var.e) && this.f == ka0Var.f) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f;
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.b);
        sb.append(", parameterKey=");
        sb.append(this.c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return qu6.p(sb, this.f, "}");
    }
}
