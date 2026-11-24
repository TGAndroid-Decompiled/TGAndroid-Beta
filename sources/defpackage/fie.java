package defpackage;
public final class fie extends c2e {
    private static final fie zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        fie fieVar = new fie();
        zzb = fieVar;
        c2e.k(fie.class, fieVar);
    }

    public static void o(fie fieVar, dke dkeVar) {
        fieVar.zzh = dkeVar.a;
        fieVar.zzd |= 2;
    }

    public static void p(fie fieVar, eoe eoeVar) {
        fieVar.zzf = eoeVar;
        fieVar.zze = 4;
    }

    public static void q(fie fieVar, dre dreVar) {
        fieVar.zzf = dreVar;
        fieVar.zze = 3;
    }

    public static void r(fie fieVar, int i) {
        fieVar.zzg = i - 1;
        fieVar.zzd |= 1;
    }

    public static nhe s() {
        return (nhe) zzb.f();
    }

    @Override
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new e0e(zzb);
                }
                return new fie();
            }
            return new vae(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", yqd.c, lme.class, dre.class, eoe.class, "zzh", yqd.e});
        }
        return (byte) 1;
    }

    public final eoe n() {
        if (this.zze == 4) {
            return (eoe) this.zzf;
        }
        return eoe.o();
    }
}
