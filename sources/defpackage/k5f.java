package defpackage;
public final class k5f extends wgf {
    private static final k5f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        k5f k5fVar = new k5f();
        zzb = k5fVar;
        wgf.e(k5f.class, k5fVar);
    }

    public static h5f l() {
        return (h5f) zzb.j();
    }

    public static void m(k5f k5fVar, String str) {
        str.getClass();
        k5fVar.zzd |= 1;
        k5fVar.zze = str;
    }

    public static void n(k5f k5fVar, String str) {
        str.getClass();
        k5fVar.zzd |= 2;
        k5fVar.zzf = str;
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
                return new k5f();
            }
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
