package defpackage;
public final class zpe extends c2e {
    private static final zpe zzb;
    private int zzd;
    private fje zze;
    private long zzf;

    static {
        ?? c2eVar = new c2e();
        zzb = c2eVar;
        c2e.k(zpe.class, c2eVar);
    }

    public static void n(zpe zpeVar, fje fjeVar) {
        zpeVar.zze = fjeVar;
        zpeVar.zzd |= 1;
    }

    public static void o(zpe zpeVar, long j) {
        zpeVar.zzd |= 2;
        zpeVar.zzf = j;
    }

    public static ope p() {
        return (ope) zzb.f();
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
            return new vae(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
