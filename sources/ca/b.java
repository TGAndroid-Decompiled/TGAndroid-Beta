package ca;

import a8.p0;
public final class b extends p {
    public final String f4827b;
    public final String f4828c;
    public final String d;
    public final String f4829e;
    public final long f4830f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f4827b = str;
            if (str2 != null) {
                this.f4828c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f4829e = str4;
                        this.f4830f = j3;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            b bVar = (b) ((p) obj);
            if (this.f4827b.equals(bVar.f4827b) && this.f4828c.equals(bVar.f4828c) && this.d.equals(bVar.d) && this.f4829e.equals(bVar.f4829e) && this.f4830f == bVar.f4830f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4830f;
        return ((((((((this.f4827b.hashCode() ^ 1000003) * 1000003) ^ this.f4828c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f4829e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f4827b);
        sb2.append(", parameterKey=");
        sb2.append(this.f4828c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f4829e);
        sb2.append(", templateVersion=");
        return p0.r(sb2, this.f4830f, "}");
    }
}
