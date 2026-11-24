package defpackage;
public final class daf extends wgf {
    private static final daf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        daf dafVar = new daf();
        zzb = dafVar;
        wgf.e(daf.class, dafVar);
    }

    @Override
    public final Object h(int i, wgf wgfVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (wgfVar == null) {
                                b = 0;
                            }
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new vgf(zzb);
                }
                return new daf();
            }
            return new tif(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", nf5.s, "zzf", "zzg", dhf.F});
        }
        return Byte.valueOf(this.zzh);
    }
}
