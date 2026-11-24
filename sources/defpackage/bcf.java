package defpackage;
public final class bcf extends wgf {
    private static final bcf zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private ehf zzg = sif.d;

    static {
        bcf bcfVar = new bcf();
        zzb = bcfVar;
        wgf.e(bcf.class, bcfVar);
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
                return new bcf();
            }
            return new tif(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", ecf.class});
        }
        return (byte) 1;
    }
}
