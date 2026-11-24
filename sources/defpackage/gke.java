package defpackage;
public final class gke extends f4e {
    private static final gke zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        gke gkeVar = new gke();
        zzb = gkeVar;
        f4e.k(gke.class, gkeVar);
    }

    public static void o(gke gkeVar, fme fmeVar) {
        gkeVar.zzh = fmeVar.a;
        gkeVar.zzd |= 2;
    }

    public static void p(gke gkeVar, hqe hqeVar) {
        gkeVar.zzf = hqeVar;
        gkeVar.zze = 4;
    }

    public static void q(gke gkeVar, gte gteVar) {
        gkeVar.zzf = gteVar;
        gkeVar.zze = 3;
    }

    public static void r(gke gkeVar, int i) {
        gkeVar.zzg = i - 1;
        gkeVar.zzd |= 1;
    }

    public static oje s() {
        return (oje) zzb.f();
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
                return new gke();
            }
            return new wce(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", btd.c, ooe.class, gte.class, hqe.class, "zzh", btd.e});
        }
        return (byte) 1;
    }

    public final hqe n() {
        if (this.zze == 4) {
            return (hqe) this.zzf;
        }
        return hqe.o();
    }
}
