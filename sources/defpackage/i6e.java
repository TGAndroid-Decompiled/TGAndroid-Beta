package defpackage;
public final class i6e extends ese {
    private static final i6e zzj;
    private static volatile u0f zzk;
    private int zzc;
    private long zze;
    private o5e zzf;
    private b6e zzh;
    private q5e zzi;
    private String zzd = "";
    private String zzg = "";

    static {
        i6e i6eVar = new i6e();
        zzj = i6eVar;
        ese.g(i6e.class, i6eVar);
    }

    @Override
    public final Object d(int i) {
        u0f u0fVar;
        switch (b7e.a[i - 1]) {
            case 1:
                return new i6e();
            case 2:
                return new ase(zzj);
            case 3:
                return new j1f(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                u0f u0fVar2 = zzk;
                if (u0fVar2 == null) {
                    synchronized (i6e.class) {
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
