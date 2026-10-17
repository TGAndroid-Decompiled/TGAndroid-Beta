package m2;
public final class j {
    public final long f16440a;
    public final long f16441b;
    public final String f16442c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f16442c = str == null ? "" : str;
        this.f16440a = j10;
        this.f16441b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        String f7 = e2.e.f(str, this.f16442c);
        if (jVar != null) {
            long j11 = jVar.f16441b;
            if (f7.equals(e2.e.f(str, jVar.f16442c))) {
                long j12 = this.f16441b;
                long j13 = -1;
                if (j12 != -1) {
                    j10 = j11;
                    long j14 = this.f16440a;
                    jVar2 = null;
                    if (j14 + j12 == jVar.f16440a) {
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
                    long j15 = jVar.f16440a;
                    if (j15 + j10 == this.f16440a) {
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
            if (this.f16440a == jVar.f16440a && this.f16441b == jVar.f16441b && this.f16442c.equals(jVar.f16442c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f16442c.hashCode() + ((((527 + ((int) this.f16440a)) * 31) + ((int) this.f16441b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f16442c);
        sb2.append(", start=");
        sb2.append(this.f16440a);
        sb2.append(", length=");
        return a1.g.r(sb2, this.f16441b, ")");
    }
}
