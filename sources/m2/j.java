package m2;
public final class j {
    public final long f14645a;
    public final long f14646b;
    public final String f14647c;
    public int d;

    public j(long j3, long j10, String str) {
        this.f14647c = str == null ? "" : str;
        this.f14645a = j3;
        this.f14646b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j3;
        long j10;
        long j11;
        String l4 = e2.a.l(str, this.f14647c);
        if (jVar != null) {
            long j12 = jVar.f14646b;
            if (l4.equals(e2.a.l(str, jVar.f14647c))) {
                long j13 = this.f14646b;
                if (j13 != -1) {
                    j3 = j12;
                    long j14 = this.f14645a;
                    jVar2 = null;
                    if (j14 + j13 == jVar.f14645a) {
                        if (j3 == -1) {
                            j11 = -1;
                        } else {
                            j11 = j13 + j3;
                        }
                        return new j(j14, j11, l4);
                    }
                } else {
                    jVar2 = null;
                    j3 = j12;
                }
                if (j3 != -1) {
                    long j15 = jVar.f14645a;
                    if (j15 + j3 == this.f14645a) {
                        if (j13 == -1) {
                            j10 = -1;
                        } else {
                            j10 = j3 + j13;
                        }
                        return new j(j15, j10, l4);
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
            if (this.f14645a == jVar.f14645a && this.f14646b == jVar.f14646b && this.f14647c.equals(jVar.f14647c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f14647c.hashCode() + ((((527 + ((int) this.f14645a)) * 31) + ((int) this.f14646b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f14647c);
        sb2.append(", start=");
        sb2.append(this.f14645a);
        sb2.append(", length=");
        return a4.a.r(sb2, this.f14646b, ")");
    }
}
