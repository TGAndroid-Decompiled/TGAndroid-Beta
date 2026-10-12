package m2;
public final class j {
    public final long f15696a;
    public final long f15697b;
    public final String f15698c;
    public int d;

    public j(long j3, long j10, String str) {
        this.f15698c = str == null ? "" : str;
        this.f15696a = j3;
        this.f15697b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j3;
        String l4 = e2.a.l(str, this.f15698c);
        if (jVar != null) {
            long j10 = jVar.f15697b;
            if (l4.equals(e2.a.l(str, jVar.f15698c))) {
                long j11 = this.f15697b;
                long j12 = -1;
                if (j11 != -1) {
                    j3 = j10;
                    long j13 = this.f15696a;
                    jVar2 = null;
                    if (j13 + j11 == jVar.f15696a) {
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
                    long j14 = jVar.f15696a;
                    if (j14 + j3 == this.f15696a) {
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
            if (this.f15696a == jVar.f15696a && this.f15697b == jVar.f15697b && this.f15698c.equals(jVar.f15698c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f15698c.hashCode() + ((((527 + ((int) this.f15696a)) * 31) + ((int) this.f15697b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f15698c);
        sb2.append(", start=");
        sb2.append(this.f15696a);
        sb2.append(", length=");
        return a1.g.s(sb2, this.f15697b, ")");
    }
}
