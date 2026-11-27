package defpackage;
public final class b6e extends ese {
    private static final b6e zzj;
    private static volatile u0f zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    static {
        ?? eseVar = new ese();
        zzj = eseVar;
        ese.g(b6e.class, eseVar);
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new ese();
            case 2:
                return new ase(zzj);
            case 3:
                return new j1f(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", r7e.f, "zze", r7e.e, "zzf", r7e.d, "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                u0f u0fVar2 = zzk;
                if (u0fVar2 == null) {
                    synchronized (b6e.class) {
                        u0f u0fVar3 = zzk;
                        u0fVar = u0fVar3;
                        if (u0fVar3 == null) {
                            ?? obj = new Object();
                            zzk = obj;
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
