package m2;
public final class j {
    public final long f16509a;
    public final long f16510b;
    public final String f16511c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f16511c = str == null ? "" : str;
        this.f16509a = j10;
        this.f16510b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        String f7 = e2.e.f(str, this.f16511c);
        if (jVar != null) {
            long j11 = jVar.f16510b;
            if (f7.equals(e2.e.f(str, jVar.f16511c))) {
                long j12 = this.f16510b;
                long j13 = -1;
                if (j12 != -1) {
                    j10 = j11;
                    long j14 = this.f16509a;
                    jVar2 = null;
                    if (j14 + j12 == jVar.f16509a) {
                        if (j10 != -1) {
                            j13 = j12 + j10;
                        }
                        return new j(j14, j13, f7);
                    }
                } else {
                    jVar2 = null;
                    j10 = j11;
                }
                if (j10 != -1) {
                    long j15 = jVar.f16509a;
                    if (j15 + j10 == this.f16509a) {
                        if (j12 != -1) {
                            j13 = j10 + j12;
                        }
                        return new j(j15, j13, f7);
                    }
                    return jVar2;
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
            if (this.f16509a == jVar.f16509a && this.f16510b == jVar.f16510b && this.f16511c.equals(jVar.f16511c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f16511c.hashCode() + ((((527 + ((int) this.f16509a)) * 31) + ((int) this.f16510b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f16511c);
        sb2.append(", start=");
        sb2.append(this.f16509a);
        sb2.append(", length=");
        return a1.g.r(sb2, this.f16510b, ")");
    }
}
