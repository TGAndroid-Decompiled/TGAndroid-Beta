package defpackage;
public final class u8f extends ljf {
    private static final u8f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        ?? ljfVar = new ljf();
        zzb = ljfVar;
        ljf.e(u8f.class, ljfVar);
    }

    public static s8f l() {
        return (s8f) zzb.j();
    }

    public static void m(u8f u8fVar, int i) {
        u8fVar.zzd |= 2;
        u8fVar.zzf = i;
    }

    public static void n(u8f u8fVar, int i) {
        u8fVar.zzd |= 4;
        u8fVar.zzg = i;
    }

    public static void o(u8f u8fVar, int i) {
        u8fVar.zzd |= 8;
        u8fVar.zzh = i;
    }

    public static void p(u8f u8fVar, int i) {
        u8fVar.zzd |= 16;
        u8fVar.zzi = i;
    }

    public static void q(u8f u8fVar, int i) {
        u8fVar.zze = i - 1;
        u8fVar.zzd |= 1;
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
            return new ilf(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", sjf.y, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
