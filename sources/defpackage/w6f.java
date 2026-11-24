package defpackage;
public final class w6f extends wgf {
    private static final w6f zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        ?? wgfVar = new wgf();
        zzb = wgfVar;
        wgf.e(w6f.class, wgfVar);
    }

    public static u6f l() {
        return (u6f) zzb.j();
    }

    public static void m(w6f w6fVar, int i) {
        w6fVar.zzd |= 2;
        w6fVar.zzf = i;
    }

    public static void n(w6f w6fVar, int i) {
        w6fVar.zze = i - 1;
        w6fVar.zzd |= 1;
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
            return new tif(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", q7f.y, "zzf"});
        }
        return (byte) 1;
    }
}
