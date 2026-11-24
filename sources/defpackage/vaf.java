package defpackage;
public final class vaf extends vef {
    private static final vaf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private dff zzg;
    private dff zzh;
    private int zzi;

    static {
        vaf vafVar = new vaf();
        zzb = vafVar;
        vef.e(vaf.class, vafVar);
    }

    public vaf() {
        rgf rgfVar = rgf.d;
        this.zzg = rgfVar;
        this.zzh = rgfVar;
    }

    @Override
    public final Object h(int i, vef vefVar) {
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
                    return new uef(zzb);
                }
                return new vaf();
            }
            return new sgf(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002", new Object[]{"zzd", "zze", vi2.y, "zzf", pd5.y, "zzg", h6f.class, "zzh", h6f.class, "zzi", vi2.r});
        }
        return (byte) 1;
    }
}
