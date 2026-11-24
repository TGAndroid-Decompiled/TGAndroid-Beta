package defpackage;
public final class h6f extends vef {
    private static final h6f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        h6f h6fVar = new h6f();
        zzb = h6fVar;
        vef.e(h6f.class, h6fVar);
    }

    public static f6f l() {
        return (f6f) zzb.j();
    }

    public static void m(h6f h6fVar, String str) {
        str.getClass();
        h6fVar.zzd |= 1;
        h6fVar.zze = str;
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
                return new h6f();
            }
            return new sgf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
