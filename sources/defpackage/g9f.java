package defpackage;
public final class g9f extends ljf {
    private static final g9f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        ?? ljfVar = new ljf();
        zzb = ljfVar;
        ljf.e(g9f.class, ljfVar);
    }

    public static e9f l() {
        return (e9f) zzb.j();
    }

    public static void m(g9f g9fVar, int i) {
        g9fVar.zzd |= 2;
        g9fVar.zzf = i;
    }

    public static void n(g9f g9fVar, int i) {
        g9fVar.zzd |= 4;
        g9fVar.zzg = i;
    }

    public static void o(g9f g9fVar, int i) {
        g9fVar.zzd |= 8;
        g9fVar.zzh = i;
    }

    public static void p(g9f g9fVar, int i) {
        g9fVar.zze = i - 1;
        g9fVar.zzd |= 1;
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
            return new ilf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", qf5.x, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
