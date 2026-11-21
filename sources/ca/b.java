package ca;

import a8.p0;
public final class b extends p {
    public final String f5135b;
    public final String f5136c;
    public final String d;
    public final String f5137e;
    public final long f5138f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f5135b = str;
            if (str2 != null) {
                this.f5136c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f5137e = str4;
                        this.f5138f = j3;
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
            if (this.f5135b.equals(bVar.f5135b) && this.f5136c.equals(bVar.f5136c) && this.d.equals(bVar.d) && this.f5137e.equals(bVar.f5137e) && this.f5138f == bVar.f5138f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f5138f;
        return ((((((((this.f5135b.hashCode() ^ 1000003) * 1000003) ^ this.f5136c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f5137e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f5135b);
        sb2.append(", parameterKey=");
        sb2.append(this.f5136c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f5137e);
        sb2.append(", templateVersion=");
        return p0.r(sb2, this.f5138f, "}");
    }
}
