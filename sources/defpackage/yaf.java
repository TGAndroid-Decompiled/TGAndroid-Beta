package defpackage;
public final class yaf extends ljf {
    private static final yaf zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        yaf yafVar = new yaf();
        zzb = yafVar;
        ljf.e(yaf.class, yafVar);
    }

    public static waf l() {
        return (waf) zzb.j();
    }

    public static void m(yaf yafVar, String str) {
        str.getClass();
        yafVar.zzd |= 1;
        yafVar.zze = str;
    }

    @Override
    public final Object h(int i, ljf ljfVar) {
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
                    return new kjf(zzb);
                }
                return new yaf();
            }
            return new ilf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
