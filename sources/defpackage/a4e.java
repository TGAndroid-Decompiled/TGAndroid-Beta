package defpackage;
public final class a4e extends qpe {
    private static final a4e zzi;
    private static volatile fye zzj;
    private int zzc;
    private h3e zzd;
    private v3e zze;
    private r3e zzf;
    private int zzg;
    private boolean zzh;

    static {
        ?? qpeVar = new qpe();
        zzi = qpeVar;
        qpe.g(a4e.class, qpeVar);
    }

    public static z3e k() {
        return (z3e) ((mpe) zzi.d(5));
    }

    @Override
    public final Object d(int i) {
        fye fyeVar;
        switch (o4e.a[i - 1]) {
            case 1:
                return new qpe();
            case 2:
                return new mpe(zzi);
            case 3:
                return new uye(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                fye fyeVar2 = zzj;
                if (fyeVar2 == null) {
                    synchronized (a4e.class) {
                        fye fyeVar3 = zzj;
                        fyeVar = fyeVar3;
                        if (fyeVar3 == null) {
                            ?? obj = new Object();
                            zzj = obj;
                            fyeVar = obj;
                        }
                    }
                    return fyeVar;
                }
                return fyeVar2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                gxc.b();
                break;
        }
        return null;
    }

    public final void j(r3e r3eVar) {
        this.zzf = r3eVar;
        this.zzc |= 4;
    }
}
