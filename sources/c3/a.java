package c3;

import java.util.HashMap;

public final class a {

    public final f3.a f2416a;

    public final HashMap f2417b;

    public a(f3.a aVar, HashMap map) {
        this.f2416a = aVar;
        this.f2417b = map;
    }

    public final long a(t2.d dVar, long j10, int i10) {
        long jE = j10 - this.f2416a.E();
        b bVar = (b) this.f2417b.get(dVar);
        long j11 = bVar.f2418a;
        int i11 = i10 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j11 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j11 > 1 ? j11 : 2L) * ((long) i11)))), jE), bVar.f2419b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2416a.equals(aVar.f2416a) && this.f2417b.equals(aVar.f2417b);
    }

    public final int hashCode() {
        return ((this.f2416a.hashCode() ^ 1000003) * 1000003) ^ this.f2417b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f2416a + ", values=" + this.f2417b + "}";
    }
}
