package defpackage;
public final class wcf extends wgf {
    private static final wcf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private ehf zzg;
    private ehf zzh;
    private int zzi;

    static {
        wcf wcfVar = new wcf();
        zzb = wcfVar;
        wgf.e(wcf.class, wcfVar);
    }

    public wcf() {
        sif sifVar = sif.d;
        this.zzg = sifVar;
        this.zzh = sifVar;
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
                return new wcf();
            }
            return new tif(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", jk2.y, "zzf", nf5.y, "zzg", j8f.class, "zzh", j8f.class, "zzi", jk2.r});
        }
        return (byte) 1;
    }
}
