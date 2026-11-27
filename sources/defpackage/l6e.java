package defpackage;
public final class l6e extends ese {
    private static final l6e zzh;
    private static volatile u0f zzi;
    private int zzc;
    private s5e zzd;
    private int zze;
    private c6e zzf;
    private r5e zzg;

    static {
        ?? eseVar = new ese();
        zzh = eseVar;
        ese.g(l6e.class, eseVar);
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new ese();
            case 2:
                return new ase(zzh);
            case 3:
                return new j1f(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                u0f u0fVar2 = zzi;
                if (u0fVar2 == null) {
                    synchronized (l6e.class) {
                        u0f u0fVar3 = zzi;
                        u0fVar = u0fVar3;
                        if (u0fVar3 == null) {
                            ?? obj = new Object();
                            zzi = obj;
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
}
