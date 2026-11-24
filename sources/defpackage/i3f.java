package defpackage;
public final class i3f extends vef {
    private static final i3f zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        i3f i3fVar = new i3f();
        zzb = i3fVar;
        vef.e(i3f.class, i3fVar);
    }

    public static f3f l() {
        return (f3f) zzb.j();
    }

    public static void m(i3f i3fVar, String str) {
        str.getClass();
        i3fVar.zzd |= 1;
        i3fVar.zze = str;
    }

    public static void n(i3f i3fVar, String str) {
        str.getClass();
        i3fVar.zzd |= 2;
        i3fVar.zzf = str;
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
                return new i3f();
            }
            return new sgf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
