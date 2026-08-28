package f9;
public final class b extends n {
    public final String f5997b;
    public final String f5998c;
    public final String d;
    public final String f5999e;
    public final long f6000f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f5997b = str;
            if (str2 != null) {
                this.f5998c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f5999e = str4;
                        this.f6000f = j10;
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
            if (this.f5997b.equals(bVar.f5997b) && this.f5998c.equals(bVar.f5998c) && this.d.equals(bVar.d) && this.f5999e.equals(bVar.f5999e) && this.f6000f == bVar.f6000f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f6000f;
        return ((((((((this.f5997b.hashCode() ^ 1000003) * 1000003) ^ this.f5998c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f5999e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f5997b);
        sb2.append(", parameterKey=");
        sb2.append(this.f5998c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f5999e);
        sb2.append(", templateVersion=");
        return aa.d.q(sb2, this.f6000f, "}");
    }
}
