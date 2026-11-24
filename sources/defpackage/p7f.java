package defpackage;
public final class p7f extends wgf {
    private static final p7f zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        p7f p7fVar = new p7f();
        zzb = p7fVar;
        wgf.e(p7f.class, p7fVar);
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
                return new p7f();
            }
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
