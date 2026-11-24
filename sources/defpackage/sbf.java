package defpackage;
public final class sbf extends wgf {
    private static final sbf zzb;
    private int zzd;
    private ehf zze;
    private ehf zzf;
    private hcf zzg;

    static {
        sbf sbfVar = new sbf();
        zzb = sbfVar;
        wgf.e(sbf.class, sbfVar);
    }

    public sbf() {
        sif sifVar = sif.d;
        this.zze = sifVar;
        this.zzf = sifVar;
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
                return new sbf();
            }
            return new tif(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", qcf.class, "zzf", e8f.class, "zzg"});
        }
        return (byte) 1;
    }
}
