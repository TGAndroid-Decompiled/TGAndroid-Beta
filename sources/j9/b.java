package j9;
public final class b extends n {
    public final String f9952b;
    public final String f9953c;
    public final String d;
    public final String f9954e;
    public final long f9955f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str != null) {
            this.f9952b = str;
            if (str2 != null) {
                this.f9953c = str2;
                if (str3 != null) {
                    this.d = str3;
                    if (str4 != null) {
                        this.f9954e = str4;
                        this.f9955f = j10;
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
            if (this.f9952b.equals(bVar.f9952b) && this.f9953c.equals(bVar.f9953c) && this.d.equals(bVar.d) && this.f9954e.equals(bVar.f9954e) && this.f9955f == bVar.f9955f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9955f;
        return ((((((((this.f9952b.hashCode() ^ 1000003) * 1000003) ^ this.f9953c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f9954e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.f9952b);
        sb.append(", parameterKey=");
        sb.append(this.f9953c);
        sb.append(", parameterValue=");
        sb.append(this.d);
        sb.append(", variantId=");
        sb.append(this.f9954e);
        sb.append(", templateVersion=");
        return android.support.v4.media.a.q(sb, this.f9955f, "}");
    }
}
