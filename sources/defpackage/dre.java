package defpackage;
public final class dre extends c2e {
    private static final dre zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        ?? c2eVar = new c2e();
        zzb = c2eVar;
        c2e.k(dre.class, c2eVar);
    }

    public static void n(dre dreVar, boolean z) {
        dreVar.zzd |= 8;
        dreVar.zzh = z;
    }

    public static void o(dre dreVar) {
        dreVar.zzd |= 16;
        dreVar.zzi = 0;
    }

    public static void p(dre dreVar, long j) {
        dreVar.zzd |= 4;
        dreVar.zzg = j;
    }

    public static void q(dre dreVar) {
        dreVar.zzd |= 2;
        dreVar.zzf = true;
    }

    public static vqe r() {
        return (vqe) zzb.f();
    }

    @Override
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new e0e(zzb);
                }
                return new c2e();
            }
            return new vae(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
