package e3;

import java.util.HashMap;
public final class a {
    public final h3.a f5084a;
    public final HashMap f5085b;

    public a(h3.a aVar, HashMap hashMap) {
        this.f5084a = aVar;
        this.f5085b = hashMap;
    }

    public final long a(v2.d dVar, long j10, int i10) {
        long j11;
        long l10 = j10 - this.f5084a.l();
        b bVar = (b) this.f5085b.get(dVar);
        long j12 = bVar.f5086a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), l10), bVar.f5087b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f5084a.equals(aVar.f5084a) && this.f5085b.equals(aVar.f5085b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f5084a.hashCode() ^ 1000003) * 1000003) ^ this.f5085b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f5084a + ", values=" + this.f5085b + "}";
    }
}
