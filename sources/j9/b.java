package j9;
public final class b extends n {
    public final String f9301b;
    public final String f9302c;
    public final String d;
    public final String e;
    public final long f9303f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f9301b = str;
            if (str2 != null) {
                this.f9302c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.e = str4;
                        this.f9303f = j10;
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
            if (this.f9301b.equals(bVar.f9301b) && this.f9302c.equals(bVar.f9302c) && this.d.equals(bVar.d) && this.e.equals(bVar.e) && this.f9303f == bVar.f9303f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9303f;
        return ((((((((this.f9301b.hashCode() ^ 1000003) * 1000003) ^ this.f9302c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f9301b);
        sb.append(", parameterKey=");
        sb.append(this.f9302c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.e);
        sb.append(", templateVersion=");
        return android.support.v4.media.a.q(sb, this.f9303f, "}");
    }
}
