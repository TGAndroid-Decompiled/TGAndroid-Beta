package defpackage;
public final class f6f extends wgf {
    private static final f6f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        ?? wgfVar = new wgf();
        zzb = wgfVar;
        wgf.e(f6f.class, wgfVar);
    }

    public static d6f l() {
        return (d6f) zzb.j();
    }

    public static void m(f6f f6fVar, int i) {
        f6fVar.zzd |= 2;
        f6fVar.zzf = i;
    }

    public static void n(f6f f6fVar, int i) {
        f6fVar.zzd |= 4;
        f6fVar.zzg = i;
    }

    public static void o(f6f f6fVar, int i) {
        f6fVar.zzd |= 8;
        f6fVar.zzh = i;
    }

    public static void p(f6f f6fVar, int i) {
        f6fVar.zzd |= 16;
        f6fVar.zzi = i;
    }

    public static void q(f6f f6fVar, int i) {
        f6fVar.zze = i - 1;
        f6fVar.zzd |= 1;
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
            return new tif(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", dhf.y, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
