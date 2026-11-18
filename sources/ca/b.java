package ca;

import a8.p0;
public final class b extends p {
    public final String f5106b;
    public final String f5107c;
    public final String d;
    public final String f5108e;
    public final long f5109f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f5106b = str;
            if (str2 != null) {
                this.f5107c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f5108e = str4;
                        this.f5109f = j3;
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
            if (this.f5106b.equals(bVar.f5106b) && this.f5107c.equals(bVar.f5107c) && this.d.equals(bVar.d) && this.f5108e.equals(bVar.f5108e) && this.f5109f == bVar.f5109f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5109f;
        return ((((((((this.f5106b.hashCode() ^ 1000003) * 1000003) ^ this.f5107c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f5108e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f5106b);
        sb2.append(", parameterKey=");
        sb2.append(this.f5107c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f5108e);
        sb2.append(", templateVersion=");
        return p0.r(sb2, this.f5109f, "}");
    }
}
