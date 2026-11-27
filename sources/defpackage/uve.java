package defpackage;
public final class uve extends s6e {
    private static final uve zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        ?? s6eVar = new s6e();
        zzb = s6eVar;
        s6e.k(uve.class, s6eVar);
    }

    public static void n(uve uveVar, boolean z) {
        uveVar.zzd |= 8;
        uveVar.zzh = z;
    }

    public static void o(uve uveVar) {
        uveVar.zzd |= 16;
        uveVar.zzi = 0;
    }

    public static void p(uve uveVar, long j) {
        uveVar.zzd |= 4;
        uveVar.zzg = j;
    }

    public static void q(uve uveVar) {
        uveVar.zzd |= 2;
        uveVar.zzf = true;
    }

    public static mve r() {
        return (mve) zzb.f();
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
                    return new u4e(zzb);
                }
                return new s6e();
            }
            return new lfe(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
