package defpackage;
public final class b8f extends vef {
    private static final b8f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        b8f b8fVar = new b8f();
        zzb = b8fVar;
        vef.e(b8f.class, b8fVar);
    }

    @Override
    public final Object h(int i, vef vefVar) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (vefVar == null) {
                                b = 0;
                            }
                            this.zzh = b;
                            return null;
                        }
                        return zzb;
                    }
                    return new uef(zzb);
                }
                return new b8f();
            }
            return new sgf(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", pd5.s, "zzf", "zzg", cff.F});
        }
        return Byte.valueOf(this.zzh);
    }
}
