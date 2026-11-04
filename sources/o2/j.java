package o2;
public final class j {
    public final long f20547a;
    public final long f20548b;
    public final String f20549c;
    public int d;

    public j(long j10, String str, long j11) {
        this.f20549c = str == null ? "" : str;
        this.f20547a = j10;
        this.f20548b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f10 = g2.f.f(str, this.f20549c);
        if (jVar != null) {
            long j10 = jVar.f20548b;
            if (f10.equals(g2.f.f(str, jVar.f20549c))) {
                long j11 = this.f20548b;
                long j12 = -1;
                if (j11 != -1) {
                    long j13 = this.f20547a;
                    jVar2 = null;
                    if (j13 + j11 == jVar.f20547a) {
                        if (j10 != -1) {
                            j12 = j11 + j10;
                        }
                        return new j(j13, f10, j12);
                    }
                } else {
                    jVar2 = null;
                }
                if (j10 != -1) {
                    long j14 = jVar.f20547a;
                    if (j14 + j10 == this.f20547a) {
                        if (j11 != -1) {
                            j12 = j10 + j11;
                        }
                        return new j(j14, f10, j12);
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
            if (this.f20547a == jVar.f20547a && this.f20548b == jVar.f20548b && this.f20549c.equals(jVar.f20549c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f20549c.hashCode() + ((((527 + ((int) this.f20547a)) * 31) + ((int) this.f20548b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f20549c);
        sb2.append(", start=");
        sb2.append(this.f20547a);
        sb2.append(", length=");
        return a1.g.r(sb2, this.f20548b, ")");
    }
}
