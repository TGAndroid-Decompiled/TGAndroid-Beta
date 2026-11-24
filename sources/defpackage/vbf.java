package defpackage;
public final class vbf extends wgf {
    private static final vbf zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        ?? wgfVar = new wgf();
        zzb = wgfVar;
        wgf.e(vbf.class, wgfVar);
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
                return new wgf();
            }
            nf5 nf5Var = nf5.w;
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", nf5Var, "zzf", nf5Var});
        }
        return (byte) 1;
    }
}
