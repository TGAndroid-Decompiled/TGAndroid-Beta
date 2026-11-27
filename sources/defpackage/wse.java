package defpackage;
public final class wse extends s6e {
    private static final wse zzb;
    private int zzd;
    private q7e zze = ffe.e;
    private String zzf = "";
    private boolean zzg;

    static {
        wse wseVar = new wse();
        zzb = wseVar;
        s6e.k(wse.class, wseVar);
    }

    public static void n(wse wseVar, boolean z) {
        wseVar.zzd |= 2;
        wseVar.zzg = z;
    }

    public static wse o() {
        return zzb;
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
                return new wse();
            }
            return new lfe(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", mse.class, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
