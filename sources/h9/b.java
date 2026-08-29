package h9;

import a4.w;
public final class b extends n {
    public final String f7944b;
    public final String f7945c;
    public final String d;
    public final String f7946e;
    public final long f7947f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f7944b = str;
            if (str2 != null) {
                this.f7945c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f7946e = str4;
                        this.f7947f = j10;
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
        if (obj instanceof n) {
            b bVar = (b) ((n) obj);
            if (this.f7944b.equals(bVar.f7944b) && this.f7945c.equals(bVar.f7945c) && this.d.equals(bVar.d) && this.f7946e.equals(bVar.f7946e) && this.f7947f == bVar.f7947f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f7947f;
        return ((((((((this.f7944b.hashCode() ^ 1000003) * 1000003) ^ this.f7945c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f7946e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f7944b);
        sb2.append(", parameterKey=");
        sb2.append(this.f7945c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f7946e);
        sb2.append(", templateVersion=");
        return w.p(sb2, this.f7947f, "}");
    }
}
