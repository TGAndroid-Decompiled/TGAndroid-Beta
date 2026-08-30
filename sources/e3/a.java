package e3;

import java.util.HashMap;
public final class a {
    public final h3.a f5078a;
    public final HashMap f5079b;

    public a(h3.a aVar, HashMap hashMap) {
        this.f5078a = aVar;
        this.f5079b = hashMap;
    }

    public final long a(v2.d dVar, long j10, int i10) {
        long j11;
        long X = j10 - this.f5078a.X();
        b bVar = (b) this.f5079b.get(dVar);
        long j12 = bVar.f5080a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), X), bVar.f5081b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f5078a.equals(aVar.f5078a) && this.f5079b.equals(aVar.f5079b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f5078a.hashCode() ^ 1000003) * 1000003) ^ this.f5079b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f5078a + ", values=" + this.f5079b + "}";
    }
}
