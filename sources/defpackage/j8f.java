package defpackage;
public final class j8f extends wgf {
    private static final j8f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        j8f j8fVar = new j8f();
        zzb = j8fVar;
        wgf.e(j8f.class, j8fVar);
    }

    public static h8f l() {
        return (h8f) zzb.j();
    }

    public static void m(j8f j8fVar, String str) {
        str.getClass();
        j8fVar.zzd |= 1;
        j8fVar.zze = str;
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
                return new j8f();
            }
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
