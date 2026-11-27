package defpackage;
public final class kte extends s6e {
    private static final kte zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private cqe zzg;
    private oqe zzh;

    static {
        kte kteVar = new kte();
        zzb = kteVar;
        s6e.k(kte.class, kteVar);
    }

    public static void n(kte kteVar, wle wleVar) {
        kteVar.zzf = wleVar;
        kteVar.zze = 2;
    }

    public static void o(kte kteVar, wme wmeVar) {
        kteVar.zzf = wmeVar;
        kteVar.zze = 3;
    }

    public static void p(kte kteVar, moe moeVar) {
        moeVar.getClass();
        kteVar.zzf = moeVar;
        kteVar.zze = 7;
    }

    public static void q(kte kteVar, cqe cqeVar) {
        cqeVar.getClass();
        kteVar.zzg = cqeVar;
        kteVar.zzd |= 1;
    }

    public static void r(kte kteVar, que queVar) {
        kteVar.zzf = queVar;
        kteVar.zze = 8;
    }

    public static void s(kte kteVar, fve fveVar) {
        kteVar.zzf = fveVar;
        kteVar.zze = 4;
    }

    public static bte t() {
        return (bte) zzb.f();
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
                return new kte();
            }
            return new lfe(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", wle.class, wme.class, fve.class, mpe.class, "zzh", moe.class, que.class});
        }
        return (byte) 1;
    }
}
