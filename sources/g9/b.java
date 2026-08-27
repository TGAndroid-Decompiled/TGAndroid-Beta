package g9;

import a9.p;

public final class b extends n {

    public final String f6797b;

    public final String f6798c;
    public final String d;

    public final String f6799e;

    public final long f6800f;

    public b(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f6797b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f6798c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f6799e = str4;
        this.f6800f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            b bVar = (b) ((n) obj);
            if (this.f6797b.equals(bVar.f6797b) && this.f6798c.equals(bVar.f6798c) && this.d.equals(bVar.d) && this.f6799e.equals(bVar.f6799e) && this.f6800f == bVar.f6800f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f6797b.hashCode() ^ 1000003) * 1000003) ^ this.f6798c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f6799e.hashCode()) * 1000003;
        long j10 = this.f6800f;
        return iHashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f6797b);
        sb2.append(", parameterKey=");
        sb2.append(this.f6798c);
        sb2.append(", parameterValue=");
        sb2.append(this.d);
        sb2.append(", variantId=");
        sb2.append(this.f6799e);
        sb2.append(", templateVersion=");
        return p.o(sb2, this.f6800f, "}");
    }
}
