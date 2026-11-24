package defpackage;
public final class r6f extends wgf {
    private static final r6f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        ?? wgfVar = new wgf();
        zzb = wgfVar;
        wgf.e(r6f.class, wgfVar);
    }

    public static p6f l() {
        return (p6f) zzb.j();
    }

    public static void m(r6f r6fVar, int i) {
        r6fVar.zzd |= 2;
        r6fVar.zzf = i;
    }

    public static void n(r6f r6fVar, int i) {
        r6fVar.zzd |= 4;
        r6fVar.zzg = i;
    }

    public static void o(r6f r6fVar, int i) {
        r6fVar.zzd |= 8;
        r6fVar.zzh = i;
    }

    public static void p(r6f r6fVar, int i) {
        r6fVar.zze = i - 1;
        r6fVar.zzd |= 1;
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
            return new tif(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", nf5.x, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
