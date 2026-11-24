package defpackage;
public final class paf extends wgf {
    private static final paf zzb;
    private int zzd;
    private long zze;
    private chf zzf;
    private chf zzg;

    static {
        paf pafVar = new paf();
        zzb = pafVar;
        wgf.e(paf.class, pafVar);
    }

    public paf() {
        aif aifVar = aif.d;
        this.zzf = aifVar;
        this.zzg = aifVar;
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
                return new paf();
            }
            return new tif(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
