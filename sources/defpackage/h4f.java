package defpackage;
public final class h4f extends vef {
    private static final h4f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        ?? vefVar = new vef();
        zzb = vefVar;
        vef.e(h4f.class, vefVar);
    }

    public static f4f l() {
        return (f4f) zzb.j();
    }

    public static void m(h4f h4fVar, int i) {
        h4fVar.zzd |= 2;
        h4fVar.zzf = i;
    }

    public static void n(h4f h4fVar, int i) {
        h4fVar.zzd |= 4;
        h4fVar.zzg = i;
    }

    public static void o(h4f h4fVar, boolean z) {
        h4fVar.zzd |= 8;
        h4fVar.zzh = z;
    }

    public static void p(h4f h4fVar, int i) {
        h4fVar.zze = i - 1;
        h4fVar.zzd |= 1;
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
            return new sgf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", vi2.x, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
