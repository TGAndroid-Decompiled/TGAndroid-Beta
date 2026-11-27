package defpackage;
public final class que extends s6e {
    private static final que zzb;
    private int zzd;
    private wne zze;
    private long zzf;

    static {
        ?? s6eVar = new s6e();
        zzb = s6eVar;
        s6e.k(que.class, s6eVar);
    }

    public static void n(que queVar, wne wneVar) {
        queVar.zze = wneVar;
        queVar.zzd |= 1;
    }

    public static void o(que queVar, long j) {
        queVar.zzd |= 2;
        queVar.zzf = j;
    }

    public static fue p() {
        return (fue) zzb.f();
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
            return new lfe(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
