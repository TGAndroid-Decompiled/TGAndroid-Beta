package defpackage;
public final class l9f extends ljf {
    private static final l9f zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        ?? ljfVar = new ljf();
        zzb = ljfVar;
        ljf.e(l9f.class, ljfVar);
    }

    public static j9f l() {
        return (j9f) zzb.j();
    }

    public static void m(l9f l9fVar, int i) {
        l9fVar.zzd |= 2;
        l9fVar.zzf = i;
    }

    public static void n(l9f l9fVar, int i) {
        l9fVar.zze = i - 1;
        l9fVar.zzd |= 1;
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
            return new ilf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", faf.y, "zzf"});
        }
        return (byte) 1;
    }
}
