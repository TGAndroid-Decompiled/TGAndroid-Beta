package m2;
public final class j {
    public final long f15087a;
    public final long f15088b;
    public final String f15089c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f15089c = str == null ? "" : str;
        this.f15087a = j10;
        this.f15088b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        String f7 = e2.e.f(str, this.f15089c);
        if (jVar != null) {
            long j11 = jVar.f15088b;
            if (f7.equals(e2.e.f(str, jVar.f15089c))) {
                long j12 = this.f15088b;
                long j13 = -1;
                if (j12 != -1) {
                    j10 = j11;
                    long j14 = this.f15087a;
                    jVar2 = null;
                    if (j14 + j12 == jVar.f15087a) {
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
                    long j15 = jVar.f15087a;
                    if (j15 + j10 == this.f15087a) {
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
            if (this.f15087a == jVar.f15087a && this.f15088b == jVar.f15088b && this.f15089c.equals(jVar.f15089c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f15089c.hashCode() + ((((527 + ((int) this.f15087a)) * 31) + ((int) this.f15088b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f15089c);
        sb2.append(", start=");
        sb2.append(this.f15087a);
        sb2.append(", length=");
        return a1.g.r(sb2, this.f15088b, ")");
    }
}
