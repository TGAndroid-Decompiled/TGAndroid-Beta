package defpackage;
public final class u3e extends qpe {
    private static final u3e zzi;
    private static volatile fye zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        ?? qpeVar = new qpe();
        zzi = qpeVar;
        qpe.g(u3e.class, qpeVar);
    }

    public static t3e j() {
        return (t3e) ((mpe) zzi.d(5));
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
                return new uye(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", e5e.g, "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                fye fyeVar2 = zzj;
                if (fyeVar2 == null) {
                    synchronized (u3e.class) {
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

    public final void k(long j) {
        this.zzc |= 2;
        this.zze = j;
    }

    public final void l(long j) {
        this.zzc |= 4;
        this.zzf = j;
    }

    public final void m(long j) {
        this.zzc |= 8;
        this.zzg = j;
    }

    public final void n(long j) {
        this.zzc |= 16;
        this.zzh = j;
    }
}
