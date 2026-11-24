package defpackage;
public final class fje extends c2e {
    private static final fje zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        fje fjeVar = new fje();
        zzb = fjeVar;
        c2e.k(fje.class, fjeVar);
    }

    public static void n(fje fjeVar, String str) {
        fjeVar.zzd |= 8;
        fjeVar.zzh = str;
    }

    public static void o(fje fjeVar, String str) {
        str.getClass();
        fjeVar.zzd |= 2;
        fjeVar.zzf = str;
    }

    public static void p(fje fjeVar, int i) {
        fjeVar.zzd |= 16;
        fjeVar.zzi = i;
    }

    public static void q(fje fjeVar, int i) {
        fjeVar.zzg = yjb.e(i);
        fjeVar.zzd |= 4;
    }

    public static void r(fje fjeVar, int i) {
        fjeVar.zzd |= 1;
        fjeVar.zze = i;
    }

    public static mie s() {
        return (mie) zzb.f();
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
                return new fje();
            }
            return new vae(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", yqd.d, "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
