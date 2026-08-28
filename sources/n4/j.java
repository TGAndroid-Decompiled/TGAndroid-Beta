package n4;
public final class j {
    public final long f18424a;
    public final long f18425b;
    public final String f18426c;
    public int d;

    public j(long j10, long j11, String str) {
        this.f18426c = str == null ? "" : str;
        this.f18424a = j10;
        this.f18425b = j11;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        long j10;
        long j11;
        long j12;
        String G = d5.a.G(str, this.f18426c);
        if (jVar != null) {
            long j13 = jVar.f18425b;
            if (G.equals(d5.a.G(str, jVar.f18426c))) {
                long j14 = this.f18425b;
                if (j14 != -1) {
                    j10 = j13;
                    long j15 = this.f18424a;
                    jVar2 = null;
                    if (j15 + j14 == jVar.f18424a) {
                        if (j10 == -1) {
                            j12 = -1;
                        } else {
                            j12 = j14 + j10;
                        }
                        return new j(j15, j12, G);
                    }
                } else {
                    jVar2 = null;
                    j10 = j13;
                }
                if (j10 != -1) {
                    long j16 = jVar.f18424a;
                    if (j16 + j10 == this.f18424a) {
                        if (j14 == -1) {
                            j11 = -1;
                        } else {
                            j11 = j10 + j14;
                        }
                        return new j(j16, j11, G);
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
            if (this.f18424a == jVar.f18424a && this.f18425b == jVar.f18425b && this.f18426c.equals(jVar.f18426c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.f18426c.hashCode() + ((((527 + ((int) this.f18424a)) * 31) + ((int) this.f18425b)) * 31);
        }
        return this.d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f18426c);
        sb2.append(", start=");
        sb2.append(this.f18424a);
        sb2.append(", length=");
        return aa.d.q(sb2, this.f18425b, ")");
    }
}
