package defpackage;
public final class h6e extends ese {
    private static final h6e zzi;
    private static volatile u0f zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        ?? eseVar = new ese();
        zzi = eseVar;
        ese.g(h6e.class, eseVar);
    }

    public static g6e j() {
        return (g6e) ((ase) zzi.d(5));
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new ese();
            case 2:
                return new ase(zzi);
            case 3:
                return new j1f(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", r7e.g, "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                u0f u0fVar2 = zzj;
                if (u0fVar2 == null) {
                    synchronized (h6e.class) {
                        u0f u0fVar3 = zzj;
                        u0fVar = u0fVar3;
                        if (u0fVar3 == null) {
                            ?? obj = new Object();
                            zzj = obj;
                            u0fVar = obj;
                        }
                    }
                    return u0fVar;
                }
                return u0fVar2;
            case 6:
                return (byte) 1;
            case 7:
                break;
            default:
                p3d.a();
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
