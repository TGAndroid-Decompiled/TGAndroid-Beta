package defpackage;
public final class n6e extends ese {
    private static final n6e zzi;
    private static volatile u0f zzj;
    private int zzc;
    private u5e zzd;
    private i6e zze;
    private e6e zzf;
    private int zzg;
    private boolean zzh;

    static {
        ?? eseVar = new ese();
        zzi = eseVar;
        ese.g(n6e.class, eseVar);
    }

    public static m6e k() {
        return (m6e) ((ase) zzi.d(5));
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
                return new j1f(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                u0f u0fVar2 = zzj;
                if (u0fVar2 == null) {
                    synchronized (n6e.class) {
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

    public final void j(e6e e6eVar) {
        this.zzf = e6eVar;
        this.zzc |= 4;
    }
}
