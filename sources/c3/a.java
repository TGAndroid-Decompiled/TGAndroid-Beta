package c3;

import java.util.HashMap;
public final class a {
    public final f3.a f2278a;
    public final HashMap f2279b;

    public a(f3.a aVar, HashMap hashMap) {
        this.f2278a = aVar;
        this.f2279b = hashMap;
    }

    public final long a(t2.d dVar, long j10, int i9) {
        long j11;
        long d = j10 - this.f2278a.d();
        b bVar = (b) this.f2279b.get(dVar);
        long j12 = bVar.f2280a;
        int i10 = i9 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i10))), d), bVar.f2281b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f2278a.equals(aVar.f2278a) && this.f2279b.equals(aVar.f2279b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f2278a.hashCode() ^ 1000003) * 1000003) ^ this.f2279b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f2278a + ", values=" + this.f2279b + "}";
    }
}
