package m2;
public final class j {
    public final long f16007a;
    public final long f16008b;
    public final String f16009c;
    public int d;

    public j(long j3, long j10, String str) {
        this.f16009c = str == null ? "" : str;
        this.f16007a = j3;
        this.f16008b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j3;
        long j10;
        long j11;
        String l4 = e2.a.l(str, this.f16009c);
        if (jVar != null) {
            long j12 = jVar.f16008b;
            if (l4.equals(e2.a.l(str, jVar.f16009c))) {
                long j13 = this.f16008b;
                if (j13 != -1) {
                    j3 = j12;
                    long j14 = this.f16007a;
                    jVar2 = null;
                    if (j14 + j13 == jVar.f16007a) {
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
                    long j15 = jVar.f16007a;
                    if (j15 + j3 == this.f16007a) {
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
            if (this.f16007a == jVar.f16007a && this.f16008b == jVar.f16008b && this.f16009c.equals(jVar.f16009c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f16009c.hashCode() + ((((527 + ((int) this.f16007a)) * 31) + ((int) this.f16008b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f16009c);
        sb2.append(", start=");
        sb2.append(this.f16007a);
        sb2.append(", length=");
        return a4.a.r(sb2, this.f16008b, ")");
    }
}
