package ca;

import a8.p0;
public final class b extends p {
    public final String f4824b;
    public final String f4825c;
    public final String d;
    public final String f4826e;
    public final long f4827f;

    public b(String str, String str2, String str3, String str4, long j3) {
        if (str != null) {
            this.f4824b = str;
            if (str2 != null) {
                this.f4825c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f4826e = str4;
                        this.f4827f = j3;
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
            if (this.f4824b.equals(bVar.f4824b) && this.f4825c.equals(bVar.f4825c) && this.d.equals(bVar.d) && this.f4826e.equals(bVar.f4826e) && this.f4827f == bVar.f4827f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f4827f;
        return ((((((((this.f4824b.hashCode() ^ 1000003) * 1000003) ^ this.f4825c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f4826e.hashCode()) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f4824b);
        sb2.append(", parameterKey=");
        sb2.append(this.f4825c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f4826e);
        sb2.append(", templateVersion=");
        return p0.r(sb2, this.f4827f, "}");
    }
}
