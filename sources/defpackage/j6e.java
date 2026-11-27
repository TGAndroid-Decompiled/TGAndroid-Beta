package defpackage;
public final class j6e extends ese {
    private static final j6e zzf;
    private static volatile u0f zzg;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        ?? eseVar = new ese();
        zzf = eseVar;
        ese.g(j6e.class, eseVar);
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new ese();
            case 2:
                return new ase(zzf);
            case 3:
                return new j1f(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                u0f u0fVar2 = zzg;
                if (u0fVar2 == null) {
                    synchronized (j6e.class) {
                        u0f u0fVar3 = zzg;
                        u0fVar = u0fVar3;
                        if (u0fVar3 == null) {
                            ?? obj = new Object();
                            zzg = obj;
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
