package m2;
public final class j {
    public final long f12662a;
    public final long f12663b;
    public final String f12664c;
    public int d;

    public j(long j10, String str, long j11) {
        this.f12664c = str == null ? "" : str;
        this.f12662a = j10;
        this.f12663b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String f7 = e2.e.f(str, this.f12664c);
        if (jVar != null) {
            long j10 = jVar.f12663b;
            if (f7.equals(e2.e.f(str, jVar.f12664c))) {
                long j11 = this.f12663b;
                long j12 = -1;
                if (j11 != -1) {
                    long j13 = this.f12662a;
                    jVar2 = null;
                    if (j13 + j11 == jVar.f12662a) {
                        if (j10 != -1) {
                            j12 = j11 + j10;
                        }
                        return new j(j13, f7, j12);
                    }
                } else {
                    jVar2 = null;
                }
                if (j10 != -1) {
                    long j14 = jVar.f12662a;
                    if (j14 + j10 == this.f12662a) {
                        if (j11 != -1) {
                            j12 = j10 + j11;
                        }
                        return new j(j14, f7, j12);
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
            if (this.f12662a == jVar.f12662a && this.f12663b == jVar.f12663b && this.f12664c.equals(jVar.f12664c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f12664c.hashCode() + ((((527 + ((int) this.f12662a)) * 31) + ((int) this.f12663b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f12664c);
        sb2.append(", start=");
        sb2.append(this.f12662a);
        sb2.append(", length=");
        return a1.g.q(sb2, this.f12663b, ")");
    }
}
