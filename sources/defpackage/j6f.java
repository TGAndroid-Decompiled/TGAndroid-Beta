package defpackage;
public final class j6f extends wgf {
    private static final j6f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    static {
        ?? wgfVar = new wgf();
        zzb = wgfVar;
        wgf.e(j6f.class, wgfVar);
    }

    public static h6f l() {
        return (h6f) zzb.j();
    }

    public static void m(j6f j6fVar, int i) {
        j6fVar.zzd |= 2;
        j6fVar.zzf = i;
    }

    public static void n(j6f j6fVar, int i) {
        j6fVar.zzd |= 4;
        j6fVar.zzg = i;
    }

    public static void o(j6f j6fVar, boolean z) {
        j6fVar.zzd |= 8;
        j6fVar.zzh = z;
    }

    public static void p(j6f j6fVar, int i) {
        j6fVar.zze = i - 1;
        j6fVar.zzd |= 1;
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
            return new tif(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", jk2.x, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
