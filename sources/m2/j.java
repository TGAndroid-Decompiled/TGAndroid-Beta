package m2;
public final class j {
    public final long f15352a;
    public final long f15353b;
    public final String f15354c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f15354c = str == null ? "" : str;
        this.f15352a = j10;
        this.f15353b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        String f7 = e2.e.f(str, this.f15354c);
        if (jVar != null) {
            long j11 = jVar.f15353b;
            if (f7.equals(e2.e.f(str, jVar.f15354c))) {
                long j12 = this.f15353b;
                long j13 = -1;
                if (j12 != -1) {
                    j10 = j11;
                    long j14 = this.f15352a;
                    jVar2 = null;
                    if (j14 + j12 == jVar.f15352a) {
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
                    long j15 = jVar.f15352a;
                    if (j15 + j10 == this.f15352a) {
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
            if (this.f15352a == jVar.f15352a && this.f15353b == jVar.f15353b && this.f15354c.equals(jVar.f15354c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f15354c.hashCode() + ((((527 + ((int) this.f15352a)) * 31) + ((int) this.f15353b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f15354c);
        sb2.append(", start=");
        sb2.append(this.f15352a);
        sb2.append(", length=");
        return a1.g.r(sb2, this.f15353b, ")");
    }
}
