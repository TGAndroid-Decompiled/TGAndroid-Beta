package m2;
public final class j {
    public final long f15971a;
    public final long f15972b;
    public final String f15973c;
    public int d;

    public j(long j3, long j10, String str) {
        this.f15973c = str == null ? "" : str;
        this.f15971a = j3;
        this.f15972b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j3;
        String l4 = e2.a.l(str, this.f15973c);
        if (jVar != null) {
            long j10 = jVar.f15972b;
            if (l4.equals(e2.a.l(str, jVar.f15973c))) {
                long j11 = this.f15972b;
                long j12 = -1;
                if (j11 != -1) {
                    j3 = j10;
                    long j13 = this.f15971a;
                    jVar2 = null;
                    if (j13 + j11 == jVar.f15971a) {
                        if (j3 != -1) {
                            j12 = j11 + j3;
                        }
                        return new j(j13, j12, l4);
                    }
                } else {
                    jVar2 = null;
                    j3 = j10;
                }
                if (j3 != -1) {
                    long j14 = jVar.f15971a;
                    if (j14 + j3 == this.f15971a) {
                        if (j11 != -1) {
                            j12 = j3 + j11;
                        }
                        return new j(j14, j12, l4);
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
            if (this.f15971a == jVar.f15971a && this.f15972b == jVar.f15972b && this.f15973c.equals(jVar.f15973c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f15973c.hashCode() + ((((527 + ((int) this.f15971a)) * 31) + ((int) this.f15972b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f15973c);
        sb2.append(", start=");
        sb2.append(this.f15971a);
        sb2.append(", length=");
        return a1.g.s(sb2, this.f15972b, ")");
    }
}
