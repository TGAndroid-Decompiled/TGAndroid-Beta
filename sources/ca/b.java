package ca;

import a8.p0;
public final class b extends p {
    public final String f5999b;
    public final String f6000c;
    public final String d;
    public final String f6001e;
    public final long f6002f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f5999b = str;
            if (str2 != null) {
                this.f6000c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f6001e = str4;
                        this.f6002f = j3;
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
            if (this.f5999b.equals(bVar.f5999b) && this.f6000c.equals(bVar.f6000c) && this.d.equals(bVar.d) && this.f6001e.equals(bVar.f6001e) && this.f6002f == bVar.f6002f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f6002f;
        return ((((((((this.f5999b.hashCode() ^ 1000003) * 1000003) ^ this.f6000c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f6001e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f5999b);
        sb2.append(", parameterKey=");
        sb2.append(this.f6000c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f6001e);
        sb2.append(", templateVersion=");
        return p0.r(sb2, this.f6002f, "}");
    }
}
