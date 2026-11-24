package defpackage;
public final class d4f extends vef {
    private static final d4f zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        ?? vefVar = new vef();
        zzb = vefVar;
        vef.e(d4f.class, vefVar);
    }

    public static b4f l() {
        return (b4f) zzb.j();
    }

    public static void m(d4f d4fVar, int i) {
        d4fVar.zzd |= 2;
        d4fVar.zzf = i;
    }

    public static void n(d4f d4fVar, int i) {
        d4fVar.zzd |= 4;
        d4fVar.zzg = i;
    }

    public static void o(d4f d4fVar, int i) {
        d4fVar.zzd |= 8;
        d4fVar.zzh = i;
    }

    public static void p(d4f d4fVar, int i) {
        d4fVar.zzd |= 16;
        d4fVar.zzi = i;
    }

    public static void q(d4f d4fVar, int i) {
        d4fVar.zze = i - 1;
        d4fVar.zzd |= 1;
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
            return new sgf(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", cff.y, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
