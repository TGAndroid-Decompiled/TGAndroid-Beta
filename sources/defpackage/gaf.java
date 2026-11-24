package defpackage;
public final class gaf extends wgf {
    private static final gaf zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        gaf gafVar = new gaf();
        zzb = gafVar;
        wgf.e(gaf.class, gafVar);
    }

    @Override
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new vgf(zzb);
                }
                return new gaf();
            }
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
