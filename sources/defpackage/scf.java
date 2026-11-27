package defpackage;
public final class scf extends ljf {
    private static final scf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        scf scfVar = new scf();
        zzb = scfVar;
        ljf.e(scf.class, scfVar);
    }

    @Override
    public final Object h(int i, ljf ljfVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (ljfVar == null) {
                                b = 0;
                            }
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new kjf(zzb);
                }
                return new scf();
            }
            return new ilf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", qf5.s, "zzf", "zzg", sjf.F});
        }
        return Byte.valueOf(this.zzh);
    }
}
