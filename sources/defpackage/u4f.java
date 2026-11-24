package defpackage;
public final class u4f extends vef {
    private static final u4f zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        ?? vefVar = new vef();
        zzb = vefVar;
        vef.e(u4f.class, vefVar);
    }

    public static s4f l() {
        return (s4f) zzb.j();
    }

    public static void m(u4f u4fVar, int i) {
        u4fVar.zzd |= 2;
        u4fVar.zzf = i;
    }

    public static void n(u4f u4fVar, int i) {
        u4fVar.zze = i - 1;
        u4fVar.zzd |= 1;
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
                return new vef();
            }
            return new sgf(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", o5f.y, "zzf"});
        }
        return (byte) 1;
    }
}
