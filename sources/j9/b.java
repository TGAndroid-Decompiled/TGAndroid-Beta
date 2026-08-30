package j9;
public final class b extends n {
    public final String f9319b;
    public final String f9320c;
    public final String d;
    public final String e;
    public final long f9321f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f9319b = str;
            if (str2 != null) {
                this.f9320c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.e = str4;
                        this.f9321f = j10;
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
            if (this.f9319b.equals(bVar.f9319b) && this.f9320c.equals(bVar.f9320c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f9321f == bVar.f9321f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9321f;
        return ((((((((this.f9319b.hashCode() ^ 1000003) * 1000003) ^ this.f9320c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f9319b);
        sb.append(", parameterKey=");
        sb.append(this.f9320c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return android.support.v4.media.a.q(sb, this.f9321f, "}");
    }
}
