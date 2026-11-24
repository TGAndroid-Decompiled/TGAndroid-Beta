package defpackage;
public final class p4f extends vef {
    private static final p4f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        ?? vefVar = new vef();
        zzb = vefVar;
        vef.e(p4f.class, vefVar);
    }

    public static n4f l() {
        return (n4f) zzb.j();
    }

    public static void m(p4f p4fVar, int i) {
        p4fVar.zzd |= 2;
        p4fVar.zzf = i;
    }

    public static void n(p4f p4fVar, int i) {
        p4fVar.zzd |= 4;
        p4fVar.zzg = i;
    }

    public static void o(p4f p4fVar, int i) {
        p4fVar.zzd |= 8;
        p4fVar.zzh = i;
    }

    public static void p(p4f p4fVar, int i) {
        p4fVar.zze = i - 1;
        p4fVar.zzd |= 1;
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
            return new sgf(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", pd5.x, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
