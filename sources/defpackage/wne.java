package defpackage;
public final class wne extends s6e {
    private static final wne zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        wne wneVar = new wne();
        zzb = wneVar;
        s6e.k(wne.class, wneVar);
    }

    public static void n(wne wneVar, String str) {
        wneVar.zzd |= 8;
        wneVar.zzh = str;
    }

    public static void o(wne wneVar, String str) {
        str.getClass();
        wneVar.zzd |= 2;
        wneVar.zzf = str;
    }

    public static void p(wne wneVar, int i) {
        wneVar.zzd |= 16;
        wneVar.zzi = i;
    }

    public static void q(wne wneVar, int i) {
        wneVar.zzg = xnb.e(i);
        wneVar.zzd |= 4;
    }

    public static void r(wne wneVar, int i) {
        wneVar.zzd |= 1;
        wneVar.zze = i;
    }

    public static dne s() {
        return (dne) zzb.f();
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
                return new wne();
            }
            return new lfe(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", ovd.d, "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
