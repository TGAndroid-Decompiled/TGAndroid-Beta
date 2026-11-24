package defpackage;
public final class gte extends f4e {
    private static final gte zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        ?? f4eVar = new f4e();
        zzb = f4eVar;
        f4e.k(gte.class, f4eVar);
    }

    public static void n(gte gteVar, boolean z) {
        gteVar.zzd |= 8;
        gteVar.zzh = z;
    }

    public static void o(gte gteVar) {
        gteVar.zzd |= 16;
        gteVar.zzi = 0;
    }

    public static void p(gte gteVar, long j) {
        gteVar.zzd |= 4;
        gteVar.zzg = j;
    }

    public static void q(gte gteVar) {
        gteVar.zzd |= 2;
        gteVar.zzf = true;
    }

    public static yse r() {
        return (yse) zzb.f();
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
                    return new h2e(zzb);
                }
                return new f4e();
            }
            return new wce(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
