package m2;
public final class j {
    public final long f16011a;
    public final long f16012b;
    public final String f16013c;
    public int d;

    public j(long j3, long j10, String str) {
        this.f16013c = str == null ? "" : str;
        this.f16011a = j3;
        this.f16012b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j3;
        long j10;
        long j11;
        String l4 = e2.a.l(str, this.f16013c);
        if (jVar != null) {
            long j12 = jVar.f16012b;
            if (l4.equals(e2.a.l(str, jVar.f16013c))) {
                long j13 = this.f16012b;
                if (j13 != -1) {
                    j3 = j12;
                    long j14 = this.f16011a;
                    jVar2 = null;
                    if (j14 + j13 == jVar.f16011a) {
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
                    long j15 = jVar.f16011a;
                    if (j15 + j3 == this.f16011a) {
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
            if (this.f16011a == jVar.f16011a && this.f16012b == jVar.f16012b && this.f16013c.equals(jVar.f16013c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f16013c.hashCode() + ((((527 + ((int) this.f16011a)) * 31) + ((int) this.f16012b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f16013c);
        sb2.append(", start=");
        sb2.append(this.f16011a);
        sb2.append(", length=");
        return a4.a.s(sb2, this.f16012b, ")");
    }
}
