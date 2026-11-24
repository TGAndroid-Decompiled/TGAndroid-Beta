package defpackage;
public final class eoe extends c2e {
    private static final eoe zzb;
    private int zzd;
    private a3e zze = pae.e;
    private String zzf = "";
    private boolean zzg;

    static {
        eoe eoeVar = new eoe();
        zzb = eoeVar;
        c2e.k(eoe.class, eoeVar);
    }

    public static void n(eoe eoeVar, boolean z) {
        eoeVar.zzd |= 2;
        eoeVar.zzg = z;
    }

    public static eoe o() {
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
                    return new e0e(zzb);
                }
                return new eoe();
            }
            return new vae(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", vne.class, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
