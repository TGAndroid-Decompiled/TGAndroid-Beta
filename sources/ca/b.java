package ca;

import a8.p0;
public final class b extends p {
    public final String f6002b;
    public final String f6003c;
    public final String d;
    public final String f6004e;
    public final long f6005f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f6002b = str;
            if (str2 != null) {
                this.f6003c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f6004e = str4;
                        this.f6005f = j3;
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
            if (this.f6002b.equals(bVar.f6002b) && this.f6003c.equals(bVar.f6003c) && this.d.equals(bVar.d) && this.f6004e.equals(bVar.f6004e) && this.f6005f == bVar.f6005f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f6005f;
        return ((((((((this.f6002b.hashCode() ^ 1000003) * 1000003) ^ this.f6003c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f6004e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f6002b);
        sb2.append(", parameterKey=");
        sb2.append(this.f6003c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f6004e);
        sb2.append(", templateVersion=");
        return p0.r(sb2, this.f6005f, "}");
    }
}
