package m2;
public final class j {
    public final long f16016a;
    public final long f16017b;
    public final String f16018c;
    public int d;

    public j(long j3, long j10, String str) {
        this.f16018c = str == null ? "" : str;
        this.f16016a = j3;
        this.f16017b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j3;
        long j10;
        long j11;
        String l4 = e2.a.l(str, this.f16018c);
        if (jVar != null) {
            long j12 = jVar.f16017b;
            if (l4.equals(e2.a.l(str, jVar.f16018c))) {
                long j13 = this.f16017b;
                if (j13 != -1) {
                    j3 = j12;
                    long j14 = this.f16016a;
                    jVar2 = null;
                    if (j14 + j13 == jVar.f16016a) {
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
                    long j15 = jVar.f16016a;
                    if (j15 + j3 == this.f16016a) {
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
            if (this.f16016a == jVar.f16016a && this.f16017b == jVar.f16017b && this.f16018c.equals(jVar.f16018c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f16018c.hashCode() + ((((527 + ((int) this.f16016a)) * 31) + ((int) this.f16017b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f16018c);
        sb2.append(", start=");
        sb2.append(this.f16016a);
        sb2.append(", length=");
        return a4.a.s(sb2, this.f16017b, ")");
    }
}
