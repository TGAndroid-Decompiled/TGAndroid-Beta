package defpackage;
public final class ia0 extends kj9 {
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;

    public ia0(String str, String str2, String str3, String str4, long j) {
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
                fvc.f("Null variantId");
                throw null;
            }
            fvc.f("Null parameterKey");
            throw null;
        }
        fvc.f("Null rolloutId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof kj9) {
                ia0 ia0Var = (ia0) ((kj9) obj);
                if (this.b.equals(ia0Var.b) && this.c.equals(ia0Var.c) && this.d.equals(ia0Var.d) && this.e.equals(ia0Var.e) && this.f == ia0Var.f) {
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
        return ls6.p(sb, this.f, "}");
    }
}
