package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
public final class h7f extends ljf {
    private static final pjf zzb = new Object();
    private static final h7f zzd;
    private int zze;
    private z7f zzf;
    private vcf zzg;
    private tjf zzh = hlf.d;
    private ojf zzi = mjf.d;

    static {
        h7f h7fVar = new h7f();
        zzd = h7fVar;
        ljf.e(h7f.class, h7fVar);
    }

    public static e7f l() {
        return (e7f) zzd.j();
    }

    public static void m(h7f h7fVar, z7f z7fVar) {
        h7fVar.zzf = z7fVar;
        h7fVar.zze |= 1;
    }

    public static void n(h7f h7fVar, ArrayList arrayList) {
        int i;
        ojf ojfVar = h7fVar.zzi;
        if (!((bif) ojfVar).a) {
            int size = ojfVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            mjf mjfVar = (mjf) ojfVar;
            if (i >= mjfVar.c) {
                h7fVar.zzi = new mjf(Arrays.copyOf(mjfVar.b, i), mjfVar.c, true);
            } else {
                iy8.d();
                return;
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            ((mjf) h7fVar.zzi).zzh(((b6f) obj).a);
        }
    }

    @Override
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzd;
                    }
                    return new kjf(zzd);
                }
                return new h7f();
            }
            return new ilf(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zze", "zzf", "zzg", "zzh", pcf.class, "zzi", z3f.E});
        }
        return (byte) 1;
    }
}
