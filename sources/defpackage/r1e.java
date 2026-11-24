package defpackage;
public final class r1e extends nne {
    private static final r1e zzi;
    private static volatile dwe zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        ?? nneVar = new nne();
        zzi = nneVar;
        nne.g(r1e.class, nneVar);
    }

    public static q1e j() {
        return (q1e) ((jne) zzi.d(5));
    }

    @Override
    public final Object d(int i) {
        dwe dweVar;
        switch (l2e.a[i - 1]) {
            case 1:
                return new nne();
            case 2:
                return new jne(zzi);
            case 3:
                return new swe(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", b3e.g, "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                dwe dweVar2 = zzj;
                if (dweVar2 == null) {
                    synchronized (r1e.class) {
                        dwe dweVar3 = zzj;
                        dweVar = dweVar3;
                        if (dweVar3 == null) {
                            ?? obj = new Object();
                            zzj = obj;
                            dweVar = obj;
                        }
                    }
                    return dweVar;
                }
                return dweVar2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                fvc.b();
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
