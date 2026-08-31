package e3;

import java.util.HashMap;
public final class a {
    public final h3.a f4914a;
    public final HashMap f4915b;

    public a(h3.a aVar, HashMap hashMap) {
        this.f4914a = aVar;
        this.f4915b = hashMap;
    }

    public final long a(v2.d dVar, long j10, int i10) {
        long j11;
        long W = j10 - this.f4914a.W();
        b bVar = (b) this.f4915b.get(dVar);
        long j12 = bVar.f4916a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), W), bVar.f4917b);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f4914a.equals(aVar.f4914a) && this.f4915b.equals(aVar.f4915b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f4914a.hashCode() ^ 1000003) * 1000003) ^ this.f4915b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f4914a + ", values=" + this.f4915b + "}";
    }
}
