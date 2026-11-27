package defpackage;
public final class y8f extends ljf {
    private static final y8f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        ?? ljfVar = new ljf();
        zzb = ljfVar;
        ljf.e(y8f.class, ljfVar);
    }

    public static w8f l() {
        return (w8f) zzb.j();
    }

    public static void m(y8f y8fVar, int i) {
        y8fVar.zzd |= 2;
        y8fVar.zzf = i;
    }

    public static void n(y8f y8fVar, int i) {
        y8fVar.zzd |= 4;
        y8fVar.zzg = i;
    }

    public static void o(y8f y8fVar, boolean z) {
        y8fVar.zzd |= 8;
        y8fVar.zzh = z;
    }

    public static void p(y8f y8fVar, int i) {
        y8fVar.zze = i - 1;
        y8fVar.zzd |= 1;
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
                        return zzb;
                    }
                    return new kjf(zzb);
                }
                return new ljf();
            }
            return new ilf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", rj2.x, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
