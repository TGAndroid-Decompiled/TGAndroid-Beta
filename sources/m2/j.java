package m2;
public final class j {
    public final long f17966a;
    public final long f17967b;
    public final String f17968c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f17968c = str == null ? "" : str;
        this.f17966a = j10;
        this.f17967b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        String f7 = e2.e.f(str, this.f17968c);
        if (jVar != null) {
            long j11 = jVar.f17967b;
            if (f7.equals(e2.e.f(str, jVar.f17968c))) {
                long j12 = this.f17967b;
                long j13 = -1;
                if (j12 != -1) {
                    j10 = j11;
                    long j14 = this.f17966a;
                    jVar2 = null;
                    if (j14 + j12 == jVar.f17966a) {
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
                    long j15 = jVar.f17966a;
                    if (j15 + j10 == this.f17966a) {
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
            if (this.f17966a == jVar.f17966a && this.f17967b == jVar.f17967b && this.f17968c.equals(jVar.f17968c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f17968c.hashCode() + ((((527 + ((int) this.f17966a)) * 31) + ((int) this.f17967b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f17968c);
        sb2.append(", start=");
        sb2.append(this.f17966a);
        sb2.append(", length=");
        return a1.g.r(sb2, this.f17967b, ")");
    }
}
