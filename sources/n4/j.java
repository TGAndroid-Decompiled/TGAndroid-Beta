package n4;

public final class j {

    public final long f18251a;

    public final long f18252b;

    public final String f18253c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f18253c = str == null ? "" : str;
        this.f18251a = j10;
        this.f18252b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        String strG = d5.a.G(str, this.f18253c);
        if (jVar != null) {
            long j11 = jVar.f18252b;
            if (strG.equals(d5.a.G(str, jVar.f18253c))) {
                long j12 = this.f18252b;
                if (j12 != -1) {
                    j10 = j11;
                    long j13 = this.f18251a;
                    jVar2 = null;
                    if (j13 + j12 == jVar.f18251a) {
                        return new j(j13, j10 == -1 ? -1L : j12 + j10, strG);
                    }
                } else {
                    jVar2 = null;
                    j10 = j11;
                }
                if (j10 == -1) {
                    return jVar2;
                }
                long j14 = jVar.f18251a;
                if (j14 + j10 == this.f18251a) {
                    return new j(j14, j12 == -1 ? -1L : j10 + j12, strG);
                }
                return jVar2;
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f18251a == jVar.f18251a && this.f18252b == jVar.f18252b && this.f18253c.equals(jVar.f18253c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f18253c.hashCode() + ((((527 + ((int) this.f18251a)) * 31) + ((int) this.f18252b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f18253c);
        sb2.append(", start=");
        sb2.append(this.f18251a);
        sb2.append(", length=");
        return a9.p.o(sb2, this.f18252b, ")");
    }
}
