package defpackage;
public final class cse extends f4e {
    private static final cse zzb;
    private int zzd;
    private gle zze;
    private long zzf;

    static {
        ?? f4eVar = new f4e();
        zzb = f4eVar;
        f4e.k(cse.class, f4eVar);
    }

    public static void n(cse cseVar, gle gleVar) {
        cseVar.zze = gleVar;
        cseVar.zzd |= 1;
    }

    public static void o(cse cseVar, long j) {
        cseVar.zzd |= 2;
        cseVar.zzf = j;
    }

    public static rre p() {
        return (rre) zzb.f();
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
            return new wce(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
