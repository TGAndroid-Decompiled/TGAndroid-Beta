package g7;

public abstract class t7 {
    public static final long a(int i10, hd.c unit) {
        kotlin.jvm.internal.j.e(unit, "unit");
        if (unit.compareTo(hd.c.SECONDS) <= 0) {
            long jA = u7.a(i10, unit, hd.c.NANOSECONDS) << 1;
            int i11 = hd.a.d;
            int i12 = hd.b.f8911a;
            return jA;
        }
        long j10 = i10;
        hd.c cVar = hd.c.NANOSECONDS;
        long jA2 = u7.a(4611686018426999999L, cVar, unit);
        if ((-jA2) <= j10 && j10 <= jA2) {
            long jA3 = u7.a(j10, unit, cVar) << 1;
            int i13 = hd.a.d;
            int i14 = hd.b.f8911a;
            return jA3;
        }
        hd.c targetUnit = hd.c.MILLISECONDS;
        kotlin.jvm.internal.j.e(targetUnit, "targetUnit");
        long jConvert = targetUnit.f8917a.convert(j10, unit.f8917a);
        long j11 = -4611686018427387903L;
        if (jConvert < -4611686018427387903L) {
            jConvert = j11;
        } else {
            j11 = 4611686018427387903L;
            if (jConvert > 4611686018427387903L) {
                jConvert = j11;
            }
        }
        long j12 = (jConvert << 1) + 1;
        int i15 = hd.a.d;
        int i16 = hd.b.f8911a;
        return j12;
    }
}
