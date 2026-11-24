package defpackage;
public final class wqe extends f4e {
    private static final wqe zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private nne zzg;
    private zne zzh;

    static {
        wqe wqeVar = new wqe();
        zzb = wqeVar;
        f4e.k(wqe.class, wqeVar);
    }

    public static void n(wqe wqeVar, gje gjeVar) {
        wqeVar.zzf = gjeVar;
        wqeVar.zze = 2;
    }

    public static void o(wqe wqeVar, gke gkeVar) {
        wqeVar.zzf = gkeVar;
        wqeVar.zze = 3;
    }

    public static void p(wqe wqeVar, xle xleVar) {
        xleVar.getClass();
        wqeVar.zzf = xleVar;
        wqeVar.zze = 7;
    }

    public static void q(wqe wqeVar, nne nneVar) {
        nneVar.getClass();
        wqeVar.zzg = nneVar;
        wqeVar.zzd |= 1;
    }

    public static void r(wqe wqeVar, cse cseVar) {
        wqeVar.zzf = cseVar;
        wqeVar.zze = 8;
    }

    public static void s(wqe wqeVar, rse rseVar) {
        wqeVar.zzf = rseVar;
        wqeVar.zze = 4;
    }

    public static nqe t() {
        return (nqe) zzb.f();
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
                return new wqe();
            }
            return new wce(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", gje.class, gke.class, rse.class, xme.class, "zzh", xle.class, cse.class});
        }
        return (byte) 1;
    }
}
