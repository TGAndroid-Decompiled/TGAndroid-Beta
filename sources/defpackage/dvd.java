package defpackage;
public final class dvd extends s6e {
    private static final dvd zzb;
    private int zzd;
    private String zze = "";

    static {
        dvd dvdVar = new dvd();
        zzb = dvdVar;
        s6e.k(dvd.class, dvdVar);
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
                return new dvd();
            }
            return new lfe(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
