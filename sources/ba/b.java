package ba;
public final class b extends p {
    public final String f3170b;
    public final String f3171c;
    public final String d;
    public final String f3172e;
    public final long f3173f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f3170b = str;
            if (str2 != null) {
                this.f3171c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f3172e = str4;
                        this.f3173f = j10;
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
            if (this.f3170b.equals(bVar.f3170b) && this.f3171c.equals(bVar.f3171c) && this.d.equals(bVar.d) && this.f3172e.equals(bVar.f3172e) && this.f3173f == bVar.f3173f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3173f;
        return ((((((((this.f3170b.hashCode() ^ 1000003) * 1000003) ^ this.f3171c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f3172e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f3170b);
        sb2.append(", parameterKey=");
        sb2.append(this.f3171c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f3172e);
        sb2.append(", templateVersion=");
        return a1.g.r(sb2, this.f3173f, "}");
    }
}
